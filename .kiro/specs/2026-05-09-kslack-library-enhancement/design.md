# Design: kslack Library Enhancement — Socket Mode Streaming & API Gap Filling

## Architecture Overview

kslack uses a resource-based API pattern. Every Slack API method follows the same structure:

```
Methods.kt (constant) → Request class → Response class → Resource interface → ResourceImpl class
```

The `Slack` interface exposes resource accessors (e.g., `fun chat(): ChatResource`), and `SlackImpl` wires them to `ResourceImpl` instances. Each API method has two variants: `suspend fun` (coroutine) and `fun ...Blocking()` (synchronous).

The stream module follows a different pattern based on `kmastodon/stream`:

```
SlackStream (interface) → SlackSocketModeClient (WebSocket manager) → EventDispatcher → SlackStreamListener (callbacks)
```

### Key Base Classes & Interfaces (REST)

| Class/Interface | Path | Purpose |
|----------------|------|---------|
| `SlackApiRequest` | `core/.../api/methods/SlackApiRequest.kt` | Marker interface; requires `val token: String?` |
| `FormRequest` | `core/.../api/methods/FormRequest.kt` | Provides `toMap()` and `toParams()` for form encoding |
| `SlackApiResponse` | `core/.../api/methods/SlackApiResponse.kt` | Base response with `isOk`, `warning`, `error`, `needed`, `provided` |
| `AbstractResourceImpl` | `core/.../api/methods/impl/AbstractResourceImpl.kt` | Provides `postFormWithToken()`, `postForm()`, `postMultipartWithToken()` |

### Key Classes (Streaming)

| Class/Interface | Path | Purpose |
|----------------|------|---------|
| `SlackStream` | `stream/.../stream/SlackStream.kt` | Current stub — will be updated |
| `SlackStreamImpl` | `stream/.../stream/internal/SlackStreamImpl.kt` | Current stub — will be updated |
| `WebsocketRequest` | `khttpclient` | WebSocket connection from dependency |

All paths below are relative to `core/src/commonMain/kotlin/work/socialhub/kslack/` (REST) or `stream/src/commonMain/kotlin/work/socialhub/kslack/` (stream).

---

## Part A: Socket Mode Streaming (Highest Priority)

### Step A1: Event Listener Interface

**File**: `stream/src/commonMain/kotlin/work/socialhub/kslack/stream/SlackStreamListener.kt` (new)

```kotlin
@JsExport
interface SlackStreamListener {
    fun onMessage(event: work.socialhub.kslack.entity.event.MessageEvent) {}
    fun onAppMention(event: work.socialhub.kslack.entity.event.AppMentionEvent) {}
    fun onChannelCreated(event: work.socialhub.kslack.entity.event.ChannelCreatedEvent) {}
    fun onChannelDeleted(event: work.socialhub.kslack.entity.event.ChannelDeletedEvent) {}
    fun onChannelRenamed(event: work.socialhub.kslack.entity.event.ChannelRenameEvent) {}
    fun onChannelArchive(event: work.socialhub.kslack.entity.event.ChannelArchiveEvent) {}
    fun onChannelUnarchive(event: work.socialhub.kslack.entity.event.ChannelUnarchiveEvent) {}
    fun onMemberJoinedChannel(event: work.socialhub.kslack.entity.event.MemberJoinedChannelEvent) {}
    fun onMemberLeftChannel(event: work.socialhub.kslack.entity.event.MemberLeftChannelEvent) {}
    fun onReactionAdded(event: work.socialhub.kslack.entity.event.ReactionAddedEvent) {}
    fun onReactionRemoved(event: work.socialhub.kslack.entity.event.ReactionRemovedEvent) {}
    fun onFileShared(event: work.socialhub.kslack.entity.event.FileSharedEvent) {}
    fun onFileDeleted(event: work.socialhub.kslack.entity.event.FileDeletedEvent) {}
    fun onFileChanged(event: work.socialhub.kslack.entity.event.FileChangeEvent) {}
    fun onError(error: Exception) {}
    fun onOpen() {}
    fun onClose() {}
}
```

Design notes:
- All methods have empty defaults — user overrides only the events they care about
- Already have 95 event types in `entity/event/` — this step covers the most commonly used ~15
- Remaining event types can be added later via additional callback methods

### Step A2: Event Type → Entity Mapping

**File**: `stream/src/commonMain/kotlin/work/socialhub/kslack/stream/internal/EventTypeMapper.kt` (new)

Maps Slack event `type` strings to their entity classes for deserialization:

| Event Type | Entity Class |
|-----------|-------------|
| `message` | `MessageEvent` |
| `app_mention` | `AppMentionEvent` |
| `channel_created` | `ChannelCreatedEvent` |
| `channel_deleted` | `ChannelDeletedEvent` |
| `channel_rename` | `ChannelRenameEvent` |
| `channel_archive` | `ChannelArchiveEvent` |
| `channel_unarchive` | `ChannelUnarchiveEvent` |
| `member_joined_channel` | `MemberJoinedChannelEvent` |
| `member_left_channel` | `MemberLeftChannelEvent` |
| `reaction_added` | `ReactionAddedEvent` |
| `reaction_removed` | `ReactionRemovedEvent` |
| `file_shared` | `FileSharedEvent` |
| `file_deleted` | `FileDeletedEvent` |
| `file_changed` | `FileChangeEvent` |

The mapper uses a `Map<String, KClass<*>>` initialized at object creation.

### Step A3: Socket Mode Client

**File**: `stream/src/commonMain/kotlin/work/socialhub/kslack/stream/internal/SocketModeClient.kt` (new)

Manages WebSocket connection lifecycle.

```kotlin
@JsExport
class SocketModeClient(
    private val token: String,
    private val listener: SlackStreamListener,
) : SlackStream {
    private var websocket: WebsocketRequest? = null
    private var isConnected: Boolean = false
    private var isIntentionallyClosed: Boolean = false

    // Exponential backoff: 1s, 2s, 4s, 8s, 16s, 30s (max)
    companion object {
        private const val INITIAL_RECONNECT_DELAY_MS = 1000L
        private const val MAX_RECONNECT_DELAY_MS = 30000L
        private const val CONNECTION_TIMEOUT_MS = 10000L
    }

    override suspend fun start()
    override fun stop()
    override fun isConnected(): Boolean
}
```

Key implementation details:

1. **Connection flow**:
   - Create `WebsocketRequest` with URL
   - Set `textListener` to parse incoming JSON events
   - Set `onOpenListener` → call `listener.onOpen()`, set `isConnected = true`
   - Set `onCloseListener` → if not intentional close, schedule reconnect; otherwise call `listener.onClose()`
   - Set `onErrorListener` → call `listener.onError(e)`

2. **Message handling**:
   - Parse JSON to detect event type
   - If `type == "socket_mode_enqueue"` → send `{type: "ack"}` back (heartbeat)
   - Otherwise, use `EventTypeMapper` to get entity class and deserialize
   - Cast to appropriate event type and call the corresponding listener method
   - Catch all exceptions → call `listener.onError(e)`

3. **Reconnect flow**:
   - `scheduleReconnect()`: delay = min(currentDelay * 2, MAX_RECONNECT_DELAY_MS)
   - Create new `WebsocketRequest` and call `open()`
   - On success: reset delay, call `listener.onOpen()`
   - On failure: schedule next reconnect attempt

4. **Close flow**:
   - Set `isIntentionallyClosed = true`
   - If `websocket != null`, call `websocket!!.close()`
   - Wait for `onCloseListener` to fire

### Step A4: SlackStream Interface Update

**File**: `stream/src/commonMain/kotlin/work/socialhub/kslack/stream/SlackStream.kt` (modify)

```kotlin
@JsExport
interface SlackStream {
    suspend fun start()
    fun stop()
    fun isConnected(): Boolean
    fun token(): String
}
```

### Step A5: SlackStreamImpl Implementation

**File**: `stream/src/commonMain/kotlin/work/socialhub/kslack/stream/internal/SlackStreamImpl.kt` (modify)

```kotlin
class SlackStreamImpl(
    private val token: String,
    private val listener: SlackStreamListener,
) : SlackStream {

    private val socketModeClient = SocketModeClient(token, listener)

    override fun token() = token

    override suspend fun start() {
        socketModeClient.start()
    }

    override fun stop() {
        socketModeClient.stop()
    }

    override fun isConnected() = socketModeClient.isConnected()
}
```

### Step A6: Slack Integration

**File**: `Slack.kt` (modify)
- Add import for `SlackStream`
- Remove the existing `// TODO: Stream module` comment
- Add `fun stream(): SlackStream` method

**File**: `internal/SlackImpl.kt` (modify)
- Add field: `private val stream: SlackStream = SlackStreamImpl(token, listener)`
- Add accessor: `override fun stream() = stream`

**File**: `SlackFactory.kt` (modify)
- Add `instance(token: String, listener: SlackStreamListener)` factory overload
- Or provide `stream()` accessor on existing instances (listener configured separately)

Design decision for listener registration:
- Option A: Pass listener to `SlackFactory.instance(token, listener)` at construction
- Option B: Allow `stream().setListener(listener)` at runtime
- **Recommended Option B** — more flexible, matches the pattern of setting callbacks after instantiation

### Step A7: Test File

**File**: `stream/src/jvmTest/kotlin/work/socialhub/kslack/stream/ChatStreamingTest.kt` (new)

Test scenarios:
1. `testStartStop` — Start stream, verify connected, stop, verify disconnected
2. `testReconnectOnDisconnect` — Disconnect, verify automatic reconnect with backoff
3. `testAckHeartbeat` — Verify that `socket_mode_enqueue` events receive `{type: "ack"}` response

---

## Part B: admin.conversations.* (New Resource — 16 methods)

### Step B1: Entity Creation

**File**: `entity/admin/conversation/AdminConversation.kt` (new)

```kotlin
@JsExport
@Serializable
class AdminConversation {
    var id: String? = null
    var name: String? = null
    var isChannel: Boolean? = null
    var isGroup: Boolean? = null
    var isIm: Boolean? = null
    var dateCreate: Long? = null
    var creatorId: String? = null
    var workspaceId: String? = null
    var isPrivate: Boolean? = null
}
```

**File**: `entity/admin/conversation/AdminConversationBanUser.kt` (new)

```kotlin
@JsExport
@Serializable
class AdminConversationBanUser {
    var userId: String? = null
    var teamId: String? = null
}
```

**File**: `entity/admin/conversation/AdminConversationConnectWorkspace.kt` (new)

```kotlin
@JsExport
@Serializable
class AdminConversationConnectWorkspace {
    var id: String? = null
    var name: String? = null
}
```

**File**: `entity/admin/conversation/AdminConversationRestriction.kt` (new)

```kotlin
@JsExport
@Serializable
class AdminConversationRestriction {
    var id: String? = null
    var type: String? = null  // "access_group"
    var name: String? = null
}
```

**File**: `entity/admin/conversation/AdminConversationCustomRetention.kt` (new)

```kotlin
@JsExport
@Serializable
class AdminConversationCustomRetention {
    var durationDays: Int? = null
}
```

### Step B2: Method Constants

**File**: `api/methods/Methods.kt` — Add:

```kotlin
// admin.conversations
const val ADMIN_CONVERSATIONS_CREATE: String = "admin.conversations.create"
const val ADMIN_CONVERSATIONS_BAN: String = "admin.conversations.ban"
const val ADMIN_CONVERSATIONS_UNBAN: String = "admin.conversations.unban"
const val ADMIN_CONVERSATIONS_ARCHIVE: String = "admin.conversations.archive"
const val ADMIN_CONVERSATIONS_UNARCHIVE: String = "admin.conversations.unarchive"
const val ADMIN_CONVERSATIONS_CONNECT: String = "admin.conversations.connect"
const val ADMIN_CONVERSATIONS_DISCONNECT: String = "admin.conversations.disconnect"
const val ADMIN_CONVERSATIONS_SEARCH: String = "admin.conversations.search"
const val ADMIN_CONVERSATIONS_GET_CUSTOM_RETENTION: String = "admin.conversations.getCustomRetention"
const val ADMIN_CONVERSATIONS_SET_CUSTOM_RETENTION: String = "admin.conversations.setCustomRetention"
const val ADMIN_CONVERSATIONS_DELETE: String = "admin.conversations.delete"
const val ADMIN_CONVERSATIONS_GET_CUSTOM_CLASSIFICATION: String = "admin.conversations.getCustomClassification"
const val ADMIN_CONVERSATIONS_SET_CUSTOM_CLASSIFICATION: String = "admin.conversations.setCustomClassification"
// admin.conversations.restrictAccess
const val ADMIN_CONVERSATIONS_RESTRICT_ACCESS_ADD: String = "admin.conversations.restrictAccess.add"
const val ADMIN_CONVERSATIONS_RESTRICT_ACCESS_LIST: String = "admin.conversations.restrictAccess.list"
const val ADMIN_CONVERSATIONS_RESTRICT_ACCESS_REMOVE: String = "admin.conversations.restrictAccess.remove"
```

### Step B3: Request Classes (16 files in `api/methods/request/admin/conversations/`)

Key parameter highlights:

| File | Key Parameters |
|------|---------------|
| `AdminConversationsCreateRequest.kt` | `isPrivate?`, `name`, `workspace_id?` |
| `AdminConversationsBanRequest.kt` | `channel_id`, `user_id` |
| `AdminConversationsUnbanRequest.kt` | `channel_id`, `user_id` |
| `AdminConversationsArchiveRequest.kt` | `channel_id` |
| `AdminConversationsUnarchiveRequest.kt` | `channel_id` |
| `AdminConversationsConnectRequest.kt` | `channel_id`, `target_workspace_id` |
| `AdminConversationsDisconnectRequest.kt` | `channel_id`, `target_workspace_id` |
| `AdminConversationsSearchRequest.kt` | `cursor?`, `is_private?`, `limit?: Int`, `query?`, `sort?: String`, `sort_dir?: String`, `workspace_ids?` |
| `AdminConversationsGetCustomRetentionRequest.kt` | `channel_id` |
| `AdminConversationsSetCustomRetentionRequest.kt` | `channel_id`, `duration_days` |
| `AdminConversationsDeleteRequest.kt` | `channel_id` |
| `AdminConversationsGetCustomClassificationRequest.kt` | `channel_id` |
| `AdminConversationsSetCustomClassificationRequest.kt` | `channel_id`, `classification_name` |
| `restrict_access/AdminConversationsRestrictAccessAddRequest.kt` | `channel_id`, `restriction` (JSON array string of IDs) |
| `restrict_access/AdminConversationsRestrictAccessListRequest.kt` | `channel_id`, `cursor?`, `limit?: Int` |
| `restrict_access/AdminConversationsRestrictAccessRemoveRequest.kt` | `channel_id`, `restriction` (JSON array string of IDs) |

### Step B4: Response Classes (16 files in `api/methods/response/admin/conversations/`)

| File | Key Fields |
|------|-----------|
| `AdminConversationsCreateResponse.kt` | `channel: AdminConversation?` |
| `AdminConversationsBanResponse.kt` | (empty) |
| `AdminConversationsUnbanResponse.kt` | (empty) |
| `AdminConversationsArchiveResponse.kt` | (empty) |
| `AdminConversationsUnarchiveResponse.kt` | (empty) |
| `AdminConversationsConnectResponse.kt` | `channel_id: String?`, `inbound_connected_to_channel_id: String?` |
| `AdminConversationsDisconnectResponse.kt` | (empty) |
| `AdminConversationsSearchResponse.kt` | `conversation_count: Int?`, `conversations: Array<AdminConversation>?`, `response_metadata: ResponseMetadata?` |
| `AdminConversationsGetCustomRetentionResponse.kt` | `duration_days: Int?` |
| `AdminConversationsSetCustomRetentionResponse.kt` | (empty) |
| `AdminConversationsDeleteResponse.kt` | (empty) |
| `AdminConversationsGetCustomClassificationResponse.kt` | `classification_name: String?` |
| `AdminConversationsSetCustomClassificationResponse.kt` | (empty) |
| `restrict_access/AdminConversationsRestrictAccessAddResponse.kt` | (empty) |
| `restrict_access/AdminConversationsRestrictAccessListResponse.kt` | `restrictions: Array<AdminConversationRestriction>?`, `response_metadata: ResponseMetadata?` |
| `restrict_access/AdminConversationsRestrictAccessRemoveResponse.kt` | (empty) |

### Step B5: Resource Interface & Implementation

**File**: `api/AdminConversationsResource.kt` (new)

16 suspend methods + 16 blocking methods = 32 total.

**File**: `internal/api/AdminConversationsResourceImpl.kt` (new)

All methods use `postFormWithToken(req.toParams(), Methods.*, getToken(req))`.

### Step B6: Wiring

**File**: `Slack.kt` — Add `fun adminConversations(): AdminConversationsResource`
**File**: `internal/SlackImpl.kt` — Add `AdminConversationsResourceImpl(token)` field + accessor
**File**: `api/AdminResource.kt` — Note: Could either create a new `AdminConversationsResource` (preferred for separation) or add methods to existing `AdminResource`. **Decision**: New `AdminConversationsResource` — the admin API is already large (21 methods), and `admin.conversations.*` is a distinct subsystem.

---

## Part C: views.home (1 method — ViewsResource extension)

### Step C1: Method Constant

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val VIEWS_HOME_UPDATE: String = "views.home.update"
```

### Step C2: Request/Response

**`request/views/ViewsHomeUpdateRequest.kt`** (new)
- Params: `homeTabConfig` (LayoutBlock), `user_id?`, `external_binding_id?`, `external_binding_method?`

**`response/views/ViewsHomeUpdateResponse.kt`** (new)
- Fields: `view: JsonElement?` (reuses `kotlinx.serialization.json.JsonElement`)

### Step C3: Existing File Edits

- `api/ViewsResource.kt` — Add 1 method pair (2 methods)
- `internal/api/ViewsResourceImpl.kt` — Add 1 implementation + 1 blocking wrapper

---

## Part D: workflows.* (New Resource — 3 methods)

### Step D1: Entity

**File**: `entity/workflow/WorkflowStep.kt` (new)

```kotlin
@JsExport
@Serializable
class WorkflowStep {
    var stepUuid: String? = null
    var appId: String? = null
    var callbackId: String? = null
    var version: Int? = null
}
```

### Step D2: Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val WORKFLOWS_STEPS_COMPLETE: String = "workflows.steps.complete"
const val WORKFLOWS_STEPS_SKIP: String = "workflows.steps.skip"
const val WORKFLOWS_STEPS_CANCEL: String = "workflows.steps.cancel"
```

### Step D3: Request/Response (3 files each)

**Request files** (`api/methods/request/workflows/steps/`):
- `WorkflowsStepsCompleteRequest.kt` — params: `workflow_step_invoke_id`
- `WorkflowsStepsSkipRequest.kt` — params: `workflow_step_invoke_id`
- `WorkflowsStepsCancelRequest.kt` — params: `workflow_step_invoke_id`

**Response files** (`api/methods/response/workflows/steps/`):
- All 3 are empty (extend `SlackApiResponse()`)

### Step D4: Resource Interface & Implementation

**File**: `api/WorkflowsResource.kt` (new)
**File**: `internal/api/WorkflowsResourceImpl.kt` (new)

### Step D5: Wiring

**File**: `Slack.kt` — Add `fun workflows(): WorkflowsResource`
**File**: `internal/SlackImpl.kt` — Add `WorkflowsResourceImpl(token)` field + accessor

---

## Part E: Minor API Gap Fixes

### Step E1: pins.delete

**`request/pins/PinsDeleteRequest.kt`** — params: `channel_id`, `timestamp`
**`response/pins/PinsDeleteResponse.kt`** — (empty)
Edit: `api/PinsResource.kt` + `internal/api/PinsResourceImpl.kt`

### Step E2: bookmarks.delete

**`request/bookmarks/BookmarksDeleteRequest.kt`** — params: `channel_id`, `bookmark_id`
**`response/bookmarks/BookmarksDeleteResponse.kt`** — (empty)
Edit: `api/BookmarksResource.kt` + `internal/api/BookmarksResourceImpl.kt`

### Step E3: admin.apps.approved/restricted.list

Add to existing `api/AdminResource.kt` + `internal/api/AdminResourceImpl.kt` (2 method pairs each).

**Request**: `admin/apps/approved/AdminAppsApprovedListRequest.kt`, `admin/apps/restricted/AdminAppsRestrictedListRequest.kt`
**Response**: `AdminAppsApprovedListResponse.kt`, `AdminAppsRestrictedListResponse.kt` — fields: `apps: Array<App>?`, `response_metadata: ResponseMetadata?`

**Note**: Check if existing `admin/apps/` request/response directories already have stub files from previous specs.

### Step E4: api.rateLimit

**`request/api/ApiRateLimitRequest.kt`** — params: (none, or empty)
**`response/api/ApiRateLimitResponse.kt`** — fields: headers as properties (x-ratelimit-limit, x-ratelimit-remaining, x-ratelimit-reset, x-ratelimit-primarylimit, x-ratelimit-secondarylimit, x-ratelimit-secondaryremaining)

**Note**: Rate limit info comes from response headers, not JSON body. May need special handling in `AbstractResourceImpl` or a custom response parser.

---

## Part F: Test Expansion

### Step F1: ChatPostEphemeralTest

**File**: `core/src/jvmTest/kotlin/work/socialhub/kslack/chat/ChatPostEphemeralTest.kt`

### Step F2: ConversationsListTest

**File**: `core/src/jvmTest/kotlin/work/socialhub/kslack/conversations/ConversationsListTest.kt`

### Step F3: FilesUploadTest

**File**: `core/src/jvmTest/kotlin/work/socialhub/kslack/files/FilesUploadTest.kt`
Tests `files.upload` via `filesGetUploadUrlExternal` + `filesCompleteUploadExternal` flow.

### Step F4: AdminConversationsTest

**File**: `core/src/jvmTest/kotlin/work/socialhub/kslack/admin/AdminConversationsTest.kt`

---

## Implementation Order

Execute steps in dependency order:

1. **Part A — Streaming** (highest priority, no REST dependencies)
   - Step A1 → A2 → A3 → A4 → A5 → A6 → A7
2. **Part B — admin.conversations** (independent new resource)
   - Step B1 → B2 → B3 → B4 → B5 → B6
3. **Part D — workflows** (independent new resource, can run in parallel with B)
   - Step D1 → D2 → D3 → D4 → D5
4. **Part C — views.home** (extension, independent)
   - Step C1 → C2 → C3
5. **Part E — Minor gaps** (all independent, can run in parallel)
   - Step E1, E2, E3, E4
6. **Part F — Tests** (depends on Part A, B, C implementations)
   - Step F1 → F4
7. **Build verification** — `./gradlew build`

---

## Design Notes

- **Streaming entity dispatch**: The 95 event types in `entity/event/` are already defined. The `EventDispatcher` should use `kotlinx.serialization` to deserialize JSON into the correct entity class based on event type.
- **Pre-serialized JSON arrays**: Parameters like `users` in admin.conversations methods that expect JSON arrays should use `String?` (pre-serialized JSON), following the existing `blocksAsString` pattern.
- **api.rateLimit response**: Rate limit information comes from HTTP response headers. The `ApiRateLimitResponse` should include header fields as properties, and the implementation should extract them from `HttpResponse.headers`.
- **AdminConversationsResource vs AdminResource**: A new `AdminConversationsResource` is preferred over extending `AdminResource` because:
  1. `admin.conversations.*` has 16 methods, nearly doubling `AdminResource`
  2. It's a distinct subsystem (enterprise channel management)
  3. Follows the pattern of separating concerns (like `AppsResource` is separate from `AdminResource`)
- **Streaming callback compatibility with JS**: Since JS exports suspend functions as Promises but not callback-based APIs, the `SlackStreamListener` callbacks will not be directly usable from JavaScript. This is acceptable — JS consumers will use the Promise-based API primarily. The streaming feature is most valuable for JVM/Native platforms.

---

## Risks & Mitigations

| Risk | Mitigation |
|------|------------|
| WebSocket support may differ across platforms (JVM vs Native vs JS) | `kmastodon/stream` already uses `WebsocketRequest` successfully — reuse the same approach. JS platform will have limited streaming support (document this). |
| 95 event types cannot all be in the listener interface at once | Start with ~15 most common events. Add more callbacks incrementally. Consider a generic `onEvent(type: String, data: JsonElement)` fallback method. |
| Rate limit headers require special parsing | Extract from `HttpResponse.headers` in `AbstractResourceImpl`. Document that `api.rateLimit` provides HTTP header info, not body. |
| admin.conversations methods require enterprise workspace | Document scope requirements. Tests will be skipped if admin scope is not available (follow existing pattern of checking `AbstractTest.hasSecrets`). |
| Pre-existing build errors may mask new issues | Filter build output for files touched by this change only. |

---

## File Summary

### New Files (~90)

| Category | Count |
|----------|-------|
| Entities (admin.conversations, workflows) | ~10 |
| Request classes (admin.conversations + workflows + minor gaps) | ~25 |
| Response classes (admin.conversations + workflows + minor gaps) | ~28 |
| Stream module (listener, client, dispatcher, event mapper) | ~5 |
| Resource interfaces (AdminConversationsResource, WorkflowsResource) | 2 |
| Resource implementations | 2 |
| Test files (stream + core) | ~5 |

### Existing Files Modified (~20)

| File | Change |
|------|--------|
| `Methods.kt` | ~33 new constants |
| `Slack.kt` | 2 new resource accessors, remove TODO comment, add stream() accessor |
| `SlackImpl.kt` | 3 new resource instances |
| `SlackStream.kt` | Major update |
| `SlackStreamImpl.kt` | Major update |
| `SlackFactory.kt` | Add listener-aware factory overload |
| `AdminResource.kt` | +2 method pairs (admin.apps.approved/restricted.list) |
| `AdminResourceImpl.kt` | +2 implementations |
| `ViewsResource.kt` / `ViewsResourceImpl.kt` | +1 method pair |
| `PinsResource.kt` / `PinsResourceImpl.kt` | +1 method pair |
| `BookmarksResource.kt` / `BookmarksResourceImpl.kt` | +1 method pair |
| `ApiResource.kt` / `ApiResourceImpl.kt` | +1 method pair |
| New: `AdminConversationsResource.kt` / `AdminConversationsResourceImpl.kt` | 16 method pairs |
| New: `WorkflowsResource.kt` / `WorkflowsResourceImpl.kt` | 3 method pairs |
| New: `SlackStreamListener.kt` | Event listener interface |
| New: `SocketModeClient.kt` | WebSocket client |
| New: `EventTypeMapper.kt` | Event type → entity mapping |
| New: `EventDispatcher.kt` | Event dispatching logic |

---

## Verification

1. `./gradlew build` — Compilation passes (pre-existing errors are acceptable)
2. All new Request classes implement `SlackApiRequest` + `FormRequest`
3. All new Response classes have `@Serializable` + `@JsExport`
4. New resources correctly wired in `Slack.kt` / `SlackImpl.kt`
5. `SlackStream` starts/stops/connects correctly
6. `SocketModeClient` handles reconnect with backoff
7. All tests pass (or are properly skipped when secrets unavailable)
