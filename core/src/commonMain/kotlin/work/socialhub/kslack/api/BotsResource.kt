package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.bots.BotsInfoRequest
import work.socialhub.kslack.api.methods.response.bots.BotsInfoResponse
import kotlin.js.JsExport

/**
 * Resource for bot user information APIs.
 *
 * Provides:
 * - [botsInfo] - Retrieve information about a bot user
 *
 * @see <a href="https://api.slack.com/methods/bots.info">bots.info</a>
 */
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
