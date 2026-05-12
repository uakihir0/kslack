package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.users.*
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileSetRequest
import work.socialhub.kslack.api.methods.response.users.*
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileGetResponse
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileSetResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `users.*` API methods.
 *
 * Provides methods for retrieving user information, managing profiles,
 * handling user photos, and managing user presence information.
 *
 * # OAuth Scopes
 * - `users:read` - Read user profile information
 * - `users:read.email` - Access user email addresses
 * - `users.profile:write` - Update user profiles
 * - `users:write` - Active/deactivate users (admin only)
 *
 * # Usage Example
 * ```kotlin
 * // List all users in the workspace
 * val users = slack.users.list(UsersListRequest())
 *
 * // Get user info
 * val info = slack.users.info(UsersInfoRequest(user = "U012AB3CD"))
 *
 * // Get user presence
 * val presence = slack.users.getPresence(
 *     UsersGetPresenceRequest(user = "U012AB3CD")
 * )
 *
 * // Look up user by email
 * val byEmail = slack.users.lookupByEmail(
 *     UsersLookupByEmailRequest(email = "user@example.com")
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/users.list">users.list</a>
 * @see <a href="https://docs.slack.dev/reference/methods/users.info">users.info</a>
 * @see <a href="https://docs.slack.dev/reference/methods/users.profile.get">users.profile.get</a>
 * @see <a href="https://docs.slack.dev/reference/methods/users.profile.set">users.profile.set</a>
 */
@JsExport
interface UsersResource {

    /**
     * Retrieves conversations a user has access to.
     *
     * Returns all conversations the user can access, including private
     * channels they are a member of (if using a user token).
     *
     * @param req Request containing the user ID
     * @return Response with a list of conversation IDs
     * @see <a href="https://docs.slack.dev/reference/methods/users.conversations">users.conversations</a>
     */
    suspend fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    @JsExport.Ignore
    fun usersConversationsBlocking(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    suspend fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    @JsExport.Ignore
    fun usersDeletePhotoBlocking(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    suspend fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    @JsExport.Ignore
    fun usersGetPresenceBlocking(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    suspend fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    @JsExport.Ignore
    fun usersIdentityBlocking(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    suspend fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse

    @JsExport.Ignore
    fun usersInfoBlocking(
        req: UsersInfoRequest
    ): UsersInfoResponse

    suspend fun usersList(
        req: UsersListRequest
    ): UsersListResponse

    @JsExport.Ignore
    fun usersListBlocking(
        req: UsersListRequest
    ): UsersListResponse

    suspend fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    @JsExport.Ignore
    fun usersLookupByEmailBlocking(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    @Deprecated("Deprecated by Slack.")
    suspend fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    @Deprecated("Deprecated by Slack.")
    @JsExport.Ignore
    fun usersSetActiveBlocking(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    suspend fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    @JsExport.Ignore
    fun usersSetPhotoBlocking(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    suspend fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    @JsExport.Ignore
    fun usersSetPresenceBlocking(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    suspend fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    @JsExport.Ignore
    fun usersProfileGetBlocking(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    suspend fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse

    @JsExport.Ignore
    fun usersProfileSetBlocking(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse

    suspend fun usersDiscoverableContactsLookup(
        req: UsersDiscoverableContactsLookupRequest
    ): UsersDiscoverableContactsLookupResponse

    @JsExport.Ignore
    fun usersDiscoverableContactsLookupBlocking(
        req: UsersDiscoverableContactsLookupRequest
    ): UsersDiscoverableContactsLookupResponse
}
