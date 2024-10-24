package work.socialhub.kslack.api.methods.impl

import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRequestsListRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.*
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsApproveResponse
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsRequestsListResponse
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsRestrictResponse
import work.socialhub.kslack.api.methods.response.admin.invite_requests.*
import work.socialhub.kslack.api.methods.response.admin.teams.*
import work.socialhub.kslack.api.methods.response.admin.users.*

/**
 * TODO: make interface
 */
class AdminResourceImpl(
    token: String?
) : AbstractResourceImpl(token) {

    // ----------------------------------------------------------------------------------
    // public methods
    // ----------------------------------------------------------------------------------
    suspend fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_APPROVE,
            getToken(req),
        )
    }

    suspend fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_RESTRICT,
            getToken(req),
        )
    }

    suspend fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_REQUESTS_LIST,
            getToken(req),
        )
    }

    suspend fun adminInviteRequestsApprove(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_APPROVE,
            getToken(req),
        )
    }

    suspend fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_DENY,
            getToken(req),
        )
    }

    suspend fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_LIST,
            getToken(req),

            )
    }

    suspend fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_APPROVED_LIST,
            getToken(req),
        )
    }

    suspend fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_DENIED_LIST,
            getToken(req),
        )
    }

    suspend fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_ADMINS_LIST,
            getToken(req),
        )
    }

    suspend fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_CREATE,
            getToken(req),
        )
    }

    suspend fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_OWNERS_LIST,
            getToken(req),
        )
    }


    suspend fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_DESCRIPTION,
            getToken(req),
        )
    }

    suspend fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_ICON,
            getToken(req),
        )
    }

    suspend fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_NAME,
            getToken(req),
        )
    }

    suspend fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_ASSIGN,
            getToken(req),
        )
    }

    suspend fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_INVITE,
            getToken(req),
        )
    }

    suspend fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_REMOVE,
            getToken(req),
        )
    }

    suspend fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_ADMIN,
            getToken(req),
        )
    }

    suspend fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_OWNER,
            getToken(req),
        )
    }

    suspend fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_REGULAR,
            getToken(req),
        )
    }

    suspend fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SESSION_RESET,
            getToken(req),
        )
    }
}