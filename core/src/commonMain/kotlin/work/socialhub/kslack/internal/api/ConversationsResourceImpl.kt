package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ConversationsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.conversations.*
import work.socialhub.kslack.api.methods.response.conversations.*
import work.socialhub.kslack.util.toBlocking

class ConversationsResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    ConversationsResource {

    override suspend fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_ARCHIVE,
            getToken(req),
        )
    }

    override fun conversationsArchiveBlocking(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse {
        return toBlocking { conversationsArchive(req) }
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

    override fun conversationsCloseBlocking(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse {
        return toBlocking { conversationsClose(req) }
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

    override fun conversationsCreateBlocking(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse {
        return toBlocking { conversationsCreate(req) }
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

    override fun conversationsHistoryBlocking(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse {
        return toBlocking { conversationsHistory(req) }
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

    override fun conversationsInfoBlocking(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse {
        return toBlocking { conversationsInfo(req) }
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

    override fun conversationsInviteBlocking(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse {
        return toBlocking { conversationsInvite(req) }
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

    override fun conversationsJoinBlocking(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse {
        return toBlocking { conversationsJoin(req) }
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

    override fun conversationsKickBlocking(
        req: ConversationsKickRequest
    ): ConversationsKickResponse {
        return toBlocking { conversationsKick(req) }
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

    override fun conversationsLeaveBlocking(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse {
        return toBlocking { conversationsLeave(req) }
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

    override fun conversationsListBlocking(
        req: ConversationsListRequest
    ): ConversationsListResponse {
        return toBlocking { conversationsList(req) }
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

    override fun conversationsMembersBlocking(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse {
        return toBlocking { conversationsMembers(req) }
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

    override fun conversationsOpenBlocking(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse {
        return toBlocking { conversationsOpen(req) }
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

    override fun conversationsRenameBlocking(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse {
        return toBlocking { conversationsRename(req) }
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

    override fun conversationsRepliesBlocking(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse {
        return toBlocking { conversationsReplies(req) }
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

    override fun conversationsSetPurposeBlocking(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse {
        return toBlocking { conversationsSetPurpose(req) }
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

    override fun conversationsSetTopicBlocking(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse {
        return toBlocking { conversationsSetTopic(req) }
    }

    override suspend fun conversationsMark(
        req: ConversationsMarkRequest
    ): ConversationsMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_MARK,
            getToken(req),
        )
    }

    override fun conversationsMarkBlocking(
        req: ConversationsMarkRequest
    ): ConversationsMarkResponse {
        return toBlocking { conversationsMark(req) }
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

    override fun conversationsUnarchiveBlocking(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse {
        return toBlocking { conversationsUnarchive(req) }
    }

    override suspend fun conversationsAcceptSharedInvite(
        req: ConversationsAcceptSharedInviteRequest
    ): ConversationsAcceptSharedInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_ACCEPT_SHARED_INVITE,
            getToken(req),
        )
    }

    override fun conversationsAcceptSharedInviteBlocking(
        req: ConversationsAcceptSharedInviteRequest
    ): ConversationsAcceptSharedInviteResponse {
        return toBlocking { conversationsAcceptSharedInvite(req) }
    }

    override suspend fun conversationsApproveSharedInvite(
        req: ConversationsApproveSharedInviteRequest
    ): ConversationsApproveSharedInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_APPROVE_SHARED_INVITE,
            getToken(req),
        )
    }

    override fun conversationsApproveSharedInviteBlocking(
        req: ConversationsApproveSharedInviteRequest
    ): ConversationsApproveSharedInviteResponse {
        return toBlocking { conversationsApproveSharedInvite(req) }
    }

    override suspend fun conversationsCanvasesCreate(
        req: ConversationsCanvasesCreateRequest
    ): ConversationsCanvasesCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_CANVASES_CREATE,
            getToken(req),
        )
    }

    override fun conversationsCanvasesCreateBlocking(
        req: ConversationsCanvasesCreateRequest
    ): ConversationsCanvasesCreateResponse {
        return toBlocking { conversationsCanvasesCreate(req) }
    }

    override suspend fun conversationsDeclineSharedInvite(
        req: ConversationsDeclineSharedInviteRequest
    ): ConversationsDeclineSharedInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_DECLINE_SHARED_INVITE,
            getToken(req),
        )
    }

    override fun conversationsDeclineSharedInviteBlocking(
        req: ConversationsDeclineSharedInviteRequest
    ): ConversationsDeclineSharedInviteResponse {
        return toBlocking { conversationsDeclineSharedInvite(req) }
    }

    override suspend fun conversationsInviteShared(
        req: ConversationsInviteSharedRequest
    ): ConversationsInviteSharedResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_INVITE_SHARED,
            getToken(req),
        )
    }

    override fun conversationsInviteSharedBlocking(
        req: ConversationsInviteSharedRequest
    ): ConversationsInviteSharedResponse {
        return toBlocking { conversationsInviteShared(req) }
    }

    override suspend fun conversationsListConnectInvites(
        req: ConversationsListConnectInvitesRequest
    ): ConversationsListConnectInvitesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_LIST_CONNECT_INVITES,
            getToken(req),
        )
    }

    override fun conversationsListConnectInvitesBlocking(
        req: ConversationsListConnectInvitesRequest
    ): ConversationsListConnectInvitesResponse {
        return toBlocking { conversationsListConnectInvites(req) }
    }

    override suspend fun conversationsRequestSharedInviteApprove(
        req: ConversationsRequestSharedInviteApproveRequest
    ): ConversationsRequestSharedInviteApproveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_REQUEST_SHARED_INVITE_APPROVE,
            getToken(req),
        )
    }

    override fun conversationsRequestSharedInviteApproveBlocking(
        req: ConversationsRequestSharedInviteApproveRequest
    ): ConversationsRequestSharedInviteApproveResponse {
        return toBlocking { conversationsRequestSharedInviteApprove(req) }
    }

    override suspend fun conversationsRequestSharedInviteDeny(
        req: ConversationsRequestSharedInviteDenyRequest
    ): ConversationsRequestSharedInviteDenyResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_REQUEST_SHARED_INVITE_DENY,
            getToken(req),
        )
    }

    override fun conversationsRequestSharedInviteDenyBlocking(
        req: ConversationsRequestSharedInviteDenyRequest
    ): ConversationsRequestSharedInviteDenyResponse {
        return toBlocking { conversationsRequestSharedInviteDeny(req) }
    }

    override suspend fun conversationsRequestSharedInviteList(
        req: ConversationsRequestSharedInviteListRequest
    ): ConversationsRequestSharedInviteListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CONVERSATIONS_REQUEST_SHARED_INVITE_LIST,
            getToken(req),
        )
    }

    override fun conversationsRequestSharedInviteListBlocking(
        req: ConversationsRequestSharedInviteListRequest
    ): ConversationsRequestSharedInviteListResponse {
        return toBlocking { conversationsRequestSharedInviteList(req) }
    }
}
