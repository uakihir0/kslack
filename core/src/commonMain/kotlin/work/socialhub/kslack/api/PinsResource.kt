package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.response.pins.PinsAddResponse
import work.socialhub.kslack.api.methods.response.pins.PinsListResponse
import work.socialhub.kslack.api.methods.response.pins.PinsRemoveResponse
import kotlin.js.JsExport

@JsExport
interface PinsResource {

    suspend fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse

    @JsExport.Ignore
    fun pinsAddBlocking(
        req: PinsAddRequest
    ): PinsAddResponse

    suspend fun pinsList(
        req: PinsListRequest
    ): PinsListResponse

    @JsExport.Ignore
    fun pinsListBlocking(
        req: PinsListRequest
    ): PinsListResponse

    suspend fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse

    @JsExport.Ignore
    fun pinsRemoveBlocking(
        req: PinsRemoveRequest
    ): PinsRemoveResponse
}
