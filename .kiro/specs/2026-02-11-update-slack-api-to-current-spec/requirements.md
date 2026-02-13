# Requirements: Update kslack to Current Slack API Specification

## Background

kslack is a Kotlin Multiplatform Slack API client library. The library currently implements ~150 API methods, while the current Slack API provides 281+ methods. The library contains many APIs that Slack has fully retired (non-functional since 2021) and is missing important modern APIs. This update cleans up dead code and adds essential new methods.

### Current Slack API Status (as of Feb 2026)

- **Fully retired (non-functional)**: `channels.*`, `groups.*`, `im.*`, `mpim.*` (Feb 2021), `files.upload` (Nov 2025), `files.comments.*` (2018), `apps.permissions.*` (N/A)
- **Deprecated**: `dialog.open`, `rtm.*`, `stars.*`, `reminders.*`, `users.setActive`, `oauth.access`
- **New namespaces not in kslack**: `assistant.*` (5), `calls.*` (6), `canvases.*` (6), `functions.*` (8), `lists.*` (12), `openid.*` (2), `workflows.*` (8), `entity.*` (1), `tooling.*` (1)
- **Expanded existing namespaces**: `admin.*` (21 → 59+), `apps.*` (1 → 21), `conversations.*` (17 → 28), `chat.*` (10 → 13), `team.*` (5 → 9), `auth.*` (2 → 3), `oauth.*` (3 → 3 but different)

## Goals

- Remove API methods that Slack has fully retired (no longer functional)
- Mark deprecated-but-functional APIs with `@Deprecated`
- Add essential new API methods for file upload, bookmarks, conversations, and socket mode
- Document additional APIs that should be added in future work

## Functional Requirements

### FR-1: Delete Fully Retired APIs

APIs that Slack has fully retired and no longer accept requests. These must be completely deleted (Resource, ResourceImpl, Request, Response, Entity, Method constants).

| API Group | Retired Date | Method Count | Replacement |
|-----------|-------------|--------------|-------------|
| `channels.*` | February 24, 2021 | 15 | `conversations.*` |
| `groups.*` | February 24, 2021 | 17 | `conversations.*` |
| `im.*` | February 24, 2021 | 6 | `conversations.*` |
| `mpim.*` | February 24, 2021 | 6 | `conversations.*` |
| `files.upload` | November 12, 2025 | 1 | `files.getUploadURLExternal` + `files.completeUploadExternal` |
| `files.comments.*` | 2018 | 3 | File threads |
| `apps.permissions.*` | N/A | 6 | Removed (developer preview ended) |
| `rtm.*` | N/A (blocked for new apps) | 2 | Socket Mode (`apps.connections.open`) |

**Total: 56 methods to delete**

### FR-2: Deprecate Still-Functional but Deprecated APIs

APIs that still work but are officially deprecated by Slack. Mark with `@Deprecated` annotation.

| API | Status | Replacement |
|-----|--------|-------------|
| `dialog.open` | Deprecated (outmoded) | `views.open` (modals with Block Kit) |
| `users.setActive` | Deprecated | None |
| `stars.add` | Functionally deprecated | "Later" view (no API equivalent) |
| `stars.list` | Functionally deprecated | "Later" view |
| `stars.remove` | Functionally deprecated | "Later" view |
| `oauth.access` | Legacy | `oauth.v2.access` |
| `oauth.token` | Legacy | `oauth.v2.access` |

### FR-3: Add New File Upload API

The new two-step file upload flow, replacing the deleted `files.upload`.

| Method | Description |
|--------|-------------|
| `files.getUploadURLExternal` | Step 1: Obtain a pre-signed upload URL and file ID |
| `files.completeUploadExternal` | Step 2: Finalize the upload and optionally share to a channel |

### FR-4: Add Bookmarks API

A new resource group for managing channel bookmarks.

| Method | Description |
|--------|-------------|
| `bookmarks.add` | Add a bookmark to a conversation (max 100 per conversation) |
| `bookmarks.edit` | Edit an existing bookmark |
| `bookmarks.list` | List bookmarks in a conversation |
| `bookmarks.remove` | Remove a bookmark |

### FR-5: Add conversations.mark

| Method | Description |
|--------|-------------|
| `conversations.mark` | Set the read cursor in a conversation |

### FR-6: Add apps.connections.open (Socket Mode)

| Method | Description |
|--------|-------------|
| `apps.connections.open` | Generate a WebSocket URL for Socket Mode connections |

### FR-7: Fix Misplaced Response Class

`UsersLookupByEmailResponse` is incorrectly placed in the `response/channels/` package. It must be moved to `response/users/` before the channels package is deleted.

## Non-Functional Requirements

### NFR-1: Consistent Architecture

All new API methods must follow the existing resource-based architecture pattern:
- Method constant in `Methods.kt`
- Request class implementing `SlackApiRequest` and `FormRequest`
- Response class extending `SlackApiResponse` with `@Serializable` and `@JsExport`
- Suspend + blocking method variants in Resource interface and ResourceImpl

### NFR-2: Compilation Verification

The project must compile successfully (`./gradlew build`) after all changes.

### NFR-3: Future API Documentation

Code and/or documentation should note which additional APIs are candidates for future implementation, to guide subsequent work.

## Out of Scope (Future Work Candidates)

The following APIs exist in the current Slack API but are not included in this update. They should be considered for future implementation:

### High Priority (commonly needed by Slack clients)
- `calls.*` (6 methods) — Voice/video call management
- `openid.connect.token`, `openid.connect.userInfo` — OpenID Connect authentication
- `conversations.inviteShared`, `conversations.acceptSharedInvite`, etc. (5 methods) — Slack Connect
- `conversations.canvases.create` — Channel canvas creation
- `conversations.requestSharedInvite.*` (3 methods) — Shared invite requests
- `chat.startStream`, `chat.appendStream`, `chat.stopStream` — Streaming messages
- `auth.teams.list` — List teams for a token
- `oauth.v2.exchange` — Token exchange
- `team.billing.info`, `team.externalTeams.*`, `team.preferences.list` — Team info additions
- `users.discoverableContacts.lookup` — Contact discovery

### Medium Priority (specialized use cases)
- `canvases.*` (6 methods) — Canvas management
- `functions.*` (8 methods) — Workflow functions
- `workflows.*` (8 methods) — Workflow management
- `admin.*` expansions (38+ new methods) — Enterprise administration

### Lower Priority (niche/new features)
- `assistant.*` (5 methods) — AI assistant features
- `lists.*` (12 methods) — Lists management (new Sep 2025)
- `apps.datastore.*` (8 methods) — App datastore
- `apps.manifest.*` (5 methods) — App manifest management
- `entity.presentDetails` — Entity details
- `tooling.tokens.rotate` — Token rotation (beta)
