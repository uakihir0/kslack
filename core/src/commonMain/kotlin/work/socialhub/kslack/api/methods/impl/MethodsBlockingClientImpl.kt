package work.socialhub.kslack.api.methods.impl

import work.socialhub.kmpcommon.runBlocking
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.methods.client.MethodsBlockingClient
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
import work.socialhub.kslack.api.methods.response.usergroups.users.UserGroupUsersUpdateResponse
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
class MethodsBlockingClientImpl(
    private val methodsAsyncClientImpl: MethodsAsyncClientImpl,
) : MethodsBlockingClient {

    override var endpointUrlPrefix = Slack.ENDPOINT_URL_PREFIX

    // ------------------------------
    // admin.apps
    // ------------------------------
    override fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse = runBlocking {
        methodsAsyncClientImpl.adminAppsApprove(req)
    }

    override fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse = runBlocking {
        methodsAsyncClientImpl.adminAppsRestrict(req)
    }

    // ------------------------------
    // admin.apps.requests
    // ------------------------------
    override fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse = runBlocking {
        methodsAsyncClientImpl.adminAppsRequestsList(req)
    }

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------
    override fun adminInviteRequestsApprove(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse = runBlocking {
        methodsAsyncClientImpl.adminInviteRequestsApprove(req)
    }

    override fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse = runBlocking {
        methodsAsyncClientImpl.adminInviteRequestsDeny(req)
    }

    override fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse = runBlocking {
        methodsAsyncClientImpl.adminInviteRequestsList(req)
    }

    override fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse = runBlocking {
        methodsAsyncClientImpl.adminInviteRequestsApprovedList(req)
    }

    override fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse = runBlocking {
        methodsAsyncClientImpl.adminInviteRequestsDeniedList(req)
    }

    // ------------------------------
    // admin.teams.admins
    // ------------------------------
    override fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse = runBlocking {
        methodsAsyncClientImpl.reactionsList(req)
    }

    // ------------------------------
    // admin.teams
    // ------------------------------
    override fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse = runBlocking {
        methodsAsyncClientImpl.adminTeamsCreate(req)
    }

    // ------------------------------
    // admin.teams.owners
    // ------------------------------
    override fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse = runBlocking {
        methodsAsyncClientImpl.adminTeamsOwnersList(req)
    }

    // ------------------------------
    // admin.teams.settings
    // ------------------------------
    override fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse = runBlocking {
        methodsAsyncClientImpl.adminTeamsSettingsSetDescription(req)
    }

    override fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse = runBlocking {
        methodsAsyncClientImpl.adminTeamsSettingsSetIcon(req)
    }

    override fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse = runBlocking {
        methodsAsyncClientImpl.adminTeamsSettingsSetName(req)
    }

    // ------------------------------
    // admin.users
    // ------------------------------
    override fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersAssign(req)
    }

    override fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersInvite(req)
    }

    override fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersRemove(req)
    }

    override fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersSetAdmin(req)
    }

    override fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersSetOwner(req)
    }

    override fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersSetRegular(req)
    }

    // ------------------------------
    // admin.users.session
    // ------------------------------
    override fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse = runBlocking {
        methodsAsyncClientImpl.adminUsersSessionReset(req)
    }

    // ------------------------------
    // api
    // ------------------------------
    override fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse = runBlocking {
        methodsAsyncClientImpl.apiTest(req)
    }

    // ------------------------------
    // apps
    // ------------------------------
    override fun appsUninstall(
        req: AppsUninstallRequest
    ): AppsUninstallResponse = runBlocking {
        methodsAsyncClientImpl.appsUninstall(req)
    }

    // ------------------------------
    // apps.permissions
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsInfo(
        req: AppsPermissionsInfoRequest
    ): AppsPermissionsInfoResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsInfo(req)
    }

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsRequest(
        req: AppsPermissionsRequestRequest
    ): AppsPermissionsRequestResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsRequest(req)
    }

    // ------------------------------
    // apps.permissions.resources
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsResourcesList(
        req: AppsPermissionsResourcesListRequest
    ): AppsPermissionsResourcesListResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsResourcesList(req)
    }

    // ------------------------------
    // apps.permissions.scopes
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsScopesList(
        req: AppsPermissionsScopesListRequest
    ): AppsPermissionsScopesListResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsScopesList(req)
    }

    // ------------------------------
    // apps.permissions.users
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsUsersList(
        req: AppsPermissionsUsersListRequest
    ): AppsPermissionsUsersListResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsUsersList(req)
    }

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    override fun appsPermissionsUsersRequest(
        req: AppsPermissionsUsersRequestRequest
    ): AppsPermissionsUsersRequestResponse = runBlocking {
        methodsAsyncClientImpl.appsPermissionsUsersRequest(req)
    }

    // ------------------------------
    // auth
    // ------------------------------
    override fun authRevoke(
        req: AuthRevokeRequest
    ): AuthRevokeResponse = runBlocking {
        methodsAsyncClientImpl.authRevoke(req)
    }

    override fun authTest(
        req: AuthTestRequest
    ): AuthTestResponse = runBlocking {
        methodsAsyncClientImpl.authTest(req)
    }

    // ------------------------------
    // bots
    // ------------------------------
    override fun botsInfo(
        req: BotsInfoRequest
    ): BotsInfoResponse = runBlocking {
        methodsAsyncClientImpl.botsInfo(req)
    }

    // ------------------------------
    // channels
    // ------------------------------
    override fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse = runBlocking {
        methodsAsyncClientImpl.channelsArchive(req)
    }

    override fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse = runBlocking {
        methodsAsyncClientImpl.channelsCreate(req)
    }

    override fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse = runBlocking {
        methodsAsyncClientImpl.channelsHistory(req)
    }

    override fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse = runBlocking {
        methodsAsyncClientImpl.channelsReplies(req)
    }

    override fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse = runBlocking {
        methodsAsyncClientImpl.channelsInfo(req)
    }

    override fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse = runBlocking {
        methodsAsyncClientImpl.channelsList(req)
    }

    override fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse = runBlocking {
        methodsAsyncClientImpl.channelsInvite(req)
    }

    override fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse = runBlocking {
        methodsAsyncClientImpl.channelsJoin(req)
    }

    override fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse = runBlocking {
        methodsAsyncClientImpl.channelsKick(req)
    }

    override fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse = runBlocking {
        methodsAsyncClientImpl.channelsLeave(req)
    }

    override fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse = runBlocking {
        methodsAsyncClientImpl.channelsMark(req)
    }

    override fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse = runBlocking {
        methodsAsyncClientImpl.channelsRename(req)
    }

    override fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse = runBlocking {
        methodsAsyncClientImpl.channelsSetPurpose(req)
    }

    override fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse = runBlocking {
        methodsAsyncClientImpl.channelsSetTopic(req)
    }

    override fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse = runBlocking {
        methodsAsyncClientImpl.channelsUnarchive(req)
    }

    // ------------------------------
    // chat
    // ------------------------------
    override fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse = runBlocking {
        methodsAsyncClientImpl.chatGetPermalink(req)
    }

    override fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse = runBlocking {
        methodsAsyncClientImpl.chatDelete(req)
    }

    override fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse = runBlocking {
        methodsAsyncClientImpl.chatDeleteScheduledMessage(req)
    }

    override fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse = runBlocking {
        methodsAsyncClientImpl.chatMeMessage(req)
    }

    override fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse = runBlocking {
        methodsAsyncClientImpl.chatPostEphemeral(req)
    }

    override fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse = runBlocking {
        methodsAsyncClientImpl.chatPostMessage(req)
    }

    override fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse = runBlocking {
        methodsAsyncClientImpl.chatScheduleMessage(req)
    }

    override fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse = runBlocking {
        methodsAsyncClientImpl.chatUpdate(req)
    }

    override fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse = runBlocking {
        methodsAsyncClientImpl.chatUnfurl(req)
    }

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------
    override fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse = runBlocking {
        methodsAsyncClientImpl.chatScheduleMessagesListMessage(req)
    }

    // ------------------------------
    // conversations
    // ------------------------------
    override fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse = runBlocking {
        methodsAsyncClientImpl.conversationsArchive(req)
    }

    override fun conversationsClose(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse = runBlocking {
        methodsAsyncClientImpl.conversationsClose(req)
    }

    override fun conversationsCreate(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse = runBlocking {
        methodsAsyncClientImpl.conversationsCreate(req)
    }

    override fun conversationsHistory(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse = runBlocking {
        methodsAsyncClientImpl.conversationsHistory(req)
    }

    override fun conversationsInfo(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse = runBlocking {
        methodsAsyncClientImpl.conversationsInfo(req)
    }

    override fun conversationsInvite(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse = runBlocking {
        methodsAsyncClientImpl.conversationsInvite(req)
    }

    override fun conversationsJoin(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse = runBlocking {
        methodsAsyncClientImpl.conversationsJoin(req)
    }

    override fun conversationsKick(
        req: ConversationsKickRequest
    ): ConversationsKickResponse = runBlocking {
        methodsAsyncClientImpl.conversationsKick(req)
    }

    override fun conversationsLeave(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse = runBlocking {
        methodsAsyncClientImpl.conversationsLeave(req)
    }

    override fun conversationsList(
        req: ConversationsListRequest
    ): ConversationsListResponse = runBlocking {
        methodsAsyncClientImpl.conversationsList(req)
    }

    override fun conversationsMembers(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse = runBlocking {
        methodsAsyncClientImpl.conversationsMembers(req)
    }

    override fun conversationsOpen(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse = runBlocking {
        methodsAsyncClientImpl.conversationsOpen(req)
    }

    override fun conversationsRename(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse = runBlocking {
        methodsAsyncClientImpl.conversationsRename(req)
    }

    override fun conversationsReplies(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse = runBlocking {
        methodsAsyncClientImpl.conversationsReplies(req)
    }

    override fun conversationsSetPurpose(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse = runBlocking {
        methodsAsyncClientImpl.conversationsSetPurpose(req)
    }

    override fun conversationsSetTopic(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse = runBlocking {
        methodsAsyncClientImpl.conversationsSetTopic(req)
    }

    override fun conversationsUnarchive(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse = runBlocking {
        methodsAsyncClientImpl.conversationsUnarchive(req)
    }

    // ------------------------------
    // dialog
    // ------------------------------
    override fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse = runBlocking {
        methodsAsyncClientImpl.dialogOpen(req)
    }

    // ------------------------------
    // dnd
    // ------------------------------
    override fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse = runBlocking {
        methodsAsyncClientImpl.dndEndDnd(req)
    }

    override fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse = runBlocking {
        methodsAsyncClientImpl.dndEndSnooze(req)
    }

    override fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse = runBlocking {
        methodsAsyncClientImpl.dndInfo(req)
    }

    override fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse = runBlocking {
        methodsAsyncClientImpl.dndSetSnooze(req)
    }

    override fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse = runBlocking {
        methodsAsyncClientImpl.dndTeamInfo(req)
    }

    // ------------------------------
    // emoji
    // ------------------------------
    override fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse = runBlocking {
        methodsAsyncClientImpl.emojiList(req)
    }

    // ------------------------------
    // files
    // ------------------------------
    override fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse = runBlocking {
        methodsAsyncClientImpl.filesDelete(req)
    }

    override fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse = runBlocking {
        methodsAsyncClientImpl.filesInfo(req)
    }

    override fun filesList(
        req: FilesListRequest
    ): FilesListResponse = runBlocking {
        methodsAsyncClientImpl.filesList(req)
    }

    override fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse = runBlocking {
        methodsAsyncClientImpl.filesRevokePublicURL(req)
    }

    override fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse = runBlocking {
        methodsAsyncClientImpl.filesSharedPublicURL(req)
    }

    override fun filesUpload(
        req: FilesUploadRequest
    ): FilesUploadResponse = runBlocking {
        methodsAsyncClientImpl.filesUpload(req)
    }

    // ------------------------------
    // files.comments
    // ------------------------------
    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    override fun filesCommentsAdd(
        req: FilesCommentsAddRequest
    ): FilesCommentsAddResponse = runBlocking {
        methodsAsyncClientImpl.filesCommentsAdd(req)
    }

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    override fun filesCommentsDelete(
        req: FilesCommentsDeleteRequest
    ): FilesCommentsDeleteResponse = runBlocking {
        methodsAsyncClientImpl.filesCommentsDelete(req)
    }

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    override fun filesCommentEdit(
        req: FilesCommentsEditRequest
    ): FilesCommentsEditResponse = runBlocking {
        methodsAsyncClientImpl.filesCommentEdit(req)
    }

    // ------------------------------
    // files.remote
    // ------------------------------
    override fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteAdd(req)
    }

    override fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteInfo(req)
    }

    override fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteList(req)
    }

    override fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteRemove(req)
    }

    override fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteShare(req)
    }

    override fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse = runBlocking {
        methodsAsyncClientImpl.filesRemoteUpdate(req)
    }

    // ------------------------------
    // groups
    // ------------------------------
    override fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse = runBlocking {
        methodsAsyncClientImpl.groupsArchive(req)
    }

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated("")
    override fun groupsClose(
        req: GroupsCloseRequest
    ): GroupsCloseResponse = runBlocking {
        methodsAsyncClientImpl.groupsClose(req)
    }

    override fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse = runBlocking {
        methodsAsyncClientImpl.groupsCreateChild(req)
    }

    override fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse = runBlocking {
        methodsAsyncClientImpl.groupsCreate(req)
    }

    override fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse = runBlocking {
        methodsAsyncClientImpl.groupsHistory(req)
    }

    override fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse = runBlocking {
        methodsAsyncClientImpl.groupsInfo(req)
    }

    override fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse = runBlocking {
        methodsAsyncClientImpl.groupsInvite(req)
    }

    override fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse = runBlocking {
        methodsAsyncClientImpl.groupsKick(req)
    }

    override fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse = runBlocking {
        methodsAsyncClientImpl.groupsLeave(req)
    }

    override fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse = runBlocking {
        methodsAsyncClientImpl.groupsList(req)
    }

    override fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse = runBlocking {
        methodsAsyncClientImpl.groupsMark(req)
    }

    override fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse = runBlocking {
        methodsAsyncClientImpl.groupsOpen(req)
    }

    override fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse = runBlocking {
        methodsAsyncClientImpl.groupsRename(req)
    }

    override fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse = runBlocking {
        methodsAsyncClientImpl.groupsSetPurpose(req)
    }

    override fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse = runBlocking {
        methodsAsyncClientImpl.groupsSetTopic(req)
    }

    override fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse = runBlocking {
        methodsAsyncClientImpl.groupsUnarchive(req)
    }

    override fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse = runBlocking {
        methodsAsyncClientImpl.groupsReplies(req)
    }

    // ------------------------------
    // im
    // ------------------------------
    override fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse = runBlocking {
        methodsAsyncClientImpl.imClose(req)
    }

    override fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse = runBlocking {
        methodsAsyncClientImpl.imHistory(req)
    }

    override fun imList(
        req: ImListRequest
    ): ImListResponse = runBlocking {
        methodsAsyncClientImpl.imList(req)
    }

    override fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse = runBlocking {
        methodsAsyncClientImpl.imMark(req)
    }

    override fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse = runBlocking {
        methodsAsyncClientImpl.imOpen(req)
    }

    override fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse = runBlocking {
        methodsAsyncClientImpl.imReplies(req)
    }

    // ------------------------------
    // migration
    // ------------------------------
    override fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse = runBlocking {
        methodsAsyncClientImpl.migrationExchange(req)
    }

    // ------------------------------
    // mpim
    // ------------------------------
    override fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse = runBlocking {
        methodsAsyncClientImpl.mpimClose(req)
    }

    override fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse = runBlocking {
        methodsAsyncClientImpl.mpimHistory(req)
    }

    override fun mpimList(
        req: MpimListRequest
    ): MpimListResponse = runBlocking {
        methodsAsyncClientImpl.mpimList(req)
    }

    override fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse = runBlocking {
        methodsAsyncClientImpl.mpimReplies(req)
    }

    override fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse = runBlocking {
        methodsAsyncClientImpl.mpimMark(req)
    }

    override fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse = runBlocking {
        methodsAsyncClientImpl.mpimOpen(req)
    }

    // ------------------------------
    // oauth
    // ------------------------------
    override fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse = runBlocking {
        methodsAsyncClientImpl.oauthAccess(req)
    }

    override fun oauthV2Access(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse = runBlocking {
        methodsAsyncClientImpl.oauthV2Access(req)
    }

    override fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse = runBlocking {
        methodsAsyncClientImpl.oauthToken(req)
    }

    // ------------------------------
    // pins
    // ------------------------------
    override fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse = runBlocking {
        methodsAsyncClientImpl.pinsAdd(req)
    }

    override fun pinsList(
        req: PinsListRequest
    ): PinsListResponse = runBlocking {
        methodsAsyncClientImpl.pinsList(req)
    }

    override fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse = runBlocking {
        methodsAsyncClientImpl.pinsRemove(req)
    }

    // ------------------------------
    // reactions
    // ------------------------------
    override fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse = runBlocking {
        methodsAsyncClientImpl.reactionsAdd(req)
    }

    override fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse = runBlocking {
        methodsAsyncClientImpl.reactionsGet(req)
    }

    override fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse = runBlocking {
        methodsAsyncClientImpl.reactionsList(req)
    }

    override fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse = runBlocking {
        methodsAsyncClientImpl.reactionsRemove(req)
    }

    // ------------------------------
    // reminders
    // ------------------------------
    override fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse = runBlocking {
        methodsAsyncClientImpl.remindersAdd(req)
    }

    override fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse = runBlocking {
        methodsAsyncClientImpl.remindersComplete(req)
    }

    override fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse = runBlocking {
        methodsAsyncClientImpl.remindersDelete(req)
    }

    override fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse = runBlocking {
        methodsAsyncClientImpl.remindersInfo(req)
    }

    override fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse = runBlocking {
        methodsAsyncClientImpl.remindersList(req)
    }

    // ------------------------------
    // search
    // ------------------------------
    override fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse = runBlocking {
        methodsAsyncClientImpl.searchAll(req)
    }

    override fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse = runBlocking {
        methodsAsyncClientImpl.searchMessages(req)
    }

    override fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse = runBlocking {
        methodsAsyncClientImpl.searchFiles(req)
    }

    // ------------------------------
    // stars
    // ------------------------------
    override fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse = runBlocking {
        methodsAsyncClientImpl.starsAdd(req)
    }

    override fun starsList(
        req: StarsListRequest
    ): StarsListResponse = runBlocking {
        methodsAsyncClientImpl.starsList(req)
    }

    override fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse = runBlocking {
        methodsAsyncClientImpl.starsRemove(req)
    }

    // ------------------------------
    // team
    // ------------------------------
    override fun teamAccessLogs(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse = runBlocking {
        methodsAsyncClientImpl.teamAccessLogs(req)
    }

    override fun teamBillableInfo(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse = runBlocking {
        methodsAsyncClientImpl.teamBillableInfo(req)
    }

    override fun teamInfo(
        req: TeamInfoRequest
    ): TeamInfoResponse = runBlocking {
        methodsAsyncClientImpl.teamInfo(req)
    }

    override fun teamIntegrationLogs(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse = runBlocking {
        methodsAsyncClientImpl.teamIntegrationLogs(req)
    }

    override fun teamProfileGet(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse = runBlocking {
        methodsAsyncClientImpl.teamProfileGet(req)
    }

    // ------------------------------
    // usergroups
    // ------------------------------
    override fun usergroupsCreate(
        req: UsergroupsCreateRequest
    ): UserGroupsCreateResponse = runBlocking {
        methodsAsyncClientImpl.usergroupsCreate(req)
    }

    override fun usergroupsDisable(
        req: UsergroupsDisableRequest
    ): UserGroupsDisableResponse = runBlocking {
        methodsAsyncClientImpl.usergroupsDisable(req)
    }

    override fun usergroupsEnable(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse = runBlocking {
        methodsAsyncClientImpl.usergroupsEnable(req)
    }

    override fun usergroupsList(
        req: UsergroupsListRequest
    ): UsergroupsListResponse = runBlocking {
        methodsAsyncClientImpl.usergroupsList(req)
    }

    override fun usergroupsUpdate(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse = runBlocking {
        methodsAsyncClientImpl.usergroupsUpdate(req)
    }

    override fun usergroupUsersList(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse = runBlocking {
        methodsAsyncClientImpl.usergroupUsersList(req)
    }

    override fun usergroupUsersUpdate(
        req: UsergroupUsersUpdateRequest
    ): UserGroupUsersUpdateResponse = runBlocking {
        methodsAsyncClientImpl.usergroupUsersUpdate(req)
    }

    // ------------------------------
    // users
    // ------------------------------
    override fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse = runBlocking {
        methodsAsyncClientImpl.usersConversations(req)
    }

    override fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse = runBlocking {
        methodsAsyncClientImpl.usersDeletePhoto(req)
    }

    override fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse = runBlocking {
        methodsAsyncClientImpl.usersGetPresence(req)
    }

    override fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse = runBlocking {
        methodsAsyncClientImpl.usersIdentity(req)
    }

    override fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse = runBlocking {
        methodsAsyncClientImpl.usersInfo(req)
    }

    override fun usersList(
        req: UsersListRequest
    ): UsersListResponse = runBlocking {
        methodsAsyncClientImpl.usersList(req)
    }

    override fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse = runBlocking {
        methodsAsyncClientImpl.usersLookupByEmail(req)
    }

    override fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse = runBlocking {
        methodsAsyncClientImpl.usersSetActive(req)
    }

    override fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse = runBlocking {
        methodsAsyncClientImpl.usersSetPhoto(req)
    }

    override fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse = runBlocking {
        methodsAsyncClientImpl.usersSetPresence(req)
    }

    // ------------------------------
    // users.profile
    // ------------------------------
    override fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse = runBlocking {
        methodsAsyncClientImpl.usersProfileGet(req)
    }

    override fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse = runBlocking {
        methodsAsyncClientImpl.usersProfileSet(req)
    }

    // ------------------------------
    // views
    // ------------------------------
    override fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse = runBlocking {
        methodsAsyncClientImpl.viewsOpen(req)
    }

    override fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse = runBlocking {
        methodsAsyncClientImpl.viewsPush(req)
    }

    override fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse = runBlocking {
        methodsAsyncClientImpl.viewsUpdate(req)
    }

    override fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse = runBlocking {
        methodsAsyncClientImpl.viewsPublish(req)
    }

}
