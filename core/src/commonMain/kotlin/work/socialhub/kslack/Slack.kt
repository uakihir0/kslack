package work.socialhub.kslack

import work.socialhub.kslack.api.AdminConversationsResource
import work.socialhub.kslack.api.AdminResource
import work.socialhub.kslack.api.ApiResource
import work.socialhub.kslack.api.AppsResource
import work.socialhub.kslack.api.WorkflowsResource
import work.socialhub.kslack.api.AuthResource
import work.socialhub.kslack.api.BookmarksResource
import work.socialhub.kslack.api.BotsResource
import work.socialhub.kslack.api.CallsResource
import work.socialhub.kslack.api.ChatResource
import work.socialhub.kslack.api.ConversationsResource
import work.socialhub.kslack.api.DialogResource
import work.socialhub.kslack.api.DndResource
import work.socialhub.kslack.api.EmojiResource
import work.socialhub.kslack.api.FilesResource
import work.socialhub.kslack.api.MigrationResource
import work.socialhub.kslack.api.OAuthResource
import work.socialhub.kslack.api.OpenIDConnectResource
import work.socialhub.kslack.api.PinsResource
import work.socialhub.kslack.api.ReactionsResource
import work.socialhub.kslack.api.RemindersResource
import work.socialhub.kslack.api.SearchResource
import work.socialhub.kslack.api.StarsResource
import work.socialhub.kslack.api.StatusResource
import work.socialhub.kslack.api.TeamResource
import work.socialhub.kslack.api.UsergroupsResource
import work.socialhub.kslack.api.UsersResource
import work.socialhub.kslack.api.ViewsResource
import work.socialhub.kslack.stream.SlackStream
import kotlin.js.JsExport

/**
 * Main interface for the Slack Web API client.
 *
 * This is the primary entry point for interacting with all Slack API endpoints.
 * Create an instance using [SlackFactory] and access individual API resources
 * through the resource accessor methods.
 *
 * **Architecture Overview:**
 * - Each Slack API category (chat, users, conversations, etc.) has its own
 *   **Resource interface** (e.g., [ChatResource], [UsersResource]) defined in
 *   the `api` package.
 * - Each Resource interface provides both **suspend** (async) and **blocking**
 *   method variants.
 * - Request classes implement [SlackApiRequest] and [FormRequest], converting
 *   parameters to URL-encoded form data.
 * - Response classes extend [SlackApiResponse], providing an `isOk` field for
 *   success/failure checking.
 *
 * **Quick Start:**
 * ```kotlin
 * // Create a client with a default token
 * val slack = SlackFactory.instance("xoxp-your-token")
 *
 * // Async usage (coroutine)
 * launch {
 *     val response = slack.chat().chatPostMessage(
 *         ChatPostMessageRequest(
 *             channel = "#general",
 *             text = "Hello from kslack!"
 *         )
 *     )
 *     if (response.isOk) println("Sent! ts=${response.ts}")
 * }
 *
 * // Blocking usage (JVM/Native)
 * val response = slack.auth().authTestBlocking(AuthTestRequest())
 * println("Auth OK: ${response.isOk}, Team: ${response.team}")
 * ```
 *
 * **Token Resolution:**
 * 1. Request-level token (`request.token`)
 * 2. Factory-level token (`SlackFactory.instance(token)`)
 * 3. Throws `IllegalStateException` if neither is available
 *
 * **Platform Support:**
 * - **JVM**: Both suspend and blocking APIs available
 * - **Native**: Both suspend and blocking APIs available
 * - **JS**: Suspend APIs only (use Kotlin/JS async/await)
 *
 * @see SlackFactory
 * @see ChatResource
 * @see UsersResource
 * @see ConversationsResource
 */
@JsExport
interface Slack {

    // ----------------------------------------------
    // Admin APIs
    // https://api.slack.com/admins
    // ----------------------------------------------

    /**
     * Access to Admin APIs (admin.apps, admin.inviteRequests, admin.teams, admin.users).
     * Requires an admin OAuth token with admin scopes.
     *
     * @see AdminResource
     */
    fun admin(): AdminResource

    /**
     * Access to Admin Conversations APIs (admin.conversations.*).
     * Requires an admin OAuth token with admin scopes.
     *
     * @see AdminConversationsResource
     */
    fun adminConversations(): AdminConversationsResource

    // ----------------------------------------------
    // Streaming
    // ----------------------------------------------

    /**
     * Access to the Slack streaming client for real-time event processing.
     *
     * Uses Socket Mode to receive events as they happen. Requires a token
     * provided via [SlackFactory.instance(token)].
     *
     * @throws IllegalStateException if no token was provided
     * @see SlackStream
     */
    fun stream(): SlackStream

    // ----------------------------------------------
    // API Utilities
    // ----------------------------------------------

    /**
     * Access to the API test and rate limit check endpoints.
     *
     * @see ApiResource
     */
    fun api(): ApiResource

    /**
     * Access to Apps APIs (apps.connections.open, apps.uninstall).
     *
     * @see AppsResource
     */
    fun apps(): AppsResource

    // ----------------------------------------------
    // Authentication
    // https://api.slack.com/authentication
    // ----------------------------------------------

    /**
     * Access to Auth APIs (auth.revoke, auth.test, auth.teams.list).
     * Also provides [AuthResource.authorizationURL] for OAuth 2.0 flows.
     *
     * @see AuthResource
     */
    fun auth(): AuthResource

    // ----------------------------------------------
    // Bookmarks
    // https://api.slack.com/methods/bookmarks
    // ----------------------------------------------

    /**
     * Access to channel bookmark management APIs.
     *
     * @see BookmarksResource
     */
    fun bookmarks(): BookmarksResource

    // ----------------------------------------------
    // Bots
    // ----------------------------------------------

    /**
     * Access to bots.info API for retrieving bot user information.
     *
     * @see BotsResource
     */
    fun bots(): BotsResource

    // ----------------------------------------------
    // Calls
    // https://api.slack.com/methods/calls
    // ----------------------------------------------

    /**
     * Access to Calls APIs for managing Slack huddle calls.
     *
     * @see CallsResource
     */
    fun calls(): CallsResource

    // ----------------------------------------------
    // Chat
    // https://api.slack.com/methods/chat
    // ----------------------------------------------

    /**
     * Access to Chat APIs for sending, updating, and deleting messages.
     *
     * Includes methods for:
     * - Sending messages ([ChatResource.chatPostMessage])
     * - Sending ephemeral messages ([ChatResource.chatPostEphemeral])
     * - Scheduling messages ([ChatResource.chatScheduleMessage])
     * - Updating/deleting messages ([ChatResource.chatUpdate], [ChatResource.chatDelete])
     * - Chat streaming ([ChatResource.chatStartStream])
     * - Chat unfurling ([ChatResource.chatUnfurl])
     * - Scheduled message list ([ChatResource.chatScheduledMessagesList])
     * - Permalink retrieval ([ChatResource.chatGetPermalink])
     *
     * @see ChatResource
     */
    fun chat(): ChatResource

    // ----------------------------------------------
    // Conversations
    // https://api.slack.com/methods/conversations
    // ----------------------------------------------

    /**
     * Access to the largest resource group - Conversations APIs.
     *
     * Provides methods for:
     * - Channel creation/joining/leaving ([ConversationsResource.conversationsCreate], [.conversationsJoin], [.conversationsLeave])
     * - Channel listing ([ConversationsResource.conversationsList])
     * - Channel history ([ConversationsResource.conversationsHistory])
     * - Channel info ([ConversationsResource.conversationsInfo])
     * - Inviting members ([ConversationsResource.conversationsInvite], [.conversationsKick])
     * - Shared workspace invites ([ConversationsResource.conversationsAcceptSharedInvite], [.conversationsApproveSharedInvite], etc.)
     * - Archiving/unarchiving ([ConversationsResource.conversationsArchive], [.conversationsUnarchive])
     * - And many more...
     *
     * @see ConversationsResource
     */
    fun conversations(): ConversationsResource

    // ----------------------------------------------
    // Dialog (Deprecated)
    // ----------------------------------------------

    /**
     * Access to the deprecated Dialog API for legacy modals.
     *
     * @deprecated Use [ViewsResource] (views.open) for modals with Block Kit instead.
     */
    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    fun dialog(): DialogResource

    // ----------------------------------------------
    // Do Not Disturb
    // ----------------------------------------------

    /**
     * Access to Do Not Disturb (DND) APIs.
     *
     * @see DndResource
     */
    fun dnd(): DndResource

    // ----------------------------------------------
    // Emoji
    // ----------------------------------------------

    /**
     * Access to emoji.list API for listing workspace custom emoji.
     *
     * @see EmojiResource
     */
    fun emoji(): EmojiResource

    // ----------------------------------------------
    // Files
    // https://api.slack.com/methods/files
    // ----------------------------------------------

    /**
     * Access to Files APIs for managing file uploads, listing, and sharing.
     *
     * Includes:
     * - File upload ([FilesResource.filesUpload])
     * - File listing/info ([FilesResource.filesList], [.filesInfo])
     * - External file uploads ([FilesResource.filesGetUploadURLExternal], [.filesCompleteUploadExternal])
     * - Remote file management ([FilesResource.filesRemoteAdd], etc.)
     * - File sharing/public URLs ([FilesResource.filesSharedPublicURL], [.filesRevokePublicURL])
     * - File deletion ([FilesResource.filesDelete])
     *
     * @see FilesResource
     */
    fun files(): FilesResource

    // ----------------------------------------------
    // Migration
    // ----------------------------------------------

    /**
     * Access to the migration.exchange API for transitioning from Bot to User tokens.
     *
     * @see MigrationResource
     */
    fun migration(): MigrationResource

    // ----------------------------------------------
    // OAuth
    // https://api.slack.com/authentication/oauth-v2
    // ----------------------------------------------

    /**
     * Access to OAuth APIs for token exchange and legacy OAuth flows.
     *
     * @see OAuthResource
     */
    fun oauth(): OAuthResource

    // ----------------------------------------------
    // OpenID Connect
    // ----------------------------------------------

    /**
     * Access to OpenID Connect APIs for token and user info retrieval.
     *
     * @see OpenIDConnectResource
     */
    fun openIDConnect(): OpenIDConnectResource

    // ----------------------------------------------
    // Pins
    // ----------------------------------------------

    /**
     * Access to pins APIs for managing pinned messages in channels.
     *
     * @see PinsResource
     */
    fun pins(): PinsResource

    // ----------------------------------------------
    // Reactions
    // https://api.slack.com/methods/reactions
    // ----------------------------------------------

    /**
     * Access to emoji reaction APIs for adding, listing, and removing reactions.
     *
     * @see ReactionsResource
     */
    fun reactions(): ReactionsResource

    // ----------------------------------------------
    // Reminders
    // ----------------------------------------------

    /**
     * Access to reminders APIs for creating, listing, and managing reminders.
     *
     * @see RemindersResource
     */
    fun reminders(): RemindersResource

    // ----------------------------------------------
    // Search
    // https://api.slack.com/methods/search
    // ----------------------------------------------

    /**
     * Access to search APIs for searching messages, files, and all content.
     *
     * @see SearchResource
     */
    fun search(): SearchResource

    // ----------------------------------------------
    // Stars (Deprecated)
    // ----------------------------------------------

    /**
     * Access to the deprecated Stars API for starring messages/files.
     *
     * @deprecated Stars API is functionally deprecated. Replaced by Later view.
     */
    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    fun stars(): StarsResource

    // ----------------------------------------------
    // Status
    // ----------------------------------------------

    /**
     * Access to the Slack Status API for checking service health.
     *
     * Provides:
     * - Current service status ([StatusResource.current])
     * - Incident history ([StatusResource.history])
     *
     * Note: This does not use the Web API endpoint; it queries
     * `https://slack-status.com/api/v2.0.0/` directly.
     *
     * @see StatusResource
     */
    fun status(): StatusResource

    // ----------------------------------------------
    // Team
    // https://api.slack.com/methods/team
    // ----------------------------------------------

    /**
     * Access to Team APIs for workspace information, billing, profile, and preferences.
     *
     * @see TeamResource
     */
    fun team(): TeamResource

    // ----------------------------------------------
    // User Groups
    // https://api.slack.com/methods/usergroups
    // ----------------------------------------------

    /**
     * Access to user group (User Group) APIs for managing workspace user groups.
     *
     * @see UsergroupsResource
     */
    fun usergroups(): UsergroupsResource

    // ----------------------------------------------
    // Users
    // https://api.slack.com/methods/users
    // ----------------------------------------------

    /**
     * Access to Users APIs for user information, profile management, and presence.
     *
     * Includes:
     * - User info ([UsersResource.usersInfo])
     * - User list ([UsersResource.usersList])
     * - Profile get/set ([UsersResource.usersProfileGet], [.usersProfileSet])
     * - User photo ([UsersResource.usersSetPhoto], [.usersDeletePhoto])
     * - Presence ([UsersResource.usersGetPresence], [.usersSetPresence])
     * - User conversations ([UsersResource.usersConversations])
     * - Email lookup ([UsersResource.usersLookupByEmail])
     * - Discoverable contacts ([UsersResource.usersDiscoverableContactsLookup])
     *
     * @see UsersResource
     */
    fun users(): UsersResource

    // ----------------------------------------------
    // Views (Block Kit Modals)
    // https://api.slack.com/block-kit/surfaces/modals
    // ----------------------------------------------

    /**
     * Access to Views APIs for Block Kit modals and home tabs.
     *
     * Replaces the deprecated Dialog API. Provides:
     * - Open modal ([ViewsResource.viewsOpen])
     * - Push modal to stack ([ViewsResource.viewsPush])
     * - Update modal ([ViewsResource.viewsUpdate])
     * - Set home tab ([ViewsResource.viewsPublish])
     * - Update home tab ([ViewsResource.viewsHomeUpdate])
     *
     * @see ViewsResource
     */
    fun views(): ViewsResource

    // ----------------------------------------------
    // Workflows
    // https://api.slack.com/workflows
    // ----------------------------------------------

    /**
     * Access to Workflow Step APIs for custom workflow step lifecycle management.
     *
     * @see WorkflowsResource
     */
    fun workflows(): WorkflowsResource

    /**
     * The default OAuth access token configured for this client instance.
     * May be null if no token was provided during creation.
     */
    val token: String?

    /**
     * Constant values for API endpoints and OAuth URLs.
     */
    companion object {
        /**
         * Base URL prefix for all Slack Web API endpoints.
         * Full endpoint URLs are formed as `{ENDPOINT_URL_PREFIX}{method}`
         * (e.g., `https://slack.com/api/chat.postMessage`).
         */
        const val ENDPOINT_URL_PREFIX = "https://slack.com/api/"

        /**
         * Base URL prefix for the Slack Status API.
         */
        const val STATUS_URL_PREFIX = "https://slack-status.com/api/v2.0.0/"

        /**
         * OAuth 2.0 authorization URL for the Slack login flow.
         * Redirect users here with `client_id`, `redirect_uri`, and `scope` parameters.
         */
        const val AUTHORIZE_URL = "https://slack.com/oauth/v2/authorize"
    }
}
