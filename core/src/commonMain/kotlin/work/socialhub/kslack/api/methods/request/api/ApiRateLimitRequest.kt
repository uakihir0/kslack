package work.socialhub.kslack.api.methods.request.api

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/api.rateLimit
 */
@JsExport
class ApiRateLimitRequest(
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>()
    }
}
