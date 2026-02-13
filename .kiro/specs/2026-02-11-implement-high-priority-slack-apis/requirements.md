# Requirements: Implement High Priority Slack APIs

## Background

kslack is a Kotlin Multiplatform Slack API client library. The previous update (2026-02-11-update-slack-api-to-current-spec) cleaned up retired APIs, added `@Deprecated` annotations, and implemented essential new methods (file upload, bookmarks, conversations.mark, apps.connections.open). The "Out of Scope — High Priority" section of that spec identified 27 additional API methods commonly needed by Slack clients. This spec covers their implementation.

### Scope

- **In scope**: REST API methods only (27 methods across 9 API groups)
- **Out of scope**: WebSocket/Stream module implementation (Socket Mode event delivery), but TODO comments will be placed at relevant integration points

## Goals

- Implement all High Priority Slack API methods identified in the previous spec
- Add 2 new resource groups (Calls, OpenID Connect) with full wiring
- Extend 6 existing resource groups with new methods
- Leave TODO markers for future Stream module integration

## Functional Requirements

### FR-1: Calls API (New Resource — 6 methods)

Voice/video call management endpoints.

| Method | Description |
|--------|-------------|
| `calls.add` | Register a new call |
| `calls.end` | End a call |
| `calls.info` | Get information about a call |
| `calls.update` | Update information about a call |
| `calls.participants.add` | Add participants to a call |
| `calls.participants.remove` | Remove participants from a call |

New entities required:
- `Call` — Call object with id, dates, URLs, title, participants, channels
- `CallParticipant` — Participant with slackId, externalId, displayName, avatarUrl

### FR-2: OpenID Connect API (New Resource — 2 methods)

OpenID Connect authentication flow endpoints.

| Method | Description |
|--------|-------------|
| `openid.connect.token` | Exchange a code for an access token (OAuth-style, no bearer token) |
| `openid.connect.userInfo` | Get user identity information from an OpenID Connect token |

### FR-3: Slack Connect Conversations (Existing Resource Extension — 6 methods)

Slack Connect shared channel management.

| Method | Description |
|--------|-------------|
| `conversations.acceptSharedInvite` | Accept a shared channel invite |
| `conversations.approveSharedInvite` | Approve a shared channel invite |
| `conversations.canvases.create` | Create a canvas in a channel |
| `conversations.declineSharedInvite` | Decline a shared channel invite |
| `conversations.inviteShared` | Send a shared channel invite |
| `conversations.listConnectInvites` | List pending Slack Connect invites |

New entity required:
- `SharedInvite` — Invite object with id, direction, dates, type, status, channel info, payload

### FR-4: Conversations Request Shared Invite (Existing Resource Extension — 3 methods)

Shared invite request management for admins.

| Method | Description |
|--------|-------------|
| `conversations.requestSharedInvite.approve` | Approve a shared invite request |
| `conversations.requestSharedInvite.deny` | Deny a shared invite request |
| `conversations.requestSharedInvite.list` | List shared invite requests |

### FR-5: Chat Streaming (Existing Resource Extension — 3 methods)

Streaming message composition (AI-style progressive message delivery).

| Method | Description |
|--------|-------------|
| `chat.startStream` | Start a new streaming message |
| `chat.appendStream` | Append content to an active stream |
| `chat.stopStream` | Finalize and stop a streaming message |

### FR-6: Auth Teams List (Existing Resource Extension — 1 method)

| Method | Description |
|--------|-------------|
| `auth.teams.list` | List the teams that a token has access to |

### FR-7: OAuth v2 Exchange (Existing Resource Extension — 1 method)

| Method | Description |
|--------|-------------|
| `oauth.v2.exchange` | Exchange a legacy token for a new token |

### FR-8: Team API Expansion (Existing Resource Extension — 4 methods)

| Method | Description |
|--------|-------------|
| `team.billing.info` | Get billing information for a team |
| `team.externalTeams.disconnect` | Disconnect an external team |
| `team.externalTeams.list` | List external teams connected to the workspace |
| `team.preferences.list` | List team preferences |

### FR-9: Users Discoverable Contacts (Existing Resource Extension — 1 method)

| Method | Description |
|--------|-------------|
| `users.discoverableContacts.lookup` | Look up discoverable contacts by email |

### FR-10: Stream Module TODO Comments

Add TODO comments at the following integration points to guide future Stream module implementation:

1. `AppsConnectionsOpenResponse.kt` — Note that the `url` field is a WebSocket URL for Socket Mode
2. `AppsResource.kt` — Note that Socket Mode WebSocket connection belongs in a separate stream module
3. `Slack.kt` — Note that a `stream()` accessor should be added for Socket Mode event delivery

## Non-Functional Requirements

### NFR-1: Consistent Architecture

All new API methods must follow the existing resource-based architecture pattern:
- Method constant in `Methods.kt`
- Request class implementing `SlackApiRequest` and `FormRequest`
- Response class extending `SlackApiResponse` with `@Serializable` and `@JsExport`
- Suspend + blocking method variants in Resource interface and ResourceImpl
- `@JsExport` on interfaces, `@JsExport.Ignore` on blocking methods

### NFR-2: Naming Conventions

- Sub-package names follow existing `snake_case` convention (e.g., `scheduled_messages/`, `external_teams/`)
- Method constant names follow existing `UPPER_SNAKE_CASE` convention
- Kotlin property names use `camelCase`

### NFR-3: Compilation Verification

The project must compile successfully (`./gradlew build`) after all changes. Pre-existing build errors are acceptable.

### NFR-4: Entity Reuse

Reuse existing entity classes where applicable:
- `entity/team/Team.kt` for `auth.teams.list` response
- `entity/user/User.kt` for `users.discoverableContacts.lookup` response
- `entity/ResponseMetadata` for paginated responses

## File Count Summary

### New Files (~49)
- Entities: 3 files (Call, CallParticipant, SharedInvite + sub-types)
- Request classes: 22 files
- Response classes: 22 files
- Resource interfaces: 2 files (CallsResource, OpenIDConnectResource)
- Resource implementations: 2 files (CallsResourceImpl, OpenIDConnectResourceImpl)

### Existing Files Modified (~13)
- `Methods.kt` — 27 new constants
- `Slack.kt` — 2 new resource accessors + TODO comment
- `SlackImpl.kt` — 2 new resource instances
- 6 existing Resource interfaces — method pairs added
- 6 existing ResourceImpl classes — implementations added
- `AppsConnectionsOpenResponse.kt` — TODO comment
- `AppsResource.kt` — TODO comment
