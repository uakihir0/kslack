package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.response.stars.StarsAddResponse
import work.socialhub.kslack.api.methods.response.stars.StarsListResponse
import work.socialhub.kslack.api.methods.response.stars.StarsRemoveResponse
import kotlin.js.JsExport

@JsExport
interface StarsResource {

    suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse

    @JsExport.Ignore
    fun starsAddBlocking(
        req: StarsAddRequest
    ): StarsAddResponse

    suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse

    @JsExport.Ignore
    fun starsListBlocking(
        req: StarsListRequest
    ): StarsListResponse

    suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse

    @JsExport.Ignore
    fun starsRemoveBlocking(
        req: StarsRemoveRequest
    ): StarsRemoveResponse
}
