package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
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
    var endpointUrlPrefix: String

    // ----------------------------------------------
    //  OkHttp layer methods
    // ----------------------------------------------
    suspend fun runPostForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): HttpResponse

    suspend fun runPostFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse

    suspend fun runPostMultipart(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse

    // ------------------------------
    // admin.apps
    // ------------------------------
    suspend fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse

    suspend fun adminAppsRestrict(
        req: AdminAppsRestrictRequest
    ): AdminAppsRestrictResponse

    // ------------------------------
    // admin.apps.requests
    // ------------------------------
    suspend fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------
    suspend fun adminInviteRequestsApprove(
        req: AdminInviteRequestsApproveRequest
    ): AdminInviteRequestsApproveResponse

    fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse

    fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse

    fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse

    fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse

    // ------------------------------
    // admin.teams.admins
    // ------------------------------
    fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse

    // ------------------------------
    // admin.teams
    // ------------------------------
    fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse

    // ------------------------------
    // admin.teams.owners
    // ------------------------------
    fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse

    // ------------------------------
    // admin.teams.settings
    // ------------------------------
    fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse

    fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse

    fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse

    // ------------------------------
    // admin.users
    // ------------------------------
    fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse

    fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse

    fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse

    fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse

    fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse

    fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse

    // ------------------------------
    // admin.users.session
    // ------------------------------
    fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse

    // ------------------------------
    // api
    // ------------------------------
    fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse

    // ------------------------------
    // apps
    // ------------------------------
    fun appsUninstall(
        req: AppsUninstallRequest
    ): AppsUninstallResponse

    // ------------------------------
    // apps.permissions
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsInfo(
        req: AppsPermissionsInfoRequest
    ): AppsPermissionsInfoResponse

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsRequest(
        req: AppsPermissionsRequestRequest
    ): AppsPermissionsRequestResponse

    // ------------------------------
    // apps.permissions.resources
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsResourcesList(
        req: AppsPermissionsResourcesListRequest
    ): AppsPermissionsResourcesListResponse

    // ------------------------------
    // apps.permissions.scopes
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsScopesList(
        req: AppsPermissionsScopesListRequest
    ): AppsPermissionsScopesListResponse

    // ------------------------------
    // apps.permissions.users
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsUsersList(
        req: AppsPermissionsUsersListRequest
    ): AppsPermissionsUsersListResponse

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    fun appsPermissionsUsersRequest(
        req: AppsPermissionsUsersRequestRequest
    ): AppsPermissionsUsersRequestResponse

    // ------------------------------
    // auth
    // ------------------------------
    fun authRevoke(
        req: AuthRevokeRequest
    ): AuthRevokeResponse

    fun authTest(
        req: AuthTestRequest
    ): AuthTestResponse

    // ------------------------------
    // bots
    // ------------------------------
    fun botsInfo(
        req: BotsInfoRequest
    ): BotsInfoResponse

    // ------------------------------
    // channels
    // ------------------------------
    fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse

    fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse

    fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse

    fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse

    fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse

    fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse

    fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse

    fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse

    fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse

    fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse

    fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse

    fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse

    fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse

    fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse

    fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse

    // ------------------------------
    // chat
    // ------------------------------
    fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse

    fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse

    fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse

    fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse

    fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse

    fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse

    fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse

    fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse

    fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------
    fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse

    // ------------------------------
    // conversations
    // ------------------------------
    fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse

    fun conversationsClose(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse

    fun conversationsCreate(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse

    fun conversationsHistory(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse

    fun conversationsInfo(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse

    fun conversationsInvite(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse

    fun conversationsJoin(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse

    fun conversationsKick(
        req: ConversationsKickRequest
    ): ConversationsKickResponse

    fun conversationsLeave(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse

    fun conversationsList(
        req: ConversationsListRequest
    ): ConversationsListResponse

    fun conversationsMembers(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse

    fun conversationsOpen(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse

    fun conversationsRename(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse

    fun conversationsReplies(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse

    fun conversationsSetPurpose(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse

    fun conversationsSetTopic(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse

    fun conversationsUnarchive(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse

    // ------------------------------
    // dialog
    // ------------------------------
    fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse

    // ------------------------------
    // dnd
    // ------------------------------
    fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse

    fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse

    fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse

    // ------------------------------
    // emoji
    // ------------------------------
    fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse

    // ------------------------------
    // files
    // ------------------------------
    fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse

    fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse

    fun filesList(
        req: FilesListRequest
    ): FilesListResponse

    fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse

    fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse

    fun filesUpload(
        req: FilesUploadRequest
    ): FilesUploadResponse

    // ------------------------------
    // files.comments
    // ------------------------------
    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    fun filesCommentsAdd(
        req: FilesCommentsAddRequest
    ): FilesCommentsAddResponse

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    fun filesCommentsDelete(
        req: FilesCommentsDeleteRequest
    ): FilesCommentsDeleteResponse

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    fun filesCommentEdit(
        req: FilesCommentsEditRequest
    ): FilesCommentsEditResponse

    // ------------------------------
    // files.remote
    // ------------------------------
    fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse

    fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse

    fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse

    fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse

    fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse

    fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse

    // ------------------------------
    // groups
    // ------------------------------
    fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated("")
    fun groupsClose(
        req: GroupsCloseRequest
    ): GroupsCloseResponse

    fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse

    fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse

    fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse

    fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse

    fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse

    fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse

    fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse

    fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse

    fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse

    fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse

    fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse

    fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse

    fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse

    fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse

    fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse

    // ------------------------------
    // im
    // ------------------------------
    fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse

    fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse

    fun imList(
        req: ImListRequest
    ): ImListResponse

    fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse

    fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse

    fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse

    // ------------------------------
    // migration
    // ------------------------------
    fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse

    // ------------------------------
    // mpim
    // ------------------------------
    fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse

    fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse

    fun mpimList(
        req: MpimListRequest
    ): MpimListResponse

    fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse

    fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse

    fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse

    // ------------------------------
    // oauth
    // ------------------------------
    fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse

    fun oauthV2Access(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse

    fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse

    // ------------------------------
    // pins
    // ------------------------------
    fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse

    fun pinsList(
        req: PinsListRequest
    ): PinsListResponse

    fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse

    // ------------------------------
    // reactions
    // ------------------------------
    fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse

    fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse

    // ------------------------------
    // reminders
    // ------------------------------
    fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse

    fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse

    // ------------------------------
    // search
    // ------------------------------
    fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse

    fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse

    fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse

    // ------------------------------
    // stars
    // ------------------------------
    fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse

    fun starsList(
        req: StarsListRequest
    ): StarsListResponse

    fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse

    // ------------------------------
    // team
    // ------------------------------
    fun teamAccessLogs(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse

    fun teamBillableInfo(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse

    fun teamInfo(
        req: TeamInfoRequest
    ): TeamInfoResponse

    fun teamIntegrationLogs(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse

    fun teamProfileGet(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse

    // ------------------------------
    // usergroups
    // ------------------------------
    fun usergroupsCreate(
        req: UsergroupsCreateRequest
    ): UsergroupsCreateResponse

    fun usergroupsDisable(
        req: UsergroupsDisableRequest
    ): UsergroupsDisableResponse

    fun usergroupsEnable(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse

    fun usergroupsList(
        req: UsergroupsListRequest
    ): UsergroupsListResponse

    fun usergroupsUpdate(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse

    fun usergroupUsersList(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse

    fun usergroupUsersUpdate(
        req: UsergroupUsersUpdateRequest
    ): UsergroupUsersUpdateResponse

    // ------------------------------
    // users
    // ------------------------------
    fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse

    fun usersList(
        req: UsersListRequest
    ): UsersListResponse

    fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    // ------------------------------
    // users.profile
    // ------------------------------
    fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse

    // ------------------------------
    // views
    // ------------------------------
    fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse

    fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://slack.com/api/"
    }
}
