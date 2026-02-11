# Agent Documentation

## Overview

This repository is a Slack API client library for Kotlin Multiplatform. It provides REST API bindings for the Slack Web API, admin APIs, and a streaming module (currently empty) for real-time updates via RTM.

## Key Concepts

### Slack Web API Structure

All Slack Web API calls are made to `https://slack.com/api/{method}` using POST requests with form-encoded bodies. Responses are JSON. Authentication tokens are passed as a `token` parameter in the request body or via the `Authorization: Bearer <token>` header.

Common method categories:

- `chat.*` - Sending and managing messages
- `conversations.*` - Channel and DM management
- `users.*` - User information and profile management
- `files.*` - File uploads and management
- `reactions.*` - Emoji reactions
- `pins.*` - Pinned messages
- `search.*` - Search messages and files
- `admin.*` - Workspace administration
- `oauth.*` / `auth.*` - Authentication
- `views.*` - Modal views (Block Kit)
- `dialog.*` - Dialogs (legacy)

### API Specification Reference

Refer to the official Slack API method documentation when implementing or updating APIs: https://docs.slack.dev/reference/methods/

### Authentication

Slack uses OAuth2 for authentication:

1. Redirect users to `https://slack.com/oauth/authorize` with `client_id`, `redirect_uri`, and `scope`
2. After user approval, exchange the authorization code for an access token via `oauth.access` or `oauth.v2.access`
3. Use the access token in subsequent API requests

The `AuthClient` class provides `authorizationURL()` to build the OAuth authorization URL.

### Status API

The library also provides access to the Slack Status API at `https://status.slack.com/api/v2.0.0/` (redirects to `https://slack-status.com/api/v2.0.0/`):

- `current()` - Get current Slack service status
- `history()` - Get historical Slack incidents

## Directory Structure

- **`core/`**: REST API client library
  - `api/auth/` - OAuth authentication client (`AuthClient`)
  - `api/methods/` - Web API method definitions
    - `client/` - Client interfaces (`MethodsAsyncClient`, `MethodsBlockingClient`)
    - `impl/` - Implementation classes (`AbstractResourceImpl`, `MethodsAsyncClientImpl`, etc.)
    - `request/` - Request objects organized by category (28 subdirectories)
    - `response/` - Response objects organized by category (28 subdirectories)
    - `helper/` - JSON serialization helpers
  - `api/status/` - Slack Status API client
  - `entity/` - Data models (Channel, Conversation, Message, User, etc.)
    - `block/` - Block Kit elements and compositions
    - `event/` - Event types
    - `file/` - File entities
    - `message/` - Message entities
    - `user/` - User entities
    - `webhook/` - Webhook payloads
- **`stream/`**: Streaming module (currently empty, RTM methods defined in core)
- **`all/`**: Package containing all modules (for platform distribution)
- **`plugins/`**: Gradle build configuration
- **`docs/`**: Documentation
- **`tool/`**: Auxiliary tooling

## Testing

Run all core tests:

```shell
./gradlew :core:jvmTest
```

Run specific tests:

```shell
./gradlew :core:jvmTest --tests "work.socialhub.kslack.auth.AuthTest"
```

If network access is not available, verify successful build:

```shell
./gradlew jvmJar
```

## Implementation Guidelines

### Method Name and Package Mapping

Slack API methods correspond to request/response classes organized by category:

- `chat.postMessage` → `request/chat/ChatPostMessageRequest` + `response/chat/ChatPostMessageResponse`
- `conversations.list` → `request/conversations/ConversationsListRequest` + `response/conversations/ConversationsListResponse`
- `users.info` → `request/users/UsersInfoRequest` + `response/users/UsersInfoResponse`
- `admin.users.invite` → `request/admin/users/AdminUsersInviteRequest` + `response/admin/users/AdminUsersInviteResponse`

API method name constants are defined in `Methods.kt`.

### Steps to Add a New API

1. Add the method name constant to **`Methods.kt`**
2. Create the **request class** in `api/methods/request/{category}/` (implementing `SlackApiRequest` and `FormRequest`)
3. Create the **response class** in `api/methods/response/{category}/` (extending `SlackApiResponse`)
4. Add the method to **`MethodsAsyncClient`** and **`MethodsBlockingClient`** interfaces
5. Implement the method in **`MethodsAsyncClientImpl`** and **`MethodsBlockingClientImpl`**

### Naming Conventions

| Type     | Naming Pattern         | Example                   |
| -------- | ---------------------- | ------------------------- |
| Request  | `{MethodName}Request`  | `ChatPostMessageRequest`  |
| Response | `{MethodName}Response` | `ChatPostMessageResponse` |
| Client   | `Methods{Sync}Client`  | `MethodsAsyncClient`      |
| Entity   | Singular form          | `Conversation`, `Message` |

### Serialization

All response models use `kotlinx.serialization`. Request models implement `FormRequest` which converts fields to form-encoded parameters via `toMap()`.

## Key File References

| Purpose                   | File Path                                                                                      |
| ------------------------- | ---------------------------------------------------------------------------------------------- |
| Main entry point          | `core/src/commonMain/kotlin/work/socialhub/kslack/Slack.kt`                                    |
| Factory                   | `core/src/commonMain/kotlin/work/socialhub/kslack/SlackFactory.kt`                             |
| API method constants      | `core/src/commonMain/kotlin/work/socialhub/kslack/api/methods/Methods.kt`                      |
| Async client interface    | `core/src/commonMain/kotlin/work/socialhub/kslack/api/methods/client/MethodsAsyncClient.kt`    |
| Blocking client interface | `core/src/commonMain/kotlin/work/socialhub/kslack/api/methods/client/MethodsBlockingClient.kt` |
| Auth client               | `core/src/commonMain/kotlin/work/socialhub/kslack/api/auth/AuthClient.kt`                      |
| Request/response models   | `core/src/commonMain/kotlin/work/socialhub/kslack/api/methods/request/` and `.../response/`    |
| Status API                | `core/src/commonMain/kotlin/work/socialhub/kslack/api/status/StatusClient.kt`                  |
