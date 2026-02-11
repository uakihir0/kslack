package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.im.*
import work.socialhub.kslack.api.methods.response.im.*
import kotlin.js.JsExport

@JsExport
interface ImResource {

    suspend fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse

    @JsExport.Ignore
    fun imCloseBlocking(
        req: ImCloseRequest
    ): ImCloseResponse

    suspend fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse

    @JsExport.Ignore
    fun imHistoryBlocking(
        req: ImHistoryRequest
    ): ImHistoryResponse

    suspend fun imList(
        req: ImListRequest
    ): ImListResponse

    @JsExport.Ignore
    fun imListBlocking(
        req: ImListRequest
    ): ImListResponse

    suspend fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse

    @JsExport.Ignore
    fun imMarkBlocking(
        req: ImMarkRequest
    ): ImMarkResponse

    suspend fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse

    @JsExport.Ignore
    fun imOpenBlocking(
        req: ImOpenRequest
    ): ImOpenResponse

    suspend fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse

    @JsExport.Ignore
    fun imRepliesBlocking(
        req: ImRepliesRequest
    ): ImRepliesResponse
}
