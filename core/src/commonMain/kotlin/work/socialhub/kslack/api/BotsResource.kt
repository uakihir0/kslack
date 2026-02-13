package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.bots.BotsInfoRequest
import work.socialhub.kslack.api.methods.response.bots.BotsInfoResponse
import kotlin.js.JsExport

@JsExport
interface BotsResource {

    suspend fun botsInfo(
        req: BotsInfoRequest
    ): BotsInfoResponse

    @JsExport.Ignore
    fun botsInfoBlocking(
        req: BotsInfoRequest
    ): BotsInfoResponse
}
