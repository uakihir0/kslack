package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.mpim.*
import work.socialhub.kslack.api.methods.response.mpim.*
import kotlin.js.JsExport

@JsExport
interface MpimResource {

    suspend fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse

    @JsExport.Ignore
    fun mpimCloseBlocking(
        req: MpimCloseRequest
    ): MpimCloseResponse

    suspend fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse

    @JsExport.Ignore
    fun mpimHistoryBlocking(
        req: MpimHistoryRequest
    ): MpimHistoryResponse

    suspend fun mpimList(
        req: MpimListRequest
    ): MpimListResponse

    @JsExport.Ignore
    fun mpimListBlocking(
        req: MpimListRequest
    ): MpimListResponse

    suspend fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse

    @JsExport.Ignore
    fun mpimRepliesBlocking(
        req: MpimRepliesRequest
    ): MpimRepliesResponse

    suspend fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse

    @JsExport.Ignore
    fun mpimMarkBlocking(
        req: MpimMarkRequest
    ): MpimMarkResponse

    suspend fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse

    @JsExport.Ignore
    fun mpimOpenBlocking(
        req: MpimOpenRequest
    ): MpimOpenResponse
}
