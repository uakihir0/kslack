package work.socialhub.kslack.api.methods.impl

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kmastodon.internal.InternalUtility.fromJson
import work.socialhub.kslack.api.methods.*
import work.socialhub.kslack.api.methods.request.admin.apps.*
import work.socialhub.kslack.api.methods.request.admin.invite_requests.AdminInviteRequestsApproveRequest
import work.socialhub.kslack.api.methods.response.admin.apps.*
import work.socialhub.kslack.api.methods.response.admin.invite_requests.AdminInviteRequestsApproveResponse

class MethodsClientImpl(
    val token: String?
) : MethodsClient {

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



    fun appsPermissionsInfo(req: AppsPermissionsInfoRequest): AppsPermissionsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_INFO,
            getToken(req),
            AppsPermissionsInfoResponse::class.java
        )
    }



    fun appsPermissionsRequest(req: AppsPermissionsRequestRequest): AppsPermissionsRequestResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.APPS_PERMISSIONS_REQUEST,
            getToken(req),
            AppsPermissionsRequestResponse::class.java
        )
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



    fun authTest(req: AuthTestRequest): AuthTestResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.AUTH_TEST,
            getToken(req),
            AuthTestResponse::class.java
        )
    }


    fun botsInfo(req: BotsInfoRequest): BotsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.BOTS_INFO,
            getToken(req),
            BotsInfoResponse::class.java
        )
    }



    fun channelsArchive(req: ChannelsArchiveRequest): ChannelsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_ARCHIVE,
            getToken(req),
            ChannelsArchiveResponse::class.java
        )
    }



    fun channelsCreate(req: ChannelsCreateRequest): ChannelsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_CREATE,
            getToken(req),
            ChannelsCreateResponse::class.java
        )
    }


    fun channelsHistory(req: ChannelsHistoryRequest): ChannelsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_HISTORY,
            getToken(req),
            ChannelsHistoryResponse::class.java
        )
    }



    fun channelsReplies(req: ChannelsRepliesRequest): ChannelsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_REPLIES,
            getToken(req),
            ChannelsRepliesResponse::class.java
        )
    }


    fun channelsInfo(req: ChannelsInfoRequest): ChannelsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_INFO,
            getToken(req),
            ChannelsInfoResponse::class.java
        )
    }



    fun channelsList(req: ChannelsListRequest): ChannelsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_LIST,
            getToken(req),
            ChannelsListResponse::class.java
        )
    }


    fun channelsInvite(req: ChannelsInviteRequest): ChannelsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_INVITE,
            getToken(req),
            ChannelsInviteResponse::class.java
        )
    }

    fun channelsJoin(req: ChannelsJoinRequest): ChannelsJoinResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_JOIN,
            getToken(req),
            ChannelsJoinResponse::class.java
        )
    }



    fun channelsKick(req: ChannelsKickRequest): ChannelsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_KICK,
            getToken(req),
            ChannelsKickResponse::class.java
        )
    }

    fun channelsLeave(req: ChannelsLeaveRequest): ChannelsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_LEAVE,
            getToken(req),
            ChannelsLeaveResponse::class.java
        )
    }


    fun channelsMark(req: ChannelsMarkRequest): ChannelsMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_MARK,
            getToken(req),
            ChannelsMarkResponse::class.java
        )
    }


    fun channelsRename(req: ChannelsRenameRequest): ChannelsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_RENAME,
            getToken(req),
            ChannelsRenameResponse::class.java
        )
    }

    fun channelsSetPurpose(req: ChannelsSetPurposeRequest): ChannelsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_SET_PURPOSE,
            getToken(req),
            ChannelsSetPurposeResponse::class.java
        )
    }


    fun channelsSetTopic(req: ChannelsSetTopicRequest): ChannelsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_SET_TOPIC,
            getToken(req),
            ChannelsSetTopicResponse::class.java
        )
    }



    fun channelsUnarchive(req: ChannelsUnarchiveRequest): ChannelsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHANNELS_UNARCHIVE,
            getToken(req),
            ChannelsUnarchiveResponse::class.java
        )
    }


    fun chatGetPermalink(req: ChatGetPermalinkRequest): ChatGetPermalinkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_GET_PERMALINK,
            getToken(req),
            ChatGetPermalinkResponse::class.java
        )
    }


    fun chatDelete(req: ChatDeleteRequest): ChatDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_DELETE,
            getToken(req),
            ChatDeleteResponse::class.java
        )
    }

    fun chatDeleteScheduledMessage(req: ChatDeleteScheduledMessageRequest): ChatDeleteScheduledMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_DELETE_SCHEDULED_MESSAGE,
            getToken(req),
            ChatDeleteScheduledMessageResponse::class.java
        )
    }



    fun chatMeMessage(req: ChatMeMessageRequest): ChatMeMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_ME_MESSAGE,
            getToken(req),
            ChatMeMessageResponse::class.java
        )
    }


    fun chatPostEphemeral(req: ChatPostEphemeralRequest): ChatPostEphemeralResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_POST_EPHEMERAL,
            getToken(req),
            ChatPostEphemeralResponse::class.java
        )
    }


    fun chatPostMessage(req: ChatPostMessageRequest): ChatPostMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_POST_MESSAGE,
            getToken(req),
            ChatPostMessageResponse::class.java
        )
    }



    fun chatScheduleMessage(req: ChatScheduleMessageRequest): ChatScheduleMessageResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_SCHEDULE_MESSAGE,
            getToken(req),
            ChatScheduleMessageResponse::class.java
        )
    }

    fun chatUpdate(req: ChatUpdateRequest): ChatUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_UPDATE,
            getToken(req),
            ChatUpdateResponse::class.java
        )
    }


    fun chatUnfurl(req: ChatUnfurlRequest): ChatUnfurlResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_UNFURL,
            getToken(req),
            ChatUnfurlResponse::class.java
        )
    }


    fun chatScheduleMessagesListMessage(req: ChatScheduleMessagesListRequest): ChatScheduleMessagesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CHAT_SCHEDULED_MESSAGES_LIST,
            getToken(req),
            ChatScheduleMessagesListResponse::class.java
        )
    }


    fun conversationsArchive(req: ConversationsArchiveRequest): ConversationsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_ARCHIVE,
            getToken(req),
            ConversationsArchiveResponse::class.java
        )
    }



    fun conversationsClose(req: ConversationsCloseRequest): ConversationsCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_CLOSE,
            getToken(req),
            ConversationsCloseResponse::class.java
        )
    }


    fun conversationsCreate(req: ConversationsCreateRequest): ConversationsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_CREATE,
            getToken(req),
            ConversationsCreateResponse::class.java
        )
    }


    fun conversationsHistory(req: ConversationsHistoryRequest): ConversationsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_HISTORY,
            getToken(req),
            ConversationsHistoryResponse::class.java
        )
    }


    fun conversationsInfo(req: ConversationsInfoRequest): ConversationsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_INFO,
            getToken(req),
            ConversationsInfoResponse::class.java
        )
    }


    fun conversationsInvite(req: ConversationsInviteRequest): ConversationsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_INVITE,
            getToken(req),
            ConversationsInviteResponse::class.java
        )
    }

    fun conversationsJoin(req: ConversationsJoinRequest): ConversationsJoinResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_JOIN,
            getToken(req),
            ConversationsJoinResponse::class.java
        )
    }

    fun conversationsKick(req: ConversationsKickRequest): ConversationsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_KICK,
            getToken(req),
            ConversationsKickResponse::class.java
        )
    }

    fun conversationsLeave(req: ConversationsLeaveRequest): ConversationsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_LEAVE,
            getToken(req),
            ConversationsLeaveResponse::class.java
        )
    }

    fun conversationsList(req: ConversationsListRequest): ConversationsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_LIST,
            getToken(req),
            ConversationsListResponse::class.java
        )
    }

    fun conversationsMembers(req: ConversationsMembersRequest): ConversationsMembersResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_MEMBERS,
            getToken(req),
            ConversationsMembersResponse::class.java
        )
    }

    fun conversationsOpen(req: ConversationsOpenRequest): ConversationsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_OPEN,
            getToken(req),
            ConversationsOpenResponse::class.java
        )
    }


    fun conversationsRename(req: ConversationsRenameRequest): ConversationsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_RENAME,
            getToken(req),
            ConversationsRenameResponse::class.java
        )
    }

    fun conversationsReplies(req: ConversationsRepliesRequest): ConversationsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_REPLIES,
            getToken(req),
            ConversationsRepliesResponse::class.java
        )
    }

    fun conversationsSetPurpose(req: ConversationsSetPurposeRequest): ConversationsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_SET_PURPOSE,
            getToken(req),
            ConversationsSetPurposeResponse::class.java
        )
    }


    fun conversationsSetTopic(req: ConversationsSetTopicRequest): ConversationsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_SET_TOPIC,
            getToken(req),
            ConversationsSetTopicResponse::class.java
        )
    }


    fun conversationsUnarchive(req: ConversationsUnarchiveRequest): ConversationsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.CONVERSATIONS_UNARCHIVE,
            getToken(req),
            ConversationsUnarchiveResponse::class.java
        )
    }


    fun dialogOpen(req: DialogOpenRequest): DialogOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DIALOG_OPEN,
            getToken(req),
            DialogOpenResponse::class.java
        )
    }


    fun dndEndDnd(req: DndEndDndRequest): DndEndDndResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_END_DND,
            getToken(req),
            DndEndDndResponse::class.java
        )
    }


    fun dndEndSnooze(req: DndEndSnoozeRequest): DndEndSnoozeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_END_SNOOZE,
            getToken(req),
            DndEndSnoozeResponse::class.java
        )
    }


    fun dndInfo(req: DndInfoRequest): DndInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_INFO,
            getToken(req),
            DndInfoResponse::class.java
        )
    }


    fun dndSetSnooze(req: DndSetSnoozeRequest): DndSetSnoozeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_SET_SNOOZE,
            getToken(req),
            DndSetSnoozeResponse::class.java
        )
    }

    fun dndTeamInfo(req: DndTeamInfoRequest): DndTeamInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.DND_TEAM_INFO,
            getToken(req),
            DndTeamInfoResponse::class.java
        )
    }


    fun emojiList(req: EmojiListRequest): EmojiListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.EMOJI_LIST,
            getToken(req),
            EmojiListResponse::class.java
        )
    }


    fun filesDelete(req: FilesDeleteRequest): FilesDeleteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_DELETE,
            getToken(req),
            FilesDeleteResponse::class.java
        )
    }

    fun filesInfo(req: FilesInfoRequest): FilesInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_INFO,
            getToken(req),
            FilesInfoResponse::class.java
        )
    }


    fun filesList(req: FilesListRequest): FilesListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_LIST,
            getToken(req),
            FilesListResponse::class.java
        )
    }


    fun filesRevokePublicURL(req: FilesRevokePublicURLRequest): FilesRevokePublicURLResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REVOKE_PUBLIC_URL,
            getToken(req),
            FilesRevokePublicURLResponse::class.java
        )
    }


    fun filesSharedPublicURL(req: FilesSharedPublicURLRequest): FilesSharedPublicURLResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_SHARED_PUBLIC_URL,
            getToken(req),
            FilesSharedPublicURLResponse::class.java
        )
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



    fun filesRemoteInfo(req: FilesRemoteInfoRequest): FilesRemoteInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_INFO,
            getToken(req),
            FilesRemoteInfoResponse::class.java
        )
    }



    fun filesRemoteList(req: FilesRemoteListRequest): FilesRemoteListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_LIST,
            getToken(req),
            FilesRemoteListResponse::class.java
        )
    }


    fun filesRemoteRemove(req: FilesRemoteRemoveRequest): FilesRemoteRemoveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_REMOVE,
            getToken(req),
            FilesRemoteRemoveResponse::class.java
        )
    }


    fun filesRemoteShare(req: FilesRemoteShareRequest): FilesRemoteShareResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.FILES_REMOTE_SHARE,
            getToken(req),
            FilesRemoteShareResponse::class.java
        )
    }



    fun filesRemoteUpdate(req: FilesRemoteUpdateRequest?): FilesRemoteUpdateResponse {
//        return postMultipartAndParseResponse(toMultipartBody(req), Methods.FILES_REMOTE_UPDATE, getToken(req), FilesRemoteUpdateResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }



    fun groupsArchive(req: GroupsArchiveRequest): GroupsArchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_ARCHIVE,
            getToken(req),
            GroupsArchiveResponse::class.java
        )
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


    fun groupsCreate(req: GroupsCreateRequest): GroupsCreateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_CREATE,
            getToken(req),
            GroupsCreateResponse::class.java
        )
    }


    fun groupsHistory(req: GroupsHistoryRequest): GroupsHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_HISTORY,
            getToken(req),
            GroupsHistoryResponse::class.java
        )
    }


    fun groupsReplies(req: GroupsRepliesRequest): GroupsRepliesResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_REPLIES,
            getToken(req),
            GroupsRepliesResponse::class.java
        )
    }



    fun groupsInfo(req: GroupsInfoRequest): GroupsInfoResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_INFO,
            getToken(req),
            GroupsInfoResponse::class.java
        )
    }



    fun groupsInvite(req: GroupsInviteRequest): GroupsInviteResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_INVITE,
            getToken(req),
            GroupsInviteResponse::class.java
        )
    }


    fun groupsKick(req: GroupsKickRequest): GroupsKickResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_KICK,
            getToken(req),
            GroupsKickResponse::class.java
        )
    }


    fun groupsLeave(req: GroupsLeaveRequest): GroupsLeaveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_LEAVE,
            getToken(req),
            GroupsLeaveResponse::class.java
        )
    }


    fun groupsList(req: GroupsListRequest): GroupsListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_LIST,
            getToken(req),
            GroupsListResponse::class.java
        )
    }


    fun groupsMark(req: GroupsMarkRequest): GroupsMarkResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_MARK,
            getToken(req),
            GroupsMarkResponse::class.java
        )
    }


    fun groupsOpen(req: GroupsOpenRequest): GroupsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_OPEN,
            getToken(req),
            GroupsOpenResponse::class.java
        )
    }


    fun groupsRename(req: GroupsRenameRequest): GroupsRenameResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_RENAME,
            getToken(req),
            GroupsRenameResponse::class.java
        )
    }
    fun groupsSetPurpose(req: GroupsSetPurposeRequest): GroupsSetPurposeResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_SET_PURPOSE,
            getToken(req),
            GroupsSetPurposeResponse::class.java
        )
    }

    fun groupsSetTopic(req: GroupsSetTopicRequest): GroupsSetTopicResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_SET_TOPIC,
            getToken(req),
            GroupsSetTopicResponse::class.java
        )
    }


    fun groupsUnarchive(req: GroupsUnarchiveRequest): GroupsUnarchiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.GROUPS_UNARCHIVE,
            getToken(req),
            GroupsUnarchiveResponse::class.java
        )
    }


    fun imClose(req: ImCloseRequest): ImCloseResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_CLOSE,
            getToken(req),
            ImCloseResponse::class.java
        )
    }

    fun imHistory(req: ImHistoryRequest): ImHistoryResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_HISTORY,
            getToken(req),
            ImHistoryResponse::class.java
        )
    }


    fun imList(req: ImListRequest): ImListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.IM_LIST,
            getToken(req),
            ImListResponse::class.java
        )
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


    fun usersList(req: UsersListRequest): UsersListResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_LIST,
            getToken(req),
            UsersListResponse::class.java
        )
    }


    fun usersLookupByEmail(req: UsersLookupByEmailRequest): UsersLookupByEmailResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_LOOKUP_BY_EMAIL,
            getToken(req),
            UsersLookupByEmailResponse::class.java
        )
    }


    fun usersSetActive(req: UsersSetActiveRequest): UsersSetActiveResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_SET_ACTIVE,
            getToken(req),
            UsersSetActiveResponse::class.java
        )
    }


    fun usersSetPhoto(req: UsersSetPhotoRequest?): UsersSetPhotoResponse {
        // return postMultipartAndParseResponse(toMultipartBody(req), Methods.USERS_SET_PHOTO, getToken(req), UsersSetPhotoResponse.class);
        throw java.lang.IllegalStateException("Not supported")
    }


    fun usersSetPresence(req: UsersSetPresenceRequest): UsersSetPresenceResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_SET_PRESENCE,
            getToken(req),
            UsersSetPresenceResponse::class.java
        )
    }


    fun usersProfileGet(req: UsersProfileGetRequest): UsersProfileGetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_PROFILE_GET,
            getToken(req),
            UsersProfileGetResponse::class.java
        )
    }


    fun usersProfileSet(req: UsersProfileSetRequest): UsersProfileSetResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.USERS_PROFILE_SET,
            getToken(req),
            UsersProfileSetResponse::class.java
        )
    }


    fun viewsOpen(req: ViewsOpenRequest): ViewsOpenResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_OPEN,
            getToken(req),
            ViewsOpenResponse::class.java
        )
    }

    fun viewsPush(req: ViewsPushRequest): ViewsPushResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_PUSH,
            getToken(req),
            ViewsPushResponse::class.java
        )
    }

    fun viewsUpdate(req: ViewsUpdateRequest): ViewsUpdateResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_UPDATE,
            getToken(req),
            ViewsUpdateResponse::class.java
        )
    }

    fun viewsPublish(req: ViewsPublishRequest): ViewsPublishResponse {
        return postFormWithTokenAndParseResponse(
            toForm(req),
            Methods.VIEWS_PUBLISH,
            getToken(req),
            ViewsPublishResponse::class.java
        )
    }

    // ----------------------------------------------
    // OkHttp layer methods
    // ----------------------------------------------
    override suspend fun runPostForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): HttpResponse {
        return HttpRequest()
            .url("http://$endpoint")
            .also { it.params += params }
            .forceApplicationFormUrlEncoded(true)
            .post()
    }

    override suspend fun runPostFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse {
        return HttpRequest()
            .url("http://$endpoint")
            .also { it.params += params }
            .header("", token)
            .forceApplicationFormUrlEncoded(true)
            .post()
    }

    override suspend fun runPostMultipart(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse {
        return HttpRequest()
            .url("http://$endpoint")
            .also { it.params += params }
            .header("", token)
            .forceMultipartFormData(true)
            .post()
    }


    protected suspend inline fun <reified T> postForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): T {
        val response = runPostForm(params, endpoint)
        return parseJsonResponse(response)
    }

    protected suspend inline fun <reified T> postFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): T {
        val response = runPostFormWithToken(params, endpoint, token)
        return parseJsonResponse(response)
    }


    protected suspend inline fun <reified T> postMultipartWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): T {
        val response = runPostMultipart(params, endpoint, token)
        return parseJsonResponse(response)
    }

    // ----------------------------------------------
    // Internal methods
    // ----------------------------------------------
    protected fun getToken(request: SlackApiRequest): String {
        if (request.token != null) {
            return request.token!!
        }

        // TODO: その API では Token が必要かどうかを確認
        throw IllegalStateException()
    }


    inline fun <reified T> parseJsonResponse(
        response: HttpResponse
    ): T {
        try {
            if (response.status in 200..299) {
                val body = response.stringBody
                return fromJson(body)
            } else {
                throw SlackApiException(response)
            }
        } catch (e: Exception) {
            throw IllegalStateException()
        }
    }
}