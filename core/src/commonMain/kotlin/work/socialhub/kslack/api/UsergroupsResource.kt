package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.usergroups.*
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import work.socialhub.kslack.api.methods.response.usergroups.*
import work.socialhub.kslack.api.methods.response.usergroups.users.UsergroupUsersListResponse
import work.socialhub.kslack.api.methods.response.usergroups.users.UserGroupUsersUpdateResponse
import kotlin.js.JsExport

@JsExport
interface UsergroupsResource {

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
