package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.admin.apps.*
import work.socialhub.kslack.api.methods.request.admin.invite_requests.*
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*
import work.socialhub.kslack.api.methods.response.admin.apps.*
import work.socialhub.kslack.api.methods.response.admin.invite_requests.*
import work.socialhub.kslack.api.methods.response.admin.teams.*
import work.socialhub.kslack.api.methods.response.admin.users.*
import kotlin.js.JsExport

@JsExport
interface AdminResource {

    suspend fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse

    @JsExport.Ignore
    fun adminAppsApproveBlocking(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse

    suspend fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse

    @JsExport.Ignore
    fun adminAppsRestrictBlocking(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse

    suspend fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse

    @JsExport.Ignore
    fun adminAppsRequestsListBlocking(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse

    suspend fun adminInviteRequestsApprove(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse

    @JsExport.Ignore
    fun adminInviteRequestsApproveBlocking(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse

    suspend fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse

    @JsExport.Ignore
    fun adminInviteRequestsDenyBlocking(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse

    suspend fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse

    @JsExport.Ignore
    fun adminInviteRequestsListBlocking(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse

    suspend fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse

    @JsExport.Ignore
    fun adminInviteRequestsApprovedListBlocking(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse

    suspend fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse

    @JsExport.Ignore
    fun adminInviteRequestsDeniedListBlocking(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse

    suspend fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse

    @JsExport.Ignore
    fun adminTeamsAdminsListBlocking(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse

    suspend fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse

    @JsExport.Ignore
    fun adminTeamsCreateBlocking(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse

    suspend fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse

    @JsExport.Ignore
    fun adminTeamsOwnersListBlocking(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse

    suspend fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse

    @JsExport.Ignore
    fun adminTeamsSettingsSetDescriptionBlocking(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse

    suspend fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse

    @JsExport.Ignore
    fun adminTeamsSettingsSetIconBlocking(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse

    suspend fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse

    @JsExport.Ignore
    fun adminTeamsSettingsSetNameBlocking(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse

    suspend fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse

    @JsExport.Ignore
    fun adminUsersAssignBlocking(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse

    suspend fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse

    @JsExport.Ignore
    fun adminUsersInviteBlocking(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse

    suspend fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse

    @JsExport.Ignore
    fun adminUsersRemoveBlocking(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse

    suspend fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse

    @JsExport.Ignore
    fun adminUsersSetAdminBlocking(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse

    suspend fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse

    @JsExport.Ignore
    fun adminUsersSetOwnerBlocking(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse

    suspend fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse

    @JsExport.Ignore
    fun adminUsersSetRegularBlocking(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse

    suspend fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse

    @JsExport.Ignore
    fun adminUsersSessionResetBlocking(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse
}
