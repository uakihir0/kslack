package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.api.ApiRateLimitRequest
import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.response.api.ApiRateLimitResponse
import work.socialhub.kslack.api.methods.response.api.ApiTestResponse
import kotlin.js.JsExport

/**
 * Resource for API utility methods.
 *
 * Provides:
 * - [apiTest] - Send a test message to verify token validity
 * - [apiRateLimit] - Check remaining API rate limits
 *
 * @see <a href="https://api.slack.com/methods/api.test">api.test</a>
 * @see <a href="https://api.slack.com/methods/api.rateLimit">api.rateLimit</a>
 */
@JsExport
interface ApiResource {

    suspend fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse

    @JsExport.Ignore
    fun apiTestBlocking(
        req: ApiTestRequest
    ): ApiTestResponse

    suspend fun apiRateLimit(
        req: ApiRateLimitRequest
    ): ApiRateLimitResponse

    @JsExport.Ignore
    fun apiRateLimitBlocking(
        req: ApiRateLimitRequest
    ): ApiRateLimitResponse
}
