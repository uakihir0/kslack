package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.groups.*
import work.socialhub.kslack.api.methods.response.groups.*
import kotlin.js.JsExport

@JsExport
interface GroupsResource {

    suspend fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse

    @JsExport.Ignore
    fun groupsArchiveBlocking(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse

    suspend fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse

    @JsExport.Ignore
    fun groupsCreateChildBlocking(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse

    suspend fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse

    @JsExport.Ignore
    fun groupsCreateBlocking(
        req: GroupsCreateRequest
    ): GroupsCreateResponse

    suspend fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse

    @JsExport.Ignore
    fun groupsHistoryBlocking(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse

    suspend fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse

    @JsExport.Ignore
    fun groupsInfoBlocking(
        req: GroupsInfoRequest
    ): GroupsInfoResponse

    suspend fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse

    @JsExport.Ignore
    fun groupsInviteBlocking(
        req: GroupsInviteRequest
    ): GroupsInviteResponse

    suspend fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse

    @JsExport.Ignore
    fun groupsKickBlocking(
        req: GroupsKickRequest
    ): GroupsKickResponse

    suspend fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse

    @JsExport.Ignore
    fun groupsLeaveBlocking(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse

    suspend fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse

    @JsExport.Ignore
    fun groupsListBlocking(
        req: GroupsListRequest
    ): GroupsListResponse

    suspend fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse

    @JsExport.Ignore
    fun groupsMarkBlocking(
        req: GroupsMarkRequest
    ): GroupsMarkResponse

    suspend fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse

    @JsExport.Ignore
    fun groupsOpenBlocking(
        req: GroupsOpenRequest
    ): GroupsOpenResponse

    suspend fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse

    @JsExport.Ignore
    fun groupsRenameBlocking(
        req: GroupsRenameRequest
    ): GroupsRenameResponse

    suspend fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse

    @JsExport.Ignore
    fun groupsSetPurposeBlocking(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse

    suspend fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse

    @JsExport.Ignore
    fun groupsSetTopicBlocking(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse

    suspend fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse

    @JsExport.Ignore
    fun groupsUnarchiveBlocking(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse

    suspend fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse

    @JsExport.Ignore
    fun groupsRepliesBlocking(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse
}
