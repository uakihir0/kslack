package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.conversations.*
import work.socialhub.kslack.api.methods.response.conversations.*
import kotlin.js.JsExport

@JsExport
interface ConversationsResource {

    suspend fun conversationsArchive(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse

    @JsExport.Ignore
    fun conversationsArchiveBlocking(
        req: ConversationsArchiveRequest
    ): ConversationsArchiveResponse

    suspend fun conversationsClose(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse

    @JsExport.Ignore
    fun conversationsCloseBlocking(
        req: ConversationsCloseRequest
    ): ConversationsCloseResponse

    suspend fun conversationsCreate(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse

    @JsExport.Ignore
    fun conversationsCreateBlocking(
        req: ConversationsCreateRequest
    ): ConversationsCreateResponse

    suspend fun conversationsHistory(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse

    @JsExport.Ignore
    fun conversationsHistoryBlocking(
        req: ConversationsHistoryRequest
    ): ConversationsHistoryResponse

    suspend fun conversationsInfo(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse

    @JsExport.Ignore
    fun conversationsInfoBlocking(
        req: ConversationsInfoRequest
    ): ConversationsInfoResponse

    suspend fun conversationsInvite(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse

    @JsExport.Ignore
    fun conversationsInviteBlocking(
        req: ConversationsInviteRequest
    ): ConversationsInviteResponse

    suspend fun conversationsJoin(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse

    @JsExport.Ignore
    fun conversationsJoinBlocking(
        req: ConversationsJoinRequest
    ): ConversationsJoinResponse

    suspend fun conversationsKick(
        req: ConversationsKickRequest
    ): ConversationsKickResponse

    @JsExport.Ignore
    fun conversationsKickBlocking(
        req: ConversationsKickRequest
    ): ConversationsKickResponse

    suspend fun conversationsLeave(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse

    @JsExport.Ignore
    fun conversationsLeaveBlocking(
        req: ConversationsLeaveRequest
    ): ConversationsLeaveResponse

    suspend fun conversationsList(
        req: ConversationsListRequest
    ): ConversationsListResponse

    @JsExport.Ignore
    fun conversationsListBlocking(
        req: ConversationsListRequest
    ): ConversationsListResponse

    suspend fun conversationsMembers(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse

    @JsExport.Ignore
    fun conversationsMembersBlocking(
        req: ConversationsMembersRequest
    ): ConversationsMembersResponse

    suspend fun conversationsOpen(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse

    @JsExport.Ignore
    fun conversationsOpenBlocking(
        req: ConversationsOpenRequest
    ): ConversationsOpenResponse

    suspend fun conversationsRename(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse

    @JsExport.Ignore
    fun conversationsRenameBlocking(
        req: ConversationsRenameRequest
    ): ConversationsRenameResponse

    suspend fun conversationsReplies(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse

    @JsExport.Ignore
    fun conversationsRepliesBlocking(
        req: ConversationsRepliesRequest
    ): ConversationsRepliesResponse

    suspend fun conversationsSetPurpose(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse

    @JsExport.Ignore
    fun conversationsSetPurposeBlocking(
        req: ConversationsSetPurposeRequest
    ): ConversationsSetPurposeResponse

    suspend fun conversationsSetTopic(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse

    @JsExport.Ignore
    fun conversationsSetTopicBlocking(
        req: ConversationsSetTopicRequest
    ): ConversationsSetTopicResponse

    suspend fun conversationsMark(
        req: ConversationsMarkRequest
    ): ConversationsMarkResponse

    @JsExport.Ignore
    fun conversationsMarkBlocking(
        req: ConversationsMarkRequest
    ): ConversationsMarkResponse

    suspend fun conversationsUnarchive(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse

    @JsExport.Ignore
    fun conversationsUnarchiveBlocking(
        req: ConversationsUnarchiveRequest
    ): ConversationsUnarchiveResponse

    suspend fun conversationsAcceptSharedInvite(
        req: ConversationsAcceptSharedInviteRequest
    ): ConversationsAcceptSharedInviteResponse

    @JsExport.Ignore
    fun conversationsAcceptSharedInviteBlocking(
        req: ConversationsAcceptSharedInviteRequest
    ): ConversationsAcceptSharedInviteResponse

    suspend fun conversationsApproveSharedInvite(
        req: ConversationsApproveSharedInviteRequest
    ): ConversationsApproveSharedInviteResponse

    @JsExport.Ignore
    fun conversationsApproveSharedInviteBlocking(
        req: ConversationsApproveSharedInviteRequest
    ): ConversationsApproveSharedInviteResponse

    suspend fun conversationsCanvasesCreate(
        req: ConversationsCanvasesCreateRequest
    ): ConversationsCanvasesCreateResponse

    @JsExport.Ignore
    fun conversationsCanvasesCreateBlocking(
        req: ConversationsCanvasesCreateRequest
    ): ConversationsCanvasesCreateResponse

    suspend fun conversationsDeclineSharedInvite(
        req: ConversationsDeclineSharedInviteRequest
    ): ConversationsDeclineSharedInviteResponse

    @JsExport.Ignore
    fun conversationsDeclineSharedInviteBlocking(
        req: ConversationsDeclineSharedInviteRequest
    ): ConversationsDeclineSharedInviteResponse

    suspend fun conversationsInviteShared(
        req: ConversationsInviteSharedRequest
    ): ConversationsInviteSharedResponse

    @JsExport.Ignore
    fun conversationsInviteSharedBlocking(
        req: ConversationsInviteSharedRequest
    ): ConversationsInviteSharedResponse

    suspend fun conversationsListConnectInvites(
        req: ConversationsListConnectInvitesRequest
    ): ConversationsListConnectInvitesResponse

    @JsExport.Ignore
    fun conversationsListConnectInvitesBlocking(
        req: ConversationsListConnectInvitesRequest
    ): ConversationsListConnectInvitesResponse

    suspend fun conversationsRequestSharedInviteApprove(
        req: ConversationsRequestSharedInviteApproveRequest
    ): ConversationsRequestSharedInviteApproveResponse

    @JsExport.Ignore
    fun conversationsRequestSharedInviteApproveBlocking(
        req: ConversationsRequestSharedInviteApproveRequest
    ): ConversationsRequestSharedInviteApproveResponse

    suspend fun conversationsRequestSharedInviteDeny(
        req: ConversationsRequestSharedInviteDenyRequest
    ): ConversationsRequestSharedInviteDenyResponse

    @JsExport.Ignore
    fun conversationsRequestSharedInviteDenyBlocking(
        req: ConversationsRequestSharedInviteDenyRequest
    ): ConversationsRequestSharedInviteDenyResponse

    suspend fun conversationsRequestSharedInviteList(
        req: ConversationsRequestSharedInviteListRequest
    ): ConversationsRequestSharedInviteListResponse

    @JsExport.Ignore
    fun conversationsRequestSharedInviteListBlocking(
        req: ConversationsRequestSharedInviteListRequest
    ): ConversationsRequestSharedInviteListResponse
}
