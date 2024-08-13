package work.socialhub.kslack.api.methods.impl

import com.github.seratch.jslack.api.methods.response.admin.apps.AdminAppsApproveResponse
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsRestrictResponse

class AdminResourceImpl : AbstractResourceImpl() {

    // ----------------------------------------------------------------------------------
    // public methods
    // ----------------------------------------------------------------------------------
    fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_APPROVE,
            getToken(req),
            AdminAppsApproveResponse::class.java
        )
    }

    fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_RESTRICT,
            getToken(req),
            AdminAppsRestrictResponse::class.java
        )
    }


    fun adminAppsRequestsList(req: AdminAppsRequestsListRequest): AdminAppsRequestsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_REQUESTS_LIST,
            getToken(req),
            AdminAppsRequestsListResponse::class.java
        )
    }


    fun adminInviteRequestsApprove(req: AdminInviteRequestsApproveRequest): AdminInviteRequestsApproveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_APPROVE,
            getToken(req),
            AdminInviteRequestsApproveResponse::class.java
        )
    }

    fun adminInviteRequestsDeny(req: AdminInviteRequestsDenyRequest): AdminInviteRequestsDenyResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_DENY,
            getToken(req),
            AdminInviteRequestsDenyResponse::class.java
        )
    }

    fun adminInviteRequestsList(req: AdminInviteRequestsListRequest): AdminInviteRequestsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_LIST,
            getToken(req),
            AdminInviteRequestsListResponse::class.java
        )
    }

    fun adminInviteRequestsApprovedList(req: AdminInviteRequestsApprovedListRequest): AdminInviteRequestsApprovedListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_APPROVED_LIST,
            getToken(req),
            AdminInviteRequestsApprovedListResponse::class.java
        )
    }

    fun adminInviteRequestsDeniedList(req: AdminInviteRequestsDeniedListRequest): AdminInviteRequestsDeniedListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_DENIED_LIST,
            getToken(req),
            AdminInviteRequestsDeniedListResponse::class.java
        )
    }

    fun adminTeamsAdminsList(req: AdminTeamsAdminsListRequest): AdminTeamsAdminsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_ADMINS_LIST,
            getToken(req),
            AdminTeamsAdminsListResponse::class.java
        )
    }

    fun adminTeamsCreate(req: AdminTeamsCreateRequest): AdminTeamsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_CREATE,
            getToken(req),
            AdminTeamsCreateResponse::class.java
        )
    }

    fun adminTeamsOwnersList(req: AdminTeamsOwnersListRequest): AdminTeamsOwnersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_OWNERS_LIST,
            getToken(req),
            AdminTeamsOwnersListResponse::class.java
        )
    }


    fun adminTeamsSettingsSetDescription(req: AdminTeamsSettingsSetDescriptionRequest): AdminTeamsSettingsSetDescriptionResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_SETTINGS_SET_DESCRIPTION,
            getToken(req),
            AdminTeamsSettingsSetDescriptionResponse::class.java
        )
    }

    fun adminTeamsSettingsSetIcon(req: AdminTeamsSettingsSetIconRequest): AdminTeamsSettingsSetIconResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_SETTINGS_SET_ICON,
            getToken(req),
            AdminTeamsSettingsSetIconResponse::class.java
        )
    }

    fun adminTeamsSettingsSetName(req: AdminTeamsSettingsSetNameRequest): AdminTeamsSettingsSetNameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_SETTINGS_SET_NAME,
            getToken(req),
            AdminTeamsSettingsSetNameResponse::class.java
        )
    }

    fun adminUsersAssign(req: AdminUsersAssignRequest): AdminUsersAssignResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_ASSIGN,
            getToken(req),
            AdminUsersAssignResponse::class.java
        )
    }

    fun adminUsersInvite(req: AdminUsersInviteRequest): AdminUsersInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_INVITE,
            getToken(req),
            AdminUsersInviteResponse::class.java
        )
    }

    fun adminUsersRemove(req: AdminUsersRemoveRequest): AdminUsersRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_REMOVE,
            getToken(req),
            AdminUsersRemoveResponse::class.java
        )
    }

    fun adminUsersSetAdmin(req: AdminUsersSetAdminRequest): AdminUsersSetAdminResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_ADMIN,
            getToken(req),
            AdminUsersSetAdminResponse::class.java
        )
    }

    fun adminUsersSetOwner(req: AdminUsersSetOwnerRequest): AdminUsersSetOwnerResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_OWNER,
            getToken(req),
            AdminUsersSetOwnerResponse::class.java
        )
    }

    fun adminUsersSetRegular(req: AdminUsersSetRegularRequest): AdminUsersSetRegularResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_REGULAR,
            getToken(req),
            AdminUsersSetRegularResponse::class.java
        )
    }

    fun adminUsersSessionReset(req: AdminUsersSessionResetRequest): AdminUsersSessionResetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SESSION_RESET,
            getToken(req),
            AdminUsersSessionResetResponse::class.java
        )
    }
}