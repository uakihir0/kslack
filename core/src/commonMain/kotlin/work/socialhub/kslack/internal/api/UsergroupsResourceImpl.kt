package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.UsergroupsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.usergroups.*
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import work.socialhub.kslack.api.methods.response.usergroups.*
import work.socialhub.kslack.api.methods.response.usergroups.users.UsergroupUsersListResponse
import work.socialhub.kslack.api.methods.response.usergroups.users.UserGroupUsersUpdateResponse
import work.socialhub.kslack.util.toBlocking

class UsergroupsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), UsergroupsResource {

    override suspend fun usergroupsCreate(req: UsergroupsCreateRequest): UserGroupsCreateResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_CREATE, getToken(req))
    }

    override fun usergroupsCreateBlocking(req: UsergroupsCreateRequest): UserGroupsCreateResponse {
        return toBlocking { usergroupsCreate(req) }
    }

    override suspend fun usergroupsDisable(req: UsergroupsDisableRequest): UserGroupsDisableResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_DISABLE, getToken(req))
    }

    override fun usergroupsDisableBlocking(req: UsergroupsDisableRequest): UserGroupsDisableResponse {
        return toBlocking { usergroupsDisable(req) }
    }

    override suspend fun usergroupsEnable(req: UsergroupsEnableRequest): UsergroupsEnableResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_ENABLE, getToken(req))
    }

    override fun usergroupsEnableBlocking(req: UsergroupsEnableRequest): UsergroupsEnableResponse {
        return toBlocking { usergroupsEnable(req) }
    }

    override suspend fun usergroupsList(req: UsergroupsListRequest): UsergroupsListResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_LIST, getToken(req))
    }

    override fun usergroupsListBlocking(req: UsergroupsListRequest): UsergroupsListResponse {
        return toBlocking { usergroupsList(req) }
    }

    override suspend fun usergroupsUpdate(req: UsergroupsUpdateRequest): UsergroupsUpdateResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_UPDATE, getToken(req))
    }

    override fun usergroupsUpdateBlocking(req: UsergroupsUpdateRequest): UsergroupsUpdateResponse {
        return toBlocking { usergroupsUpdate(req) }
    }

    override suspend fun usergroupUsersList(req: UsergroupUsersListRequest): UsergroupUsersListResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_USERS_LIST, getToken(req))
    }

    override fun usergroupUsersListBlocking(req: UsergroupUsersListRequest): UsergroupUsersListResponse {
        return toBlocking { usergroupUsersList(req) }
    }

    override suspend fun usergroupUsersUpdate(req: UsergroupUsersUpdateRequest): UserGroupUsersUpdateResponse {
        return postFormWithToken(req.toParams(), Methods.USERGROUPS_USERS_UPDATE, getToken(req))
    }

    override fun usergroupUsersUpdateBlocking(req: UsergroupUsersUpdateRequest): UserGroupUsersUpdateResponse {
        return toBlocking { usergroupUsersUpdate(req) }
    }
}
