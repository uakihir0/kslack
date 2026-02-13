package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.AdminResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.admin.apps.*
import work.socialhub.kslack.api.methods.request.admin.invite_requests.*
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*
import work.socialhub.kslack.api.methods.response.admin.apps.*
import work.socialhub.kslack.api.methods.response.admin.invite_requests.*
import work.socialhub.kslack.api.methods.response.admin.teams.*
import work.socialhub.kslack.api.methods.response.admin.users.*
import work.socialhub.kslack.util.toBlocking

class AdminResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    AdminResource {

    override suspend fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_APPROVE,
            getToken(req),
        )
    }

    override fun adminAppsApproveBlocking(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse {
        return toBlocking { adminAppsApprove(req) }
    }

    override suspend fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_RESTRICT,
            getToken(req),
        )
    }

    override fun adminAppsRestrictBlocking(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse {
        return toBlocking { adminAppsRestrict(req) }
    }

    override suspend fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_REQUESTS_LIST,
            getToken(req),
        )
    }

    override fun adminAppsRequestsListBlocking(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse {
        return toBlocking { adminAppsRequestsList(req) }
    }

    override suspend fun adminInviteRequestsApprove(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_APPROVE,
            getToken(req),
        )
    }

    override fun adminInviteRequestsApproveBlocking(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse {
        return toBlocking { adminInviteRequestsApprove(req) }
    }

    override suspend fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_DENY,
            getToken(req),
        )
    }

    override fun adminInviteRequestsDenyBlocking(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse {
        return toBlocking { adminInviteRequestsDeny(req) }
    }

    override suspend fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_LIST,
            getToken(req),
        )
    }

    override fun adminInviteRequestsListBlocking(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse {
        return toBlocking { adminInviteRequestsList(req) }
    }

    override suspend fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_APPROVED_LIST,
            getToken(req),
        )
    }

    override fun adminInviteRequestsApprovedListBlocking(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse {
        return toBlocking { adminInviteRequestsApprovedList(req) }
    }

    override suspend fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_DENIED_LIST,
            getToken(req),
        )
    }

    override fun adminInviteRequestsDeniedListBlocking(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse {
        return toBlocking { adminInviteRequestsDeniedList(req) }
    }

    override suspend fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_ADMINS_LIST,
            getToken(req),
        )
    }

    override fun adminTeamsAdminsListBlocking(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse {
        return toBlocking { adminTeamsAdminsList(req) }
    }

    override suspend fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_CREATE,
            getToken(req),
        )
    }

    override fun adminTeamsCreateBlocking(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse {
        return toBlocking { adminTeamsCreate(req) }
    }

    override suspend fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_OWNERS_LIST,
            getToken(req),
        )
    }

    override fun adminTeamsOwnersListBlocking(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse {
        return toBlocking { adminTeamsOwnersList(req) }
    }

    override suspend fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_DESCRIPTION,
            getToken(req),
        )
    }

    override fun adminTeamsSettingsSetDescriptionBlocking(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse {
        return toBlocking { adminTeamsSettingsSetDescription(req) }
    }

    override suspend fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_ICON,
            getToken(req),
        )
    }

    override fun adminTeamsSettingsSetIconBlocking(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse {
        return toBlocking { adminTeamsSettingsSetIcon(req) }
    }

    override suspend fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_NAME,
            getToken(req),
        )
    }

    override fun adminTeamsSettingsSetNameBlocking(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse {
        return toBlocking { adminTeamsSettingsSetName(req) }
    }

    override suspend fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_ASSIGN,
            getToken(req),
        )
    }

    override fun adminUsersAssignBlocking(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse {
        return toBlocking { adminUsersAssign(req) }
    }

    override suspend fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_INVITE,
            getToken(req),
        )
    }

    override fun adminUsersInviteBlocking(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse {
        return toBlocking { adminUsersInvite(req) }
    }

    override suspend fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_REMOVE,
            getToken(req),
        )
    }

    override fun adminUsersRemoveBlocking(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse {
        return toBlocking { adminUsersRemove(req) }
    }

    override suspend fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_ADMIN,
            getToken(req),
        )
    }

    override fun adminUsersSetAdminBlocking(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse {
        return toBlocking { adminUsersSetAdmin(req) }
    }

    override suspend fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_OWNER,
            getToken(req),
        )
    }

    override fun adminUsersSetOwnerBlocking(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse {
        return toBlocking { adminUsersSetOwner(req) }
    }

    override suspend fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_REGULAR,
            getToken(req),
        )
    }

    override fun adminUsersSetRegularBlocking(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse {
        return toBlocking { adminUsersSetRegular(req) }
    }

    override suspend fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SESSION_RESET,
            getToken(req),
        )
    }

    override fun adminUsersSessionResetBlocking(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse {
        return toBlocking { adminUsersSessionReset(req) }
    }
}
