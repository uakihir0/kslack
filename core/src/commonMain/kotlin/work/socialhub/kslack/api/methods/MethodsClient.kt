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

    suspend fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse

    suspend fun adminInviteRequestsList(
        req: AdminInviteRequestsListRequest
    ): AdminInviteRequestsListResponse

    suspend fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse

    suspend fun adminInviteRequestsDeniedList(
        req: AdminInviteRequestsDeniedListRequest
    ): AdminInviteRequestsDeniedListResponse

    // ------------------------------
    // admin.teams.admins
    // ------------------------------
    suspend fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse

    // ------------------------------
    // admin.teams
    // ------------------------------
    suspend fun adminTeamsCreate(
        req: AdminTeamsCreateRequest
    ): AdminTeamsCreateResponse

    // ------------------------------
    // admin.teams.owners
    // ------------------------------
    suspend fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse

    // ------------------------------
    // admin.teams.settings
    // ------------------------------
    suspend fun adminTeamsSettingsSetDescription(
        req: AdminTeamsSettingsSetDescriptionRequest
    ): AdminTeamsSettingsSetDescriptionResponse

    suspend fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse

    suspend fun adminTeamsSettingsSetName(
        req: AdminTeamsSettingsSetNameRequest
    ): AdminTeamsSettingsSetNameResponse

    // ------------------------------
    // admin.users
    // ------------------------------
    suspend fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse

    suspend fun adminUsersInvite(
        req: AdminUsersInviteRequest
    ): AdminUsersInviteResponse

    suspend fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse

    suspend fun adminUsersSetAdmin(
        req: AdminUsersSetAdminRequest
    ): AdminUsersSetAdminResponse

    suspend fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse

    suspend fun adminUsersSetRegular(
        req: AdminUsersSetRegularRequest
    ): AdminUsersSetRegularResponse

    // ------------------------------
    // admin.users.session
    // ------------------------------
    suspend fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse

    // ------------------------------
    // api
    // ------------------------------
    suspend fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse

    // ------------------------------
    // apps
    // ------------------------------
    suspend fun appsUninstall(
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
    suspend fun appsPermissionsInfo(
        req: AppsPermissionsInfoRequest
    ): AppsPermissionsInfoResponse

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    suspend fun appsPermissionsRequest(
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
    suspend fun appsPermissionsResourcesList(
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
    suspend fun appsPermissionsScopesList(
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
    suspend fun appsPermissionsUsersList(
        req: AppsPermissionsUsersListRequest
    ): AppsPermissionsUsersListResponse

    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    suspend fun appsPermissionsUsersRequest(
        req: AppsPermissionsUsersRequestRequest
    ): AppsPermissionsUsersRequestResponse

    // ------------------------------
    // auth
    // ------------------------------
    suspend fun authRevoke(
        req: AuthRevokeRequest
    ): AuthRevokeResponse

    suspend fun authTest(
        req: AuthTestRequest
    ): AuthTestResponse

    // ------------------------------
    // bots
    // ------------------------------
    suspend fun botsInfo(
        req: BotsInfoRequest
    ): BotsInfoResponse

    // ------------------------------
    // channels
    // ------------------------------
    suspend fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse

    suspend fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse

    suspend fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse

    suspend fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse

    suspend fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse

    suspend fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse

    suspend fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse

    suspend fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse

    suspend fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse

    suspend fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse

    suspend fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse

    suspend fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse

    suspend fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse

    suspend fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse

    suspend fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse

    // ------------------------------
    // chat
    // ------------------------------
    suspend fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse

    suspend fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse

    suspend fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse

    suspend fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse

    suspend fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse

    suspend fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse

    suspend fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse

    suspend fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse

    suspend fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------
    suspend fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse

    // ------------------------------
    // conversations
    // ------------------------------
    suspend fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse

    suspend fun conversationsClose(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse

    suspend fun conversationsCreate(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse

    suspend fun conversationsHistory(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse

    suspend fun conversationsInfo(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse

    suspend fun conversationsInvite(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse

    suspend fun conversationsJoin(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse

    suspend fun conversationsKick(
        req: ConversationsKickRequest
    ): ConversationsKickResponse

    suspend fun conversationsLeave(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse

    suspend fun conversationsList(
        req: ConversationsListRequest
    ): ConversationsListResponse

    suspend fun conversationsMembers(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse

    suspend fun conversationsOpen(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse

    suspend fun conversationsRename(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse

    suspend fun conversationsReplies(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse

    suspend fun conversationsSetPurpose(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse

    suspend fun conversationsSetTopic(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse

    suspend fun conversationsUnarchive(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse

    // ------------------------------
    // dialog
    // ------------------------------
    suspend fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse

    // ------------------------------
    // dnd
    // ------------------------------
    suspend fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse

    suspend fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    suspend fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse

    suspend fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    suspend fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse

    // ------------------------------
    // emoji
    // ------------------------------
    suspend fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse

    // ------------------------------
    // files
    // ------------------------------
    suspend fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse

    suspend fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse

    suspend fun filesList(
        req: FilesListRequest
    ): FilesListResponse

    suspend fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse

    suspend fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse

    suspend fun filesUpload(
        req: FilesUploadRequest
    ): FilesUploadResponse

    // ------------------------------
    // files.comments
    // ------------------------------
    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    suspend fun filesCommentsAdd(
        req: FilesCommentsAddRequest
    ): FilesCommentsAddResponse

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    suspend fun filesCommentsDelete(
        req: FilesCommentsDeleteRequest
    ): FilesCommentsDeleteResponse

    // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    @Deprecated("")
    suspend fun filesCommentEdit(
        req: FilesCommentsEditRequest
    ): FilesCommentsEditResponse

    // ------------------------------
    // files.remote
    // ------------------------------
    suspend fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse

    suspend fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse

    suspend fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse

    suspend fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse

    suspend fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse

    suspend fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse

    // ------------------------------
    // groups
    // ------------------------------
    suspend fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse

    // https://github.com/slackapi/slack-api-specs/issues/12
    @Deprecated("")
    suspend fun groupsClose(
        req: GroupsCloseRequest
    ): GroupsCloseResponse

    suspend fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse

    suspend fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse

    suspend fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse

    suspend fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse

    suspend fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse

    suspend fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse

    suspend fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse

    suspend fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse

    suspend fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse

    suspend fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse

    suspend fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse

    suspend fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse

    suspend fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse

    suspend fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse

    suspend fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse

    // ------------------------------
    // im
    // ------------------------------
    suspend fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse

    suspend fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse

    suspend fun imList(
        req: ImListRequest
    ): ImListResponse

    suspend fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse

    suspend fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse

    suspend fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse

    // ------------------------------
    // migration
    // ------------------------------
    suspend fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse

    // ------------------------------
    // mpim
    // ------------------------------
    suspend fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse

    suspend fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse

    suspend fun mpimList(
        req: MpimListRequest
    ): MpimListResponse

    suspend fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse

    suspend fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse

    suspend fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse

    // ------------------------------
    // oauth
    // ------------------------------
    suspend fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse

    suspend fun oauthV2Access(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse

    suspend fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse

    // ------------------------------
    // pins
    // ------------------------------
    suspend fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse

    suspend fun pinsList(
        req: PinsListRequest
    ): PinsListResponse

    suspend fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse

    // ------------------------------
    // reactions
    // ------------------------------
    suspend fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    suspend fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    suspend fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse

    suspend fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse

    // ------------------------------
    // reminders
    // ------------------------------
    suspend fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse

    suspend fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    suspend fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    suspend fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    suspend fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse

    // ------------------------------
    // search
    // ------------------------------
    suspend fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse

    suspend fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse

    suspend fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse

    // ------------------------------
    // stars
    // ------------------------------
    suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse

    suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse

    suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse

    // ------------------------------
    // team
    // ------------------------------
    suspend fun teamAccessLogs(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse

    suspend fun teamBillableInfo(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse

    suspend fun teamInfo(
        req: TeamInfoRequest
    ): TeamInfoResponse

    suspend fun teamIntegrationLogs(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse

    suspend fun teamProfileGet(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse

    // ------------------------------
    // usergroups
    // ------------------------------
    suspend fun usergroupsCreate(
        req: UsergroupsCreateRequest
    ): UsergroupsCreateResponse

    suspend fun usergroupsDisable(
        req: UsergroupsDisableRequest
    ): UsergroupsDisableResponse

    suspend fun usergroupsEnable(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse

    suspend fun usergroupsList(
        req: UsergroupsListRequest
    ): UsergroupsListResponse

    suspend fun usergroupsUpdate(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse

    suspend fun usergroupUsersList(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse

    suspend fun usergroupUsersUpdate(
        req: UsergroupUsersUpdateRequest
    ): UsergroupUsersUpdateResponse

    // ------------------------------
    // users
    // ------------------------------
    suspend fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse

    suspend fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse

    suspend fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse

    suspend fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse

    suspend fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse

    suspend fun usersList(
        req: UsersListRequest
    ): UsersListResponse

    suspend fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse

    suspend fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse

    suspend fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse

    suspend fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse

    // ------------------------------
    // users.profile
    // ------------------------------
    suspend fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse

    suspend fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse

    // ------------------------------
    // views
    // ------------------------------
    suspend fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    suspend fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse

    suspend fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    suspend fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://slack.com/api/"
    }
}
