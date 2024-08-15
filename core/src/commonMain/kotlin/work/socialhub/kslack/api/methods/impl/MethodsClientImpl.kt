package work.socialhub.kslack.api.methods.impl

import work.socialhub.kslack.api.RequestConfigurator
import work.socialhub.kslack.api.methods.FormBody
import work.socialhub.kslack.api.methods.Methods

class MethodsClientImpl(slackHttpClient: SlackHttpClient, token: String?) : MethodsClient {
    var endpointUrlPrefix: String = MethodsClient.ENDPOINT_URL_PREFIX

    private val slackHttpClient: SlackHttpClient = slackHttpClient
    private val token: java.util.Optional<String> = java.util.Optional.ofNullable<String>(token)

    constructor(slackHttpClient: SlackHttpClient) : this(slackHttpClient, null)

    // ----------------------------------------------------------------------------------
    // public methods
    // ----------------------------------------------------------------------------------
    fun adminAppsApprove(req: AdminAppsApproveRequest): AdminAppsApproveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_APPROVE,
            getToken(req),
            AdminAppsApproveResponse::class.java
        )
    }

    fun adminAppsApprove(req: RequestConfigurator<AdminAppsApproveRequest.AdminAppsApproveRequestBuilder?>): AdminAppsApproveResponse {
        return adminAppsApprove(req.configure(AdminAppsApproveRequest.builder()).build())
    }

    fun adminAppsRestrict(req: AdminAppsRestrictRequest): AdminAppsRestrictResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_RESTRICT,
            getToken(req),
            AdminAppsRestrictResponse::class.java
        )
    }

    fun adminAppsRestrict(req: RequestConfigurator<AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder?>): AdminAppsRestrictResponse {
        return adminAppsRestrict(req.configure(AdminAppsRestrictRequest.builder()).build())
    }

    fun adminAppsRequestsList(req: AdminAppsRequestsListRequest): AdminAppsRequestsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_APPS_REQUESTS_LIST,
            getToken(req),
            AdminAppsRequestsListResponse::class.java
        )
    }

    fun adminAppsRequestsList(req: RequestConfigurator<AdminAppsRequestsListRequest.AdminAppsRequestsListRequestBuilder?>): AdminAppsRequestsListResponse {
        return adminAppsRequestsList(req.configure(AdminAppsRequestsListRequest.builder()).build())
    }

    fun adminInviteRequestsApprove(req: AdminInviteRequestsApproveRequest): AdminInviteRequestsApproveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_APPROVE,
            getToken(req),
            AdminInviteRequestsApproveResponse::class.java
        )
    }

    fun adminInviteRequestsApprove(req: RequestConfigurator<AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder?>): AdminInviteRequestsApproveResponse {
        return adminInviteRequestsApprove(req.configure(AdminInviteRequestsApproveRequest.builder()).build())
    }

    fun adminInviteRequestsDeny(req: AdminInviteRequestsDenyRequest): AdminInviteRequestsDenyResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_DENY,
            getToken(req),
            AdminInviteRequestsDenyResponse::class.java
        )
    }

    fun adminInviteRequestsDeny(req: RequestConfigurator<AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder?>): AdminInviteRequestsDenyResponse {
        return adminInviteRequestsDeny(req.configure(AdminInviteRequestsDenyRequest.builder()).build())
    }

    fun adminInviteRequestsList(req: AdminInviteRequestsListRequest): AdminInviteRequestsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_LIST,
            getToken(req),
            AdminInviteRequestsListResponse::class.java
        )
    }

    fun adminInviteRequestsList(req: RequestConfigurator<AdminInviteRequestsListRequest.AdminInviteRequestsListRequestBuilder?>): AdminInviteRequestsListResponse {
        return adminInviteRequestsList(req.configure(AdminInviteRequestsListRequest.builder()).build())
    }

    fun adminInviteRequestsApprovedList(req: AdminInviteRequestsApprovedListRequest): AdminInviteRequestsApprovedListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_APPROVED_LIST,
            getToken(req),
            AdminInviteRequestsApprovedListResponse::class.java
        )
    }

    fun adminInviteRequestsApprovedList(req: RequestConfigurator<AdminInviteRequestsApprovedListRequest.AdminInviteRequestsApprovedListRequestBuilder?>): AdminInviteRequestsApprovedListResponse {
        return adminInviteRequestsApprovedList(req.configure(AdminInviteRequestsApprovedListRequest.builder()).build())
    }

    fun adminInviteRequestsDeniedList(req: AdminInviteRequestsDeniedListRequest): AdminInviteRequestsDeniedListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_INVITE_REQUESTS_DENIED_LIST,
            getToken(req),
            AdminInviteRequestsDeniedListResponse::class.java
        )
    }

    fun adminInviteRequestsDeniedList(req: RequestConfigurator<AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder?>): AdminInviteRequestsDeniedListResponse {
        return adminInviteRequestsDeniedList(req.configure(AdminInviteRequestsDeniedListRequest.builder()).build())
    }

    fun adminTeamsAdminsList(req: AdminTeamsAdminsListRequest): AdminTeamsAdminsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_ADMINS_LIST,
            getToken(req),
            AdminTeamsAdminsListResponse::class.java
        )
    }

    fun adminTeamsAdminsList(req: RequestConfigurator<AdminTeamsAdminsListRequest.AdminTeamsAdminsListRequestBuilder?>): AdminTeamsAdminsListResponse {
        return adminTeamsAdminsList(req.configure(AdminTeamsAdminsListRequest.builder()).build())
    }

    fun adminTeamsCreate(req: AdminTeamsCreateRequest): AdminTeamsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_CREATE,
            getToken(req),
            AdminTeamsCreateResponse::class.java
        )
    }

    fun adminTeamsCreate(req: RequestConfigurator<AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder?>): AdminTeamsCreateResponse {
        return adminTeamsCreate(req.configure(AdminTeamsCreateRequest.builder()).build())
    }

    fun adminTeamsOwnersList(req: AdminTeamsOwnersListRequest): AdminTeamsOwnersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_OWNERS_LIST,
            getToken(req),
            AdminTeamsOwnersListResponse::class.java
        )
    }

    fun adminTeamsOwnersList(req: RequestConfigurator<AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder?>): AdminTeamsOwnersListResponse {
        return adminTeamsOwnersList(req.configure(AdminTeamsOwnersListRequest.builder()).build())
    }

    fun adminTeamsSettingsSetDescription(req: AdminTeamsSettingsSetDescriptionRequest): AdminTeamsSettingsSetDescriptionResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_SETTINGS_SET_DESCRIPTION,
            getToken(req),
            AdminTeamsSettingsSetDescriptionResponse::class.java
        )
    }

    fun adminTeamsSettingsSetDescription(req: RequestConfigurator<AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder?>): AdminTeamsSettingsSetDescriptionResponse {
        return adminTeamsSettingsSetDescription(
            req.configure(AdminTeamsSettingsSetDescriptionRequest.builder()).build()
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

    fun adminTeamsSettingsSetIcon(req: RequestConfigurator<AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder?>): AdminTeamsSettingsSetIconResponse {
        return adminTeamsSettingsSetIcon(req.configure(AdminTeamsSettingsSetIconRequest.builder()).build())
    }

    fun adminTeamsSettingsSetName(req: AdminTeamsSettingsSetNameRequest): AdminTeamsSettingsSetNameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_TEAMS_SETTINGS_SET_NAME,
            getToken(req),
            AdminTeamsSettingsSetNameResponse::class.java
        )
    }

    fun adminTeamsSettingsSetName(req: RequestConfigurator<AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder?>): AdminTeamsSettingsSetNameResponse {
        return adminTeamsSettingsSetName(req.configure(AdminTeamsSettingsSetNameRequest.builder()).build())
    }

    fun adminUsersAssign(req: AdminUsersAssignRequest): AdminUsersAssignResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_ASSIGN,
            getToken(req),
            AdminUsersAssignResponse::class.java
        )
    }

    fun adminUsersAssign(req: RequestConfigurator<AdminUsersAssignRequest.AdminUsersAssignRequestBuilder?>): AdminUsersAssignResponse {
        return adminUsersAssign(req.configure(AdminUsersAssignRequest.builder()).build())
    }

    fun adminUsersInvite(req: AdminUsersInviteRequest): AdminUsersInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_INVITE,
            getToken(req),
            AdminUsersInviteResponse::class.java
        )
    }

    fun adminUsersInvite(req: RequestConfigurator<AdminUsersInviteRequest.AdminUsersInviteRequestBuilder?>): AdminUsersInviteResponse {
        return adminUsersInvite(req.configure(AdminUsersInviteRequest.builder()).build())
    }

    fun adminUsersRemove(req: AdminUsersRemoveRequest): AdminUsersRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_REMOVE,
            getToken(req),
            AdminUsersRemoveResponse::class.java
        )
    }

    fun adminUsersRemove(req: RequestConfigurator<AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder?>): AdminUsersRemoveResponse {
        return adminUsersRemove(req.configure(AdminUsersRemoveRequest.builder()).build())
    }

    fun adminUsersSetAdmin(req: AdminUsersSetAdminRequest): AdminUsersSetAdminResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_ADMIN,
            getToken(req),
            AdminUsersSetAdminResponse::class.java
        )
    }

    fun adminUsersSetAdmin(req: RequestConfigurator<AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder?>): AdminUsersSetAdminResponse {
        return adminUsersSetAdmin(req.configure(AdminUsersSetAdminRequest.builder()).build())
    }

    fun adminUsersSetOwner(req: AdminUsersSetOwnerRequest): AdminUsersSetOwnerResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_OWNER,
            getToken(req),
            AdminUsersSetOwnerResponse::class.java
        )
    }

    fun adminUsersSetOwner(req: RequestConfigurator<AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder?>): AdminUsersSetOwnerResponse {
        return adminUsersSetOwner(req.configure(AdminUsersSetOwnerRequest.builder()).build())
    }

    fun adminUsersSetRegular(req: AdminUsersSetRegularRequest): AdminUsersSetRegularResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SET_REGULAR,
            getToken(req),
            AdminUsersSetRegularResponse::class.java
        )
    }

    fun adminUsersSetRegular(req: RequestConfigurator<AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder?>): AdminUsersSetRegularResponse {
        return adminUsersSetRegular(req.configure(AdminUsersSetRegularRequest.builder()).build())
    }

    fun adminUsersSessionReset(req: AdminUsersSessionResetRequest): AdminUsersSessionResetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.ADMIN_USERS_SESSION_RESET,
            getToken(req),
            AdminUsersSessionResetResponse::class.java
        )
    }

    fun adminUsersSessionReset(req: RequestConfigurator<AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder?>): AdminUsersSessionResetResponse {
        return adminUsersSessionReset(req.configure(AdminUsersSessionResetRequest.builder()).build())
    }

    fun apiTest(req: ApiTestRequest?): ApiTestResponse {
        return postFormAndParseResponse(toForm(req), Methods.API_TEST, ApiTestResponse::class.java)
    }


    fun apiTest(req: RequestConfigurator<ApiTestRequest.ApiTestRequestBuilder?>): ApiTestResponse {
        return apiTest(req.configure(ApiTestRequest.builder()).build())
    }


    fun appsUninstall(req: AppsUninstallRequest): AppsUninstallResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_UNINSTALL,
            getToken(req),
            AppsUninstallResponse::class.java
        )
    }


    fun appsUninstall(req: RequestConfigurator<AppsUninstallRequest.AppsUninstallRequestBuilder?>): AppsUninstallResponse {
        return appsUninstall(req.configure(AppsUninstallRequest.builder()).build())
    }


    fun appsPermissionsInfo(req: AppsPermissionsInfoRequest): AppsPermissionsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_INFO,
            getToken(req),
            AppsPermissionsInfoResponse::class.java
        )
    }


    fun appsPermissionsInfo(req: RequestConfigurator<AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder?>): AppsPermissionsInfoResponse {
        return appsPermissionsInfo(req.configure(AppsPermissionsInfoRequest.builder()).build())
    }


    fun appsPermissionsRequest(req: AppsPermissionsRequestRequest): AppsPermissionsRequestResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_REQUEST,
            getToken(req),
            AppsPermissionsRequestResponse::class.java
        )
    }


    fun appsPermissionsRequest(req: RequestConfigurator<AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder?>): AppsPermissionsRequestResponse {
        return appsPermissionsRequest(req.configure(AppsPermissionsRequestRequest.builder()).build())
    }


    fun appsPermissionsResourcesList(req: AppsPermissionsResourcesListRequest): AppsPermissionsResourcesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_RESOURCES_LIST,
            getToken(req),
            AppsPermissionsResourcesListResponse::class.java
        )
    }


    fun appsPermissionsScopesList(req: AppsPermissionsScopesListRequest): AppsPermissionsScopesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_SCOPES_LIST,
            getToken(req),
            AppsPermissionsScopesListResponse::class.java
        )
    }


    fun appsPermissionsUsersList(req: AppsPermissionsUsersListRequest): AppsPermissionsUsersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_USERS_LIST,
            getToken(req),
            AppsPermissionsUsersListResponse::class.java
        )
    }


    fun appsPermissionsUsersRequest(req: AppsPermissionsUsersRequestRequest): AppsPermissionsUsersRequestResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_USERS_REQUEST,
            getToken(req),
            AppsPermissionsUsersRequestResponse::class.java
        )
    }


    fun authRevoke(req: AuthRevokeRequest): AuthRevokeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.AUTH_REVOKE,
            getToken(req),
            AuthRevokeResponse::class.java
        )
    }


    fun authRevoke(req: RequestConfigurator<AuthRevokeRequest.AuthRevokeRequestBuilder?>): AuthRevokeResponse {
        return authRevoke(req.configure(AuthRevokeRequest.builder()).build())
    }


    fun authTest(req: AuthTestRequest): AuthTestResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.AUTH_TEST,
            getToken(req),
            AuthTestResponse::class.java
        )
    }


    fun authTest(req: RequestConfigurator<AuthTestRequest.AuthTestRequestBuilder?>): AuthTestResponse {
        return authTest(req.configure(AuthTestRequest.builder()).build())
    }


    fun botsInfo(req: BotsInfoRequest): BotsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.BOTS_INFO,
            getToken(req),
            BotsInfoResponse::class.java
        )
    }


    fun botsInfo(req: RequestConfigurator<BotsInfoRequest.BotsInfoRequestBuilder?>): BotsInfoResponse {
        return botsInfo(req.configure(BotsInfoRequest.builder()).build())
    }


    fun channelsArchive(req: ChannelsArchiveRequest): ChannelsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_ARCHIVE,
            getToken(req),
            ChannelsArchiveResponse::class.java
        )
    }


    fun channelsArchive(req: RequestConfigurator<ChannelsArchiveRequest.ChannelsArchiveRequestBuilder?>): ChannelsArchiveResponse {
        return channelsArchive(req.configure(ChannelsArchiveRequest.builder()).build())
    }


    fun channelsCreate(req: ChannelsCreateRequest): ChannelsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_CREATE,
            getToken(req),
            ChannelsCreateResponse::class.java
        )
    }


    fun channelsCreate(req: RequestConfigurator<ChannelsCreateRequest.ChannelsCreateRequestBuilder?>): ChannelsCreateResponse {
        return channelsCreate(req.configure(ChannelsCreateRequest.builder()).build())
    }


    fun channelsHistory(req: ChannelsHistoryRequest): ChannelsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_HISTORY,
            getToken(req),
            ChannelsHistoryResponse::class.java
        )
    }


    fun channelsHistory(req: RequestConfigurator<ChannelsHistoryRequest.ChannelsHistoryRequestBuilder?>): ChannelsHistoryResponse {
        return channelsHistory(req.configure(ChannelsHistoryRequest.builder()).build())
    }


    fun channelsReplies(req: ChannelsRepliesRequest): ChannelsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_REPLIES,
            getToken(req),
            ChannelsRepliesResponse::class.java
        )
    }


    fun channelsReplies(req: RequestConfigurator<ChannelsRepliesRequest.ChannelsRepliesRequestBuilder?>): ChannelsRepliesResponse {
        return channelsReplies(req.configure(ChannelsRepliesRequest.builder()).build())
    }


    fun channelsInfo(req: ChannelsInfoRequest): ChannelsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_INFO,
            getToken(req),
            ChannelsInfoResponse::class.java
        )
    }


    fun channelsInfo(req: RequestConfigurator<ChannelsInfoRequest.ChannelsInfoRequestBuilder?>): ChannelsInfoResponse {
        return channelsInfo(req.configure(ChannelsInfoRequest.builder()).build())
    }


    fun channelsList(req: ChannelsListRequest): ChannelsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_LIST,
            getToken(req),
            ChannelsListResponse::class.java
        )
    }


    fun channelsList(req: RequestConfigurator<ChannelsListRequest.ChannelsListRequestBuilder?>): ChannelsListResponse {
        return channelsList(req.configure(ChannelsListRequest.builder()).build())
    }


    fun channelsInvite(req: ChannelsInviteRequest): ChannelsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_INVITE,
            getToken(req),
            ChannelsInviteResponse::class.java
        )
    }


    fun channelsInvite(req: RequestConfigurator<ChannelsInviteRequest.ChannelsInviteRequestBuilder?>): ChannelsInviteResponse {
        return channelsInvite(req.configure(ChannelsInviteRequest.builder()).build())
    }


    fun channelsJoin(req: ChannelsJoinRequest): ChannelsJoinResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_JOIN,
            getToken(req),
            ChannelsJoinResponse::class.java
        )
    }


    fun channelsJoin(req: RequestConfigurator<ChannelsJoinRequest.ChannelsJoinRequestBuilder?>): ChannelsJoinResponse {
        return channelsJoin(req.configure(ChannelsJoinRequest.builder()).build())
    }


    fun channelsKick(req: ChannelsKickRequest): ChannelsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_KICK,
            getToken(req),
            ChannelsKickResponse::class.java
        )
    }


    fun channelsKick(req: RequestConfigurator<ChannelsKickRequest.ChannelsKickRequestBuilder?>): ChannelsKickResponse {
        return channelsKick(req.configure(ChannelsKickRequest.builder()).build())
    }


    fun channelsLeave(req: ChannelsLeaveRequest): ChannelsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_LEAVE,
            getToken(req),
            ChannelsLeaveResponse::class.java
        )
    }


    fun channelsLeave(req: RequestConfigurator<ChannelsLeaveRequest.ChannelsLeaveRequestBuilder?>): ChannelsLeaveResponse {
        return channelsLeave(req.configure(ChannelsLeaveRequest.builder()).build())
    }


    fun channelsMark(req: ChannelsMarkRequest): ChannelsMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_MARK,
            getToken(req),
            ChannelsMarkResponse::class.java
        )
    }


    fun channelsMark(req: RequestConfigurator<ChannelsMarkRequest.ChannelsMarkRequestBuilder?>): ChannelsMarkResponse {
        return channelsMark(req.configure(ChannelsMarkRequest.builder()).build())
    }


    fun channelsRename(req: ChannelsRenameRequest): ChannelsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_RENAME,
            getToken(req),
            ChannelsRenameResponse::class.java
        )
    }


    fun channelsRename(req: RequestConfigurator<ChannelsRenameRequest.ChannelsRenameRequestBuilder?>): ChannelsRenameResponse {
        return channelsRename(req.configure(ChannelsRenameRequest.builder()).build())
    }


    fun channelsSetPurpose(req: ChannelsSetPurposeRequest): ChannelsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_SET_PURPOSE,
            getToken(req),
            ChannelsSetPurposeResponse::class.java
        )
    }


    fun channelsSetPurpose(req: RequestConfigurator<ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder?>): ChannelsSetPurposeResponse {
        return channelsSetPurpose(req.configure(ChannelsSetPurposeRequest.builder()).build())
    }


    fun channelsSetTopic(req: ChannelsSetTopicRequest): ChannelsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_SET_TOPIC,
            getToken(req),
            ChannelsSetTopicResponse::class.java
        )
    }


    fun channelsSetTopic(req: RequestConfigurator<ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder?>): ChannelsSetTopicResponse {
        return channelsSetTopic(req.configure(ChannelsSetTopicRequest.builder()).build())
    }


    fun channelsUnarchive(req: ChannelsUnarchiveRequest): ChannelsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_UNARCHIVE,
            getToken(req),
            ChannelsUnarchiveResponse::class.java
        )
    }


    fun channelsUnarchive(req: RequestConfigurator<ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder?>): ChannelsUnarchiveResponse {
        return channelsUnarchive(req.configure(ChannelsUnarchiveRequest.builder()).build())
    }


    fun chatGetPermalink(req: ChatGetPermalinkRequest): ChatGetPermalinkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_GET_PERMALINK,
            getToken(req),
            ChatGetPermalinkResponse::class.java
        )
    }


    fun chatGetPermalink(req: RequestConfigurator<ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder?>): ChatGetPermalinkResponse {
        return chatGetPermalink(req.configure(ChatGetPermalinkRequest.builder()).build())
    }


    fun chatDelete(req: ChatDeleteRequest): ChatDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_DELETE,
            getToken(req),
            ChatDeleteResponse::class.java
        )
    }


    fun chatDelete(req: RequestConfigurator<ChatDeleteRequest.ChatDeleteRequestBuilder?>): ChatDeleteResponse {
        return chatDelete(req.configure(ChatDeleteRequest.builder()).build())
    }


    fun chatDeleteScheduledMessage(req: ChatDeleteScheduledMessageRequest): ChatDeleteScheduledMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_DELETE_SCHEDULED_MESSAGE,
            getToken(req),
            ChatDeleteScheduledMessageResponse::class.java
        )
    }


    fun chatDeleteScheduledMessage(req: RequestConfigurator<ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder?>): ChatDeleteScheduledMessageResponse {
        return chatDeleteScheduledMessage(req.configure(ChatDeleteScheduledMessageRequest.builder()).build())
    }


    fun chatMeMessage(req: ChatMeMessageRequest): ChatMeMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_ME_MESSAGE,
            getToken(req),
            ChatMeMessageResponse::class.java
        )
    }


    fun chatMeMessage(req: RequestConfigurator<ChatMeMessageRequest.ChatMeMessageRequestBuilder?>): ChatMeMessageResponse {
        return chatMeMessage(req.configure(ChatMeMessageRequest.builder()).build())
    }


    fun chatPostEphemeral(req: ChatPostEphemeralRequest): ChatPostEphemeralResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_POST_EPHEMERAL,
            getToken(req),
            ChatPostEphemeralResponse::class.java
        )
    }


    fun chatPostEphemeral(req: RequestConfigurator<ChatPostEphemeralRequest.ChatPostEphemeralRequestBuilder?>): ChatPostEphemeralResponse {
        return chatPostEphemeral(req.configure(ChatPostEphemeralRequest.builder()).build())
    }


    fun chatPostMessage(req: ChatPostMessageRequest): ChatPostMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_POST_MESSAGE,
            getToken(req),
            ChatPostMessageResponse::class.java
        )
    }


    fun chatPostMessage(req: RequestConfigurator<ChatPostMessageRequest.ChatPostMessageRequestBuilder?>): ChatPostMessageResponse {
        return chatPostMessage(req.configure(ChatPostMessageRequest.builder()).build())
    }


    fun chatScheduleMessage(req: ChatScheduleMessageRequest): ChatScheduleMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_SCHEDULE_MESSAGE,
            getToken(req),
            ChatScheduleMessageResponse::class.java
        )
    }


    fun chatScheduleMessage(req: RequestConfigurator<ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder?>): ChatScheduleMessageResponse {
        return chatScheduleMessage(req.configure(ChatScheduleMessageRequest.builder()).build())
    }


    fun chatUpdate(req: ChatUpdateRequest): ChatUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_UPDATE,
            getToken(req),
            ChatUpdateResponse::class.java
        )
    }


    fun chatUpdate(req: RequestConfigurator<ChatUpdateRequest.ChatUpdateRequestBuilder?>): ChatUpdateResponse {
        return chatUpdate(req.configure(ChatUpdateRequest.builder()).build())
    }


    fun chatUnfurl(req: ChatUnfurlRequest): ChatUnfurlResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_UNFURL,
            getToken(req),
            ChatUnfurlResponse::class.java
        )
    }


    fun chatUnfurl(req: RequestConfigurator<ChatUnfurlRequest.ChatUnfurlRequestBuilder?>): ChatUnfurlResponse {
        return chatUnfurl(req.configure(ChatUnfurlRequest.builder()).build())
    }


    fun chatScheduleMessagesListMessage(req: ChatScheduleMessagesListRequest): ChatScheduleMessagesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_SCHEDULED_MESSAGES_LIST,
            getToken(req),
            ChatScheduleMessagesListResponse::class.java
        )
    }


    fun chatScheduleMessagesListMessage(req: RequestConfigurator<ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder?>): ChatScheduleMessagesListResponse {
        return chatScheduleMessagesListMessage(req.configure(ChatScheduleMessagesListRequest.builder()).build())
    }


    fun conversationsArchive(req: ConversationsArchiveRequest): ConversationsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_ARCHIVE,
            getToken(req),
            ConversationsArchiveResponse::class.java
        )
    }


    fun conversationsArchive(req: RequestConfigurator<ConversationsArchiveRequest.ConversationsArchiveRequestBuilder?>): ConversationsArchiveResponse {
        return conversationsArchive(req.configure(ConversationsArchiveRequest.builder()).build())
    }


    fun conversationsClose(req: ConversationsCloseRequest): ConversationsCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_CLOSE,
            getToken(req),
            ConversationsCloseResponse::class.java
        )
    }


    fun conversationsClose(req: RequestConfigurator<ConversationsCloseRequest.ConversationsCloseRequestBuilder?>): ConversationsCloseResponse {
        return conversationsClose(req.configure(ConversationsCloseRequest.builder()).build())
    }


    fun conversationsCreate(req: ConversationsCreateRequest): ConversationsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_CREATE,
            getToken(req),
            ConversationsCreateResponse::class.java
        )
    }


    fun conversationsCreate(req: RequestConfigurator<ConversationsCreateRequest.ConversationsCreateRequestBuilder?>): ConversationsCreateResponse {
        return conversationsCreate(req.configure(ConversationsCreateRequest.builder()).build())
    }


    fun conversationsHistory(req: ConversationsHistoryRequest): ConversationsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_HISTORY,
            getToken(req),
            ConversationsHistoryResponse::class.java
        )
    }


    fun conversationsHistory(req: RequestConfigurator<ConversationsHistoryRequest.ConversationsHistoryRequestBuilder?>): ConversationsHistoryResponse {
        return conversationsHistory(req.configure(ConversationsHistoryRequest.builder()).build())
    }


    fun conversationsInfo(req: ConversationsInfoRequest): ConversationsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_INFO,
            getToken(req),
            ConversationsInfoResponse::class.java
        )
    }


    fun conversationsInfo(req: RequestConfigurator<ConversationsInfoRequest.ConversationsInfoRequestBuilder?>): ConversationsInfoResponse {
        return conversationsInfo(req.configure(ConversationsInfoRequest.builder()).build())
    }


    fun conversationsInvite(req: ConversationsInviteRequest): ConversationsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_INVITE,
            getToken(req),
            ConversationsInviteResponse::class.java
        )
    }


    fun conversationsInvite(req: RequestConfigurator<ConversationsInviteRequest.ConversationsInviteRequestBuilder?>): ConversationsInviteResponse {
        return conversationsInvite(req.configure(ConversationsInviteRequest.builder()).build())
    }


    fun conversationsJoin(req: ConversationsJoinRequest): ConversationsJoinResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_JOIN,
            getToken(req),
            ConversationsJoinResponse::class.java
        )
    }


    fun conversationsJoin(req: RequestConfigurator<ConversationsJoinRequest.ConversationsJoinRequestBuilder?>): ConversationsJoinResponse {
        return conversationsJoin(req.configure(ConversationsJoinRequest.builder()).build())
    }


    fun conversationsKick(req: ConversationsKickRequest): ConversationsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_KICK,
            getToken(req),
            ConversationsKickResponse::class.java
        )
    }


    fun conversationsKick(req: RequestConfigurator<ConversationsKickRequest.ConversationsKickRequestBuilder?>): ConversationsKickResponse {
        return conversationsKick(req.configure(ConversationsKickRequest.builder()).build())
    }


    fun conversationsLeave(req: ConversationsLeaveRequest): ConversationsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_LEAVE,
            getToken(req),
            ConversationsLeaveResponse::class.java
        )
    }


    fun conversationsLeave(req: RequestConfigurator<ConversationsLeaveRequest.ConversationsLeaveRequestBuilder?>): ConversationsLeaveResponse {
        return conversationsLeave(req.configure(ConversationsLeaveRequest.builder()).build())
    }


    fun conversationsList(req: ConversationsListRequest): ConversationsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_LIST,
            getToken(req),
            ConversationsListResponse::class.java
        )
    }


    fun conversationsList(req: RequestConfigurator<ConversationsListRequest.ConversationsListRequestBuilder?>): ConversationsListResponse {
        return conversationsList(req.configure(ConversationsListRequest.builder()).build())
    }


    fun conversationsMembers(req: ConversationsMembersRequest): ConversationsMembersResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_MEMBERS,
            getToken(req),
            ConversationsMembersResponse::class.java
        )
    }


    fun conversationsMembers(req: RequestConfigurator<ConversationsMembersRequest.ConversationsMembersRequestBuilder?>): ConversationsMembersResponse {
        return conversationsMembers(req.configure(ConversationsMembersRequest.builder()).build())
    }


    fun conversationsOpen(req: ConversationsOpenRequest): ConversationsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_OPEN,
            getToken(req),
            ConversationsOpenResponse::class.java
        )
    }


    fun conversationsOpen(req: RequestConfigurator<ConversationsOpenRequest.ConversationsOpenRequestBuilder?>): ConversationsOpenResponse {
        return conversationsOpen(req.configure(ConversationsOpenRequest.builder()).build())
    }


    fun conversationsRename(req: ConversationsRenameRequest): ConversationsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_RENAME,
            getToken(req),
            ConversationsRenameResponse::class.java
        )
    }


    fun conversationsRename(req: RequestConfigurator<ConversationsRenameRequest.ConversationsRenameRequestBuilder?>): ConversationsRenameResponse {
        return conversationsRename(req.configure(ConversationsRenameRequest.builder()).build())
    }


    fun conversationsReplies(req: ConversationsRepliesRequest): ConversationsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_REPLIES,
            getToken(req),
            ConversationsRepliesResponse::class.java
        )
    }


    fun conversationsReplies(req: RequestConfigurator<ConversationsRepliesRequest.ConversationsRepliesRequestBuilder?>): ConversationsRepliesResponse {
        return conversationsReplies(req.configure(ConversationsRepliesRequest.builder()).build())
    }


    fun conversationsSetPurpose(req: ConversationsSetPurposeRequest): ConversationsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_SET_PURPOSE,
            getToken(req),
            ConversationsSetPurposeResponse::class.java
        )
    }


    fun conversationsSetPurpose(req: RequestConfigurator<ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder?>): ConversationsSetPurposeResponse {
        return conversationsSetPurpose(req.configure(ConversationsSetPurposeRequest.builder()).build())
    }


    fun conversationsSetTopic(req: ConversationsSetTopicRequest): ConversationsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_SET_TOPIC,
            getToken(req),
            ConversationsSetTopicResponse::class.java
        )
    }


    fun conversationsSetTopic(req: RequestConfigurator<ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder?>): ConversationsSetTopicResponse {
        return conversationsSetTopic(req.configure(ConversationsSetTopicRequest.builder()).build())
    }


    fun conversationsUnarchive(req: ConversationsUnarchiveRequest): ConversationsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_UNARCHIVE,
            getToken(req),
            ConversationsUnarchiveResponse::class.java
        )
    }


    fun conversationsUnarchive(req: RequestConfigurator<ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder?>): ConversationsUnarchiveResponse {
        return conversationsUnarchive(req.configure(ConversationsUnarchiveRequest.builder()).build())
    }


    fun dialogOpen(req: DialogOpenRequest): DialogOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DIALOG_OPEN,
            getToken(req),
            DialogOpenResponse::class.java
        )
    }


    fun dialogOpen(req: RequestConfigurator<DialogOpenRequest.DialogOpenRequestBuilder?>): DialogOpenResponse {
        return dialogOpen(req.configure(DialogOpenRequest.builder()).build())
    }


    fun dndEndDnd(req: DndEndDndRequest): DndEndDndResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_END_DND,
            getToken(req),
            DndEndDndResponse::class.java
        )
    }


    fun dndEndDnd(req: RequestConfigurator<DndEndDndRequest.DndEndDndRequestBuilder?>): DndEndDndResponse {
        return dndEndDnd(req.configure(DndEndDndRequest.builder()).build())
    }


    fun dndEndSnooze(req: DndEndSnoozeRequest): DndEndSnoozeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_END_SNOOZE,
            getToken(req),
            DndEndSnoozeResponse::class.java
        )
    }


    fun dndEndSnooze(req: RequestConfigurator<DndEndSnoozeRequest.DndEndSnoozeRequestBuilder?>): DndEndSnoozeResponse {
        return dndEndSnooze(req.configure(DndEndSnoozeRequest.builder()).build())
    }


    fun dndInfo(req: DndInfoRequest): DndInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_INFO,
            getToken(req),
            DndInfoResponse::class.java
        )
    }


    fun dndInfo(req: RequestConfigurator<DndInfoRequest.DndInfoRequestBuilder?>): DndInfoResponse {
        return dndInfo(req.configure(DndInfoRequest.builder()).build())
    }


    fun dndSetSnooze(req: DndSetSnoozeRequest): DndSetSnoozeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_SET_SNOOZE,
            getToken(req),
            DndSetSnoozeResponse::class.java
        )
    }


    fun dndSetSnooze(req: RequestConfigurator<DndSetSnoozeRequest.DndSetSnoozeRequestBuilder?>): DndSetSnoozeResponse {
        return dndSetSnooze(req.configure(DndSetSnoozeRequest.builder()).build())
    }


    fun dndTeamInfo(req: DndTeamInfoRequest): DndTeamInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_TEAM_INFO,
            getToken(req),
            DndTeamInfoResponse::class.java
        )
    }


    fun dndTeamInfo(req: RequestConfigurator<DndTeamInfoRequest.DndTeamInfoRequestBuilder?>): DndTeamInfoResponse {
        return dndTeamInfo(req.configure(DndTeamInfoRequest.builder()).build())
    }


    fun emojiList(req: EmojiListRequest): EmojiListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.EMOJI_LIST,
            getToken(req),
            EmojiListResponse::class.java
        )
    }


    fun emojiList(req: RequestConfigurator<EmojiListRequest.EmojiListRequestBuilder?>): EmojiListResponse {
        return emojiList(req.configure(EmojiListRequest.builder()).build())
    }


    fun filesDelete(req: FilesDeleteRequest): FilesDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_DELETE,
            getToken(req),
            FilesDeleteResponse::class.java
        )
    }


    fun filesDelete(req: RequestConfigurator<FilesDeleteRequest.FilesDeleteRequestBuilder?>): FilesDeleteResponse {
        return filesDelete(req.configure(FilesDeleteRequest.builder()).build())
    }


    fun filesInfo(req: FilesInfoRequest): FilesInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_INFO,
            getToken(req),
            FilesInfoResponse::class.java
        )
    }


    fun filesInfo(req: RequestConfigurator<FilesInfoRequest.FilesInfoRequestBuilder?>): FilesInfoResponse {
        return filesInfo(req.configure(FilesInfoRequest.builder()).build())
    }


    fun filesList(req: FilesListRequest): FilesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_LIST,
            getToken(req),
            FilesListResponse::class.java
        )
    }


    fun filesList(req: RequestConfigurator<FilesListRequest.FilesListRequestBuilder?>): FilesListResponse {
        return filesList(req.configure(FilesListRequest.builder()).build())
    }


    fun filesRevokePublicURL(req: FilesRevokePublicURLRequest): FilesRevokePublicURLResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REVOKE_PUBLIC_URL,
            getToken(req),
            FilesRevokePublicURLResponse::class.java
        )
    }


    fun filesRevokePublicURL(req: RequestConfigurator<FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder?>): FilesRevokePublicURLResponse {
        return filesRevokePublicURL(req.configure(FilesRevokePublicURLRequest.builder()).build())
    }


    fun filesSharedPublicURL(req: FilesSharedPublicURLRequest): FilesSharedPublicURLResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_SHARED_PUBLIC_URL,
            getToken(req),
            FilesSharedPublicURLResponse::class.java
        )
    }


    fun filesSharedPublicURL(req: RequestConfigurator<FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder?>): FilesSharedPublicURLResponse {
        return filesSharedPublicURL(req.configure(FilesSharedPublicURLRequest.builder()).build())
    }


    fun filesUpload(req: FilesUploadRequest): FilesUploadResponse {
        return if (req.getFile() != null || req.getFilestream() != null) {
            postMultipartAndParseResponse(
                toMultipartBody(req),
                Methods.FILES_UPLOAD,
                getToken(req),
                FilesUploadResponse::class.java
            )
        } else {
            postFormWithTokenAndParseResponse(
                toForm(req),
                Methods.FILES_UPLOAD,
                getToken(req),
                FilesUploadResponse::class.java
            )
        }
    }


    fun filesUpload(req: RequestConfigurator<FilesUploadRequest.FilesUploadRequestBuilder?>): FilesUploadResponse {
        return filesUpload(req.configure(FilesUploadRequest.builder()).build())
    }


    fun filesCommentsAdd(req: FilesCommentsAddRequest): FilesCommentsAddResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_COMMENTS_ADD,
            getToken(req),
            FilesCommentsAddResponse::class.java
        )
    }


    fun filesCommentsDelete(req: FilesCommentsDeleteRequest): FilesCommentsDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_COMMENTS_DELETE,
            getToken(req),
            FilesCommentsDeleteResponse::class.java
        )
    }


    fun filesCommentEdit(req: FilesCommentsEditRequest): FilesCommentsEditResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_COMMENTS_EDIT,
            getToken(req),
            FilesCommentsEditResponse::class.java
        )
    }


    fun filesRemoteAdd(req: FilesRemoteAddRequest?): FilesRemoteAddResponse {
//        return postMultipartAndParseResponse(RequestFormBuilder.toMultipartBody(req), Methods.FILES_REMOTE_ADD, getToken(req), FilesRemoteAddResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }


    fun filesRemoteAdd(req: RequestConfigurator<FilesRemoteAddRequest.FilesRemoteAddRequestBuilder?>): FilesRemoteAddResponse {
        return filesRemoteAdd(req.configure(FilesRemoteAddRequest.builder()).build())
    }


    fun filesRemoteInfo(req: FilesRemoteInfoRequest): FilesRemoteInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_INFO,
            getToken(req),
            FilesRemoteInfoResponse::class.java
        )
    }


    fun filesRemoteInfo(req: RequestConfigurator<FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder?>): FilesRemoteInfoResponse {
        return filesRemoteInfo(req.configure(FilesRemoteInfoRequest.builder()).build())
    }


    fun filesRemoteList(req: FilesRemoteListRequest): FilesRemoteListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_LIST,
            getToken(req),
            FilesRemoteListResponse::class.java
        )
    }


    fun filesRemoteList(req: RequestConfigurator<FilesRemoteListRequest.FilesRemoteListRequestBuilder?>): FilesRemoteListResponse {
        return filesRemoteList(req.configure(FilesRemoteListRequest.builder()).build())
    }


    fun filesRemoteRemove(req: FilesRemoteRemoveRequest): FilesRemoteRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_REMOVE,
            getToken(req),
            FilesRemoteRemoveResponse::class.java
        )
    }


    fun filesRemoteRemove(req: RequestConfigurator<FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder?>): FilesRemoteRemoveResponse {
        return filesRemoteRemove(req.configure(FilesRemoteRemoveRequest.builder()).build())
    }


    fun filesRemoteShare(req: FilesRemoteShareRequest): FilesRemoteShareResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_SHARE,
            getToken(req),
            FilesRemoteShareResponse::class.java
        )
    }


    fun filesRemoteShare(req: RequestConfigurator<FilesRemoteShareRequest.FilesRemoteShareRequestBuilder?>): FilesRemoteShareResponse {
        return filesRemoteShare(req.configure(FilesRemoteShareRequest.builder()).build())
    }


    fun filesRemoteUpdate(req: FilesRemoteUpdateRequest?): FilesRemoteUpdateResponse {
//        return postMultipartAndParseResponse(toMultipartBody(req), Methods.FILES_REMOTE_UPDATE, getToken(req), FilesRemoteUpdateResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }


    fun filesRemoteUpdate(req: RequestConfigurator<FilesRemoteUpdateRequest.FilesRemoteUpdateRequestBuilder?>): FilesRemoteUpdateResponse {
        return filesRemoteUpdate(req.configure(FilesRemoteUpdateRequest.builder()).build())
    }


    fun groupsArchive(req: GroupsArchiveRequest): GroupsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_ARCHIVE,
            getToken(req),
            GroupsArchiveResponse::class.java
        )
    }


    fun groupsArchive(req: RequestConfigurator<GroupsArchiveRequest.GroupsArchiveRequestBuilder?>): GroupsArchiveResponse {
        return groupsArchive(req.configure(GroupsArchiveRequest.builder()).build())
    }


    fun groupsClose(req: GroupsCloseRequest): GroupsCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_CLOSE,
            getToken(req),
            GroupsCloseResponse::class.java
        )
    }


    fun groupsCreateChild(req: GroupsCreateChildRequest): GroupsCreateChildResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_CREATE_CHILD,
            getToken(req),
            GroupsCreateChildResponse::class.java
        )
    }


    fun groupsCreateChild(req: RequestConfigurator<GroupsCreateChildRequest.GroupsCreateChildRequestBuilder?>): GroupsCreateChildResponse {
        return groupsCreateChild(req.configure(GroupsCreateChildRequest.builder()).build())
    }


    fun groupsCreate(req: GroupsCreateRequest): GroupsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_CREATE,
            getToken(req),
            GroupsCreateResponse::class.java
        )
    }


    fun groupsCreate(req: RequestConfigurator<GroupsCreateRequest.GroupsCreateRequestBuilder?>): GroupsCreateResponse {
        return groupsCreate(req.configure(GroupsCreateRequest.builder()).build())
    }


    fun groupsHistory(req: GroupsHistoryRequest): GroupsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_HISTORY,
            getToken(req),
            GroupsHistoryResponse::class.java
        )
    }


    fun groupsHistory(req: RequestConfigurator<GroupsHistoryRequest.GroupsHistoryRequestBuilder?>): GroupsHistoryResponse {
        return groupsHistory(req.configure(GroupsHistoryRequest.builder()).build())
    }


    fun groupsReplies(req: GroupsRepliesRequest): GroupsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_REPLIES,
            getToken(req),
            GroupsRepliesResponse::class.java
        )
    }


    fun groupsReplies(req: RequestConfigurator<GroupsRepliesRequest.GroupsRepliesRequestBuilder?>): GroupsRepliesResponse {
        return groupsReplies(req.configure(GroupsRepliesRequest.builder()).build())
    }


    fun groupsInfo(req: GroupsInfoRequest): GroupsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_INFO,
            getToken(req),
            GroupsInfoResponse::class.java
        )
    }


    fun groupsInfo(req: RequestConfigurator<GroupsInfoRequest.GroupsInfoRequestBuilder?>): GroupsInfoResponse {
        return groupsInfo(req.configure(GroupsInfoRequest.builder()).build())
    }


    fun groupsInvite(req: GroupsInviteRequest): GroupsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_INVITE,
            getToken(req),
            GroupsInviteResponse::class.java
        )
    }


    fun groupsInvite(req: RequestConfigurator<GroupsInviteRequest.GroupsInviteRequestBuilder?>): GroupsInviteResponse {
        return groupsInvite(req.configure(GroupsInviteRequest.builder()).build())
    }


    fun groupsKick(req: GroupsKickRequest): GroupsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_KICK,
            getToken(req),
            GroupsKickResponse::class.java
        )
    }


    fun groupsKick(req: RequestConfigurator<GroupsKickRequest.GroupsKickRequestBuilder?>): GroupsKickResponse {
        return groupsKick(req.configure(GroupsKickRequest.builder()).build())
    }


    fun groupsLeave(req: GroupsLeaveRequest): GroupsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_LEAVE,
            getToken(req),
            GroupsLeaveResponse::class.java
        )
    }


    fun groupsLeave(req: RequestConfigurator<GroupsLeaveRequest.GroupsLeaveRequestBuilder?>): GroupsLeaveResponse {
        return groupsLeave(req.configure(GroupsLeaveRequest.builder()).build())
    }


    fun groupsList(req: GroupsListRequest): GroupsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_LIST,
            getToken(req),
            GroupsListResponse::class.java
        )
    }


    fun groupsList(req: RequestConfigurator<GroupsListRequest.GroupsListRequestBuilder?>): GroupsListResponse {
        return groupsList(req.configure(GroupsListRequest.builder()).build())
    }


    fun groupsMark(req: GroupsMarkRequest): GroupsMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_MARK,
            getToken(req),
            GroupsMarkResponse::class.java
        )
    }


    fun groupsMark(req: RequestConfigurator<GroupsMarkRequest.GroupsMarkRequestBuilder?>): GroupsMarkResponse {
        return groupsMark(req.configure(GroupsMarkRequest.builder()).build())
    }


    fun groupsOpen(req: GroupsOpenRequest): GroupsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_OPEN,
            getToken(req),
            GroupsOpenResponse::class.java
        )
    }


    fun groupsOpen(req: RequestConfigurator<GroupsOpenRequest.GroupsOpenRequestBuilder?>): GroupsOpenResponse {
        return groupsOpen(req.configure(GroupsOpenRequest.builder()).build())
    }


    fun groupsRename(req: GroupsRenameRequest): GroupsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_RENAME,
            getToken(req),
            GroupsRenameResponse::class.java
        )
    }


    fun groupsRename(req: RequestConfigurator<GroupsRenameRequest.GroupsRenameRequestBuilder?>): GroupsRenameResponse {
        return groupsRename(req.configure(GroupsRenameRequest.builder()).build())
    }


    fun groupsSetPurpose(req: GroupsSetPurposeRequest): GroupsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_SET_PURPOSE,
            getToken(req),
            GroupsSetPurposeResponse::class.java
        )
    }


    fun groupsSetPurpose(req: RequestConfigurator<GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder?>): GroupsSetPurposeResponse {
        return groupsSetPurpose(req.configure(GroupsSetPurposeRequest.builder()).build())
    }


    fun groupsSetTopic(req: GroupsSetTopicRequest): GroupsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_SET_TOPIC,
            getToken(req),
            GroupsSetTopicResponse::class.java
        )
    }


    fun groupsSetTopic(req: RequestConfigurator<GroupsSetTopicRequest.GroupsSetTopicRequestBuilder?>): GroupsSetTopicResponse {
        return groupsSetTopic(req.configure(GroupsSetTopicRequest.builder()).build())
    }


    fun groupsUnarchive(req: GroupsUnarchiveRequest): GroupsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_UNARCHIVE,
            getToken(req),
            GroupsUnarchiveResponse::class.java
        )
    }


    fun groupsUnarchive(req: RequestConfigurator<GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder?>): GroupsUnarchiveResponse {
        return groupsUnarchive(req.configure(GroupsUnarchiveRequest.builder()).build())
    }


    fun imClose(req: ImCloseRequest): ImCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_CLOSE,
            getToken(req),
            ImCloseResponse::class.java
        )
    }


    fun imClose(req: RequestConfigurator<ImCloseRequest.ImCloseRequestBuilder?>): ImCloseResponse {
        return imClose(req.configure(ImCloseRequest.builder()).build())
    }


    fun imHistory(req: ImHistoryRequest): ImHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_HISTORY,
            getToken(req),
            ImHistoryResponse::class.java
        )
    }


    fun imHistory(req: RequestConfigurator<ImHistoryRequest.ImHistoryRequestBuilder?>): ImHistoryResponse {
        return imHistory(req.configure(ImHistoryRequest.builder()).build())
    }


    fun imList(req: ImListRequest): ImListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_LIST,
            getToken(req),
            ImListResponse::class.java
        )
    }


    fun imList(req: RequestConfigurator<ImListRequest.ImListRequestBuilder?>): ImListResponse {
        return imList(req.configure(ImListRequest.builder()).build())
    }


    fun imMark(req: ImMarkRequest): ImMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_MARK,
            getToken(req),
            ImMarkResponse::class.java
        )
    }


    fun imMark(req: RequestConfigurator<ImMarkRequest.ImMarkRequestBuilder?>): ImMarkResponse {
        return imMark(req.configure(ImMarkRequest.builder()).build())
    }


    fun imOpen(req: ImOpenRequest): ImOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_OPEN,
            getToken(req),
            ImOpenResponse::class.java
        )
    }


    fun imOpen(req: RequestConfigurator<ImOpenRequest.ImOpenRequestBuilder?>): ImOpenResponse {
        return imOpen(req.configure(ImOpenRequest.builder()).build())
    }


    fun imReplies(req: ImRepliesRequest): ImRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_REPLIES,
            getToken(req),
            ImRepliesResponse::class.java
        )
    }


    fun imReplies(req: RequestConfigurator<ImRepliesRequest.ImRepliesRequestBuilder?>): ImRepliesResponse {
        return imReplies(req.configure(ImRepliesRequest.builder()).build())
    }


    fun migrationExchange(req: MigrationExchangeRequest): MigrationExchangeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MIGRATION_EXCHANGE,
            getToken(req),
            MigrationExchangeResponse::class.java
        )
    }


    fun migrationExchange(req: RequestConfigurator<MigrationExchangeRequest.MigrationExchangeRequestBuilder?>): MigrationExchangeResponse {
        return migrationExchange(req.configure(MigrationExchangeRequest.builder()).build())
    }


    fun mpimClose(req: MpimCloseRequest): MpimCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_CLOSE,
            getToken(req),
            MpimCloseResponse::class.java
        )
    }


    fun mpimClose(req: RequestConfigurator<MpimCloseRequest.MpimCloseRequestBuilder?>): MpimCloseResponse {
        return mpimClose(req.configure(MpimCloseRequest.builder()).build())
    }


    fun mpimHistory(req: MpimHistoryRequest): MpimHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_HISTORY,
            getToken(req),
            MpimHistoryResponse::class.java
        )
    }


    fun mpimHistory(req: RequestConfigurator<MpimHistoryRequest.MpimHistoryRequestBuilder?>): MpimHistoryResponse {
        return mpimHistory(req.configure(MpimHistoryRequest.builder()).build())
    }


    fun mpimList(req: MpimListRequest): MpimListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_LIST,
            getToken(req),
            MpimListResponse::class.java
        )
    }


    fun mpimList(req: RequestConfigurator<MpimListRequest.MpimListRequestBuilder?>): MpimListResponse {
        return mpimList(req.configure(MpimListRequest.builder()).build())
    }


    fun mpimReplies(req: MpimRepliesRequest): MpimRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_REPLIES,
            getToken(req),
            MpimRepliesResponse::class.java
        )
    }


    fun mpimReplies(req: RequestConfigurator<MpimRepliesRequest.MpimRepliesRequestBuilder?>): MpimRepliesResponse {
        return mpimReplies(req.configure(MpimRepliesRequest.builder()).build())
    }


    fun mpimMark(req: MpimMarkRequest): MpimMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_MARK,
            getToken(req),
            MpimMarkResponse::class.java
        )
    }


    fun mpimMark(req: RequestConfigurator<MpimMarkRequest.MpimMarkRequestBuilder?>): MpimMarkResponse {
        return mpimMark(req.configure(MpimMarkRequest.builder()).build())
    }


    fun mpimOpen(req: MpimOpenRequest): MpimOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.MPIM_OPEN,
            getToken(req),
            MpimOpenResponse::class.java
        )
    }


    fun mpimOpen(req: RequestConfigurator<MpimOpenRequest.MpimOpenRequestBuilder?>): MpimOpenResponse {
        return mpimOpen(req.configure(MpimOpenRequest.builder()).build())
    }


    fun oauthAccess(req: OAuthAccessRequest?): OAuthAccessResponse {
        return postFormAndParseResponse(toForm(req), Methods.OAUTH_ACCESS, OAuthAccessResponse::class.java)
    }


    fun oauthAccess(req: RequestConfigurator<OAuthAccessRequest.OAuthAccessRequestBuilder?>): OAuthAccessResponse {
        return oauthAccess(req.configure(OAuthAccessRequest.builder()).build())
    }


    fun oauthV2Access(req: OAuthV2AccessRequest?): OAuthV2AccessResponse {
//        FormBody.Builder form = new FormBody.Builder();
//        form.add("code", req.getCode());
//        form.add("redirect_uri", req.getRedirectUri());
//        String authorizationHeader = Credentials.basic(req.getClientId(), req.getClientSecret());
//        return postFormWithAuthorizationHeaderAndParseResponse(form, endpointUrlPrefix + Methods.OAUTH_V2_ACCESS, authorizationHeader, OAuthV2AccessResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }


    fun oauthV2Access(req: RequestConfigurator<OAuthV2AccessRequest.OAuthV2AccessRequestBuilder?>): OAuthV2AccessResponse {
        return oauthV2Access(req.configure(OAuthV2AccessRequest.builder()).build())
    }


    fun oauthToken(req: OAuthTokenRequest?): OAuthTokenResponse {
        return postFormAndParseResponse(toForm(req), Methods.OAUTH_TOKEN, OAuthTokenResponse::class.java)
    }


    fun oauthToken(req: RequestConfigurator<OAuthTokenRequest.OAuthTokenRequestBuilder?>): OAuthTokenResponse {
        return oauthToken(req.configure(OAuthTokenRequest.builder()).build())
    }


    fun pinsAdd(req: PinsAddRequest): PinsAddResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.PINS_ADD,
            getToken(req),
            PinsAddResponse::class.java
        )
    }


    fun pinsAdd(req: RequestConfigurator<PinsAddRequest.PinsAddRequestBuilder?>): PinsAddResponse {
        return pinsAdd(req.configure(PinsAddRequest.builder()).build())
    }


    fun pinsList(req: PinsListRequest): PinsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.PINS_LIST,
            getToken(req),
            PinsListResponse::class.java
        )
    }


    fun pinsList(req: RequestConfigurator<PinsListRequest.PinsListRequestBuilder?>): PinsListResponse {
        return pinsList(req.configure(PinsListRequest.builder()).build())
    }


    fun pinsRemove(req: PinsRemoveRequest): PinsRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.PINS_REMOVE,
            getToken(req),
            PinsRemoveResponse::class.java
        )
    }


    fun pinsRemove(req: RequestConfigurator<PinsRemoveRequest.PinsRemoveRequestBuilder?>): PinsRemoveResponse {
        return pinsRemove(req.configure(PinsRemoveRequest.builder()).build())
    }


    fun reactionsAdd(req: ReactionsAddRequest): ReactionsAddResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REACTIONS_ADD,
            getToken(req),
            ReactionsAddResponse::class.java
        )
    }


    fun reactionsAdd(req: RequestConfigurator<ReactionsAddRequest.ReactionsAddRequestBuilder?>): ReactionsAddResponse {
        return reactionsAdd(req.configure(ReactionsAddRequest.builder()).build())
    }


    fun reactionsGet(req: ReactionsGetRequest): ReactionsGetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REACTIONS_GET,
            getToken(req),
            ReactionsGetResponse::class.java
        )
    }


    fun reactionsGet(req: RequestConfigurator<ReactionsGetRequest.ReactionsGetRequestBuilder?>): ReactionsGetResponse {
        return reactionsGet(req.configure(ReactionsGetRequest.builder()).build())
    }


    fun reactionsList(req: ReactionsListRequest): ReactionsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REACTIONS_LIST,
            getToken(req),
            ReactionsListResponse::class.java
        )
    }


    fun reactionsList(req: RequestConfigurator<ReactionsListRequest.ReactionsListRequestBuilder?>): ReactionsListResponse {
        return reactionsList(req.configure(ReactionsListRequest.builder()).build())
    }


    fun reactionsRemove(req: ReactionsRemoveRequest): ReactionsRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REACTIONS_REMOVE,
            getToken(req),
            ReactionsRemoveResponse::class.java
        )
    }


    fun reactionsRemove(req: RequestConfigurator<ReactionsRemoveRequest.ReactionsRemoveRequestBuilder?>): ReactionsRemoveResponse {
        return reactionsRemove(req.configure(ReactionsRemoveRequest.builder()).build())
    }


    fun remindersAdd(req: RemindersAddRequest): RemindersAddResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REMINDERS_ADD,
            getToken(req),
            RemindersAddResponse::class.java
        )
    }


    fun remindersAdd(req: RequestConfigurator<RemindersAddRequest.RemindersAddRequestBuilder?>): RemindersAddResponse {
        return remindersAdd(req.configure(RemindersAddRequest.builder()).build())
    }


    fun remindersComplete(req: RemindersCompleteRequest): RemindersCompleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REMINDERS_COMPLETE,
            getToken(req),
            RemindersCompleteResponse::class.java
        )
    }


    fun remindersComplete(req: RequestConfigurator<RemindersCompleteRequest.RemindersCompleteRequestBuilder?>): RemindersCompleteResponse {
        return remindersComplete(req.configure(RemindersCompleteRequest.builder()).build())
    }


    fun remindersDelete(req: RemindersDeleteRequest): RemindersDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REMINDERS_DELETE,
            getToken(req),
            RemindersDeleteResponse::class.java
        )
    }


    fun remindersDelete(req: RequestConfigurator<RemindersDeleteRequest.RemindersDeleteRequestBuilder?>): RemindersDeleteResponse {
        return remindersDelete(req.configure(RemindersDeleteRequest.builder()).build())
    }


    fun remindersInfo(req: RemindersInfoRequest): RemindersInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REMINDERS_INFO,
            getToken(req),
            RemindersInfoResponse::class.java
        )
    }


    fun remindersInfo(req: RequestConfigurator<RemindersInfoRequest.RemindersInfoRequestBuilder?>): RemindersInfoResponse {
        return remindersInfo(req.configure(RemindersInfoRequest.builder()).build())
    }


    fun remindersList(req: RemindersListRequest): RemindersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.REMINDERS_LIST,
            getToken(req),
            RemindersListResponse::class.java
        )
    }


    fun remindersList(req: RequestConfigurator<RemindersListRequest.RemindersListRequestBuilder?>): RemindersListResponse {
        return remindersList(req.configure(RemindersListRequest.builder()).build())
    }


    fun rtmConnect(req: RTMConnectRequest): RTMConnectResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.RTM_CONNECT,
            getToken(req),
            RTMConnectResponse::class.java
        )
    }


    fun rtmConnect(req: RequestConfigurator<RTMConnectRequest.RTMConnectRequestBuilder?>): RTMConnectResponse {
        return rtmConnect(req.configure(RTMConnectRequest.builder()).build())
    }


    fun rtmStart(req: RTMStartRequest): RTMStartResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.RTM_START,
            getToken(req),
            RTMStartResponse::class.java
        )
    }


    fun rtmStart(req: RequestConfigurator<RTMStartRequest.RTMStartRequestBuilder?>): RTMStartResponse {
        return rtmStart(req.configure(RTMStartRequest.builder()).build())
    }


    fun searchAll(req: SearchAllRequest): SearchAllResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.SEARCH_ALL,
            getToken(req),
            SearchAllResponse::class.java
        )
    }


    fun searchAll(req: RequestConfigurator<SearchAllRequest.SearchAllRequestBuilder?>): SearchAllResponse {
        return searchAll(req.configure(SearchAllRequest.builder()).build())
    }


    fun searchMessages(req: SearchMessagesRequest): SearchMessagesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.SEARCH_MESSAGES,
            getToken(req),
            SearchMessagesResponse::class.java
        )
    }


    fun searchMessages(req: RequestConfigurator<SearchMessagesRequest.SearchMessagesRequestBuilder?>): SearchMessagesResponse {
        return searchMessages(req.configure(SearchMessagesRequest.builder()).build())
    }


    fun searchFiles(req: SearchFilesRequest): SearchFilesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.SEARCH_FILES,
            getToken(req),
            SearchFilesResponse::class.java
        )
    }


    fun searchFiles(req: RequestConfigurator<SearchFilesRequest.SearchFilesRequestBuilder?>): SearchFilesResponse {
        return searchFiles(req.configure(SearchFilesRequest.builder()).build())
    }


    fun starsAdd(req: StarsAddRequest): StarsAddResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.STARS_ADD,
            getToken(req),
            StarsAddResponse::class.java
        )
    }


    fun starsAdd(req: RequestConfigurator<StarsAddRequest.StarsAddRequestBuilder?>): StarsAddResponse {
        return starsAdd(req.configure(StarsAddRequest.builder()).build())
    }


    fun starsList(req: StarsListRequest): StarsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.STARS_LIST,
            getToken(req),
            StarsListResponse::class.java
        )
    }


    fun starsList(req: RequestConfigurator<StarsListRequest.StarsListRequestBuilder?>): StarsListResponse {
        return starsList(req.configure(StarsListRequest.builder()).build())
    }


    fun starsRemove(req: StarsRemoveRequest): StarsRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.STARS_REMOVE,
            getToken(req),
            StarsRemoveResponse::class.java
        )
    }


    fun starsRemove(req: RequestConfigurator<StarsRemoveRequest.StarsRemoveRequestBuilder?>): StarsRemoveResponse {
        return starsRemove(req.configure(StarsRemoveRequest.builder()).build())
    }


    fun teamAccessLogs(req: TeamAccessLogsRequest): TeamAccessLogsResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.TEAM_ACCESS_LOGS,
            getToken(req),
            TeamAccessLogsResponse::class.java
        )
    }


    fun teamAccessLogs(req: RequestConfigurator<TeamAccessLogsRequest.TeamAccessLogsRequestBuilder?>): TeamAccessLogsResponse {
        return teamAccessLogs(req.configure(TeamAccessLogsRequest.builder()).build())
    }


    fun teamBillableInfo(req: TeamBillableInfoRequest): TeamBillableInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.TEAM_BILLABLE_INFO,
            getToken(req),
            TeamBillableInfoResponse::class.java
        )
    }


    fun teamBillableInfo(req: RequestConfigurator<TeamBillableInfoRequest.TeamBillableInfoRequestBuilder?>): TeamBillableInfoResponse {
        return teamBillableInfo(req.configure(TeamBillableInfoRequest.builder()).build())
    }


    fun teamInfo(req: TeamInfoRequest): TeamInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.TEAM_INFO,
            getToken(req),
            TeamInfoResponse::class.java
        )
    }


    fun teamInfo(req: RequestConfigurator<TeamInfoRequest.TeamInfoRequestBuilder?>): TeamInfoResponse {
        return teamInfo(req.configure(TeamInfoRequest.builder()).build())
    }


    fun teamIntegrationLogs(req: TeamIntegrationLogsRequest): TeamIntegrationLogsResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.TEAM_INTEGRATION_LOGS,
            getToken(req),
            TeamIntegrationLogsResponse::class.java
        )
    }


    fun teamIntegrationLogs(req: RequestConfigurator<TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder?>): TeamIntegrationLogsResponse {
        return teamIntegrationLogs(req.configure(TeamIntegrationLogsRequest.builder()).build())
    }


    fun teamProfileGet(req: TeamProfileGetRequest): TeamProfileGetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.TEAM_PROFILE_GET,
            getToken(req),
            TeamProfileGetResponse::class.java
        )
    }


    fun teamProfileGet(req: RequestConfigurator<TeamProfileGetRequest.TeamProfileGetRequestBuilder?>): TeamProfileGetResponse {
        return teamProfileGet(req.configure(TeamProfileGetRequest.builder()).build())
    }


    fun usergroupsCreate(req: UsergroupsCreateRequest): UsergroupsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_CREATE,
            getToken(req),
            UsergroupsCreateResponse::class.java
        )
    }


    fun usergroupsCreate(req: RequestConfigurator<UsergroupsCreateRequest.UsergroupsCreateRequestBuilder?>): UsergroupsCreateResponse {
        return usergroupsCreate(req.configure(UsergroupsCreateRequest.builder()).build())
    }


    fun usergroupsDisable(req: UsergroupsDisableRequest): UsergroupsDisableResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_DISABLE,
            getToken(req),
            UsergroupsDisableResponse::class.java
        )
    }


    fun usergroupsDisable(req: RequestConfigurator<UsergroupsDisableRequest.UsergroupsDisableRequestBuilder?>): UsergroupsDisableResponse {
        return usergroupsDisable(req.configure(UsergroupsDisableRequest.builder()).build())
    }


    fun usergroupsEnable(req: UsergroupsEnableRequest): UsergroupsEnableResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_ENABLE,
            getToken(req),
            UsergroupsEnableResponse::class.java
        )
    }


    fun usergroupsEnable(req: RequestConfigurator<UsergroupsEnableRequest.UsergroupsEnableRequestBuilder?>): UsergroupsEnableResponse {
        return usergroupsEnable(req.configure(UsergroupsEnableRequest.builder()).build())
    }


    fun usergroupsList(req: UsergroupsListRequest): UsergroupsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_LIST,
            getToken(req),
            UsergroupsListResponse::class.java
        )
    }


    fun usergroupsList(req: RequestConfigurator<UsergroupsListRequest.UsergroupsListRequestBuilder?>): UsergroupsListResponse {
        return usergroupsList(req.configure(UsergroupsListRequest.builder()).build())
    }


    fun usergroupsUpdate(req: UsergroupsUpdateRequest): UsergroupsUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_UPDATE,
            getToken(req),
            UsergroupsUpdateResponse::class.java
        )
    }


    fun usergroupsUpdate(req: RequestConfigurator<UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder?>): UsergroupsUpdateResponse {
        return usergroupsUpdate(req.configure(UsergroupsUpdateRequest.builder()).build())
    }


    fun usergroupUsersList(req: UsergroupUsersListRequest): UsergroupUsersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_USERS_LIST,
            getToken(req),
            UsergroupUsersListResponse::class.java
        )
    }


    fun usergroupUsersList(req: RequestConfigurator<UsergroupUsersListRequest.UsergroupUsersListRequestBuilder?>): UsergroupUsersListResponse {
        return usergroupUsersList(req.configure(UsergroupUsersListRequest.builder()).build())
    }


    fun usergroupUsersUpdate(req: UsergroupUsersUpdateRequest): UsergroupUsersUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERGROUPS_USERS_UPDATE,
            getToken(req),
            UsergroupUsersUpdateResponse::class.java
        )
    }


    fun usergroupUsersUpdate(req: RequestConfigurator<UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder?>): UsergroupUsersUpdateResponse {
        return usergroupUsersUpdate(req.configure(UsergroupUsersUpdateRequest.builder()).build())
    }


    fun usersConversations(req: UsersConversationsRequest): UsersConversationsResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_CONVERSATIONS,
            getToken(req),
            UsersConversationsResponse::class.java
        )
    }


    fun usersConversations(req: RequestConfigurator<UsersConversationsRequest.UsersConversationsRequestBuilder?>): UsersConversationsResponse {
        return usersConversations(req.configure(UsersConversationsRequest.builder()).build())
    }


    fun usersDeletePhoto(req: UsersDeletePhotoRequest): UsersDeletePhotoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_DELETE_PHOTO,
            getToken(req),
            UsersDeletePhotoResponse::class.java
        )
    }


    fun usersDeletePhoto(req: RequestConfigurator<UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder?>): UsersDeletePhotoResponse {
        return usersDeletePhoto(req.configure(UsersDeletePhotoRequest.builder()).build())
    }


    fun usersGetPresence(req: UsersGetPresenceRequest): UsersGetPresenceResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_GET_PRESENCE,
            getToken(req),
            UsersGetPresenceResponse::class.java
        )
    }


    fun usersGetPresence(req: RequestConfigurator<UsersGetPresenceRequest.UsersGetPresenceRequestBuilder?>): UsersGetPresenceResponse {
        return usersGetPresence(req.configure(UsersGetPresenceRequest.builder()).build())
    }


    fun usersIdentity(req: UsersIdentityRequest): UsersIdentityResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_IDENTITY,
            getToken(req),
            UsersIdentityResponse::class.java
        )
    }


    fun usersIdentity(req: RequestConfigurator<UsersIdentityRequest.UsersIdentityRequestBuilder?>): UsersIdentityResponse {
        return usersIdentity(req.configure(UsersIdentityRequest.builder()).build())
    }


    fun usersInfo(req: UsersInfoRequest): UsersInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_INFO,
            getToken(req),
            UsersInfoResponse::class.java
        )
    }


    fun usersInfo(req: RequestConfigurator<UsersInfoRequest.UsersInfoRequestBuilder?>): UsersInfoResponse {
        return usersInfo(req.configure(UsersInfoRequest.builder()).build())
    }


    fun usersList(req: UsersListRequest): UsersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_LIST,
            getToken(req),
            UsersListResponse::class.java
        )
    }


    fun usersList(req: RequestConfigurator<UsersListRequest.UsersListRequestBuilder?>): UsersListResponse {
        return usersList(req.configure(UsersListRequest.builder()).build())
    }


    fun usersLookupByEmail(req: UsersLookupByEmailRequest): UsersLookupByEmailResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_LOOKUP_BY_EMAIL,
            getToken(req),
            UsersLookupByEmailResponse::class.java
        )
    }


    fun usersLookupByEmail(req: RequestConfigurator<UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder?>): UsersLookupByEmailResponse {
        return usersLookupByEmail(req.configure(UsersLookupByEmailRequest.builder()).build())
    }


    fun usersSetActive(req: UsersSetActiveRequest): UsersSetActiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_SET_ACTIVE,
            getToken(req),
            UsersSetActiveResponse::class.java
        )
    }


    fun usersSetActive(req: RequestConfigurator<UsersSetActiveRequest.UsersSetActiveRequestBuilder?>): UsersSetActiveResponse {
        return usersSetActive(req.configure(UsersSetActiveRequest.builder()).build())
    }


    fun usersSetPhoto(req: UsersSetPhotoRequest?): UsersSetPhotoResponse {
        // return postMultipartAndParseResponse(toMultipartBody(req), Methods.USERS_SET_PHOTO, getToken(req), UsersSetPhotoResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }


    fun usersSetPhoto(req: RequestConfigurator<UsersSetPhotoRequest.UsersSetPhotoRequestBuilder?>): UsersSetPhotoResponse {
        return usersSetPhoto(req.configure(UsersSetPhotoRequest.builder()).build())
    }


    fun usersSetPresence(req: UsersSetPresenceRequest): UsersSetPresenceResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_SET_PRESENCE,
            getToken(req),
            UsersSetPresenceResponse::class.java
        )
    }


    fun usersSetPresence(req: RequestConfigurator<UsersSetPresenceRequest.UsersSetPresenceRequestBuilder?>): UsersSetPresenceResponse {
        return usersSetPresence(req.configure(UsersSetPresenceRequest.builder()).build())
    }


    fun usersProfileGet(req: UsersProfileGetRequest): UsersProfileGetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_PROFILE_GET,
            getToken(req),
            UsersProfileGetResponse::class.java
        )
    }


    fun usersProfileGet(req: RequestConfigurator<UsersProfileGetRequest.UsersProfileGetRequestBuilder?>): UsersProfileGetResponse {
        return usersProfileGet(req.configure(UsersProfileGetRequest.builder()).build())
    }


    fun usersProfileSet(req: UsersProfileSetRequest): UsersProfileSetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_PROFILE_SET,
            getToken(req),
            UsersProfileSetResponse::class.java
        )
    }


    fun usersProfileSet(req: RequestConfigurator<UsersProfileSetRequest.UsersProfileSetRequestBuilder?>): UsersProfileSetResponse {
        return usersProfileSet(req.configure(UsersProfileSetRequest.builder()).build())
    }


    fun viewsOpen(req: ViewsOpenRequest): ViewsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_OPEN,
            getToken(req),
            ViewsOpenResponse::class.java
        )
    }


    fun viewsOpen(req: RequestConfigurator<ViewsOpenRequest.ViewsOpenRequestBuilder?>): ViewsOpenResponse {
        return viewsOpen(req.configure(ViewsOpenRequest.builder()).build())
    }


    fun viewsPush(req: ViewsPushRequest): ViewsPushResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_PUSH,
            getToken(req),
            ViewsPushResponse::class.java
        )
    }


    fun viewsPush(req: RequestConfigurator<ViewsPushRequest.ViewsPushRequestBuilder?>): ViewsPushResponse {
        return viewsPush(req.configure(ViewsPushRequest.builder()).build())
    }


    fun viewsUpdate(req: ViewsUpdateRequest): ViewsUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_UPDATE,
            getToken(req),
            ViewsUpdateResponse::class.java
        )
    }


    fun viewsUpdate(req: RequestConfigurator<ViewsUpdateRequest.ViewsUpdateRequestBuilder?>): ViewsUpdateResponse {
        return viewsUpdate(req.configure(ViewsUpdateRequest.builder()).build())
    }


    fun viewsPublish(req: ViewsPublishRequest): ViewsPublishResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_PUBLISH,
            getToken(req),
            ViewsPublishResponse::class.java
        )
    }


    fun viewsPublish(req: RequestConfigurator<ViewsPublishRequest.ViewsPublishRequestBuilder?>): ViewsPublishResponse {
        return viewsPublish(req.configure(ViewsPublishRequest.builder()).build())
    }

    // ----------------------------------------------
    // OkHttp layer methods
    // ----------------------------------------------
    @Throws(java.io.IOException::class)
    override fun runPostForm(form: FormBody.Builder?, endpoint: String?): HttpResponse? {
        return slackHttpClient.postForm(endpointUrlPrefix + endpoint, form!!.build())
    }

    @Throws(java.io.IOException::class)
    override fun runPostFormWithToken(form: FormBody.Builder?, endpoint: String?, token: String?): HttpResponse? {
        return slackHttpClient.postFormWithBearerHeader(endpointUrlPrefix + endpoint, token, form!!.build())
    }

    @Throws(java.io.IOException::class)
    override fun runPostMultipart(form: FormBody.Builder?, endpoint: String?, token: String?): HttpResponse? {
        return slackHttpClient.postMultipart(endpointUrlPrefix + endpoint, token, form!!.build())
    }

    // ----------------------------------------------
    //  Methods to send requests and parse responses
    // ----------------------------------------------

    fun <T> postFormAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>,
        endpoint: String?,
        clazz: java.lang.Class<T>?
    ): T {
        return postFormAndParseResponse(
            form.configure(FormBody.Builder()),
            endpoint,
            clazz
        )
    }


    fun <T> postFormWithAuthorizationHeaderAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>,
        endpoint: String?,
        authorizationHeader: String?,
        clazz: java.lang.Class<T>?
    ): T {
        return postFormWithAuthorizationHeaderAndParseResponse(
            form.configure(FormBody.Builder()),
            endpoint,
            authorizationHeader,
            clazz
        )
    }


    fun <T> postFormWithTokenAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T {
        return postFormWithTokenAndParseResponse(
            form.configure(FormBody.Builder()),
            endpoint,
            token,
            clazz
        )
    }


    fun <T> postMultipartAndParseResponse(
        form: RequestConfigurator<FormBody.Builder?>,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>?
    ): T {
        val f = FormBody.Builder()
        return postMultipartAndParseResponse(
            form.configure(f),
            endpoint,
            token,
            clazz
        )
    }


    protected fun <T> postFormAndParseResponse(
        form: FormBody.Builder?,
        endpoint: String?,
        clazz: java.lang.Class<T>
    ): T {
        val response: HttpResponse? = runPostForm(form, endpoint)
        return parseJsonResponseAndRunListeners(response, clazz)
    }


    protected fun <T> postFormWithAuthorizationHeaderAndParseResponse(
        form: FormBody.Builder,
        endpoint: String?,
        authorizationHeader: String?,
        clazz: java.lang.Class<T>
    ): T {
        val response: HttpResponse =
            slackHttpClient.postFormWithAuthorizationHeader(endpoint, authorizationHeader, form.build())
        return parseJsonResponseAndRunListeners(response, clazz)
    }


    protected fun <T> postFormWithTokenAndParseResponse(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>
    ): T {
        val response: HttpResponse? = runPostFormWithToken(form, endpoint, token)
        return parseJsonResponseAndRunListeners(response, clazz)
    }


    protected fun <T> postMultipartAndParseResponse(
        form: FormBody.Builder?,
        endpoint: String?,
        token: String?,
        clazz: java.lang.Class<T>
    ): T {
        val response: HttpResponse? = runPostMultipart(form, endpoint, token)
        return parseJsonResponseAndRunListeners(response, clazz)
    }

    // ----------------------------------------------
    // Internal methods
    // ----------------------------------------------
    protected fun getToken(request: SlackApiRequest): String? {
        if (request.token != null) {
            return request.token
        }
        if (token.isPresent()) {
            return token.get()
        }

        if (slackHttpClient.getConfig().isTokenExistenceVerificationEnabled()) {
            val error =
                "Slack API token is supposed to be set in " + request.javaClass.getSimpleName() + " but not found"
            throw java.lang.IllegalStateException(error)
        } else {
            return null
        }
    }


    private fun <T> parseJsonResponseAndRunListeners(response: HttpResponse?, clazz: java.lang.Class<T>): T {
//        String body = response.body().string();
//        slackHttpClient.runHttpResponseListeners(response, body);
//        if (response.isSuccessful()) {
//            return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, clazz);
//        } else {
//            throw new SlackApiException(slackHttpClient.getConfig(), response, body);
//        }
        try {
            if (response.getStatusCode() === 200) {
                val body: String = response.asString()
                slackHttpClient.runHttpResponseListeners(response, body)
                return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, clazz)
            } else {
                val body: String = response.asString()
                throw SlackApiException(response, body)
            }
        } catch (e: HttpException) {
            throw java.io.IOException(e)
        }
    }
}