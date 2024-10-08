package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRequestsListRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.*
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*
import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.AppsPermissionsInfoRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.AppsPermissionsRequestRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.resources.AppsPermissionsResourcesListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.scopes.AppsPermissionsScopesListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersRequestRequest
import work.socialhub.kslack.api.methods.request.auth.AuthRevokeRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.bots.BotsInfoRequest
import work.socialhub.kslack.api.methods.request.channels.*
import work.socialhub.kslack.api.methods.request.chat.*
import work.socialhub.kslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import work.socialhub.kslack.api.methods.request.conversations.*
import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.request.dnd.*
import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.request.files.*
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsAddRequest
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsDeleteRequest
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsEditRequest
import work.socialhub.kslack.api.methods.request.files.remote.*
import work.socialhub.kslack.api.methods.request.groups.*
import work.socialhub.kslack.api.methods.request.im.*
import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.request.mpim.*
import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsAddRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsGetRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsRemoveRequest
import work.socialhub.kslack.api.methods.request.reminders.*
import work.socialhub.kslack.api.methods.request.rtm.RTMConnectRequest
import work.socialhub.kslack.api.methods.request.rtm.RTMStartRequest
import work.socialhub.kslack.api.methods.request.search.SearchAllRequest
import work.socialhub.kslack.api.methods.request.search.SearchFilesRequest
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.request.team.TeamAccessLogsRequest
import work.socialhub.kslack.api.methods.request.team.TeamBillableInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamIntegrationLogsRequest
import work.socialhub.kslack.api.methods.request.team.profile.TeamProfileGetRequest
import work.socialhub.kslack.api.methods.request.usergroups.*
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import work.socialhub.kslack.api.methods.request.users.*
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileSetRequest
import work.socialhub.kslack.api.methods.request.views.ViewsOpenRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPublishRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPushRequest
import work.socialhub.kslack.api.methods.request.views.ViewsUpdateRequest
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsApproveResponse
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsRequestsListResponse
import work.socialhub.kslack.api.methods.response.admin.apps.AdminAppsRestrictResponse
import work.socialhub.kslack.api.methods.response.admin.invite_requests.*
import work.socialhub.kslack.api.methods.response.admin.teams.*
import work.socialhub.kslack.api.methods.response.admin.users.*
import work.socialhub.kslack.api.methods.response.api.ApiTestResponse
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.AppsPermissionsInfoResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.AppsPermissionsRequestResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.resources.AppsPermissionsResourcesListResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.scopes.AppsPermissionsScopesListResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersListResponse
import work.socialhub.kslack.api.methods.response.apps.permissions.users.AppsPermissionsUsersRequestResponse
import work.socialhub.kslack.api.methods.response.auth.AuthRevokeResponse
import work.socialhub.kslack.api.methods.response.auth.AuthTestResponse
import work.socialhub.kslack.api.methods.response.bots.BotsInfoResponse
import work.socialhub.kslack.api.methods.response.channels.*
import work.socialhub.kslack.api.methods.response.chat.*
import work.socialhub.kslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse
import work.socialhub.kslack.api.methods.response.conversations.*
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import work.socialhub.kslack.api.methods.response.dnd.*
import work.socialhub.kslack.api.methods.response.emoji.EmojiListResponse
import work.socialhub.kslack.api.methods.response.files.*
import work.socialhub.kslack.api.methods.response.files.comments.FilesCommentsAddResponse
import work.socialhub.kslack.api.methods.response.files.comments.FilesCommentsDeleteResponse
import work.socialhub.kslack.api.methods.response.files.comments.FilesCommentsEditResponse
import work.socialhub.kslack.api.methods.response.files.remote.*
import work.socialhub.kslack.api.methods.response.groups.*
import work.socialhub.kslack.api.methods.response.im.*
import work.socialhub.kslack.api.methods.response.migration.MigrationExchangeResponse
import work.socialhub.kslack.api.methods.response.mpim.*
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import work.socialhub.kslack.api.methods.response.pins.PinsAddResponse
import work.socialhub.kslack.api.methods.response.pins.PinsListResponse
import work.socialhub.kslack.api.methods.response.pins.PinsRemoveResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsAddResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsGetResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsListResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsRemoveResponse
import work.socialhub.kslack.api.methods.response.reminders.*
import work.socialhub.kslack.api.methods.response.rtm.RTMConnectResponse
import work.socialhub.kslack.api.methods.response.rtm.RTMStartResponse
import work.socialhub.kslack.api.methods.response.search.SearchAllResponse
import work.socialhub.kslack.api.methods.response.search.SearchFilesResponse
import work.socialhub.kslack.api.methods.response.search.SearchMessagesResponse
import work.socialhub.kslack.api.methods.response.stars.StarsAddResponse
import work.socialhub.kslack.api.methods.response.stars.StarsListResponse
import work.socialhub.kslack.api.methods.response.stars.StarsRemoveResponse
import work.socialhub.kslack.api.methods.response.team.TeamAccessLogsResponse
import work.socialhub.kslack.api.methods.response.team.TeamBillableInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamIntegrationLogsResponse
import work.socialhub.kslack.api.methods.response.team.profile.TeamProfileGetResponse
import work.socialhub.kslack.api.methods.response.usergroups.*
import work.socialhub.kslack.api.methods.response.usergroups.users.UsergroupUsersListResponse
import work.socialhub.kslack.api.methods.response.usergroups.users.UsergroupUsersUpdateResponse
import work.socialhub.kslack.api.methods.response.users.*
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileGetResponse
import work.socialhub.kslack.api.methods.response.users.profile.UsersProfileSetResponse
import work.socialhub.kslack.api.methods.response.views.ViewsOpenResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPublishResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPushResponse
import work.socialhub.kslack.api.methods.response.views.ViewsUpdateResponse

/**
 * API Methods.
 * https://api.slack.com/methods
 */
interface MethodsClient {
    var endpointUrlPrefix: String?

    // ----------------------------------------------
    //  OkHttp layer methods
    // ----------------------------------------------
    fun runPostForm(
        form: FormBody.Builder?,
        endpoint: String?
    ): HttpResponse?

    fun runPostFormWithToken(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?
    ): HttpResponse?

    fun runPostMultipart(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?
    ): HttpResponse?

    // ----------------------------------------------
    //  Methods to send requests and parse responses
    // ----------------------------------------------
    fun <T> postFormAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        clazz: java.lang.Class<T>?
    ): T

    fun <T> postFormWithAuthorizationHeaderAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        authorizationHeader: String?,
        clazz: java.lang.Class<T>?
    ): T

    fun <T> postFormWithTokenAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T

    fun <T> postMultipartAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T

    // ------------------------------
    // admin.apps
    // ------------------------------
    fun adminAppsApprove(
        req: AdminAppsApproveRequest?
    ): AdminAppsApproveResponse?

    fun adminAppsApprove(
        req: RequestConfigurator<AdminAppsApproveRequest.AdminAppsApproveRequestBuilder?>?
    ): AdminAppsApproveResponse?

    fun adminAppsRestrict(
        req: AdminAppsRestrictRequest?
    ): AdminAppsRestrictResponse?

    fun adminAppsRestrict(
        req: RequestConfigurator<AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder?>?
    ): AdminAppsRestrictResponse?

    // ------------------------------
    // admin.apps.requests
    // ------------------------------
    fun adminAppsRequestsList(req: AdminAppsRequestsListRequest?): AdminAppsRequestsListResponse?

    fun adminAppsRequestsList(req: RequestConfigurator<AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder?>?): AdminAppsRequestsListResponse?

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------
    fun adminInviteRequestsApprove(req: AdminInviteRequestsApproveRequest?): AdminInviteRequestsApproveResponse?

    fun adminInviteRequestsApprove(req: RequestConfigurator<AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder?>?): AdminInviteRequestsApproveResponse?

    fun adminInviteRequestsDeny(req: AdminInviteRequestsDenyRequest?): AdminInviteRequestsDenyResponse?

    fun adminInviteRequestsDeny(req: RequestConfigurator<AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder?>?): AdminInviteRequestsDenyResponse?

    fun adminInviteRequestsList(req: AdminInviteRequestsListRequest?): AdminInviteRequestsListResponse?

    fun adminInviteRequestsList(req: RequestConfigurator<AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder?>?): AdminInviteRequestsListResponse?


    fun adminInviteRequestsApprovedList(req: AdminInviteRequestsApprovedListRequest?): AdminInviteRequestsApprovedListResponse?


    fun adminInviteRequestsApprovedList(req: RequestConfigurator<AdminInviteRequestsApprovedListRequest.AdminInviteRequestsApprovedListRequestBuilder?>?): AdminInviteRequestsApprovedListResponse?


    fun adminInviteRequestsDeniedList(req: AdminInviteRequestsDeniedListRequest?): AdminInviteRequestsDeniedListResponse?


    fun adminInviteRequestsDeniedList(req: RequestConfigurator<AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder?>?): AdminInviteRequestsDeniedListResponse?

    // ------------------------------
    // admin.teams.admins
    // ------------------------------

    fun adminTeamsAdminsList(req: AdminTeamsAdminsListRequest?): AdminTeamsAdminsListResponse?


    fun adminTeamsAdminsList(req: RequestConfigurator<AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder?>?): AdminTeamsAdminsListResponse?

    // ------------------------------
    // admin.teams
    // ------------------------------

    fun adminTeamsCreate(req: AdminTeamsCreateRequest?): AdminTeamsCreateResponse?


    fun adminTeamsCreate(req: RequestConfigurator<AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder?>?): AdminTeamsCreateResponse?

    // ------------------------------
    // admin.teams.owners
    // ------------------------------

    fun adminTeamsOwnersList(req: AdminTeamsOwnersListRequest?): AdminTeamsOwnersListResponse?


    fun adminTeamsOwnersList(req: RequestConfigurator<AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder?>?): AdminTeamsOwnersListResponse?

    // ------------------------------
    // admin.teams.settings
    // ------------------------------

    fun adminTeamsSettingsSetDescription(req: AdminTeamsSettingsSetDescriptionRequest?): AdminTeamsSettingsSetDescriptionResponse?


    fun adminTeamsSettingsSetDescription(req: RequestConfigurator<AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder?>?): AdminTeamsSettingsSetDescriptionResponse?


    fun adminTeamsSettingsSetIcon(req: AdminTeamsSettingsSetIconRequest?): AdminTeamsSettingsSetIconResponse?


    fun adminTeamsSettingsSetIcon(req: RequestConfigurator<AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder?>?): AdminTeamsSettingsSetIconResponse?


    fun adminTeamsSettingsSetName(req: AdminTeamsSettingsSetNameRequest?): AdminTeamsSettingsSetNameResponse?


    fun adminTeamsSettingsSetName(req: RequestConfigurator<AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder?>?): AdminTeamsSettingsSetNameResponse?

    // ------------------------------
    // admin.users
    // ------------------------------

    fun adminUsersAssign(req: AdminUsersAssignRequest?): AdminUsersAssignResponse?


    fun adminUsersAssign(req: RequestConfigurator<AdminUsersAssignRequest.AdminUsersAssignRequestBuilder?>?): AdminUsersAssignResponse?


    fun adminUsersInvite(req: AdminUsersInviteRequest?): AdminUsersInviteResponse?


    fun adminUsersInvite(req: RequestConfigurator<AdminUsersInviteRequest.AdminUsersInviteRequestBuilder?>?): AdminUsersInviteResponse?


    fun adminUsersRemove(req: AdminUsersRemoveRequest?): AdminUsersRemoveResponse?


    fun adminUsersRemove(req: RequestConfigurator<AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder?>?): AdminUsersRemoveResponse?


    fun adminUsersSetAdmin(req: AdminUsersSetAdminRequest?): AdminUsersSetAdminResponse?


    fun adminUsersSetAdmin(req: RequestConfigurator<AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder?>?): AdminUsersSetAdminResponse?


    fun adminUsersSetOwner(req: AdminUsersSetOwnerRequest?): AdminUsersSetOwnerResponse?


    fun adminUsersSetOwner(req: RequestConfigurator<AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder?>?): AdminUsersSetOwnerResponse?


    fun adminUsersSetRegular(req: AdminUsersSetRegularRequest?): AdminUsersSetRegularResponse?


    fun adminUsersSetRegular(req: RequestConfigurator<AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder?>?): AdminUsersSetRegularResponse?

    // ------------------------------
    // admin.users.session
    // ------------------------------

    fun adminUsersSessionReset(req: AdminUsersSessionResetRequest?): AdminUsersSessionResetResponse?


    fun adminUsersSessionReset(req: RequestConfigurator<AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder?>?): AdminUsersSessionResetResponse?

    // ------------------------------
    // api
    // ------------------------------

    fun apiTest(req: ApiTestRequest?): ApiTestResponse?


    fun apiTest(req: RequestConfigurator<ApiTestRequest.ApiTestRequestBuilder?>?): ApiTestResponse?

    // ------------------------------
    // apps
    // ------------------------------

    fun appsUninstall(req: AppsUninstallRequest?): AppsUninstallResponse?


    fun appsUninstall(req: RequestConfigurator<AppsUninstallRequest.AppsUninstallRequestBuilder?>?): AppsUninstallResponse?

    // ------------------------------
    // apps.permissions
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsInfo(req: AppsPermissionsInfoRequest?): AppsPermissionsInfoResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsInfo(req: RequestConfigurator<AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder?>?): AppsPermissionsInfoResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsRequest(req: AppsPermissionsRequestRequest?): AppsPermissionsRequestResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsRequest(req: RequestConfigurator<AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder?>?): AppsPermissionsRequestResponse?

    // ------------------------------
    // apps.permissions.resources
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsResourcesList(req: AppsPermissionsResourcesListRequest?): AppsPermissionsResourcesListResponse?

    // ------------------------------
    // apps.permissions.scopes
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsScopesList(req: AppsPermissionsScopesListRequest?): AppsPermissionsScopesListResponse?

    // ------------------------------
    // apps.permissions.users
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsUsersList(req: AppsPermissionsUsersListRequest?): AppsPermissionsUsersListResponse?

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")

    fun appsPermissionsUsersRequest(req: AppsPermissionsUsersRequestRequest?): AppsPermissionsUsersRequestResponse?

    // ------------------------------
    // auth
    // ------------------------------

    fun authRevoke(req: AuthRevokeRequest?): AuthRevokeResponse?


    fun authRevoke(req: RequestConfigurator<AuthRevokeRequest.AuthRevokeRequestBuilder?>?): AuthRevokeResponse?


    fun authTest(req: AuthTestRequest?): AuthTestResponse?


    fun authTest(req: RequestConfigurator<AuthTestRequest.AuthTestRequestBuilder?>?): AuthTestResponse?

    // ------------------------------
    // bots
    // ------------------------------

    fun botsInfo(req: BotsInfoRequest?): BotsInfoResponse?


    fun botsInfo(req: RequestConfigurator<BotsInfoRequest.BotsInfoRequestBuilder?>?): BotsInfoResponse?

    // ------------------------------
    // channels
    // ------------------------------

    fun channelsArchive(req: ChannelsArchiveRequest?): ChannelsArchiveResponse?


    fun channelsArchive(req: RequestConfigurator<ChannelsArchiveRequest.ChannelsArchiveRequestBuilder?>?): ChannelsArchiveResponse?


    fun channelsCreate(req: ChannelsCreateRequest?): ChannelsCreateResponse?


    fun channelsCreate(req: RequestConfigurator<ChannelsCreateRequest.ChannelsCreateRequestBuilder?>?): ChannelsCreateResponse?


    fun channelsHistory(req: ChannelsHistoryRequest?): ChannelsHistoryResponse?


    fun channelsHistory(req: RequestConfigurator<ChannelsHistoryRequest.ChannelsHistoryRequestBuilder?>?): ChannelsHistoryResponse?


    fun channelsReplies(req: ChannelsRepliesRequest?): ChannelsRepliesResponse?


    fun channelsReplies(req: RequestConfigurator<ChannelsRepliesRequest.ChannelsRepliesRequestBuilder?>?): ChannelsRepliesResponse?


    fun channelsInfo(req: ChannelsInfoRequest?): ChannelsInfoResponse?


    fun channelsInfo(req: RequestConfigurator<ChannelsInfoRequest.ChannelsInfoRequestBuilder?>?): ChannelsInfoResponse?


    fun channelsList(req: ChannelsListRequest?): ChannelsListResponse?


    fun channelsList(req: RequestConfigurator<ChannelsListRequest.ChannelsListRequestBuilder?>?): ChannelsListResponse?


    fun channelsInvite(req: ChannelsInviteRequest?): ChannelsInviteResponse?


    fun channelsInvite(req: RequestConfigurator<ChannelsInviteRequest.ChannelsInviteRequestBuilder?>?): ChannelsInviteResponse?


    fun channelsJoin(req: ChannelsJoinRequest?): ChannelsJoinResponse?


    fun channelsJoin(req: RequestConfigurator<ChannelsJoinRequest.ChannelsJoinRequestBuilder?>?): ChannelsJoinResponse?


    fun channelsKick(req: ChannelsKickRequest?): ChannelsKickResponse?


    fun channelsKick(req: RequestConfigurator<ChannelsKickRequest.ChannelsKickRequestBuilder?>?): ChannelsKickResponse?


    fun channelsLeave(req: ChannelsLeaveRequest?): ChannelsLeaveResponse?


    fun channelsLeave(req: RequestConfigurator<ChannelsLeaveRequest.ChannelsLeaveRequestBuilder?>?): ChannelsLeaveResponse?


    fun channelsMark(req: ChannelsMarkRequest?): ChannelsMarkResponse?


    fun channelsMark(req: RequestConfigurator<ChannelsMarkRequest.ChannelsMarkRequestBuilder?>?): ChannelsMarkResponse?


    fun channelsRename(req: ChannelsRenameRequest?): ChannelsRenameResponse?


    fun channelsRename(req: RequestConfigurator<ChannelsRenameRequest.ChannelsRenameRequestBuilder?>?): ChannelsRenameResponse?


    fun channelsSetPurpose(req: ChannelsSetPurposeRequest?): ChannelsSetPurposeResponse?


    fun channelsSetPurpose(req: RequestConfigurator<ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder?>?): ChannelsSetPurposeResponse?


    fun channelsSetTopic(req: ChannelsSetTopicRequest?): ChannelsSetTopicResponse?


    fun channelsSetTopic(req: RequestConfigurator<ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder?>?): ChannelsSetTopicResponse?


    fun channelsUnarchive(req: ChannelsUnarchiveRequest?): ChannelsUnarchiveResponse?


    fun channelsUnarchive(req: RequestConfigurator<ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder?>?): ChannelsUnarchiveResponse?

    // ------------------------------
    // chat
    // ------------------------------

    fun chatGetPermalink(req: ChatGetPermalinkRequest?): ChatGetPermalinkResponse?


    fun chatGetPermalink(req: RequestConfigurator<ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder?>?): ChatGetPermalinkResponse?


    fun chatDelete(req: ChatDeleteRequest?): ChatDeleteResponse?


    fun chatDelete(req: RequestConfigurator<ChatDeleteRequest.ChatDeleteRequestBuilder?>?): ChatDeleteResponse?


    fun chatDeleteScheduledMessage(req: ChatDeleteScheduledMessageRequest?): ChatDeleteScheduledMessageResponse?


    fun chatDeleteScheduledMessage(req: RequestConfigurator<ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder?>?): ChatDeleteScheduledMessageResponse?


    fun chatMeMessage(req: ChatMeMessageRequest?): ChatMeMessageResponse?


    fun chatMeMessage(req: RequestConfigurator<ChatMeMessageRequest.ChatMeMessageRequestBuilder?>?): ChatMeMessageResponse?


    fun chatPostEphemeral(req: ChatPostEphemeralRequest?): ChatPostEphemeralResponse?


    fun chatPostEphemeral(req: RequestConfigurator<ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder?>?): ChatPostEphemeralResponse?


    fun chatPostMessage(req: ChatPostMessageRequest?): ChatPostMessageResponse?


    fun chatPostMessage(req: RequestConfigurator<ChatPostMessageRequest.ChatPostMessageRequestBuilder?>?): ChatPostMessageResponse?


    fun chatScheduleMessage(req: ChatScheduleMessageRequest?): ChatScheduleMessageResponse?


    fun chatScheduleMessage(req: RequestConfigurator<ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder?>?): ChatScheduleMessageResponse?


    fun chatUpdate(req: ChatUpdateRequest?): ChatUpdateResponse?


    fun chatUpdate(req: RequestConfigurator<ChatUpdateRequest.ChatUpdateRequestBuilder?>?): ChatUpdateResponse?


    fun chatUnfurl(req: ChatUnfurlRequest?): ChatUnfurlResponse?


    fun chatUnfurl(req: RequestConfigurator<ChatUnfurlRequest.ChatUnfurlRequestBuilder?>?): ChatUnfurlResponse?

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------

    fun chatScheduleMessagesListMessage(req: ChatScheduleMessagesListRequest?): ChatScheduleMessagesListResponse?


    fun chatScheduleMessagesListMessage(req: RequestConfigurator<ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder?>?): ChatScheduleMessagesListResponse?

    // ------------------------------
    // conversations
    // ------------------------------

    fun conversationsArchive(req: ConversationsArchiveRequest?): ConversationsArchiveResponse?


    fun conversationsArchive(req: RequestConfigurator<ConversationsArchiveRequest.ConversationsArchiveRequestBuilder?>?): ConversationsArchiveResponse?


    fun conversationsClose(req: ConversationsCloseRequest?): ConversationsCloseResponse?


    fun conversationsClose(req: RequestConfigurator<ConversationsCloseRequest.ConversationsCloseRequestBuilder?>?): ConversationsCloseResponse?


    fun conversationsCreate(req: ConversationsCreateRequest?): ConversationsCreateResponse?


    fun conversationsCreate(req: RequestConfigurator<ConversationsCreateRequest.ConversationsCreateRequestBuilder?>?): ConversationsCreateResponse?


    fun conversationsHistory(req: ConversationsHistoryRequest?): ConversationsHistoryResponse?


    fun conversationsHistory(req: RequestConfigurator<ConversationsHistoryRequest.ConversationsHistoryRequestBuilder?>?): ConversationsHistoryResponse?


    fun conversationsInfo(req: ConversationsInfoRequest?): ConversationsInfoResponse?


    fun conversationsInfo(req: RequestConfigurator<ConversationsInfoRequest.ConversationsInfoRequestBuilder?>?): ConversationsInfoResponse?


    fun conversationsInvite(req: ConversationsInviteRequest?): ConversationsInviteResponse?


    fun conversationsInvite(req: RequestConfigurator<ConversationsInviteRequest.ConversationsInviteRequestBuilder?>?): ConversationsInviteResponse?


    fun conversationsJoin(req: ConversationsJoinRequest?): ConversationsJoinResponse?


    fun conversationsJoin(req: RequestConfigurator<ConversationsJoinRequest.ConversationsJoinRequestBuilder?>?): ConversationsJoinResponse?


    fun conversationsKick(req: ConversationsKickRequest?): ConversationsKickResponse?


    fun conversationsKick(req: RequestConfigurator<ConversationsKickRequest.ConversationsKickRequestBuilder?>?): ConversationsKickResponse?


    fun conversationsLeave(req: ConversationsLeaveRequest?): ConversationsLeaveResponse?


    fun conversationsLeave(req: RequestConfigurator<ConversationsLeaveRequest.ConversationsLeaveRequestBuilder?>?): ConversationsLeaveResponse?


    fun conversationsList(req: ConversationsListRequest?): ConversationsListResponse?


    fun conversationsList(req: RequestConfigurator<ConversationsListRequest.ConversationsListRequestBuilder?>?): ConversationsListResponse?


    fun conversationsMembers(req: ConversationsMembersRequest?): ConversationsMembersResponse?


    fun conversationsMembers(req: RequestConfigurator<ConversationsMembersRequest.ConversationsMembersRequestBuilder?>?): ConversationsMembersResponse?


    fun conversationsOpen(req: ConversationsOpenRequest?): ConversationsOpenResponse?


    fun conversationsOpen(req: RequestConfigurator<ConversationsOpenRequest.ConversationsOpenRequestBuilder?>?): ConversationsOpenResponse?


    fun conversationsRename(req: ConversationsRenameRequest?): ConversationsRenameResponse?


    fun conversationsRename(req: RequestConfigurator<ConversationsRenameRequest.ConversationsRenameRequestBuilder?>?): ConversationsRenameResponse?


    fun conversationsReplies(req: ConversationsRepliesRequest?): ConversationsRepliesResponse?


    fun conversationsReplies(req: RequestConfigurator<ConversationsRepliesRequest.ConversationsRepliesRequestBuilder?>?): ConversationsRepliesResponse?


    fun conversationsSetPurpose(req: ConversationsSetPurposeRequest?): ConversationsSetPurposeResponse?


    fun conversationsSetPurpose(req: RequestConfigurator<ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder?>?): ConversationsSetPurposeResponse?


    fun conversationsSetTopic(req: ConversationsSetTopicRequest?): ConversationsSetTopicResponse?


    fun conversationsSetTopic(req: RequestConfigurator<ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder?>?): ConversationsSetTopicResponse?


    fun conversationsUnarchive(req: ConversationsUnarchiveRequest?): ConversationsUnarchiveResponse?


    fun conversationsUnarchive(req: RequestConfigurator<ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder?>?): ConversationsUnarchiveResponse?

    // ------------------------------
    // dialog
    // ------------------------------

    fun dialogOpen(req: DialogOpenRequest?): DialogOpenResponse?


    fun dialogOpen(req: RequestConfigurator<DialogOpenRequest.DialogOpenRequestBuilder?>?): DialogOpenResponse?

    // ------------------------------
    // dnd
    // ------------------------------

    fun dndEndDnd(req: DndEndDndRequest?): DndEndDndResponse?


    fun dndEndDnd(req: RequestConfigurator<DndEndDndRequest.DndEndDndRequestBuilder?>?): DndEndDndResponse?


    fun dndEndSnooze(req: DndEndSnoozeRequest?): DndEndSnoozeResponse?


    fun dndEndSnooze(req: RequestConfigurator<DndEndSnoozeRequest.DndEndSnoozeRequestBuilder?>?): DndEndSnoozeResponse?


    fun dndInfo(req: DndInfoRequest?): DndInfoResponse?


    fun dndInfo(req: RequestConfigurator<DndInfoRequest.DndInfoRequestBuilder?>?): DndInfoResponse?


    fun dndSetSnooze(req: DndSetSnoozeRequest?): DndSetSnoozeResponse?


    fun dndSetSnooze(req: RequestConfigurator<DndSetSnoozeRequest.DndSetSnoozeRequestBuilder?>?): DndSetSnoozeResponse?


    fun dndTeamInfo(req: DndTeamInfoRequest?): DndTeamInfoResponse?


    fun dndTeamInfo(req: RequestConfigurator<DndTeamInfoRequest.DndTeamInfoRequestBuilder?>?): DndTeamInfoResponse?

    // ------------------------------
    // emoji
    // ------------------------------

    fun emojiList(req: EmojiListRequest?): EmojiListResponse?


    fun emojiList(req: RequestConfigurator<EmojiListRequest.EmojiListRequestBuilder?>?): EmojiListResponse?

    // ------------------------------
    // files
    // ------------------------------

    fun filesDelete(req: FilesDeleteRequest?): FilesDeleteResponse?


    fun filesDelete(req: RequestConfigurator<FilesDeleteRequest.FilesDeleteRequestBuilder?>?): FilesDeleteResponse?


    fun filesInfo(req: FilesInfoRequest?): FilesInfoResponse?


    fun filesInfo(req: RequestConfigurator<FilesInfoRequest.FilesInfoRequestBuilder?>?): FilesInfoResponse?


    fun filesList(req: FilesListRequest?): FilesListResponse?


    fun filesList(req: RequestConfigurator<FilesListRequest.FilesListRequestBuilder?>?): FilesListResponse?


    fun filesRevokePublicURL(req: FilesRevokePublicURLRequest?): FilesRevokePublicURLResponse?


    fun filesRevokePublicURL(req: RequestConfigurator<FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder?>?): FilesRevokePublicURLResponse?


    fun filesSharedPublicURL(req: FilesSharedPublicURLRequest?): FilesSharedPublicURLResponse?


    fun filesSharedPublicURL(req: RequestConfigurator<FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder?>?): FilesSharedPublicURLResponse?


    fun filesUpload(req: FilesUploadRequest?): FilesUploadResponse?


    fun filesUpload(req: RequestConfigurator<FilesUploadRequest.FilesUploadRequestBuilder?>?): FilesUploadResponse?

    // ------------------------------
    // files.comments
    // ------------------------------
    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")

    fun filesCommentsAdd(req: FilesCommentsAddRequest?): FilesCommentsAddResponse?

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")

    fun filesCommentsDelete(req: FilesCommentsDeleteRequest?): FilesCommentsDeleteResponse?

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")

    fun filesCommentEdit(req: FilesCommentsEditRequest?): FilesCommentsEditResponse?

    // ------------------------------
    // files.remote
    // ------------------------------

    fun filesRemoteAdd(req: FilesRemoteAddRequest?): FilesRemoteAddResponse?


    fun filesRemoteAdd(req: RequestConfigurator<FilesRemoteAddRequest.FilesRemoteAddRequestBuilder?>?): FilesRemoteAddResponse?


    fun filesRemoteInfo(req: FilesRemoteInfoRequest?): FilesRemoteInfoResponse?


    fun filesRemoteInfo(req: RequestConfigurator<FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder?>?): FilesRemoteInfoResponse?


    fun filesRemoteList(req: FilesRemoteListRequest?): FilesRemoteListResponse?


    fun filesRemoteList(req: RequestConfigurator<FilesRemoteListRequest.FilesRemoteListRequestBuilder?>?): FilesRemoteListResponse?


    fun filesRemoteRemove(req: FilesRemoteRemoveRequest?): FilesRemoteRemoveResponse?


    fun filesRemoteRemove(req: RequestConfigurator<FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder?>?): FilesRemoteRemoveResponse?


    fun filesRemoteShare(req: FilesRemoteShareRequest?): FilesRemoteShareResponse?


    fun filesRemoteShare(req: RequestConfigurator<FilesRemoteShareRequest.FilesRemoteShareRequestBuilder?>?): FilesRemoteShareResponse?


    fun filesRemoteUpdate(req: FilesRemoteUpdateRequest?): FilesRemoteUpdateResponse?


    fun filesRemoteUpdate(req: RequestConfigurator<FilesRemoteUpdateRequest.FilesRemoteUpdateRequestBuilder?>?): FilesRemoteUpdateResponse?

    // ------------------------------
    // groups
    // ------------------------------

    fun groupsArchive(req: GroupsArchiveRequest?): GroupsArchiveResponse?


    fun groupsArchive(req: RequestConfigurator<GroupsArchiveRequest.GroupsArchiveRequestBuilder?>?): GroupsArchiveResponse?

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated("")

    fun groupsClose(req: GroupsCloseRequest?): GroupsCloseResponse?


    fun groupsCreateChild(req: GroupsCreateChildRequest?): GroupsCreateChildResponse?


    fun groupsCreateChild(req: RequestConfigurator<GroupsCreateChildRequest.GroupsCreateChildRequestBuilder?>?): GroupsCreateChildResponse?


    fun groupsCreate(req: GroupsCreateRequest?): GroupsCreateResponse?


    fun groupsCreate(req: RequestConfigurator<GroupsCreateRequest.GroupsCreateRequestBuilder?>?): GroupsCreateResponse?


    fun groupsHistory(req: GroupsHistoryRequest?): GroupsHistoryResponse?


    fun groupsHistory(req: RequestConfigurator<GroupsHistoryRequest.GroupsHistoryRequestBuilder?>?): GroupsHistoryResponse?


    fun groupsInfo(req: GroupsInfoRequest?): GroupsInfoResponse?


    fun groupsInfo(req: RequestConfigurator<GroupsInfoRequest.GroupsInfoRequestBuilder?>?): GroupsInfoResponse?


    fun groupsInvite(req: GroupsInviteRequest?): GroupsInviteResponse?


    fun groupsInvite(req: RequestConfigurator<GroupsInviteRequest.GroupsInviteRequestBuilder?>?): GroupsInviteResponse?


    fun groupsKick(req: GroupsKickRequest?): GroupsKickResponse?


    fun groupsKick(req: RequestConfigurator<GroupsKickRequest.GroupsKickRequestBuilder?>?): GroupsKickResponse?


    fun groupsLeave(req: GroupsLeaveRequest?): GroupsLeaveResponse?


    fun groupsLeave(req: RequestConfigurator<GroupsLeaveRequest.GroupsLeaveRequestBuilder?>?): GroupsLeaveResponse?


    fun groupsList(req: GroupsListRequest?): GroupsListResponse?


    fun groupsList(req: RequestConfigurator<GroupsListRequest.GroupsListRequestBuilder?>?): GroupsListResponse?


    fun groupsMark(req: GroupsMarkRequest?): GroupsMarkResponse?


    fun groupsMark(req: RequestConfigurator<GroupsMarkRequest.GroupsMarkRequestBuilder?>?): GroupsMarkResponse?


    fun groupsOpen(req: GroupsOpenRequest?): GroupsOpenResponse?


    fun groupsOpen(req: RequestConfigurator<GroupsOpenRequest.GroupsOpenRequestBuilder?>?): GroupsOpenResponse?


    fun groupsRename(req: GroupsRenameRequest?): GroupsRenameResponse?


    fun groupsRename(req: RequestConfigurator<GroupsRenameRequest.GroupsRenameRequestBuilder?>?): GroupsRenameResponse?


    fun groupsSetPurpose(req: GroupsSetPurposeRequest?): GroupsSetPurposeResponse?


    fun groupsSetPurpose(req: RequestConfigurator<GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder?>?): GroupsSetPurposeResponse?


    fun groupsSetTopic(req: GroupsSetTopicRequest?): GroupsSetTopicResponse?


    fun groupsSetTopic(req: RequestConfigurator<GroupsSetTopicRequest.GroupsSetTopicRequestBuilder?>?): GroupsSetTopicResponse?


    fun groupsUnarchive(req: GroupsUnarchiveRequest?): GroupsUnarchiveResponse?


    fun groupsUnarchive(req: RequestConfigurator<GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder?>?): GroupsUnarchiveResponse?


    fun groupsReplies(req: GroupsRepliesRequest?): GroupsRepliesResponse?


    fun groupsReplies(req: RequestConfigurator<GroupsRepliesRequest.GroupsRepliesRequestBuilder?>?): GroupsRepliesResponse?

    // ------------------------------
    // im
    // ------------------------------

    fun imClose(req: ImCloseRequest?): ImCloseResponse?


    fun imClose(req: RequestConfigurator<ImCloseRequest.ImCloseRequestBuilder?>?): ImCloseResponse?


    fun imHistory(req: ImHistoryRequest?): ImHistoryResponse?


    fun imHistory(req: RequestConfigurator<ImHistoryRequest.ImHistoryRequestBuilder?>?): ImHistoryResponse?


    fun imList(req: ImListRequest?): ImListResponse?


    fun imList(req: RequestConfigurator<ImListRequest.ImListRequestBuilder?>?): ImListResponse?


    fun imMark(req: ImMarkRequest?): ImMarkResponse?


    fun imMark(req: RequestConfigurator<ImMarkRequest.ImMarkRequestBuilder?>?): ImMarkResponse?


    fun imOpen(req: ImOpenRequest?): ImOpenResponse?


    fun imOpen(req: RequestConfigurator<ImOpenRequest.ImOpenRequestBuilder?>?): ImOpenResponse?


    fun imReplies(req: ImRepliesRequest?): ImRepliesResponse?


    fun imReplies(req: RequestConfigurator<ImRepliesRequest.ImRepliesRequestBuilder?>?): ImRepliesResponse?

    // ------------------------------
    // migration
    // ------------------------------

    fun migrationExchange(req: MigrationExchangeRequest?): MigrationExchangeResponse?


    fun migrationExchange(req: RequestConfigurator<MigrationExchangeRequest.MigrationExchangeRequestBuilder?>?): MigrationExchangeResponse?

    // ------------------------------
    // mpim
    // ------------------------------

    fun mpimClose(req: MpimCloseRequest?): MpimCloseResponse?


    fun mpimClose(req: RequestConfigurator<MpimCloseRequest.MpimCloseRequestBuilder?>?): MpimCloseResponse?


    fun mpimHistory(req: MpimHistoryRequest?): MpimHistoryResponse?


    fun mpimHistory(req: RequestConfigurator<MpimHistoryRequest.MpimHistoryRequestBuilder?>?): MpimHistoryResponse?


    fun mpimList(req: MpimListRequest?): MpimListResponse?


    fun mpimList(req: RequestConfigurator<MpimListRequest.MpimListRequestBuilder?>?): MpimListResponse?


    fun mpimReplies(req: MpimRepliesRequest?): MpimRepliesResponse?


    fun mpimReplies(req: RequestConfigurator<MpimRepliesRequest.MpimRepliesRequestBuilder?>?): MpimRepliesResponse?


    fun mpimMark(req: MpimMarkRequest?): MpimMarkResponse?


    fun mpimMark(req: RequestConfigurator<MpimMarkRequest.MpimMarkRequestBuilder?>?): MpimMarkResponse?


    fun mpimOpen(req: MpimOpenRequest?): MpimOpenResponse?


    fun mpimOpen(req: RequestConfigurator<MpimOpenRequest.MpimOpenRequestBuilder?>?): MpimOpenResponse?

    // ------------------------------
    // oauth
    // ------------------------------

    fun oauthAccess(req: OAuthAccessRequest?): OAuthAccessResponse?


    fun oauthAccess(req: RequestConfigurator<OAuthAccessRequest.OAuthAccessRequestBuilder?>?): OAuthAccessResponse?


    fun oauthV2Access(req: OAuthV2AccessRequest?): OAuthV2AccessResponse?


    fun oauthV2Access(req: RequestConfigurator<OAuthV2AccessRequest.OAuthV2AccessRequestBuilder?>?): OAuthV2AccessResponse?


    fun oauthToken(req: OAuthTokenRequest?): OAuthTokenResponse?


    fun oauthToken(req: RequestConfigurator<OAuthTokenRequest.OAuthTokenRequestBuilder?>?): OAuthTokenResponse?

    // ------------------------------
    // pins
    // ------------------------------

    fun pinsAdd(req: PinsAddRequest?): PinsAddResponse?


    fun pinsAdd(req: RequestConfigurator<PinsAddRequest.PinsAddRequestBuilder?>?): PinsAddResponse?


    fun pinsList(req: PinsListRequest?): PinsListResponse?


    fun pinsList(req: RequestConfigurator<PinsListRequest.PinsListRequestBuilder?>?): PinsListResponse?


    fun pinsRemove(req: PinsRemoveRequest?): PinsRemoveResponse?


    fun pinsRemove(req: RequestConfigurator<PinsRemoveRequest.PinsRemoveRequestBuilder?>?): PinsRemoveResponse?

    // ------------------------------
    // reactions
    // ------------------------------

    fun reactionsAdd(req: ReactionsAddRequest?): ReactionsAddResponse?


    fun reactionsAdd(req: RequestConfigurator<ReactionsAddRequest.ReactionsAddRequestBuilder?>?): ReactionsAddResponse?


    fun reactionsGet(req: ReactionsGetRequest?): ReactionsGetResponse?


    fun reactionsGet(req: RequestConfigurator<ReactionsGetRequest.ReactionsGetRequestBuilder?>?): ReactionsGetResponse?


    fun reactionsList(req: ReactionsListRequest?): ReactionsListResponse?


    fun reactionsList(req: RequestConfigurator<ReactionsListRequest.ReactionsListRequestBuilder?>?): ReactionsListResponse?


    fun reactionsRemove(req: ReactionsRemoveRequest?): ReactionsRemoveResponse?


    fun reactionsRemove(req: RequestConfigurator<ReactionsRemoveRequest.ReactionsRemoveRequestBuilder?>?): ReactionsRemoveResponse?

    // ------------------------------
    // reminders
    // ------------------------------

    fun remindersAdd(req: RemindersAddRequest?): RemindersAddResponse?


    fun remindersAdd(req: RequestConfigurator<RemindersAddRequest.RemindersAddRequestBuilder?>?): RemindersAddResponse?


    fun remindersComplete(req: RemindersCompleteRequest?): RemindersCompleteResponse?


    fun remindersComplete(req: RequestConfigurator<RemindersCompleteRequest.RemindersCompleteRequestBuilder?>?): RemindersCompleteResponse?


    fun remindersDelete(req: RemindersDeleteRequest?): RemindersDeleteResponse?


    fun remindersDelete(req: RequestConfigurator<RemindersDeleteRequest.RemindersDeleteRequestBuilder?>?): RemindersDeleteResponse?


    fun remindersInfo(req: RemindersInfoRequest?): RemindersInfoResponse?


    fun remindersInfo(req: RequestConfigurator<RemindersInfoRequest.RemindersInfoRequestBuilder?>?): RemindersInfoResponse?


    fun remindersList(req: RemindersListRequest?): RemindersListResponse?


    fun remindersList(req: RequestConfigurator<RemindersListRequest.RemindersListRequestBuilder?>?): RemindersListResponse?

    // ------------------------------
    // rtm
    // ------------------------------

    fun rtmConnect(req: RTMConnectRequest?): RTMConnectResponse?


    fun rtmConnect(req: RequestConfigurator<RTMConnectRequest.RTMConnectRequestBuilder?>?): RTMConnectResponse?


    fun rtmStart(req: RTMStartRequest?): RTMStartResponse?


    fun rtmStart(req: RequestConfigurator<RTMStartRequest.RTMStartRequestBuilder?>?): RTMStartResponse?

    // ------------------------------
    // search
    // ------------------------------

    fun searchAll(req: SearchAllRequest?): SearchAllResponse?


    fun searchAll(req: RequestConfigurator<SearchAllRequest.SearchAllRequestBuilder?>?): SearchAllResponse?


    fun searchMessages(req: SearchMessagesRequest?): SearchMessagesResponse?


    fun searchMessages(req: RequestConfigurator<SearchMessagesRequest.SearchMessagesRequestBuilder?>?): SearchMessagesResponse?


    fun searchFiles(req: SearchFilesRequest?): SearchFilesResponse?


    fun searchFiles(req: RequestConfigurator<SearchFilesRequest.SearchFilesRequestBuilder?>?): SearchFilesResponse?

    // ------------------------------
    // stars
    // ------------------------------

    fun starsAdd(req: StarsAddRequest?): StarsAddResponse?


    fun starsAdd(req: RequestConfigurator<StarsAddRequest.StarsAddRequestBuilder?>?): StarsAddResponse?


    fun starsList(req: StarsListRequest?): StarsListResponse?


    fun starsList(req: RequestConfigurator<StarsListRequest.StarsListRequestBuilder?>?): StarsListResponse?


    fun starsRemove(req: StarsRemoveRequest?): StarsRemoveResponse?


    fun starsRemove(req: RequestConfigurator<StarsRemoveRequest.StarsRemoveRequestBuilder?>?): StarsRemoveResponse?

    // ------------------------------
    // team
    // ------------------------------

    fun teamAccessLogs(req: TeamAccessLogsRequest?): TeamAccessLogsResponse?


    fun teamAccessLogs(req: RequestConfigurator<TeamAccessLogsRequest.TeamAccessLogsRequestBuilder?>?): TeamAccessLogsResponse?


    fun teamBillableInfo(req: TeamBillableInfoRequest?): TeamBillableInfoResponse?


    fun teamBillableInfo(req: RequestConfigurator<TeamBillableInfoRequest.TeamBillableInfoRequestBuilder?>?): TeamBillableInfoResponse?


    fun teamInfo(req: TeamInfoRequest?): TeamInfoResponse?


    fun teamInfo(req: RequestConfigurator<TeamInfoRequest.TeamInfoRequestBuilder?>?): TeamInfoResponse?


    fun teamIntegrationLogs(req: TeamIntegrationLogsRequest?): TeamIntegrationLogsResponse?


    fun teamIntegrationLogs(req: RequestConfigurator<TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder?>?): TeamIntegrationLogsResponse?


    fun teamProfileGet(req: TeamProfileGetRequest?): TeamProfileGetResponse?


    fun teamProfileGet(req: RequestConfigurator<TeamProfileGetRequest.TeamProfileGetRequestBuilder?>?): TeamProfileGetResponse?

    // ------------------------------
    // usergroups
    // ------------------------------

    fun usergroupsCreate(req: UsergroupsCreateRequest?): UsergroupsCreateResponse?


    fun usergroupsCreate(req: RequestConfigurator<UsergroupsCreateRequest.UsergroupsCreateRequestBuilder?>?): UsergroupsCreateResponse?


    fun usergroupsDisable(req: UsergroupsDisableRequest?): UsergroupsDisableResponse?


    fun usergroupsDisable(req: RequestConfigurator<UsergroupsDisableRequest.UsergroupsDisableRequestBuilder?>?): UsergroupsDisableResponse?


    fun usergroupsEnable(req: UsergroupsEnableRequest?): UsergroupsEnableResponse?


    fun usergroupsEnable(req: RequestConfigurator<UsergroupsEnableRequest.UsergroupsEnableRequestBuilder?>?): UsergroupsEnableResponse?


    fun usergroupsList(req: UsergroupsListRequest?): UsergroupsListResponse?


    fun usergroupsList(req: RequestConfigurator<UsergroupsListRequest.UsergroupsListRequestBuilder?>?): UsergroupsListResponse?


    fun usergroupsUpdate(req: UsergroupsUpdateRequest?): UsergroupsUpdateResponse?


    fun usergroupsUpdate(req: RequestConfigurator<UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder?>?): UsergroupsUpdateResponse?


    fun usergroupUsersList(req: UsergroupUsersListRequest?): UsergroupUsersListResponse?


    fun usergroupUsersList(req: RequestConfigurator<UsergroupUsersListRequest.UsergroupUsersListRequestBuilder?>?): UsergroupUsersListResponse?


    fun usergroupUsersUpdate(req: UsergroupUsersUpdateRequest?): UsergroupUsersUpdateResponse?


    fun usergroupUsersUpdate(req: RequestConfigurator<UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder?>?): UsergroupUsersUpdateResponse?

    // ------------------------------
    // users
    // ------------------------------

    fun usersConversations(req: UsersConversationsRequest?): UsersConversationsResponse?


    fun usersConversations(req: RequestConfigurator<UsersConversationsRequest.UsersConversationsRequestBuilder?>?): UsersConversationsResponse?


    fun usersDeletePhoto(req: UsersDeletePhotoRequest?): UsersDeletePhotoResponse?


    fun usersDeletePhoto(req: RequestConfigurator<UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder?>?): UsersDeletePhotoResponse?


    fun usersGetPresence(req: UsersGetPresenceRequest?): UsersGetPresenceResponse?


    fun usersGetPresence(req: RequestConfigurator<UsersGetPresenceRequest.UsersGetPresenceRequestBuilder?>?): UsersGetPresenceResponse?


    fun usersIdentity(req: UsersIdentityRequest?): UsersIdentityResponse?


    fun usersIdentity(req: RequestConfigurator<UsersIdentityRequest.UsersIdentityRequestBuilder?>?): UsersIdentityResponse?


    fun usersInfo(req: UsersInfoRequest?): UsersInfoResponse?


    fun usersInfo(req: RequestConfigurator<UsersInfoRequest.UsersInfoRequestBuilder?>?): UsersInfoResponse?


    fun usersList(req: UsersListRequest?): UsersListResponse?


    fun usersList(req: RequestConfigurator<UsersListRequest.UsersListRequestBuilder?>?): UsersListResponse?


    fun usersLookupByEmail(req: UsersLookupByEmailRequest?): UsersLookupByEmailResponse?


    fun usersLookupByEmail(req: RequestConfigurator<UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder?>?): UsersLookupByEmailResponse?


    fun usersSetActive(req: UsersSetActiveRequest?): UsersSetActiveResponse?


    fun usersSetActive(req: RequestConfigurator<UsersSetActiveRequest.UsersSetActiveRequestBuilder?>?): UsersSetActiveResponse?


    fun usersSetPhoto(req: UsersSetPhotoRequest?): UsersSetPhotoResponse?


    fun usersSetPhoto(req: RequestConfigurator<UsersSetPhotoRequest.UsersSetPhotoRequestBuilder?>?): UsersSetPhotoResponse?


    fun usersSetPresence(req: UsersSetPresenceRequest?): UsersSetPresenceResponse?


    fun usersSetPresence(req: RequestConfigurator<UsersSetPresenceRequest.UsersSetPresenceRequestBuilder?>?): UsersSetPresenceResponse?

    // ------------------------------
    // users.profile
    // ------------------------------

    fun usersProfileGet(req: UsersProfileGetRequest?): UsersProfileGetResponse?


    fun usersProfileGet(req: RequestConfigurator<UsersProfileGetRequest.UsersProfileGetRequestBuilder?>?): UsersProfileGetResponse?


    fun usersProfileSet(req: UsersProfileSetRequest?): UsersProfileSetResponse?


    fun usersProfileSet(req: RequestConfigurator<UsersProfileSetRequest.UsersProfileSetRequestBuilder?>?): UsersProfileSetResponse?

    // ------------------------------
    // views
    // ------------------------------

    fun viewsOpen(req: ViewsOpenRequest?): ViewsOpenResponse?


    fun viewsOpen(req: RequestConfigurator<ViewsOpenRequest.ViewsOpenRequestBuilder?>?): ViewsOpenResponse?


    fun viewsPush(req: ViewsPushRequest?): ViewsPushResponse?


    fun viewsPush(req: RequestConfigurator<ViewsPushRequest.ViewsPushRequestBuilder?>?): ViewsPushResponse?


    fun viewsUpdate(req: ViewsUpdateRequest?): ViewsUpdateResponse?


    fun viewsUpdate(req: RequestConfigurator<ViewsUpdateRequest.ViewsUpdateRequestBuilder?>?): ViewsUpdateResponse?


    fun viewsPublish(req: ViewsPublishRequest?): ViewsPublishResponse?


    fun viewsPublish(req: RequestConfigurator<ViewsPublishRequest.ViewsPublishRequestBuilder?>?): ViewsPublishResponse?

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://slack.com/api/"
    }
}
