package com.github.seratch.jslack.api.methods

import com.github.seratch.jslack.api.RequestConfigurator
import com.github.seratch.jslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import com.github.seratch.jslack.api.methods.request.admin.apps.AdminAppsRequestsListRequest
import com.github.seratch.jslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import com.github.seratch.jslack.api.methods.request.admin.invite_requests.*
import com.github.seratch.jslack.api.methods.request.admin.teams.*
import com.github.seratch.jslack.api.methods.request.admin.users.*
import com.github.seratch.jslack.api.methods.request.api.ApiTestRequest
import com.github.seratch.jslack.api.methods.request.apps.AppsUninstallRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.AppsPermissionsInfoRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.AppsPermissionsRequestRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.resources.AppsPermissionsResourcesListRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.scopes.AppsPermissionsScopesListRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersListRequest
import com.github.seratch.jslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersRequestRequest
import com.github.seratch.jslack.api.methods.request.auth.AuthRevokeRequest
import com.github.seratch.jslack.api.methods.request.auth.AuthTestRequest
import com.github.seratch.jslack.api.methods.request.bots.BotsInfoRequest
import com.github.seratch.jslack.api.methods.request.channels.*
import com.github.seratch.jslack.api.methods.request.chat.*
import com.github.seratch.jslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import com.github.seratch.jslack.api.methods.request.conversations.*
import com.github.seratch.jslack.api.methods.request.dialog.DialogOpenRequest
import com.github.seratch.jslack.api.methods.request.dnd.*
import com.github.seratch.jslack.api.methods.request.emoji.EmojiListRequest
import com.github.seratch.jslack.api.methods.request.files.*
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsAddRequest
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsDeleteRequest
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsEditRequest
import com.github.seratch.jslack.api.methods.request.files.remote.*
import com.github.seratch.jslack.api.methods.request.groups.*
import com.github.seratch.jslack.api.methods.request.im.*
import com.github.seratch.jslack.api.methods.request.migration.MigrationExchangeRequest
import com.github.seratch.jslack.api.methods.request.mpim.*
import com.github.seratch.jslack.api.methods.request.oauth.OAuthAccessRequest
import com.github.seratch.jslack.api.methods.request.oauth.OAuthTokenRequest
import com.github.seratch.jslack.api.methods.request.oauth.OAuthV2AccessRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsAddRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsListRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsRemoveRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsAddRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsGetRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsListRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsRemoveRequest
import com.github.seratch.jslack.api.methods.request.reminders.*
import com.github.seratch.jslack.api.methods.request.rtm.RTMConnectRequest
import com.github.seratch.jslack.api.methods.request.rtm.RTMStartRequest
import com.github.seratch.jslack.api.methods.request.search.SearchAllRequest
import com.github.seratch.jslack.api.methods.request.search.SearchFilesRequest
import com.github.seratch.jslack.api.methods.request.search.SearchMessagesRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsAddRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsListRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsRemoveRequest
import com.github.seratch.jslack.api.methods.request.team.TeamAccessLogsRequest
import com.github.seratch.jslack.api.methods.request.team.TeamBillableInfoRequest
import com.github.seratch.jslack.api.methods.request.team.TeamInfoRequest
import com.github.seratch.jslack.api.methods.request.team.TeamIntegrationLogsRequest
import com.github.seratch.jslack.api.methods.request.team.profile.TeamProfileGetRequest
import com.github.seratch.jslack.api.methods.request.usergroups.*
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import com.github.seratch.jslack.api.methods.request.users.*
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileGetRequest
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileSetRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsOpenRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsPublishRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsPushRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsUpdateRequest
import com.github.seratch.jslack.api.methods.response.admin.apps.AdminAppsApproveResponse
import com.github.seratch.jslack.api.methods.response.admin.apps.AdminAppsRequestsListResponse
import com.github.seratch.jslack.api.methods.response.admin.apps.AdminAppsRestrictResponse
import com.github.seratch.jslack.api.methods.response.admin.invite_requests.*
import com.github.seratch.jslack.api.methods.response.admin.teams.*
import com.github.seratch.jslack.api.methods.response.admin.users.*
import com.github.seratch.jslack.api.methods.response.api.ApiTestResponse
import com.github.seratch.jslack.api.methods.response.apps.AppsUninstallResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.AppsPermissionsInfoResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.AppsPermissionsRequestResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.resources.AppsPermissionsResourcesListResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.scopes.AppsPermissionsScopesListResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersListResponse
import com.github.seratch.jslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersRequestResponse
import com.github.seratch.jslack.api.methods.response.auth.AuthRevokeResponse
import com.github.seratch.jslack.api.methods.response.auth.AuthTestResponse
import com.github.seratch.jslack.api.methods.response.bots.BotsInfoResponse
import com.github.seratch.jslack.api.methods.response.channels.*
import com.github.seratch.jslack.api.methods.response.chat.*
import com.github.seratch.jslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse
import com.github.seratch.jslack.api.methods.response.conversations.*
import com.github.seratch.jslack.api.methods.response.dialog.DialogOpenResponse
import com.github.seratch.jslack.api.methods.response.dnd.*
import com.github.seratch.jslack.api.methods.response.emoji.EmojiListResponse
import com.github.seratch.jslack.api.methods.response.files.*
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsAddResponse
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsDeleteResponse
import com.github.seratch.jslack.api.methods.response.files.comments.FilesCommentsEditResponse
import com.github.seratch.jslack.api.methods.response.files.remote.*
import com.github.seratch.jslack.api.methods.response.groups.*
import com.github.seratch.jslack.api.methods.response.im.*
import com.github.seratch.jslack.api.methods.response.migration.MigrationExchangeResponse
import com.github.seratch.jslack.api.methods.response.mpim.*
import com.github.seratch.jslack.api.methods.response.oauth.OAuthAccessResponse
import com.github.seratch.jslack.api.methods.response.oauth.OAuthTokenResponse
import com.github.seratch.jslack.api.methods.response.oauth.OAuthV2AccessResponse
import com.github.seratch.jslack.api.methods.response.pins.PinsAddResponse
import com.github.seratch.jslack.api.methods.response.pins.PinsListResponse
import com.github.seratch.jslack.api.methods.response.pins.PinsRemoveResponse
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsAddResponse
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsGetResponse
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsListResponse
import com.github.seratch.jslack.api.methods.response.reactions.ReactionsRemoveResponse
import com.github.seratch.jslack.api.methods.response.reminders.*
import com.github.seratch.jslack.api.methods.response.rtm.RTMConnectResponse
import com.github.seratch.jslack.api.methods.response.rtm.RTMStartResponse
import com.github.seratch.jslack.api.methods.response.search.SearchAllResponse
import com.github.seratch.jslack.api.methods.response.search.SearchFilesResponse
import com.github.seratch.jslack.api.methods.response.search.SearchMessagesResponse
import com.github.seratch.jslack.api.methods.response.stars.StarsAddResponse
import com.github.seratch.jslack.api.methods.response.stars.StarsListResponse
import com.github.seratch.jslack.api.methods.response.stars.StarsRemoveResponse
import com.github.seratch.jslack.api.methods.response.team.TeamAccessLogsResponse
import com.github.seratch.jslack.api.methods.response.team.TeamBillableInfoResponse
import com.github.seratch.jslack.api.methods.response.team.TeamInfoResponse
import com.github.seratch.jslack.api.methods.response.team.TeamIntegrationLogsResponse
import com.github.seratch.jslack.api.methods.response.team.profile.TeamProfileGetResponse
import com.github.seratch.jslack.api.methods.response.usergroups.*
import com.github.seratch.jslack.api.methods.response.usergroups.users.UsergroupUsersListResponse
import com.github.seratch.jslack.api.methods.response.usergroups.users.UsergroupUsersUpdateResponse
import com.github.seratch.jslack.api.methods.response.users.*
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileGetResponse
import com.github.seratch.jslack.api.methods.response.users.profile.UsersProfileSetResponse
import com.github.seratch.jslack.api.methods.response.views.ViewsOpenResponse
import com.github.seratch.jslack.api.methods.response.views.ViewsPublishResponse
import com.github.seratch.jslack.api.methods.response.views.ViewsPushResponse
import com.github.seratch.jslack.api.methods.response.views.ViewsUpdateResponse
import net.socialhub.http.HttpResponse

/**
 * API Methods.
 * https://api.slack.com/methods
 */
interface MethodsClient {
    var endpointUrlPrefix: String?

    // ----------------------------------------------
    //  OkHttp layer methods
    // ----------------------------------------------
    @Throws(java.io.IOException::class)
    fun runPostForm(
        form: FormBody.Builder?,
        endpoint: String?
    ): HttpResponse?

    @Throws(java.io.IOException::class)
    fun runPostFormWithToken(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?
    ): HttpResponse?

    @Throws(java.io.IOException::class)
    fun runPostMultipart(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?
    ): HttpResponse?

    // ----------------------------------------------
    //  Methods to send requests and parse responses
    // ----------------------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun <T> postFormAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        clazz: java.lang.Class<T>?
    ): T

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun <T> postFormWithAuthorizationHeaderAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        authorizationHeader: String?,
        clazz: java.lang.Class<T>?
    ): T

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun <T> postFormWithTokenAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun <T> postMultipartAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T

    // ------------------------------
    // admin.apps
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsApprove(req: AdminAppsApproveRequest?): AdminAppsApproveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsApprove(req: RequestConfigurator<AdminAppsApproveRequest.AdminAppsApproveRequestBuilder?>?): AdminAppsApproveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsRestrict(req: AdminAppsRestrictRequest?): AdminAppsRestrictResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsRestrict(req: RequestConfigurator<AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder?>?): AdminAppsRestrictResponse?

    // ------------------------------
    // admin.apps.requests
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsRequestsList(req: AdminAppsRequestsListRequest?): AdminAppsRequestsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminAppsRequestsList(req: RequestConfigurator<AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder?>?): AdminAppsRequestsListResponse?

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsApprove(req: AdminInviteRequestsApproveRequest?): AdminInviteRequestsApproveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsApprove(req: RequestConfigurator<AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder?>?): AdminInviteRequestsApproveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsDeny(req: AdminInviteRequestsDenyRequest?): AdminInviteRequestsDenyResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsDeny(req: RequestConfigurator<AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder?>?): AdminInviteRequestsDenyResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsList(req: AdminInviteRequestsListRequest?): AdminInviteRequestsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsList(req: RequestConfigurator<AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder?>?): AdminInviteRequestsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsApprovedList(req: AdminInviteRequestsApprovedListRequest?): AdminInviteRequestsApprovedListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsApprovedList(req: RequestConfigurator<AdminInviteRequestsApprovedListRequest.AdminInviteRequestsApprovedListRequestBuilder?>?): AdminInviteRequestsApprovedListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsDeniedList(req: AdminInviteRequestsDeniedListRequest?): AdminInviteRequestsDeniedListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminInviteRequestsDeniedList(req: RequestConfigurator<AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder?>?): AdminInviteRequestsDeniedListResponse?

    // ------------------------------
    // admin.teams.admins
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsAdminsList(req: AdminTeamsAdminsListRequest?): AdminTeamsAdminsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsAdminsList(req: RequestConfigurator<AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder?>?): AdminTeamsAdminsListResponse?

    // ------------------------------
    // admin.teams
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsCreate(req: AdminTeamsCreateRequest?): AdminTeamsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsCreate(req: RequestConfigurator<AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder?>?): AdminTeamsCreateResponse?

    // ------------------------------
    // admin.teams.owners
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsOwnersList(req: AdminTeamsOwnersListRequest?): AdminTeamsOwnersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsOwnersList(req: RequestConfigurator<AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder?>?): AdminTeamsOwnersListResponse?

    // ------------------------------
    // admin.teams.settings
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetDescription(req: AdminTeamsSettingsSetDescriptionRequest?): AdminTeamsSettingsSetDescriptionResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetDescription(req: RequestConfigurator<AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder?>?): AdminTeamsSettingsSetDescriptionResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetIcon(req: AdminTeamsSettingsSetIconRequest?): AdminTeamsSettingsSetIconResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetIcon(req: RequestConfigurator<AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder?>?): AdminTeamsSettingsSetIconResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetName(req: AdminTeamsSettingsSetNameRequest?): AdminTeamsSettingsSetNameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminTeamsSettingsSetName(req: RequestConfigurator<AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder?>?): AdminTeamsSettingsSetNameResponse?

    // ------------------------------
    // admin.users
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersAssign(req: AdminUsersAssignRequest?): AdminUsersAssignResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersAssign(req: RequestConfigurator<AdminUsersAssignRequest.AdminUsersAssignRequestBuilder?>?): AdminUsersAssignResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersInvite(req: AdminUsersInviteRequest?): AdminUsersInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersInvite(req: RequestConfigurator<AdminUsersInviteRequest.AdminUsersInviteRequestBuilder?>?): AdminUsersInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersRemove(req: AdminUsersRemoveRequest?): AdminUsersRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersRemove(req: RequestConfigurator<AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder?>?): AdminUsersRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetAdmin(req: AdminUsersSetAdminRequest?): AdminUsersSetAdminResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetAdmin(req: RequestConfigurator<AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder?>?): AdminUsersSetAdminResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetOwner(req: AdminUsersSetOwnerRequest?): AdminUsersSetOwnerResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetOwner(req: RequestConfigurator<AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder?>?): AdminUsersSetOwnerResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetRegular(req: AdminUsersSetRegularRequest?): AdminUsersSetRegularResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSetRegular(req: RequestConfigurator<AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder?>?): AdminUsersSetRegularResponse?

    // ------------------------------
    // admin.users.session
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSessionReset(req: AdminUsersSessionResetRequest?): AdminUsersSessionResetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun adminUsersSessionReset(req: RequestConfigurator<AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder?>?): AdminUsersSessionResetResponse?

    // ------------------------------
    // api
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun apiTest(req: ApiTestRequest?): ApiTestResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun apiTest(req: RequestConfigurator<ApiTestRequest.ApiTestRequestBuilder?>?): ApiTestResponse?

    // ------------------------------
    // apps
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsUninstall(req: AppsUninstallRequest?): AppsUninstallResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsUninstall(req: RequestConfigurator<AppsUninstallRequest.AppsUninstallRequestBuilder?>?): AppsUninstallResponse?

    // ------------------------------
    // apps.permissions
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsInfo(req: AppsPermissionsInfoRequest?): AppsPermissionsInfoResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsInfo(req: RequestConfigurator<AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder?>?): AppsPermissionsInfoResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsRequest(req: AppsPermissionsRequestRequest?): AppsPermissionsRequestResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsRequest(req: RequestConfigurator<AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder?>?): AppsPermissionsRequestResponse?

    // ------------------------------
    // apps.permissions.resources
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsResourcesList(req: AppsPermissionsResourcesListRequest?): AppsPermissionsResourcesListResponse?

    // ------------------------------
    // apps.permissions.scopes
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsScopesList(req: AppsPermissionsScopesListRequest?): AppsPermissionsScopesListResponse?

    // ------------------------------
    // apps.permissions.users
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsUsersList(req: AppsPermissionsUsersListRequest?): AppsPermissionsUsersListResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun appsPermissionsUsersRequest(req: AppsPermissionsUsersRequestRequest?): AppsPermissionsUsersRequestResponse?

    // ------------------------------
    // auth
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun authRevoke(req: AuthRevokeRequest?): AuthRevokeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun authRevoke(req: RequestConfigurator<AuthRevokeRequest.AuthRevokeRequestBuilder?>?): AuthRevokeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun authTest(req: AuthTestRequest?): AuthTestResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun authTest(req: RequestConfigurator<AuthTestRequest.AuthTestRequestBuilder?>?): AuthTestResponse?

    // ------------------------------
    // bots
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun botsInfo(req: BotsInfoRequest?): BotsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun botsInfo(req: RequestConfigurator<BotsInfoRequest.BotsInfoRequestBuilder?>?): BotsInfoResponse?

    // ------------------------------
    // channels
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsArchive(req: ChannelsArchiveRequest?): ChannelsArchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsArchive(req: RequestConfigurator<ChannelsArchiveRequest.ChannelsArchiveRequestBuilder?>?): ChannelsArchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsCreate(req: ChannelsCreateRequest?): ChannelsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsCreate(req: RequestConfigurator<ChannelsCreateRequest.ChannelsCreateRequestBuilder?>?): ChannelsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsHistory(req: ChannelsHistoryRequest?): ChannelsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsHistory(req: RequestConfigurator<ChannelsHistoryRequest.ChannelsHistoryRequestBuilder?>?): ChannelsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsReplies(req: ChannelsRepliesRequest?): ChannelsRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsReplies(req: RequestConfigurator<ChannelsRepliesRequest.ChannelsRepliesRequestBuilder?>?): ChannelsRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsInfo(req: ChannelsInfoRequest?): ChannelsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsInfo(req: RequestConfigurator<ChannelsInfoRequest.ChannelsInfoRequestBuilder?>?): ChannelsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsList(req: ChannelsListRequest?): ChannelsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsList(req: RequestConfigurator<ChannelsListRequest.ChannelsListRequestBuilder?>?): ChannelsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsInvite(req: ChannelsInviteRequest?): ChannelsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsInvite(req: RequestConfigurator<ChannelsInviteRequest.ChannelsInviteRequestBuilder?>?): ChannelsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsJoin(req: ChannelsJoinRequest?): ChannelsJoinResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsJoin(req: RequestConfigurator<ChannelsJoinRequest.ChannelsJoinRequestBuilder?>?): ChannelsJoinResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsKick(req: ChannelsKickRequest?): ChannelsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsKick(req: RequestConfigurator<ChannelsKickRequest.ChannelsKickRequestBuilder?>?): ChannelsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsLeave(req: ChannelsLeaveRequest?): ChannelsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsLeave(req: RequestConfigurator<ChannelsLeaveRequest.ChannelsLeaveRequestBuilder?>?): ChannelsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsMark(req: ChannelsMarkRequest?): ChannelsMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsMark(req: RequestConfigurator<ChannelsMarkRequest.ChannelsMarkRequestBuilder?>?): ChannelsMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsRename(req: ChannelsRenameRequest?): ChannelsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsRename(req: RequestConfigurator<ChannelsRenameRequest.ChannelsRenameRequestBuilder?>?): ChannelsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsSetPurpose(req: ChannelsSetPurposeRequest?): ChannelsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsSetPurpose(req: RequestConfigurator<ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder?>?): ChannelsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsSetTopic(req: ChannelsSetTopicRequest?): ChannelsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsSetTopic(req: RequestConfigurator<ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder?>?): ChannelsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsUnarchive(req: ChannelsUnarchiveRequest?): ChannelsUnarchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun channelsUnarchive(req: RequestConfigurator<ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder?>?): ChannelsUnarchiveResponse?

    // ------------------------------
    // chat
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatGetPermalink(req: ChatGetPermalinkRequest?): ChatGetPermalinkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatGetPermalink(req: RequestConfigurator<ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder?>?): ChatGetPermalinkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatDelete(req: ChatDeleteRequest?): ChatDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatDelete(req: RequestConfigurator<ChatDeleteRequest.ChatDeleteRequestBuilder?>?): ChatDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatDeleteScheduledMessage(req: ChatDeleteScheduledMessageRequest?): ChatDeleteScheduledMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatDeleteScheduledMessage(req: RequestConfigurator<ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder?>?): ChatDeleteScheduledMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatMeMessage(req: ChatMeMessageRequest?): ChatMeMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatMeMessage(req: RequestConfigurator<ChatMeMessageRequest.ChatMeMessageRequestBuilder?>?): ChatMeMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatPostEphemeral(req: ChatPostEphemeralRequest?): ChatPostEphemeralResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatPostEphemeral(req: RequestConfigurator<ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder?>?): ChatPostEphemeralResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatPostMessage(req: ChatPostMessageRequest?): ChatPostMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatPostMessage(req: RequestConfigurator<ChatPostMessageRequest.ChatPostMessageRequestBuilder?>?): ChatPostMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatScheduleMessage(req: ChatScheduleMessageRequest?): ChatScheduleMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatScheduleMessage(req: RequestConfigurator<ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder?>?): ChatScheduleMessageResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatUpdate(req: ChatUpdateRequest?): ChatUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatUpdate(req: RequestConfigurator<ChatUpdateRequest.ChatUpdateRequestBuilder?>?): ChatUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatUnfurl(req: ChatUnfurlRequest?): ChatUnfurlResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatUnfurl(req: RequestConfigurator<ChatUnfurlRequest.ChatUnfurlRequestBuilder?>?): ChatUnfurlResponse?

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatScheduleMessagesListMessage(req: ChatScheduleMessagesListRequest?): ChatScheduleMessagesListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun chatScheduleMessagesListMessage(req: RequestConfigurator<ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder?>?): ChatScheduleMessagesListResponse?

    // ------------------------------
    // conversations
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsArchive(req: ConversationsArchiveRequest?): ConversationsArchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsArchive(req: RequestConfigurator<ConversationsArchiveRequest.ConversationsArchiveRequestBuilder?>?): ConversationsArchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsClose(req: ConversationsCloseRequest?): ConversationsCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsClose(req: RequestConfigurator<ConversationsCloseRequest.ConversationsCloseRequestBuilder?>?): ConversationsCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsCreate(req: ConversationsCreateRequest?): ConversationsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsCreate(req: RequestConfigurator<ConversationsCreateRequest.ConversationsCreateRequestBuilder?>?): ConversationsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsHistory(req: ConversationsHistoryRequest?): ConversationsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsHistory(req: RequestConfigurator<ConversationsHistoryRequest.ConversationsHistoryRequestBuilder?>?): ConversationsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsInfo(req: ConversationsInfoRequest?): ConversationsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsInfo(req: RequestConfigurator<ConversationsInfoRequest.ConversationsInfoRequestBuilder?>?): ConversationsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsInvite(req: ConversationsInviteRequest?): ConversationsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsInvite(req: RequestConfigurator<ConversationsInviteRequest.ConversationsInviteRequestBuilder?>?): ConversationsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsJoin(req: ConversationsJoinRequest?): ConversationsJoinResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsJoin(req: RequestConfigurator<ConversationsJoinRequest.ConversationsJoinRequestBuilder?>?): ConversationsJoinResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsKick(req: ConversationsKickRequest?): ConversationsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsKick(req: RequestConfigurator<ConversationsKickRequest.ConversationsKickRequestBuilder?>?): ConversationsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsLeave(req: ConversationsLeaveRequest?): ConversationsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsLeave(req: RequestConfigurator<ConversationsLeaveRequest.ConversationsLeaveRequestBuilder?>?): ConversationsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsList(req: ConversationsListRequest?): ConversationsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsList(req: RequestConfigurator<ConversationsListRequest.ConversationsListRequestBuilder?>?): ConversationsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsMembers(req: ConversationsMembersRequest?): ConversationsMembersResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsMembers(req: RequestConfigurator<ConversationsMembersRequest.ConversationsMembersRequestBuilder?>?): ConversationsMembersResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsOpen(req: ConversationsOpenRequest?): ConversationsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsOpen(req: RequestConfigurator<ConversationsOpenRequest.ConversationsOpenRequestBuilder?>?): ConversationsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsRename(req: ConversationsRenameRequest?): ConversationsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsRename(req: RequestConfigurator<ConversationsRenameRequest.ConversationsRenameRequestBuilder?>?): ConversationsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsReplies(req: ConversationsRepliesRequest?): ConversationsRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsReplies(req: RequestConfigurator<ConversationsRepliesRequest.ConversationsRepliesRequestBuilder?>?): ConversationsRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsSetPurpose(req: ConversationsSetPurposeRequest?): ConversationsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsSetPurpose(req: RequestConfigurator<ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder?>?): ConversationsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsSetTopic(req: ConversationsSetTopicRequest?): ConversationsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsSetTopic(req: RequestConfigurator<ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder?>?): ConversationsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsUnarchive(req: ConversationsUnarchiveRequest?): ConversationsUnarchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun conversationsUnarchive(req: RequestConfigurator<ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder?>?): ConversationsUnarchiveResponse?

    // ------------------------------
    // dialog
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dialogOpen(req: DialogOpenRequest?): DialogOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dialogOpen(req: RequestConfigurator<DialogOpenRequest.DialogOpenRequestBuilder?>?): DialogOpenResponse?

    // ------------------------------
    // dnd
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndEndDnd(req: DndEndDndRequest?): DndEndDndResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndEndDnd(req: RequestConfigurator<DndEndDndRequest.DndEndDndRequestBuilder?>?): DndEndDndResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndEndSnooze(req: DndEndSnoozeRequest?): DndEndSnoozeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndEndSnooze(req: RequestConfigurator<DndEndSnoozeRequest.DndEndSnoozeRequestBuilder?>?): DndEndSnoozeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndInfo(req: DndInfoRequest?): DndInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndInfo(req: RequestConfigurator<DndInfoRequest.DndInfoRequestBuilder?>?): DndInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndSetSnooze(req: DndSetSnoozeRequest?): DndSetSnoozeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndSetSnooze(req: RequestConfigurator<DndSetSnoozeRequest.DndSetSnoozeRequestBuilder?>?): DndSetSnoozeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndTeamInfo(req: DndTeamInfoRequest?): DndTeamInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun dndTeamInfo(req: RequestConfigurator<DndTeamInfoRequest.DndTeamInfoRequestBuilder?>?): DndTeamInfoResponse?

    // ------------------------------
    // emoji
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun emojiList(req: EmojiListRequest?): EmojiListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun emojiList(req: RequestConfigurator<EmojiListRequest.EmojiListRequestBuilder?>?): EmojiListResponse?

    // ------------------------------
    // files
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesDelete(req: FilesDeleteRequest?): FilesDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesDelete(req: RequestConfigurator<FilesDeleteRequest.FilesDeleteRequestBuilder?>?): FilesDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesInfo(req: FilesInfoRequest?): FilesInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesInfo(req: RequestConfigurator<FilesInfoRequest.FilesInfoRequestBuilder?>?): FilesInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesList(req: FilesListRequest?): FilesListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesList(req: RequestConfigurator<FilesListRequest.FilesListRequestBuilder?>?): FilesListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRevokePublicURL(req: FilesRevokePublicURLRequest?): FilesRevokePublicURLResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRevokePublicURL(req: RequestConfigurator<FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder?>?): FilesRevokePublicURLResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesSharedPublicURL(req: FilesSharedPublicURLRequest?): FilesSharedPublicURLResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesSharedPublicURL(req: RequestConfigurator<FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder?>?): FilesSharedPublicURLResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesUpload(req: FilesUploadRequest?): FilesUploadResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesUpload(req: RequestConfigurator<FilesUploadRequest.FilesUploadRequestBuilder?>?): FilesUploadResponse?

    // ------------------------------
    // files.comments
    // ------------------------------
    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesCommentsAdd(req: FilesCommentsAddRequest?): FilesCommentsAddResponse?

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesCommentsDelete(req: FilesCommentsDeleteRequest?): FilesCommentsDeleteResponse?

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesCommentEdit(req: FilesCommentsEditRequest?): FilesCommentsEditResponse?

    // ------------------------------
    // files.remote
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteAdd(req: FilesRemoteAddRequest?): FilesRemoteAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteAdd(req: RequestConfigurator<FilesRemoteAddRequest.FilesRemoteAddRequestBuilder?>?): FilesRemoteAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteInfo(req: FilesRemoteInfoRequest?): FilesRemoteInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteInfo(req: RequestConfigurator<FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder?>?): FilesRemoteInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteList(req: FilesRemoteListRequest?): FilesRemoteListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteList(req: RequestConfigurator<FilesRemoteListRequest.FilesRemoteListRequestBuilder?>?): FilesRemoteListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteRemove(req: FilesRemoteRemoveRequest?): FilesRemoteRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteRemove(req: RequestConfigurator<FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder?>?): FilesRemoteRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteShare(req: FilesRemoteShareRequest?): FilesRemoteShareResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteShare(req: RequestConfigurator<FilesRemoteShareRequest.FilesRemoteShareRequestBuilder?>?): FilesRemoteShareResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteUpdate(req: FilesRemoteUpdateRequest?): FilesRemoteUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun filesRemoteUpdate(req: RequestConfigurator<FilesRemoteUpdateRequest.FilesRemoteUpdateRequestBuilder?>?): FilesRemoteUpdateResponse?

    // ------------------------------
    // groups
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsArchive(req: GroupsArchiveRequest?): GroupsArchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsArchive(req: RequestConfigurator<GroupsArchiveRequest.GroupsArchiveRequestBuilder?>?): GroupsArchiveResponse?

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated("")
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsClose(req: GroupsCloseRequest?): GroupsCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsCreateChild(req: GroupsCreateChildRequest?): GroupsCreateChildResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsCreateChild(req: RequestConfigurator<GroupsCreateChildRequest.GroupsCreateChildRequestBuilder?>?): GroupsCreateChildResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsCreate(req: GroupsCreateRequest?): GroupsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsCreate(req: RequestConfigurator<GroupsCreateRequest.GroupsCreateRequestBuilder?>?): GroupsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsHistory(req: GroupsHistoryRequest?): GroupsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsHistory(req: RequestConfigurator<GroupsHistoryRequest.GroupsHistoryRequestBuilder?>?): GroupsHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsInfo(req: GroupsInfoRequest?): GroupsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsInfo(req: RequestConfigurator<GroupsInfoRequest.GroupsInfoRequestBuilder?>?): GroupsInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsInvite(req: GroupsInviteRequest?): GroupsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsInvite(req: RequestConfigurator<GroupsInviteRequest.GroupsInviteRequestBuilder?>?): GroupsInviteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsKick(req: GroupsKickRequest?): GroupsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsKick(req: RequestConfigurator<GroupsKickRequest.GroupsKickRequestBuilder?>?): GroupsKickResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsLeave(req: GroupsLeaveRequest?): GroupsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsLeave(req: RequestConfigurator<GroupsLeaveRequest.GroupsLeaveRequestBuilder?>?): GroupsLeaveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsList(req: GroupsListRequest?): GroupsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsList(req: RequestConfigurator<GroupsListRequest.GroupsListRequestBuilder?>?): GroupsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsMark(req: GroupsMarkRequest?): GroupsMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsMark(req: RequestConfigurator<GroupsMarkRequest.GroupsMarkRequestBuilder?>?): GroupsMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsOpen(req: GroupsOpenRequest?): GroupsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsOpen(req: RequestConfigurator<GroupsOpenRequest.GroupsOpenRequestBuilder?>?): GroupsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsRename(req: GroupsRenameRequest?): GroupsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsRename(req: RequestConfigurator<GroupsRenameRequest.GroupsRenameRequestBuilder?>?): GroupsRenameResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsSetPurpose(req: GroupsSetPurposeRequest?): GroupsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsSetPurpose(req: RequestConfigurator<GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder?>?): GroupsSetPurposeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsSetTopic(req: GroupsSetTopicRequest?): GroupsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsSetTopic(req: RequestConfigurator<GroupsSetTopicRequest.GroupsSetTopicRequestBuilder?>?): GroupsSetTopicResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsUnarchive(req: GroupsUnarchiveRequest?): GroupsUnarchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsUnarchive(req: RequestConfigurator<GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder?>?): GroupsUnarchiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsReplies(req: GroupsRepliesRequest?): GroupsRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun groupsReplies(req: RequestConfigurator<GroupsRepliesRequest.GroupsRepliesRequestBuilder?>?): GroupsRepliesResponse?

    // ------------------------------
    // im
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imClose(req: ImCloseRequest?): ImCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imClose(req: RequestConfigurator<ImCloseRequest.ImCloseRequestBuilder?>?): ImCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imHistory(req: ImHistoryRequest?): ImHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imHistory(req: RequestConfigurator<ImHistoryRequest.ImHistoryRequestBuilder?>?): ImHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imList(req: ImListRequest?): ImListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imList(req: RequestConfigurator<ImListRequest.ImListRequestBuilder?>?): ImListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imMark(req: ImMarkRequest?): ImMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imMark(req: RequestConfigurator<ImMarkRequest.ImMarkRequestBuilder?>?): ImMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imOpen(req: ImOpenRequest?): ImOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imOpen(req: RequestConfigurator<ImOpenRequest.ImOpenRequestBuilder?>?): ImOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imReplies(req: ImRepliesRequest?): ImRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun imReplies(req: RequestConfigurator<ImRepliesRequest.ImRepliesRequestBuilder?>?): ImRepliesResponse?

    // ------------------------------
    // migration
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun migrationExchange(req: MigrationExchangeRequest?): MigrationExchangeResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun migrationExchange(req: RequestConfigurator<MigrationExchangeRequest.MigrationExchangeRequestBuilder?>?): MigrationExchangeResponse?

    // ------------------------------
    // mpim
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimClose(req: MpimCloseRequest?): MpimCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimClose(req: RequestConfigurator<MpimCloseRequest.MpimCloseRequestBuilder?>?): MpimCloseResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimHistory(req: MpimHistoryRequest?): MpimHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimHistory(req: RequestConfigurator<MpimHistoryRequest.MpimHistoryRequestBuilder?>?): MpimHistoryResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimList(req: MpimListRequest?): MpimListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimList(req: RequestConfigurator<MpimListRequest.MpimListRequestBuilder?>?): MpimListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimReplies(req: MpimRepliesRequest?): MpimRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimReplies(req: RequestConfigurator<MpimRepliesRequest.MpimRepliesRequestBuilder?>?): MpimRepliesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimMark(req: MpimMarkRequest?): MpimMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimMark(req: RequestConfigurator<MpimMarkRequest.MpimMarkRequestBuilder?>?): MpimMarkResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimOpen(req: MpimOpenRequest?): MpimOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun mpimOpen(req: RequestConfigurator<MpimOpenRequest.MpimOpenRequestBuilder?>?): MpimOpenResponse?

    // ------------------------------
    // oauth
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthAccess(req: OAuthAccessRequest?): OAuthAccessResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthAccess(req: RequestConfigurator<OAuthAccessRequest.OAuthAccessRequestBuilder?>?): OAuthAccessResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthV2Access(req: OAuthV2AccessRequest?): OAuthV2AccessResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthV2Access(req: RequestConfigurator<OAuthV2AccessRequest.OAuthV2AccessRequestBuilder?>?): OAuthV2AccessResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthToken(req: OAuthTokenRequest?): OAuthTokenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun oauthToken(req: RequestConfigurator<OAuthTokenRequest.OAuthTokenRequestBuilder?>?): OAuthTokenResponse?

    // ------------------------------
    // pins
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsAdd(req: PinsAddRequest?): PinsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsAdd(req: RequestConfigurator<PinsAddRequest.PinsAddRequestBuilder?>?): PinsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsList(req: PinsListRequest?): PinsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsList(req: RequestConfigurator<PinsListRequest.PinsListRequestBuilder?>?): PinsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsRemove(req: PinsRemoveRequest?): PinsRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun pinsRemove(req: RequestConfigurator<PinsRemoveRequest.PinsRemoveRequestBuilder?>?): PinsRemoveResponse?

    // ------------------------------
    // reactions
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsAdd(req: ReactionsAddRequest?): ReactionsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsAdd(req: RequestConfigurator<ReactionsAddRequest.ReactionsAddRequestBuilder?>?): ReactionsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsGet(req: ReactionsGetRequest?): ReactionsGetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsGet(req: RequestConfigurator<ReactionsGetRequest.ReactionsGetRequestBuilder?>?): ReactionsGetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsList(req: ReactionsListRequest?): ReactionsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsList(req: RequestConfigurator<ReactionsListRequest.ReactionsListRequestBuilder?>?): ReactionsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsRemove(req: ReactionsRemoveRequest?): ReactionsRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun reactionsRemove(req: RequestConfigurator<ReactionsRemoveRequest.ReactionsRemoveRequestBuilder?>?): ReactionsRemoveResponse?

    // ------------------------------
    // reminders
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersAdd(req: RemindersAddRequest?): RemindersAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersAdd(req: RequestConfigurator<RemindersAddRequest.RemindersAddRequestBuilder?>?): RemindersAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersComplete(req: RemindersCompleteRequest?): RemindersCompleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersComplete(req: RequestConfigurator<RemindersCompleteRequest.RemindersCompleteRequestBuilder?>?): RemindersCompleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersDelete(req: RemindersDeleteRequest?): RemindersDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersDelete(req: RequestConfigurator<RemindersDeleteRequest.RemindersDeleteRequestBuilder?>?): RemindersDeleteResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersInfo(req: RemindersInfoRequest?): RemindersInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersInfo(req: RequestConfigurator<RemindersInfoRequest.RemindersInfoRequestBuilder?>?): RemindersInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersList(req: RemindersListRequest?): RemindersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun remindersList(req: RequestConfigurator<RemindersListRequest.RemindersListRequestBuilder?>?): RemindersListResponse?

    // ------------------------------
    // rtm
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun rtmConnect(req: RTMConnectRequest?): RTMConnectResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun rtmConnect(req: RequestConfigurator<RTMConnectRequest.RTMConnectRequestBuilder?>?): RTMConnectResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun rtmStart(req: RTMStartRequest?): RTMStartResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun rtmStart(req: RequestConfigurator<RTMStartRequest.RTMStartRequestBuilder?>?): RTMStartResponse?

    // ------------------------------
    // search
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchAll(req: SearchAllRequest?): SearchAllResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchAll(req: RequestConfigurator<SearchAllRequest.SearchAllRequestBuilder?>?): SearchAllResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchMessages(req: SearchMessagesRequest?): SearchMessagesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchMessages(req: RequestConfigurator<SearchMessagesRequest.SearchMessagesRequestBuilder?>?): SearchMessagesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchFiles(req: SearchFilesRequest?): SearchFilesResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun searchFiles(req: RequestConfigurator<SearchFilesRequest.SearchFilesRequestBuilder?>?): SearchFilesResponse?

    // ------------------------------
    // stars
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsAdd(req: StarsAddRequest?): StarsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsAdd(req: RequestConfigurator<StarsAddRequest.StarsAddRequestBuilder?>?): StarsAddResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsList(req: StarsListRequest?): StarsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsList(req: RequestConfigurator<StarsListRequest.StarsListRequestBuilder?>?): StarsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsRemove(req: StarsRemoveRequest?): StarsRemoveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun starsRemove(req: RequestConfigurator<StarsRemoveRequest.StarsRemoveRequestBuilder?>?): StarsRemoveResponse?

    // ------------------------------
    // team
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamAccessLogs(req: TeamAccessLogsRequest?): TeamAccessLogsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamAccessLogs(req: RequestConfigurator<TeamAccessLogsRequest.TeamAccessLogsRequestBuilder?>?): TeamAccessLogsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamBillableInfo(req: TeamBillableInfoRequest?): TeamBillableInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamBillableInfo(req: RequestConfigurator<TeamBillableInfoRequest.TeamBillableInfoRequestBuilder?>?): TeamBillableInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamInfo(req: TeamInfoRequest?): TeamInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamInfo(req: RequestConfigurator<TeamInfoRequest.TeamInfoRequestBuilder?>?): TeamInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamIntegrationLogs(req: TeamIntegrationLogsRequest?): TeamIntegrationLogsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamIntegrationLogs(req: RequestConfigurator<TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder?>?): TeamIntegrationLogsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamProfileGet(req: TeamProfileGetRequest?): TeamProfileGetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun teamProfileGet(req: RequestConfigurator<TeamProfileGetRequest.TeamProfileGetRequestBuilder?>?): TeamProfileGetResponse?

    // ------------------------------
    // usergroups
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsCreate(req: UsergroupsCreateRequest?): UsergroupsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsCreate(req: RequestConfigurator<UsergroupsCreateRequest.UsergroupsCreateRequestBuilder?>?): UsergroupsCreateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsDisable(req: UsergroupsDisableRequest?): UsergroupsDisableResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsDisable(req: RequestConfigurator<UsergroupsDisableRequest.UsergroupsDisableRequestBuilder?>?): UsergroupsDisableResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsEnable(req: UsergroupsEnableRequest?): UsergroupsEnableResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsEnable(req: RequestConfigurator<UsergroupsEnableRequest.UsergroupsEnableRequestBuilder?>?): UsergroupsEnableResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsList(req: UsergroupsListRequest?): UsergroupsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsList(req: RequestConfigurator<UsergroupsListRequest.UsergroupsListRequestBuilder?>?): UsergroupsListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsUpdate(req: UsergroupsUpdateRequest?): UsergroupsUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupsUpdate(req: RequestConfigurator<UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder?>?): UsergroupsUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupUsersList(req: UsergroupUsersListRequest?): UsergroupUsersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupUsersList(req: RequestConfigurator<UsergroupUsersListRequest.UsergroupUsersListRequestBuilder?>?): UsergroupUsersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupUsersUpdate(req: UsergroupUsersUpdateRequest?): UsergroupUsersUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usergroupUsersUpdate(req: RequestConfigurator<UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder?>?): UsergroupUsersUpdateResponse?

    // ------------------------------
    // users
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersConversations(req: UsersConversationsRequest?): UsersConversationsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersConversations(req: RequestConfigurator<UsersConversationsRequest.UsersConversationsRequestBuilder?>?): UsersConversationsResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersDeletePhoto(req: UsersDeletePhotoRequest?): UsersDeletePhotoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersDeletePhoto(req: RequestConfigurator<UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder?>?): UsersDeletePhotoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersGetPresence(req: UsersGetPresenceRequest?): UsersGetPresenceResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersGetPresence(req: RequestConfigurator<UsersGetPresenceRequest.UsersGetPresenceRequestBuilder?>?): UsersGetPresenceResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersIdentity(req: UsersIdentityRequest?): UsersIdentityResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersIdentity(req: RequestConfigurator<UsersIdentityRequest.UsersIdentityRequestBuilder?>?): UsersIdentityResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersInfo(req: UsersInfoRequest?): UsersInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersInfo(req: RequestConfigurator<UsersInfoRequest.UsersInfoRequestBuilder?>?): UsersInfoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersList(req: UsersListRequest?): UsersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersList(req: RequestConfigurator<UsersListRequest.UsersListRequestBuilder?>?): UsersListResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersLookupByEmail(req: UsersLookupByEmailRequest?): UsersLookupByEmailResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersLookupByEmail(req: RequestConfigurator<UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder?>?): UsersLookupByEmailResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetActive(req: UsersSetActiveRequest?): UsersSetActiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetActive(req: RequestConfigurator<UsersSetActiveRequest.UsersSetActiveRequestBuilder?>?): UsersSetActiveResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetPhoto(req: UsersSetPhotoRequest?): UsersSetPhotoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetPhoto(req: RequestConfigurator<UsersSetPhotoRequest.UsersSetPhotoRequestBuilder?>?): UsersSetPhotoResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetPresence(req: UsersSetPresenceRequest?): UsersSetPresenceResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersSetPresence(req: RequestConfigurator<UsersSetPresenceRequest.UsersSetPresenceRequestBuilder?>?): UsersSetPresenceResponse?

    // ------------------------------
    // users.profile
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersProfileGet(req: UsersProfileGetRequest?): UsersProfileGetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersProfileGet(req: RequestConfigurator<UsersProfileGetRequest.UsersProfileGetRequestBuilder?>?): UsersProfileGetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersProfileSet(req: UsersProfileSetRequest?): UsersProfileSetResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun usersProfileSet(req: RequestConfigurator<UsersProfileSetRequest.UsersProfileSetRequestBuilder?>?): UsersProfileSetResponse?

    // ------------------------------
    // views
    // ------------------------------
    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsOpen(req: ViewsOpenRequest?): ViewsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsOpen(req: RequestConfigurator<ViewsOpenRequest.ViewsOpenRequestBuilder?>?): ViewsOpenResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsPush(req: ViewsPushRequest?): ViewsPushResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsPush(req: RequestConfigurator<ViewsPushRequest.ViewsPushRequestBuilder?>?): ViewsPushResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsUpdate(req: ViewsUpdateRequest?): ViewsUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsUpdate(req: RequestConfigurator<ViewsUpdateRequest.ViewsUpdateRequestBuilder?>?): ViewsUpdateResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsPublish(req: ViewsPublishRequest?): ViewsPublishResponse?

    @Throws(java.io.IOException::class, SlackApiException::class)
    fun viewsPublish(req: RequestConfigurator<ViewsPublishRequest.ViewsPublishRequestBuilder?>?): ViewsPublishResponse?

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://slack.com/api/"
    }
}
