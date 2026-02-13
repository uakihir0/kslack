package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.response.stars.StarsAddResponse
import work.socialhub.kslack.api.methods.response.stars.StarsListResponse
import work.socialhub.kslack.api.methods.response.stars.StarsRemoveResponse
import kotlin.js.JsExport

@Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
@JsExport
interface StarsResource {

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsAddBlocking(
        req: StarsAddRequest
    ): StarsAddResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsListBlocking(
        req: StarsListRequest
    ): StarsListResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsRemoveBlocking(
        req: StarsRemoveRequest
    ): StarsRemoveResponse
}
