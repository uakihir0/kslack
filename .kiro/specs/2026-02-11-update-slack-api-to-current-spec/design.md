# Design: Update kslack to Current Slack API Specification

## Architecture Overview

kslack uses a resource-based API pattern. Every Slack API method follows the same structure:

```
Methods.kt (constant) → Request class → Response class → Resource interface → ResourceImpl class
```

The `Slack` interface exposes resource accessors (e.g., `fun files(): FilesResource`), and `SlackImpl` wires them to `ResourceImpl` instances. Each API method has two variants: `suspend fun` (coroutine) and `fun ...Blocking()` (synchronous).

### Key Base Classes & Interfaces

| Class/Interface | Path | Purpose |
|----------------|------|---------|
| `SlackApiRequest` | `core/.../api/methods/SlackApiRequest.kt` | Marker interface; requires `val token: String?` |
| `FormRequest` | `core/.../api/methods/FormRequest.kt` | Provides `toMap()` and `toParams()` for form encoding |
| `SlackApiResponse` | `core/.../api/methods/SlackApiResponse.kt` | Base response with `isOk`, `warning`, `error`, `needed`, `provided` |
| `AbstractResourceImpl` | `core/.../api/methods/impl/AbstractResourceImpl.kt` | Provides `postFormWithToken()`, `postForm()`, `postMultipartWithToken()` |

All paths below are relative to `core/src/commonMain/kotlin/work/socialhub/kslack/`.

---

## Step 1: Move Misplaced File Before Deletion

`UsersLookupByEmailResponse` is in `response/channels/` but used by `UsersResource`. Must move before deleting `channels` package.

| Action | File |
|--------|------|
| Move | `api/methods/response/channels/UsersLookupByEmailResponse.kt` → `api/methods/response/users/UsersLookupByEmailResponse.kt` |
| Edit | Update package declaration to `response.users` |
| Edit | `internal/api/UsersResourceImpl.kt` — update import |

---

## Step 2: Add New File Upload API

Add the replacement before removing the old API.

### 2.1 Method Constants

**File**: `api/methods/Methods.kt` — Add in the `files` section:
```kotlin
const val FILES_GET_UPLOAD_URL_EXTERNAL: String = "files.getUploadURLExternal"
const val FILES_COMPLETE_UPLOAD_EXTERNAL: String = "files.completeUploadExternal"
```

### 2.2 Request Classes

**File**: `api/methods/request/files/FilesGetUploadURLExternalRequest.kt` (new)
```kotlin
@JsExport
class FilesGetUploadURLExternalRequest(
    override var token: String?,
    var filename: String?,
    var length: Int?,
    var altTxt: String? = null,
    var snippetType: String? = null,
) : SlackApiRequest, FormRequest {
    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("filename", filename)
            it.addParam("length", length?.toString())
            it.addParam("alt_txt", altTxt)
            it.addParam("snippet_type", snippetType)
        }
    }
}
```

**File**: `api/methods/request/files/FilesCompleteUploadExternalRequest.kt` (new)
```kotlin
@JsExport
class FilesCompleteUploadExternalRequest(
    override var token: String?,
    var files: String?,
    var channelId: String? = null,
    var initialComment: String? = null,
    var threadTs: String? = null,
) : SlackApiRequest, FormRequest {
    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("files", files)
            it.addParam("channel_id", channelId)
            it.addParam("initial_comment", initialComment)
            it.addParam("thread_ts", threadTs)
        }
    }
}
```

### 2.3 Response Classes

**File**: `api/methods/response/files/FilesGetUploadURLExternalResponse.kt` (new)
```kotlin
@JsExport
@Serializable
class FilesGetUploadURLExternalResponse : SlackApiResponse() {
    var uploadUrl: String? = null
    var fileId: String? = null
}
```

**File**: `api/methods/response/files/FilesCompleteUploadExternalResponse.kt` (new)
```kotlin
@JsExport
@Serializable
class FilesCompleteUploadExternalResponse : SlackApiResponse() {
    var files: Array<File>? = null
}
```

### 2.4 Resource Interface & Implementation

**File**: `api/FilesResource.kt` — Add 4 methods (2 suspend + 2 blocking)
**File**: `internal/api/FilesResourceImpl.kt` — Add implementations using `postFormWithToken()`

---

## Step 3: Delete Fully Retired APIs

### 3.1 Delete `channels.*` (fully retired Feb 2021)

Complete deletion of the entire resource group:

| Action | Files |
|--------|-------|
| Delete | `api/ChannelsResource.kt` |
| Delete | `internal/api/ChannelsResourceImpl.kt` |
| Delete | `api/methods/request/channels/` directory (15 request files) |
| Delete | `api/methods/response/channels/` directory (remaining files after UsersLookupByEmail move) |
| Edit | `Slack.kt` — remove `fun channels(): ChannelsResource` |
| Edit | `internal/SlackImpl.kt` — remove channels field, import, and accessor |
| Edit | `api/methods/Methods.kt` — remove all 15 `CHANNELS_*` constants |

**Entity check**: `entity/Channel.kt` — check if referenced outside channels responses. If only by channels package, delete. If referenced by other code (e.g., events), keep.

### 3.2 Delete `groups.*` (fully retired Feb 2021)

| Action | Files |
|--------|-------|
| Delete | `api/GroupsResource.kt` |
| Delete | `internal/api/GroupsResourceImpl.kt` |
| Delete | `api/methods/request/groups/` directory (17 request files) |
| Delete | `api/methods/response/groups/` directory |
| Edit | `Slack.kt` — remove `fun groups(): GroupsResource` |
| Edit | `internal/SlackImpl.kt` — remove groups field, import, and accessor |
| Edit | `api/methods/Methods.kt` — remove all 17 `GROUPS_*` constants |

### 3.3 Delete `im.*` (fully retired Feb 2021)

| Action | Files |
|--------|-------|
| Delete | `api/ImResource.kt` |
| Delete | `internal/api/ImResourceImpl.kt` |
| Delete | `api/methods/request/im/` directory (6 request files) |
| Delete | `api/methods/response/im/` directory |
| Edit | `Slack.kt` — remove `fun im(): ImResource` |
| Edit | `internal/SlackImpl.kt` — remove im field, import, and accessor |
| Edit | `api/methods/Methods.kt` — remove all 6 `IM_*` constants |

### 3.4 Delete `mpim.*` (fully retired Feb 2021)

| Action | Files |
|--------|-------|
| Delete | `api/MpimResource.kt` |
| Delete | `internal/api/MpimResourceImpl.kt` |
| Delete | `api/methods/request/mpim/` directory (6 request files) |
| Delete | `api/methods/response/mpim/` directory |
| Edit | `Slack.kt` — remove `fun mpim(): MpimResource` |
| Edit | `internal/SlackImpl.kt` — remove mpim field, import, and accessor |
| Edit | `api/methods/Methods.kt` — remove all 6 `MPIM_*` constants |

### 3.5 Delete `files.upload` (sunset Nov 2025)

| Action | File |
|--------|------|
| Delete | `api/methods/request/files/FilesUploadRequest.kt` |
| Delete | `api/methods/response/files/FilesUploadResponse.kt` |
| Edit | `api/methods/Methods.kt` — remove `FILES_UPLOAD` |
| Edit | `api/FilesResource.kt` — remove `filesUpload()` + `filesUploadBlocking()` |
| Edit | `internal/api/FilesResourceImpl.kt` — remove implementations |

### 3.6 Delete `files.comments.*` (orphaned, retired 2018)

| Action | File |
|--------|------|
| Delete | `api/methods/request/files/comments/` directory (3 files) |
| Delete | `api/methods/response/files/comments/` directory (3 files) |
| Edit | `api/methods/Methods.kt` — remove 3 `FILES_COMMENTS_*` constants |

### 3.7 Delete `apps.permissions.*` (orphaned, developer preview ended)

| Action | File |
|--------|------|
| Delete | `api/methods/request/apps/permissions/` directory (6 files) |
| Delete | `api/methods/response/apps/permissions/` directory (6 files) |
| Edit | `api/methods/Methods.kt` — remove 6 `APPS_PERMISSIONS_*` constants |

### 3.8 Delete `rtm.*` (constants only, blocked for new apps)

| Action | File |
|--------|------|
| Edit | `api/methods/Methods.kt` — remove `RTM_CONNECT`, `RTM_START` |

---

## Step 4: Deprecate Still-Functional APIs

### Pattern

For `@Deprecated` on method-level:
```kotlin
@Deprecated("Use views.open (modals) instead. dialog.open is outmoded.")
```

For `const val` → change to `val` (Kotlin limitation: `@Deprecated` cannot be on `const val`).

### 4.1 Deprecate `dialog.open`

| File | Change |
|------|--------|
| `api/methods/Methods.kt` | `DIALOG_OPEN`: `const val` → `@Deprecated val` |
| `api/DialogResource.kt` | `@Deprecated` on all methods |
| `internal/api/DialogResourceImpl.kt` | `@Deprecated` on all overrides |
| `Slack.kt` | `@Deprecated` on `fun dialog()` |
| `internal/SlackImpl.kt` | `@Deprecated` on `override fun dialog()` |

### 4.2 Deprecate `users.setActive` (method-level only)

| File | Change |
|------|--------|
| `api/methods/Methods.kt` | `USERS_SET_ACTIVE`: `const val` → `@Deprecated val` |
| `api/UsersResource.kt` | `@Deprecated` on `usersSetActive` + `usersSetActiveBlocking` only |
| `internal/api/UsersResourceImpl.kt` | `@Deprecated` on those 2 overrides only |

### 4.3 Deprecate `stars.*` (all 3 methods)

| File | Change |
|------|--------|
| `api/methods/Methods.kt` | `STARS_ADD`, `STARS_LIST`, `STARS_REMOVE`: `const val` → `@Deprecated val` |
| `api/StarsResource.kt` | `@Deprecated` on all methods |
| `internal/api/StarsResourceImpl.kt` | `@Deprecated` on all overrides |
| `Slack.kt` | `@Deprecated` on `fun stars()` |
| `internal/SlackImpl.kt` | `@Deprecated` on `override fun stars()` |

### 4.4 Deprecate `oauth.access` and `oauth.token` (method-level only)

| File | Change |
|------|--------|
| `api/methods/Methods.kt` | `OAUTH_ACCESS`, `OAUTH_TOKEN`: `const val` → `@Deprecated val` |
| `api/OAuthResource.kt` | `@Deprecated` on `oauthAccess`/`oauthToken` methods only (not `oauthV2Access`) |
| `internal/api/OAuthResourceImpl.kt` | `@Deprecated` on those methods only |

---

## Step 5: Add conversations.mark

### 5.1 Method Constant

**File**: `api/methods/Methods.kt`
```kotlin
const val CONVERSATIONS_MARK: String = "conversations.mark"
```

### 5.2 Request/Response

**File**: `api/methods/request/conversations/ConversationsMarkRequest.kt` (new)
- Params: `token`, `channel: String?`, `ts: String?`

**File**: `api/methods/response/conversations/ConversationsMarkResponse.kt` (new)
- Extends `SlackApiResponse()` with no additional fields.

### 5.3 Resource Interface & Implementation

**File**: `api/ConversationsResource.kt` — Add 2 methods
**File**: `internal/api/ConversationsResourceImpl.kt` — Add implementations

---

## Step 6: Add Bookmarks API (New Resource Group)

### 6.1 Entity

**File**: `entity/Bookmark.kt` (new)
```kotlin
@JsExport
@Serializable
class Bookmark {
    var id: String? = null
    var channelId: String? = null
    var title: String? = null
    var link: String? = null
    var emoji: String? = null
    var iconUrl: String? = null
    var type: String? = null
    var dateCreated: Long? = null
    var dateUpdated: Long? = null
    var rank: String? = null
    var lastUpdatedByUserId: String? = null
    var lastUpdatedByTeamId: String? = null
}
```

### 6.2 Method Constants

**File**: `api/methods/Methods.kt`
```kotlin
const val BOOKMARKS_ADD: String = "bookmarks.add"
const val BOOKMARKS_EDIT: String = "bookmarks.edit"
const val BOOKMARKS_LIST: String = "bookmarks.list"
const val BOOKMARKS_REMOVE: String = "bookmarks.remove"
```

### 6.3 Request Classes (4 new files in `api/methods/request/bookmarks/`)

- `BookmarksAddRequest.kt` — `token`, `channelId`, `title`, `type`, `emoji`, `link`
- `BookmarksEditRequest.kt` — `token`, `bookmarkId`, `channelId`, `emoji`, `link`, `title`
- `BookmarksListRequest.kt` — `token`, `channelId`
- `BookmarksRemoveRequest.kt` — `token`, `bookmarkId`, `channelId`

### 6.4 Response Classes (4 new files in `api/methods/response/bookmarks/`)

- `BookmarksAddResponse.kt` — `bookmark: Bookmark?`
- `BookmarksEditResponse.kt` — `bookmark: Bookmark?`
- `BookmarksListResponse.kt` — `bookmarks: Array<Bookmark>?`
- `BookmarksRemoveResponse.kt` — extends `SlackApiResponse()` only

### 6.5 Resource Interface

**File**: `api/BookmarksResource.kt` (new) — 4 suspend + 4 blocking = 8 methods

### 6.6 Resource Implementation

**File**: `internal/api/BookmarksResourceImpl.kt` (new)

### 6.7 Wiring

**File**: `Slack.kt` — Add `fun bookmarks(): BookmarksResource`
**File**: `internal/SlackImpl.kt` — Add field + accessor

---

## Step 7: Add apps.connections.open

### 7.1 Method Constant

**File**: `api/methods/Methods.kt`
```kotlin
const val APPS_CONNECTIONS_OPEN: String = "apps.connections.open"
```

### 7.2 Request/Response

**File**: `api/methods/request/apps/connections/AppsConnectionsOpenRequest.kt` (new) — `token` only
**File**: `api/methods/response/apps/connections/AppsConnectionsOpenResponse.kt` (new) — `url: String?`

### 7.3 Resource Interface & Implementation

**File**: `api/AppsResource.kt` — Add 2 methods
**File**: `internal/api/AppsResourceImpl.kt` — Add implementations

---

## Implementation Order

Execute steps in this order to avoid compilation errors:

1. **Step 1** — Move `UsersLookupByEmailResponse` (must precede channels deletion)
2. **Step 2** — Add new file upload APIs (replacement exists before deletion)
3. **Step 3** — Delete all retired APIs (channels, groups, im, mpim, files.upload, files.comments, apps.permissions, rtm)
4. **Step 4** — Add `@Deprecated` annotations (non-breaking)
5. **Step 5** — Add `conversations.mark`
6. **Step 6** — Add Bookmarks API
7. **Step 7** — Add `apps.connections.open`
8. **Build verification** — `./gradlew build`

---

## Risks & Mitigations

| Risk | Mitigation |
|------|------------|
| Entity classes (`Channel`, `Group`, `Im`) may be referenced by event types or other code | Grep for all usages before deletion; keep entities that have external references |
| `UsersLookupByEmailResponse` in channels package — would be deleted with channels | Move in Step 1 before channels deletion |
| `const val` cannot have `@Deprecated` in Kotlin | Follow existing pattern: change to `val` |
| `FilesCompleteUploadExternalRequest.files` is a JSON array | Serialize as JSON string and pass as form param |
| Deleted APIs break binary compatibility | This is intentional — dead APIs should not be exposed |

---

## Deleted File Count Summary

| Category | Files Deleted |
|----------|--------------|
| channels (Resource, Impl, Request, Response) | ~32 files |
| groups (Resource, Impl, Request, Response) | ~36 files |
| im (Resource, Impl, Request, Response) | ~14 files |
| mpim (Resource, Impl, Request, Response) | ~14 files |
| files.upload (Request, Response) | 2 files |
| files.comments (Request, Response) | 6 files |
| apps.permissions (Request, Response) | 12 files |
| **Total files deleted** | **~116 files** |

## New File Count Summary

| Category | Files Created |
|----------|--------------|
| File upload (Request, Response) | 4 files |
| Bookmarks (Entity, Resource, Impl, Request, Response) | 11 files |
| conversations.mark (Request, Response) | 2 files |
| apps.connections.open (Request, Response) | 2 files |
| **Total files created** | **~19 files** |

---

## Verification

1. `./gradlew build` — Full compilation passes
2. Deprecated methods produce compiler warnings
3. New methods accessible via `slack.files()`, `slack.bookmarks()`, `slack.conversations()`, `slack.apps()`
4. No orphaned imports or references to deleted code
5. `UsersLookupByEmailResponse` works correctly from new package location
