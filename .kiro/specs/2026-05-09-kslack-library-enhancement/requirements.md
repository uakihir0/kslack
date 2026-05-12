# Requirements: kslack Library Enhancement — Socket Mode Streaming & API Gap Filling

## Background

kslack is a Kotlin Multiplatform Slack API client library that currently provides REST API bindings for the Slack Web API. It supports 24 Resource interfaces, 95 event types, and covers many major API areas (admin, chat, conversations, users, files, search, etc.).

However, a thorough investigation revealed significant gaps that prevent kslack from being a fully functional SNS client library:

1. **The `stream` module is entirely a stub** — `SlackStream` contains only a `token()` method with no WebSocket implementation. In contrast, the companion library `kmastodon` has a fully functional stream module with WebSocket connections, event listeners, and multiple stream types (user, public, hashtag).
2. **Major Slack API endpoints are missing** — notably `admin.conversations.*` (enterprise channel administration), `views.home`, `workflows.*`, and various other endpoints that are commonly needed.
3. **Test coverage is minimal** — only 4 test files exist (Auth, ChatPostMessage, AbstractTest, AbstractResourceImplTest).

This spec addresses these gaps to make kslack a production-ready Slack client library.

### Scope

- **In scope**: Socket Mode streaming implementation, admin.conversations API, views.home API, workflows API, minor API gap fixes, test expansion
- **Out of scope**: RTM API (legacy, low priority), channels./groups.* (legacy, replaced by conversations.*), webhooks.* (low priority), admin.barriers/auth/categories/events/functions/roles/userblocks/wiz (low priority)

## Goals

- Implement Socket Mode WebSocket streaming with event dispatching and auto-reconnect
- Implement `admin.conversations.*` — the most significant REST API gap (enterprise channel admin)
- Implement `views.home` and `workflows.*` — moderately used modern APIs
- Fix minor API gaps (pins.delete, bookmarks.delete, admin.apps.approved/restricted.list)
- Expand test coverage beyond the current 4 test files

## Functional Requirements

### FR-1: Socket Mode Streaming (stream module — highest priority)

Socket Mode allows apps to receive events via WebSocket instead of HTTP callbacks. This is the recommended way to build Slack apps.

#### FR-1a: Event Listener Interface

Define `SlackStreamListener` interface with callback methods for event types:

| Method | Event Type | Description |
|--------|-----------|-------------|
| `onMessage(event)` | `message` | Incoming messages |
| `onAppMention(event)` | `app_mention` | Mentions of the bot |
| `onChannelCreated(event)` | `channel_created` | New channels |
| `onChannelDeleted(event)` | `channel_deleted` | Deleted channels |
| `onMemberJoinedChannel(event)` | `member_joined_channel` | Members joining |
| `onMemberLeftChannel(event)` | `member_left_channel` | Members leaving |
| `onReactionAdded(event)` | `reaction_added` | Reactions added |
| `onReactionRemoved(event)` | `reaction_removed` | Reactions removed |
| `onFileShared(event)` | `file_shared` | Files shared |
| `onFileDeleted(event)` | `file_deleted` | Files deleted |
| `onError(event, error)` | — | Error handling |
| `onOpen()` | — | Connection opened |
| `onClose()` | — | Connection closed |

Slack already has 95 event type entities in `entity/event/`. The listener should map event types to these entities.

#### FR-1b: Socket Mode Client

`SlackSocketModeClient` manages the WebSocket connection lifecycle:

1. **Initialization**: Call `apps.connections.open` to obtain a WebSocket URL
2. **WebSocket connection**: Open WebSocket to the URL from step 1
3. **Message handling**: Parse incoming JSON, dispatch to `SlackStreamListener`
4. **Heartbeat (ack)**: Respond to `socket_mode_enqueue` events with `{type: "ack"}`
5. **Auto-reconnect**: Implement exponential backoff reconnection on disconnect (except when intentionally closed)
6. **Close**: Graceful shutdown with `close()` method

#### FR-1c: SlackStream Interface Update

Update `SlackStream` interface:

| Method | Description |
|--------|-------------|
| `start(listener: SlackStreamListener)` | Start streaming with event listener |
| `stop()` | Stop and close the WebSocket connection |
| `isConnected(): Boolean` | Check connection status |
| `token(): String` | Existing — get the token |

#### FR-1d: Slack Integration

Add `stream(): SlackStream` accessor to `Slack` interface and wire in `SlackImpl`.

### FR-2: admin.conversations.* (New Resource)

Enterprise channel administration — the most significant REST API gap.

| Method | Slack API | Description |
|--------|-----------|-------------|
| `adminConversationsCreate` | `admin.conversations.create` | Create a public or private channel |
| `adminConversationsBan` | `admin.conversations.ban` | Ban a user from a channel |
| `adminConversationsUnban` | `admin.conversations.unban` | Unban a user |
| `adminConversationsArchive` | `admin.conversations.archive` | Archive a channel |
| `adminConversationsUnarchive` | `admin.conversations.unarchive` | Unarchive a channel |
| `adminConversationsConnect` | `admin.conversations.connect` | Connect channel to another workspace |
| `adminConversationsDisconnect` | `admin.conversations.disconnect` | Disconnect channel |
| `adminConversationsSearch` | `admin.conversations.search` | Search channels |
| `adminConversationsGetCustomRetention` | `admin.conversations.getCustomRetention` | Get retention setting |
| `adminConversationsSetCustomRetention` | `admin.conversations.setCustomRetention` | Set retention setting |
| `adminConversationsDelete` | `admin.conversations.delete` | Delete a channel |
| `adminConversationsGetCustomClassification` | `admin.conversations.getCustomClassification` | Get classification |
| `adminConversationsSetCustomClassification` | `admin.conversations.setCustomClassification` | Set classification |
| `adminConversationsRestrictAccessAdd` | `admin.conversations.restrictAccess.add` | Add access group |
| `adminConversationsRestrictAccessList` | `admin.conversations.restrictAccess.list` | List access groups |
| `adminConversationsRestrictAccessRemove` | `admin.conversations.restrictAccess.remove` | Remove access group |

New entities required:
- `AdminConversation` — Channel info with workspace details
- `AdminConversationBanUser` — User in ban context (userId, teamId)
- `AdminConversationConnectWorkspace` — Workspace info for connect
- `AdminConversationRestriction` — Restriction target info
- `AdminConversationCustomRetention` — Retention setting

### FR-3: views.home (ViewsResource extension)

Update Home tab configuration for app home.

| Method | Slack API | Description |
|--------|-----------|-------------|
| `viewsHomeUpdate` | `views.home.update` | Update home tabs |

- 1 method pair (2 methods: suspend + blocking)
- Request: `ViewsHomeUpdateRequest` — fields: `homeTabConfig` (LayoutBlock), `user_id?`, `external_binding_id?`, `external_binding_method?`

### FR-4: workflows.* (New Resource)

Workflow steps management (Beta).

| Method | Slack API | Description |
|--------|-----------|-------------|
| `workflowsStepsComplete` | `workflows.steps.complete` | Complete a workflow step |
| `workflowsStepsSkip` | `workflows.steps.skip` | Skip a workflow step |
| `workflowsStepsCancel` | `workflows.steps.cancel` | Cancel a workflow step |

New entities required:
- `WorkflowStep` — Workflow step info with id, version, callback_id

### FR-5: Minor API Gap Fixes

| # | Resource | Method | Slack API | Description |
|---|----------|--------|-----------|-------------|
| 5-1 | `PinsResource` | `pinsDelete` | `pins.delete` | Delete pinned message (existing: pins.add, pins.list, pins.remove) |
| 5-2 | `BookmarksResource` | `bookmarksDelete` | `bookmarks.delete` | Delete bookmark (existing: bookmarks.add, bookmarks.edit, bookmarks.list, bookmarks.remove) |
| 5-3 | `AdminResource` | `adminAppsApprovedList` | `admin.apps.approved.list` | List approved apps |
| 5-4 | `AdminResource` | `adminAppsRestrictedList` | `admin.apps.restricted.list` | List restricted apps |
| 5-5 | `ApiResource` | `apiRateLimit` | `api.rateLimit` | Get rate limit info |

### FR-6: Test Expansion

| # | Test File | Coverage |
|---|-----------|----------|
| 6-1 | `ChatPostMessageTest` (existing) | Already exists |
| 6-2 | `AuthTest` (existing) | Already exists |
| 6-3 | `ChatStreamingTest` | Socket Mode streaming (start, events, reconnect, close) |
| 6-4 | `ChatPostEphemeralTest` | chat.postEphemeral |
| 6-5 | `ConversationsListTest` | conversations.list |
| 6-6 | `FilesUploadTest` | files.upload (multipart) |
| 6-7 | `AdminConversationsTest` | admin.conversations.create (if admin scope available) |

### FR-7: Stream Module TODO Removal

Remove the existing TODO comment in `Slack.kt` about adding `stream()` accessor since this spec implements it.

## Non-Functional Requirements

### NFR-1: Socket Mode WebSocket Library

Use `khttpclient`'s `WebsocketRequest` class (already used by `kmastodon/stream`). The same class is available since `kslack` depends on `khttpclient`.

### NFR-2: Consistent Architecture

All new REST API methods must follow the existing resource-based architecture pattern:
- Method constant in `Methods.kt`
- Request class implementing `SlackApiRequest` and `FormRequest`
- Response class extending `SlackApiResponse` with `@Serializable` and `@JsExport`
- Suspend + blocking method variants in Resource interface and ResourceImpl
- `@JsExport` on interfaces, `@JsExport.Ignore` on blocking methods

### NFR-3: Naming Conventions

- Sub-package names: `snake_case` (e.g., `restrict_access/`, `custom_retention/`)
- Method constant names: `UPPER_SNAKE_CASE`
- Kotlin property names: `camelCase`
- New entity classes: singular form

### NFR-4: Compilation Verification

The project must compile successfully (`./gradlew build`) after all changes. Pre-existing build errors are acceptable.

### NFR-5: Streaming Error Handling

- Auto-reconnect uses exponential backoff starting at 1 second, max 30 seconds
- Connection timeout: 10 seconds
- Reconnect attempts: unlimited (until `stop()` is called)
- Distinguish between intentional close (user called `stop()`) and accidental disconnect

### NFR-6: Entity Reuse

Reuse existing entity classes where applicable:
- `entity/channel/Channel.kt` for channel-related admin.conversations responses
- `entity/user/User.kt` for user-related responses
- `entity/ResponseMetadata` for paginated responses

### NFR-7: JsExport for Streaming

- `SlackStream` interface: `@JsExport`
- `SlackStreamListener` interface: `@JsExport`
- `SlackSocketModeClient` callbacks: must be compatible with JavaScript interop

## File Count Summary

### New Files (~85)

| Category | Count |
|----------|-------|
| Entities (admin.conversations, workflows, view home) | ~10 |
| Request classes (admin.conversations + workflows + minor gaps) | ~25 |
| Response classes (admin.conversations + workflows + minor gaps) | ~28 |
| Stream module (listener, client, dispatcher) | ~5 |
| Resource interfaces (AdminConversations, Workflows) | 2 |
| Resource implementations | 2 |
| Test files | ~4 |

### Existing Files Modified (~15)

| File | Change |
|------|--------|
| `Methods.kt` | ~30 new constants |
| `Slack.kt` | 2 new resource accessors + update TODO comment |
| `SlackImpl.kt` | 2 new resource instances |
| `SlackStream.kt` | Major update (start, stop, isConnected) |
| `AdminResource.kt` | 16 new method pairs |
| `ViewsResource.kt` | 1 new method pair |
| `PinsResource.kt` | 1 new method pair |
| `BookmarksResource.kt` | 1 new method pair |
| `ApiResource.kt` | 1 new method pair |
| `admin/` subdirs (new AdminConversationsResource/AdminConversationsResourceImpl) | New |
| `workflows/` subdirs (new WorkflowsResource/WorkflowsResourceImpl) | New |
