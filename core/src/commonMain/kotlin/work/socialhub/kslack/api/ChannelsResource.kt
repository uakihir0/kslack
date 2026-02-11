package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.channels.*
import work.socialhub.kslack.api.methods.response.channels.*
import kotlin.js.JsExport

@JsExport
interface ChannelsResource {

    suspend fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse

    @JsExport.Ignore
    fun channelsArchiveBlocking(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse

    suspend fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse

    @JsExport.Ignore
    fun channelsCreateBlocking(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse

    suspend fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse

    @JsExport.Ignore
    fun channelsHistoryBlocking(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse

    suspend fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse

    @JsExport.Ignore
    fun channelsRepliesBlocking(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse

    suspend fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse

    @JsExport.Ignore
    fun channelsInfoBlocking(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse

    suspend fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse

    @JsExport.Ignore
    fun channelsListBlocking(
        req: ChannelsListRequest
    ): ChannelsListResponse

    suspend fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse

    @JsExport.Ignore
    fun channelsInviteBlocking(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse

    suspend fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse

    @JsExport.Ignore
    fun channelsJoinBlocking(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse

    suspend fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse

    @JsExport.Ignore
    fun channelsKickBlocking(
        req: ChannelsKickRequest
    ): ChannelsKickResponse

    suspend fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse

    @JsExport.Ignore
    fun channelsLeaveBlocking(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse

    suspend fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse

    @JsExport.Ignore
    fun channelsMarkBlocking(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse

    suspend fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse

    @JsExport.Ignore
    fun channelsRenameBlocking(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse

    suspend fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse

    @JsExport.Ignore
    fun channelsSetPurposeBlocking(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse

    suspend fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse

    @JsExport.Ignore
    fun channelsSetTopicBlocking(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse

    suspend fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse

    @JsExport.Ignore
    fun channelsUnarchiveBlocking(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse
}
