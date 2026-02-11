# Design: Implement High Priority Slack APIs

## Architecture Overview

kslack uses a resource-based API pattern. Every Slack API method follows the same structure:

```
Methods.kt (constant) → Request class → Response class → Resource interface → ResourceImpl class
```

The `Slack` interface exposes resource accessors (e.g., `fun calls(): CallsResource`), and `SlackImpl` wires them to `ResourceImpl` instances. Each API method has two variants: `suspend fun` (coroutine) and `fun ...Blocking()` (synchronous).

### Key Base Classes & Interfaces

| Class/Interface | Path | Purpose |
|----------------|------|---------|
| `SlackApiRequest` | `core/.../api/methods/SlackApiRequest.kt` | Marker interface; requires `val token: String?` |
| `FormRequest` | `core/.../api/methods/FormRequest.kt` | Provides `toMap()` and `toParams()` for form encoding |
| `SlackApiResponse` | `core/.../api/methods/SlackApiResponse.kt` | Base response with `isOk`, `warning`, `error`, `needed`, `provided` |
| `AbstractResourceImpl` | `core/.../api/methods/impl/AbstractResourceImpl.kt` | Provides `postFormWithToken()`, `postForm()`, `postMultipartWithToken()` |

All paths below are relative to `core/src/commonMain/kotlin/work/socialhub/kslack/`.

---

## Step 1: Entity Creation

### 1a. `entity/call/Call.kt` (new)

```kotlin
@JsExport
@Serializable
class Call {
    var id: String? = null
    var dateCreated: Long? = null
    var externalUniqueId: String? = null
    var joinUrl: String? = null
    var desktopAppJoinUrl: String? = null
    var externalDisplayId: String? = null
    var title: String? = null
    var users: Array<CallParticipant>? = null
    var channels: Array<String>? = null
}
```

### 1b. `entity/call/CallParticipant.kt` (new)

```kotlin
@JsExport
@Serializable
class CallParticipant {
    var slackId: String? = null
    var externalId: String? = null
    var displayName: String? = null
    var avatarUrl: String? = null
}
```

### 1c. `entity/connect/SharedInvite.kt` (new)

Defines `SharedInvite`, `SharedInviteChannel`, and `SharedInvitePayload` in the same file.

```kotlin
@JsExport
@Serializable
class SharedInvite {
    var id: String? = null
    var direction: String? = null
    var dateCreated: Long? = null
    var dateInvalid: Long? = null
    var inviteType: String? = null
    var status: String? = null
    var channel: SharedInviteChannel? = null
    var invitePayload: SharedInvitePayload? = null
}

@JsExport
@Serializable
class SharedInviteChannel {
    var id: String? = null
    var name: String? = null
    var isPrivate: Boolean? = null
}

@JsExport
@Serializable
class SharedInvitePayload {
    var recipientUserId: String? = null
    var recipientEmail: String? = null
}
```

---

## Step 2: calls.* (New Resource — 6 methods)

### 2.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val CALLS_ADD: String = "calls.add"
const val CALLS_END: String = "calls.end"
const val CALLS_INFO: String = "calls.info"
const val CALLS_UPDATE: String = "calls.update"
const val CALLS_PARTICIPANTS_ADD: String = "calls.participants.add"
const val CALLS_PARTICIPANTS_REMOVE: String = "calls.participants.remove"
```

### 2.2 Request Classes (6 files in `api/methods/request/calls/`)

**`CallsAddRequest.kt`**
- Params: `externalUniqueId`, `joinUrl`, `createdBy?`, `dateStart?: Long`, `desktopAppJoinUrl?`, `externalDisplayId?`, `title?`, `users?: String` (pre-serialized JSON array)

**`CallsEndRequest.kt`**
- Params: `id`, `duration?: Int`

**`CallsInfoRequest.kt`**
- Params: `id`

**`CallsUpdateRequest.kt`**
- Params: `id`, `desktopAppJoinUrl?`, `joinUrl?`, `title?`

**`participants/CallsParticipantsAddRequest.kt`**
- Params: `id`, `users: String?` (pre-serialized JSON array)

**`participants/CallsParticipantsRemoveRequest.kt`**
- Params: `id`, `users: String?` (pre-serialized JSON array)

### 2.3 Response Classes (6 files in `api/methods/response/calls/`)

**`CallsAddResponse.kt`** — `call: Call?`
**`CallsEndResponse.kt`** — (empty, extends `SlackApiResponse()`)
**`CallsInfoResponse.kt`** — `call: Call?`
**`CallsUpdateResponse.kt`** — `call: Call?`
**`participants/CallsParticipantsAddResponse.kt`** — (empty)
**`participants/CallsParticipantsRemoveResponse.kt`** — (empty)

### 2.4 Resource Interface

**File**: `api/CallsResource.kt` (new)
- 6 suspend methods + 6 blocking methods = 12 total
- Pattern: `@JsExport` interface, `@JsExport.Ignore` on blocking methods

### 2.5 Resource Implementation

**File**: `internal/api/CallsResourceImpl.kt` (new)
- Extends `AbstractResourceImpl(token)`, implements `CallsResource`
- All methods use `postFormWithToken(req.toParams(), Methods.CALLS_*, getToken(req))`
- Blocking methods use `toBlocking { ... }`

### 2.6 Wiring

**File**: `Slack.kt` — Add `fun calls(): CallsResource`
**File**: `internal/SlackImpl.kt` — Add `CallsResourceImpl(token)` field + accessor

---

## Step 3: openid.connect.* (New Resource — 2 methods)

### 3.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val OPENID_CONNECT_TOKEN: String = "openid.connect.token"
const val OPENID_CONNECT_USER_INFO: String = "openid.connect.userInfo"
```

### 3.2 Request Classes (2 files in `api/methods/request/openid/connect/`)

**`OpenIDConnectTokenRequest.kt`**
- Params: `clientId`, `clientSecret`, `code`, `redirectUri?`, `grantType?`, `refreshToken?`
- Note: No bearer token needed — credentials are sent in form body

**`OpenIDConnectUserInfoRequest.kt`**
- Params: `token` only (no additional parameters)

### 3.3 Response Classes (2 files in `api/methods/response/openid/connect/`)

**`OpenIDConnectTokenResponse.kt`**
- Fields: `accessToken`, `tokenType`, `idToken`, `refreshToken`, `expiresIn: Int?`, `scope`, `teamId`, `enterpriseId`

**`OpenIDConnectUserInfoResponse.kt`**
- Fields: `sub`, `email`, `emailVerified: Boolean?`, `name`, `picture`, `givenName`, `familyName`, `locale`, `teamId`

### 3.4 Resource Interface & Implementation

**File**: `api/OpenIDConnectResource.kt` (new) — 2 suspend + 2 blocking = 4 methods

**File**: `internal/api/OpenIDConnectResourceImpl.kt` (new)
- `openIDConnectToken`: Uses `postForm()` (no bearer token, credentials in form body)
- `openIDConnectUserInfo`: Uses `postFormWithToken()`

### 3.5 Wiring

**File**: `Slack.kt` — Add `fun openIDConnect(): OpenIDConnectResource`
**File**: `internal/SlackImpl.kt` — Add `OpenIDConnectResourceImpl(token)` field + accessor

---

## Step 4: Slack Connect Conversations (6 methods — ConversationsResource extension)

### 4.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val CONVERSATIONS_ACCEPT_SHARED_INVITE: String = "conversations.acceptSharedInvite"
const val CONVERSATIONS_APPROVE_SHARED_INVITE: String = "conversations.approveSharedInvite"
const val CONVERSATIONS_CANVASES_CREATE: String = "conversations.canvases.create"
const val CONVERSATIONS_DECLINE_SHARED_INVITE: String = "conversations.declineSharedInvite"
const val CONVERSATIONS_INVITE_SHARED: String = "conversations.inviteShared"
const val CONVERSATIONS_LIST_CONNECT_INVITES: String = "conversations.listConnectInvites"
```

### 4.2 Request Classes (6 files in `api/methods/request/conversations/`)

| File | Key Parameters |
|------|---------------|
| `ConversationsAcceptSharedInviteRequest.kt` | `channelName`, `channelId?`, `freeTrialAccepted?: Boolean`, `inviteId?`, `isPrivate?: Boolean`, `teamId?` |
| `ConversationsApproveSharedInviteRequest.kt` | `inviteId`, `targetApprovalsChannelId?` |
| `ConversationsCanvasesCreateRequest.kt` | `channelId`, `documentContent?: String` (JSON string) |
| `ConversationsDeclineSharedInviteRequest.kt` | `inviteId`, `targetApprovalsChannelId?` |
| `ConversationsInviteSharedRequest.kt` | `channel`, `emails?: String` (comma-separated), `userIds?: String` (comma-separated), `externalLimited?: Boolean` |
| `ConversationsListConnectInvitesRequest.kt` | `count?: Int`, `cursor?`, `teamId?` |

### 4.3 Response Classes (6 files in `api/methods/response/conversations/`)

| File | Fields |
|------|--------|
| `ConversationsAcceptSharedInviteResponse.kt` | `implicitApproval: Boolean?`, `channelId: String?` |
| `ConversationsApproveSharedInviteResponse.kt` | (empty) |
| `ConversationsCanvasesCreateResponse.kt` | `canvasId: String?` |
| `ConversationsDeclineSharedInviteResponse.kt` | (empty) |
| `ConversationsInviteSharedResponse.kt` | `inviteId: String?`, `confCode: String?`, `isLegacySharedChannel: Boolean?` |
| `ConversationsListConnectInvitesResponse.kt` | `invites: Array<SharedInvite>?`, `responseMetadata: ResponseMetadata?` |

### 4.4 Existing File Edits

- `api/ConversationsResource.kt` — Add 6 method pairs (12 methods)
- `internal/api/ConversationsResourceImpl.kt` — Add 6 implementations + 6 blocking wrappers

---

## Step 5: conversations.requestSharedInvite.* (3 methods — ConversationsResource extension)

### 5.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val CONVERSATIONS_REQUEST_SHARED_INVITE_APPROVE: String = "conversations.requestSharedInvite.approve"
const val CONVERSATIONS_REQUEST_SHARED_INVITE_DENY: String = "conversations.requestSharedInvite.deny"
const val CONVERSATIONS_REQUEST_SHARED_INVITE_LIST: String = "conversations.requestSharedInvite.list"
```

### 5.2 Request Classes (3 files in `api/methods/request/conversations/`)

| File | Key Parameters |
|------|---------------|
| `ConversationsRequestSharedInviteApproveRequest.kt` | `inviteId`, `channelId?` |
| `ConversationsRequestSharedInviteDenyRequest.kt` | `inviteId` |
| `ConversationsRequestSharedInviteListRequest.kt` | `cursor?`, `limit?: Int`, `isApproved?: Boolean` |

### 5.3 Response Classes (3 files in `api/methods/response/conversations/`)

| File | Fields |
|------|--------|
| `ConversationsRequestSharedInviteApproveResponse.kt` | (empty) |
| `ConversationsRequestSharedInviteDenyResponse.kt` | (empty) |
| `ConversationsRequestSharedInviteListResponse.kt` | `invites: Array<SharedInvite>?`, `responseMetadata: ResponseMetadata?` |

### 5.4 Existing File Edits

- `api/ConversationsResource.kt` — Add 3 method pairs (6 methods)
- `internal/api/ConversationsResourceImpl.kt` — Add 3 implementations + 3 blocking wrappers

---

## Step 6: Chat Streaming (3 methods — ChatResource extension)

### 6.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val CHAT_START_STREAM: String = "chat.startStream"
const val CHAT_APPEND_STREAM: String = "chat.appendStream"
const val CHAT_STOP_STREAM: String = "chat.stopStream"
```

### 6.2 Request Classes (3 files in `api/methods/request/chat/`)

| File | Key Parameters |
|------|---------------|
| `ChatStartStreamRequest.kt` | `channel`, `threadTs?`, `text?` |
| `ChatAppendStreamRequest.kt` | `streamId`, `channel`, `text` |
| `ChatStopStreamRequest.kt` | `streamId`, `channel` |

### 6.3 Response Classes (3 files in `api/methods/response/chat/`)

| File | Fields |
|------|--------|
| `ChatStartStreamResponse.kt` | `streamId: String?`, `channel: String?`, `ts: String?` |
| `ChatAppendStreamResponse.kt` | (empty) |
| `ChatStopStreamResponse.kt` | `channel: String?`, `ts: String?` |

### 6.4 Existing File Edits

- `api/ChatResource.kt` — Add 3 method pairs (6 methods)
- `internal/api/ChatResourceImpl.kt` — Add 3 implementations + 3 blocking wrappers

---

## Step 7: auth.teams.list (1 method — AuthResource extension)

### 7.1 Method Constant

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val AUTH_TEAMS_LIST: String = "auth.teams.list"
```

### 7.2 Request/Response

**`request/auth/AuthTeamsListRequest.kt`** (new)
- Params: `cursor?`, `includeIcon?: Boolean`, `limit?: Int`

**`response/auth/AuthTeamsListResponse.kt`** (new)
- Fields: `teams: Array<Team>?` (reuses existing `entity/team/Team.kt`), `responseMetadata: ResponseMetadata?`

### 7.3 Existing File Edits

- `api/AuthResource.kt` — Add 1 method pair (2 methods)
- `internal/api/AuthResourceImpl.kt` — Add 1 implementation + 1 blocking wrapper

---

## Step 8: oauth.v2.exchange (1 method — OAuthResource extension)

### 8.1 Method Constant

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val OAUTH_V2_EXCHANGE: String = "oauth.v2.exchange"
```

### 8.2 Request/Response

**`request/oauth/OAuthV2ExchangeRequest.kt`** (new)
- Params: `token`, `clientId`, `clientSecret`

**`response/oauth/OAuthV2ExchangeResponse.kt`** (new)
- Fields: `accessToken`, `scope`, `tokenType`, `botUserId`, `team`, `enterprise`, `authedUser`
- Type structure similar to `OAuthV2AccessResponse`

### 8.3 Existing File Edits

- `api/OAuthResource.kt` — Add 1 method pair (2 methods)
- `internal/api/OAuthResourceImpl.kt` — Add with `TODO("Not yet implemented")` (matches existing pattern where all OAuth impl methods are TODO)

---

## Step 9: team.* Expansion (4 methods — TeamResource extension)

### 9.1 Method Constants

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val TEAM_BILLING_INFO: String = "team.billing.info"
const val TEAM_EXTERNAL_TEAMS_DISCONNECT: String = "team.externalTeams.disconnect"
const val TEAM_EXTERNAL_TEAMS_LIST: String = "team.externalTeams.list"
const val TEAM_PREFERENCES_LIST: String = "team.preferences.list"
```

### 9.2 Request Classes (4 files)

| File | Key Parameters |
|------|---------------|
| `request/team/billing/TeamBillingInfoRequest.kt` | `token` only |
| `request/team/external_teams/TeamExternalTeamsDisconnectRequest.kt` | `targetTeam` |
| `request/team/external_teams/TeamExternalTeamsListRequest.kt` | `connectionStatusFilter?`, `cursor?`, `limit?: Int`, `slackConnectPrefFilter?`, `sortDirection?`, `sortField?`, `workspaceFilter?` |
| `request/team/preferences/TeamPreferencesListRequest.kt` | `token` only |

### 9.3 Response Classes (4 files)

| File | Fields |
|------|--------|
| `response/team/billing/TeamBillingInfoResponse.kt` | `plan: String?` |
| `response/team/external_teams/TeamExternalTeamsDisconnectResponse.kt` | (empty) |
| `response/team/external_teams/TeamExternalTeamsListResponse.kt` | `organizations: Array<ExternalTeam>?`, `responseMetadata: ResponseMetadata?` — `ExternalTeam` defined inline in response file |
| `response/team/preferences/TeamPreferencesListResponse.kt` | `allowMessageDeletion: Boolean?` and other key preference fields |

### 9.4 Existing File Edits

- `api/TeamResource.kt` — Add 4 method pairs (8 methods)
- `internal/api/TeamResourceImpl.kt` — Add 4 implementations + 4 blocking wrappers

---

## Step 10: users.discoverableContacts.lookup (1 method — UsersResource extension)

### 10.1 Method Constant

**File**: `api/methods/Methods.kt` — Add:
```kotlin
const val USERS_DISCOVERABLE_CONTACTS_LOOKUP: String = "users.discoverableContacts.lookup"
```

### 10.2 Request/Response

**`request/users/UsersDiscoverableContactsLookupRequest.kt`** (new)
- Params: `email`, `visibility?`

**`response/users/UsersDiscoverableContactsLookupResponse.kt`** (new)
- Fields: `user: User?` (reuses existing `entity/user/User.kt`)

### 10.3 Existing File Edits

- `api/UsersResource.kt` — Add 1 method pair (2 methods)
- `internal/api/UsersResourceImpl.kt` — Add 1 implementation + 1 blocking wrapper

---

## Step 11: Stream Module TODO Comments

Add TODO comments at the following locations:

1. **`api/methods/response/apps/connections/AppsConnectionsOpenResponse.kt`** — On `url` field:
   ```
   // TODO: Stream module — This url is a WebSocket URL.
   // Use this URL in the stream/ module to implement Socket Mode connections.
   // See: https://api.slack.com/apis/connections/socket-implement
   ```

2. **`api/AppsResource.kt`** — Near `appsConnectionsOpen` method:
   ```
   // TODO: Stream module — Socket Mode WebSocket connection should be implemented in stream/ module.
   ```

3. **`Slack.kt`** — At class level:
   ```
   // TODO: Stream module — Add stream() accessor for Socket Mode event delivery.
   ```

---

## Implementation Order

Execute steps in dependency order to avoid compilation errors:

1. **Step 1** — Entities (all others depend on these)
2. **Step 2** — calls.* (independent new resource)
3. **Step 3** — openid.connect.* (independent new resource)
4. **Steps 4-5** — Conversations Slack Connect + requestSharedInvite (depends on SharedInvite entity)
5. **Step 6** — Chat streaming (independent extension)
6. **Step 7** — auth.teams.list (independent extension)
7. **Step 8** — oauth.v2.exchange (independent extension)
8. **Step 9** — team.* expansion (independent extension)
9. **Step 10** — users.discoverableContacts.lookup (independent extension)
10. **Step 11** — TODO comments
11. **Build verification** — `./gradlew build`

---

## Design Notes

- **`users` parameter (calls.*)**: Slack API expects a JSON array of participants. Accept as `String?` (pre-serialized JSON), following the existing `blocksAsString` pattern used elsewhere in the codebase.
- **OpenID Connect token**: OAuth-style endpoint, so use `postForm()` (no bearer token) — credentials go in form body.
- **OAuthResourceImpl**: All existing methods are `TODO("Not yet implemented")`, so `oauthV2Exchange` follows the same pattern.
- **Sub-package naming**: Follow existing `snake_case` convention (`scheduled_messages/`, `external_teams/`, etc.).
- **ResponseMetadata**: Paginated responses use existing `entity/ResponseMetadata` class with `nextCursor` field.
- **ExternalTeam (team.externalTeams.list)**: Defined as an inline `@Serializable` class within the response file, since it's only used by that response.

---

## Risks & Mitigations

| Risk | Mitigation |
|------|------------|
| JSON array parameters (calls.participants) may need special serialization | Use `String?` (pre-serialized JSON) pattern, consistent with existing `blocksAsString` |
| OpenID Connect token endpoint differs from standard token-based API | Use `postForm()` instead of `postFormWithToken()` |
| OAuthResourceImpl has no real implementations (all TODO) | Follow existing pattern; `oauthV2Exchange` also uses `TODO()` |
| Pre-existing build errors may mask new issues | Filter build output for files touched by this change |

---

## File Summary

### New Files (~49)

| Category | Count |
|----------|-------|
| Entities (Call, CallParticipant, SharedInvite + sub-types) | 3 |
| Request classes | 22 |
| Response classes | 22 |
| Resource interfaces (CallsResource, OpenIDConnectResource) | 2 |
| Resource implementations (CallsResourceImpl, OpenIDConnectResourceImpl) | 2 |

### Existing Files Modified (~13)

| File | Change |
|------|--------|
| `Methods.kt` | 27 new constants |
| `Slack.kt` | 2 resource accessors + TODO comment |
| `SlackImpl.kt` | 2 resource instances |
| `ConversationsResource.kt` / `ConversationsResourceImpl.kt` | 9 method pairs |
| `ChatResource.kt` / `ChatResourceImpl.kt` | 3 method pairs |
| `AuthResource.kt` / `AuthResourceImpl.kt` | 1 method pair |
| `OAuthResource.kt` / `OAuthResourceImpl.kt` | 1 method pair |
| `TeamResource.kt` / `TeamResourceImpl.kt` | 4 method pairs |
| `UsersResource.kt` / `UsersResourceImpl.kt` | 1 method pair |
| `AppsConnectionsOpenResponse.kt` | TODO comment |
| `AppsResource.kt` | TODO comment |

---

## Verification

1. `./gradlew build` — Compilation passes (pre-existing errors are acceptable)
2. All new Request classes implement `SlackApiRequest` + `FormRequest`
3. All new Response classes have `@Serializable` + `@JsExport`
4. New resources are correctly wired in `Slack.kt` / `SlackImpl.kt`
5. TODO comments are placed at all Stream module integration points
