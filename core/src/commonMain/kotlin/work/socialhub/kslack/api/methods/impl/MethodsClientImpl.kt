package work.socialhub.kslack.api.methods.impl

import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.MethodsClient
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

class MethodsClientImpl(
    token: String?
) : AbstractResourceImpl(token),
    MethodsClient {

    override var endpointUrlPrefix = MethodsClient.ENDPOINT_URL_PREFIX

    // ----------------------------------------------------------------------------------
    // public methods
    // ----------------------------------------------------------------------------------
    override suspend fun adminAppsApprove(
        req: AdminAppsApproveRequest
    ): AdminAppsApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_APPROVE,
            getToken(req),
        )
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

    override suspend fun adminAppsRequestsList(
        req: AdminAppsRequestsListRequest
    ): AdminAppsRequestsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_APPS_REQUESTS_LIST,
            getToken(req),
        )
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

    override suspend fun adminInviteRequestsDeny(
        req: AdminInviteRequestsDenyRequest
    ): AdminInviteRequestsDenyResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_DENY,
            getToken(req),
        )
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

    override suspend fun adminInviteRequestsApprovedList(
        req: AdminInviteRequestsApprovedListRequest
    ): AdminInviteRequestsApprovedListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_INVITE_REQUESTS_APPROVED_LIST,
            getToken(req),
        )
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

    override suspend fun adminTeamsAdminsList(
        req: AdminTeamsAdminsListRequest
    ): AdminTeamsAdminsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_ADMINS_LIST,
            getToken(req),
        )
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

    override suspend fun adminTeamsOwnersList(
        req: AdminTeamsOwnersListRequest
    ): AdminTeamsOwnersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_OWNERS_LIST,
            getToken(req),
        )
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

    override suspend fun adminTeamsSettingsSetIcon(
        req: AdminTeamsSettingsSetIconRequest
    ): AdminTeamsSettingsSetIconResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_TEAMS_SETTINGS_SET_ICON,
            getToken(req),
        )
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


    override suspend fun adminUsersAssign(
        req: AdminUsersAssignRequest
    ): AdminUsersAssignResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_ASSIGN,
            getToken(req),
        )
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


    override suspend fun adminUsersRemove(
        req: AdminUsersRemoveRequest
    ): AdminUsersRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_REMOVE,
            getToken(req),
        )
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


    override suspend fun adminUsersSetOwner(
        req: AdminUsersSetOwnerRequest
    ): AdminUsersSetOwnerResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SET_OWNER,
            getToken(req),
        )
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


    override suspend fun adminUsersSessionReset(
        req: AdminUsersSessionResetRequest
    ): AdminUsersSessionResetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_USERS_SESSION_RESET,
            getToken(req),
        )
    }

    override suspend fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse {
        return postForm(
            req.toParams(),
            Methods.API_TEST
        )
    }


    override suspend fun appsUninstall(
        req: AppsUninstallRequest
    ): AppsUninstallResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_UNINSTALL,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsInfo(
        req: AppsPermissionsInfoRequest
    ): AppsPermissionsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_INFO,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsRequest(
        req: AppsPermissionsRequestRequest
    ): AppsPermissionsRequestResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_REQUEST,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsResourcesList(
        req: AppsPermissionsResourcesListRequest
    ): AppsPermissionsResourcesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_RESOURCES_LIST,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsScopesList(
        req: AppsPermissionsScopesListRequest
    ): AppsPermissionsScopesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_SCOPES_LIST,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsUsersList(
        req: AppsPermissionsUsersListRequest
    ): AppsPermissionsUsersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_USERS_LIST,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun appsPermissionsUsersRequest(
        req: AppsPermissionsUsersRequestRequest
    ): AppsPermissionsUsersRequestResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_PERMISSIONS_USERS_REQUEST,
            getToken(req),
        )
    }


    override suspend fun authRevoke(
        req: AuthRevokeRequest
    ): AuthRevokeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.AUTH_REVOKE,
            getToken(req),
        )
    }


    override suspend fun authTest(
        req: AuthTestRequest
    ): AuthTestResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.AUTH_TEST,
            getToken(req),
        )
    }


    override suspend fun botsInfo(
        req: BotsInfoRequest
    ): BotsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.BOTS_INFO,
            getToken(req),
        )
    }


    override suspend fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_ARCHIVE,
            getToken(req),
        )
    }


    override suspend fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_CREATE,
            getToken(req),
        )
    }


    override suspend fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_HISTORY,
            getToken(req),
        )
    }


    override suspend fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_REPLIES,
            getToken(req),
        )
    }


    override suspend fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_INFO,
            getToken(req),
        )
    }


    override suspend fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_LIST,
            getToken(req),
        )
    }


    override suspend fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_INVITE,
            getToken(req),
        )
    }


    override suspend fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_JOIN,
            getToken(req),
        )
    }


    override suspend fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_KICK,
            getToken(req),
        )
    }


    override suspend fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_LEAVE,
            getToken(req),
        )
    }


    override suspend fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_MARK,
            getToken(req),
        )
    }


    override suspend fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_RENAME,
            getToken(req),
        )
    }


    override suspend fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_SET_PURPOSE,
            getToken(req),
        )
    }


    override suspend fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_SET_TOPIC,
            getToken(req),
        )
    }


    override suspend fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_UNARCHIVE,
            getToken(req),
        )
    }


    override suspend fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_GET_PERMALINK,
            getToken(req),
        )
    }


    override suspend fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_DELETE,
            getToken(req),
        )
    }


    override suspend fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_DELETE_SCHEDULED_MESSAGE,
            getToken(req),
        )
    }


    override suspend fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_ME_MESSAGE,
            getToken(req),
        )
    }


    override suspend fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_POST_EPHEMERAL,
            getToken(req),
        )
    }


    override suspend fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_POST_MESSAGE,
            getToken(req),
        )
    }


    override suspend fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_SCHEDULE_MESSAGE,
            getToken(req),
        )
    }


    override suspend fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_UPDATE,
            getToken(req),
        )
    }


    override suspend fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_UNFURL,
            getToken(req),
        )
    }


    override suspend fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_SCHEDULED_MESSAGES_LIST,
            getToken(req),
        )
    }


    override suspend fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_ARCHIVE,
            getToken(req),
        )
    }


    override suspend fun conversationsClose(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_CLOSE,
            getToken(req),
        )
    }


    override suspend fun conversationsCreate(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_CREATE,
            getToken(req),
        )
    }


    override suspend fun conversationsHistory(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_HISTORY,
            getToken(req),
        )
    }


    override suspend fun conversationsInfo(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_INFO,
            getToken(req),
        )
    }


    override suspend fun conversationsInvite(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_INVITE,
            getToken(req),
        )
    }


    override suspend fun conversationsJoin(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_JOIN,
            getToken(req),
        )
    }


    override suspend fun conversationsKick(
        req: ConversationsKickRequest
    ): ConversationsKickResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_KICK,
            getToken(req),
        )
    }


    override suspend fun conversationsLeave(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_LEAVE,
            getToken(req),
        )
    }


    override suspend fun conversationsList(
        req: ConversationsListRequest
    ): ConversationsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_LIST,
            getToken(req),
        )
    }


    override suspend fun conversationsMembers(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_MEMBERS,
            getToken(req),
        )
    }


    override suspend fun conversationsOpen(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_OPEN,
            getToken(req),
        )
    }


    override suspend fun conversationsRename(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_RENAME,
            getToken(req),
        )
    }


    override suspend fun conversationsReplies(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_REPLIES,
            getToken(req),
        )
    }


    override suspend fun conversationsSetPurpose(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_SET_PURPOSE,
            getToken(req),
        )
    }


    override suspend fun conversationsSetTopic(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_SET_TOPIC,
            getToken(req),
        )
    }


    override suspend fun conversationsUnarchive(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_UNARCHIVE,
            getToken(req),
        )
    }


    override suspend fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DIALOG_OPEN,
            getToken(req),
        )
    }


    override suspend fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DND_END_DND,
            getToken(req),
        )
    }


    override suspend fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DND_END_SNOOZE,
            getToken(req),
        )
    }


    override suspend fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DND_INFO,
            getToken(req),
        )
    }


    override suspend fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DND_SET_SNOOZE,
            getToken(req),
        )
    }


    override suspend fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.DND_TEAM_INFO,
            getToken(req),
        )
    }


    override suspend fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.EMOJI_LIST,
            getToken(req),
        )
    }


    override suspend fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_DELETE,
            getToken(req),
        )
    }


    override suspend fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_INFO,
            getToken(req),
        )
    }


    override suspend fun filesList(
        req: FilesListRequest
    ): FilesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_LIST,
            getToken(req),
        )
    }


    override suspend fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REVOKE_PUBLIC_URL,
            getToken(req),
        )
    }


    override suspend fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_SHARED_PUBLIC_URL,
            getToken(req),
        )
    }


    override suspend fun filesUpload(
        req: FilesUploadRequest
    ): FilesUploadResponse {
        return if (req.file != null) {
            postMultipartWithToken(
                req.toParams(),
                Methods.FILES_UPLOAD,
                getToken(req),
            )
        } else {
            postFormWithToken(
                req.toParams(),
                Methods.FILES_UPLOAD,
                getToken(req),
            )
        }
    }


    @Deprecated("")
    override suspend fun filesCommentsAdd(
        req: FilesCommentsAddRequest
    ): FilesCommentsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_COMMENTS_ADD,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun filesCommentsDelete(
        req: FilesCommentsDeleteRequest
    ): FilesCommentsDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_COMMENTS_DELETE,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun filesCommentEdit(
        req: FilesCommentsEditRequest
    ): FilesCommentsEditResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_COMMENTS_EDIT,
            getToken(req),
        )
    }


    override suspend fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_ADD,
            getToken(req),
        )
    }


    override suspend fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_INFO,
            getToken(req),
        )
    }


    override suspend fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_LIST,
            getToken(req),
        )
    }


    override suspend fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_REMOVE,
            getToken(req),
        )
    }


    override suspend fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_SHARE,
            getToken(req),
        )
    }


    override suspend fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_UPDATE,
            getToken(req),
        )
    }


    override suspend fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_ARCHIVE,
            getToken(req),
        )
    }


    @Deprecated("")
    override suspend fun groupsClose(
        req: GroupsCloseRequest
    ): GroupsCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_CLOSE,
            getToken(req),
        )
    }


    override suspend fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_CREATE_CHILD,
            getToken(req),
        )
    }


    override suspend fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_CREATE,
            getToken(req),
        )
    }


    override suspend fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_HISTORY,
            getToken(req),
        )
    }


    override suspend fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_REPLIES,
            getToken(req),
        )
    }


    override suspend fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_INFO,
            getToken(req),
        )
    }


    override suspend fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_INVITE,
            getToken(req),
        )
    }


    override suspend fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_KICK,
            getToken(req),
        )
    }


    override suspend fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_LEAVE,
            getToken(req),
        )
    }


    override suspend fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_LIST,
            getToken(req),
        )
    }


    override suspend fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_MARK,
            getToken(req),
        )
    }


    override suspend fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_OPEN,
            getToken(req),
        )
    }


    override suspend fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_RENAME,
            getToken(req),
        )
    }


    override suspend fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_SET_PURPOSE,
            getToken(req),
        )
    }


    override suspend fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_SET_TOPIC,
            getToken(req),
        )
    }


    override suspend fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_UNARCHIVE,
            getToken(req),
        )
    }


    override suspend fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_CLOSE,
            getToken(req),
        )
    }


    override suspend fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_HISTORY,
            getToken(req),
        )
    }


    override suspend fun imList(
        req: ImListRequest
    ): ImListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_LIST,
            getToken(req),
        )
    }


    override suspend fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_MARK,
            getToken(req),
        )
    }


    override suspend fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_OPEN,
            getToken(req),
        )
    }


    override suspend fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_REPLIES,
            getToken(req),
        )
    }


    override suspend fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MIGRATION_EXCHANGE,
            getToken(req),
        )
    }


    override suspend fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_CLOSE,
            getToken(req),
        )
    }


    override suspend fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_HISTORY,
            getToken(req),
        )
    }


    override suspend fun mpimList(
        req: MpimListRequest
    ): MpimListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_LIST,
            getToken(req),
        )
    }


    override suspend fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_REPLIES,
            getToken(req),
        )
    }


    override suspend fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_MARK,
            getToken(req),
        )
    }


    override suspend fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_OPEN,
            getToken(req),
        )
    }


    override suspend fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse {
        TODO("")
    }


    override suspend fun oauthV2Access(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse {
        TODO("")
//        FormBody.Builder form = new FormBody.Builder();
//        form.add("code", req.getCode());
//        form.add("redirect_uri", req.getRedirectUri());
//        String authorizationHeader = Credentials.basic(req.getClientId(), req.getClientSecret());
//        return postFormWithAuthorizationHeader(form, endpointUrlPrefix + Methods.OAUTH_V2_ACCESS, authorizationHeader, OAuthV2AccessResponse.class);
    }


    override suspend fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse {
        TODO("")
    }


    override suspend fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_ADD,
            getToken(req),
        )
    }


    override suspend fun pinsList(
        req: PinsListRequest
    ): PinsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_LIST,
            getToken(req),
        )
    }


    override suspend fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_REMOVE,
            getToken(req),
        )
    }


    override suspend fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_ADD,
            getToken(req),
        )
    }


    override suspend fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_GET,
            getToken(req),
        )
    }


    override suspend fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_LIST,
            getToken(req),
        )
    }


    override suspend fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_REMOVE,
            getToken(req),
        )
    }


    override suspend fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REMINDERS_ADD,
            getToken(req),
        )
    }


    override suspend fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REMINDERS_COMPLETE,
            getToken(req),
        )
    }


    override suspend fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REMINDERS_DELETE,
            getToken(req),
        )
    }


    override suspend fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REMINDERS_INFO,
            getToken(req),
        )
    }


    override suspend fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REMINDERS_LIST,
            getToken(req),
        )
    }


    override suspend fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_ALL,
            getToken(req),
        )
    }


    override suspend fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_MESSAGES,
            getToken(req),
        )
    }


    override suspend fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_FILES,
            getToken(req),
        )
    }


    override suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_ADD,
            getToken(req),
        )
    }


    override suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_LIST,
            getToken(req),
        )
    }


    override suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_REMOVE,
            getToken(req),
        )
    }


    override suspend fun teamAccessLogs(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.TEAM_ACCESS_LOGS,
            getToken(req),
        )
    }


    override suspend fun teamBillableInfo(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.TEAM_BILLABLE_INFO,
            getToken(req),
        )
    }


    override suspend fun teamInfo(
        req: TeamInfoRequest
    ): TeamInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.TEAM_INFO,
            getToken(req),
        )
    }


    override suspend fun teamIntegrationLogs(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.TEAM_INTEGRATION_LOGS,
            getToken(req),
        )
    }


    override suspend fun teamProfileGet(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.TEAM_PROFILE_GET,
            getToken(req),
        )
    }


    override suspend fun usergroupsCreate(
        req: UsergroupsCreateRequest
    ): UsergroupsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_CREATE,
            getToken(req),
        )
    }


    override suspend fun usergroupsDisable(
        req: UsergroupsDisableRequest
    ): UsergroupsDisableResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_DISABLE,
            getToken(req),
        )
    }


    override suspend fun usergroupsEnable(
        req: UsergroupsEnableRequest
    ): UsergroupsEnableResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_ENABLE,
            getToken(req),
        )
    }


    override suspend fun usergroupsList(
        req: UsergroupsListRequest
    ): UsergroupsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_LIST,
            getToken(req),
        )
    }


    override suspend fun usergroupsUpdate(
        req: UsergroupsUpdateRequest
    ): UsergroupsUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_UPDATE,
            getToken(req),
        )
    }


    override suspend fun usergroupUsersList(
        req: UsergroupUsersListRequest
    ): UsergroupUsersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_USERS_LIST,
            getToken(req),
        )
    }


    override suspend fun usergroupUsersUpdate(
        req: UsergroupUsersUpdateRequest
    ): UsergroupUsersUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERGROUPS_USERS_UPDATE,
            getToken(req),
        )
    }


    override suspend fun usersConversations(
        req: UsersConversationsRequest
    ): UsersConversationsResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_CONVERSATIONS,
            getToken(req),
        )
    }


    override suspend fun usersDeletePhoto(
        req: UsersDeletePhotoRequest
    ): UsersDeletePhotoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_DELETE_PHOTO,
            getToken(req),
        )
    }


    override suspend fun usersGetPresence(
        req: UsersGetPresenceRequest
    ): UsersGetPresenceResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_GET_PRESENCE,
            getToken(req),
        )
    }


    override suspend fun usersIdentity(
        req: UsersIdentityRequest
    ): UsersIdentityResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_IDENTITY,
            getToken(req),
        )
    }


    override suspend fun usersInfo(
        req: UsersInfoRequest
    ): UsersInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_INFO,
            getToken(req),
        )
    }


    override suspend fun usersList(
        req: UsersListRequest
    ): UsersListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_LIST,
            getToken(req),
        )
    }


    override suspend fun usersLookupByEmail(
        req: UsersLookupByEmailRequest
    ): UsersLookupByEmailResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_LOOKUP_BY_EMAIL,
            getToken(req),
        )
    }


    override suspend fun usersSetActive(
        req: UsersSetActiveRequest
    ): UsersSetActiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_SET_ACTIVE,
            getToken(req),
        )
    }


    override suspend fun usersSetPhoto(
        req: UsersSetPhotoRequest
    ): UsersSetPhotoResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.USERS_SET_PHOTO,
            getToken(req)
        )
    }


    override suspend fun usersSetPresence(
        req: UsersSetPresenceRequest
    ): UsersSetPresenceResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_SET_PRESENCE,
            getToken(req),
        )
    }


    override suspend fun usersProfileGet(
        req: UsersProfileGetRequest
    ): UsersProfileGetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_PROFILE_GET,
            getToken(req),
        )
    }


    override suspend fun usersProfileSet(
        req: UsersProfileSetRequest
    ): UsersProfileSetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.USERS_PROFILE_SET,
            getToken(req),
        )
    }


    override suspend fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.VIEWS_OPEN,
            getToken(req),
        )
    }


    override suspend fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.VIEWS_PUSH,
            getToken(req),
        )
    }


    override suspend fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.VIEWS_UPDATE,
            getToken(req),
        )
    }


    override suspend fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.VIEWS_PUBLISH,
            getToken(req),
        )
    }
}