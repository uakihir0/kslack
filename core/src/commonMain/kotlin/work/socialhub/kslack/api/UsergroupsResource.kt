package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.usergroups.*
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import work.socialhub.kslack.api.methods.response.usergroups.*
import work.socialhub.kslack.api.methods.response.usergroups.users.UsergroupUsersListResponse
import work.socialhub.kslack.api.methods.response.usergroups.users.UserGroupUsersUpdateResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `usergroups.*` API methods.
 *
 * Provides methods for creating, managing, and updating user groups (formerly
 * known as "usergroups"). User groups allow organizing users into teams
 * for easier mention and discovery.
 *
 * # Usage Example
 * ```kotlin
 * // List all user groups in the workspace
 * val groups = slack.usergroups.list(UsergroupsListRequest())
 *
 * // Update a user group's description
 * val updated = slack.usergroups.update(
 *     UsergroupsUpdateRequest(
 *         id = "S012AB3CD",
 *         description = "Backend development team"
 *     )
 * )
 *
 * // Update members in a user group
 * val membersUpdated = slack.usergroup.users.update(
 *     UsergroupUsersUpdateRequest(
 *         id = "S012AB3CD",
 *         users = arrayOf("U012AB3CD", "U012AB3CE")
 *     )
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/usergroups.create">usergroups.create</a>
 * @see <a href="https://docs.slack.dev/reference/methods/usergroups.list">usergroups.list</a>
 * @see <a href="https://docs.slack.dev/reference/methods/usergroups.update">usergroups.update</a>
 * @see <a href="https://docs.slack.dev/reference/methods/usergroups.users.list">usergroups.users.list</a>
 */
@JsExport
interface UsergroupsResource {

    /**
     * Creates a new user group.
     *
     * @param req Request containing the group name and optional description/m handles
     * @return Response with the created group's ID and details
     * @see <a href="https://docs.slack.dev/reference/methods/usergroups.create">usergroups.create</a>
     */
    suspend fun usergroupsCreate(
        req: UsergroupsCreateRequest
    ): UserGroupsCreateResponse

    @JsExport.Ignore
    fun usergroupsCreateBlocking(
        req: UsergroupsCreateRequest
    ): UserGroupsCreateResponse

    suspend fun usergroupsDisable(
        req: UsergroupsDisableRequest
    ): UserGroupsDisableResponse

    @JsExport.Ignore
    fun usergroupsDisableBlocking(
        req: UsergroupsDisableRequest
    ): UserGroupsDisableResponse

    suspend fun usergroupsEnable(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse

    @JsExport.Ignore
    fun usergroupsEnableBlocking(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse

    suspend fun usergroupsList(
        req: UsergroupsListRequest
    ): UsergroupsListResponse

    @JsExport.Ignore
    fun usergroupsListBlocking(
        req: UsergroupsListRequest
    ): UsergroupsListResponse

    suspend fun usergroupsUpdate(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse

    @JsExport.Ignore
    fun usergroupsUpdateBlocking(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse

    suspend fun usergroupUsersList(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse

    @JsExport.Ignore
    fun usergroupUsersListBlocking(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse

    suspend fun usergroupUsersUpdate(
        req: UsergroupUsersUpdateRequest
    ): UserGroupUsersUpdateResponse

    @JsExport.Ignore
    fun usergroupUsersUpdateBlocking(
        req: UsergroupUsersUpdateRequest
    ): UserGroupUsersUpdateResponse
}
