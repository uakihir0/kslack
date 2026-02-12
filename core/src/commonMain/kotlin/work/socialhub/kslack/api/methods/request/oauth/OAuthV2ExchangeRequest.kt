package work.socialhub.kslack.api.methods.request.oauth

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class OAuthV2ExchangeRequest(
    override var token: String?,
    var clientId: String?,
    var clientSecret: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("client_id", clientId)
            it.addParam("client_secret", clientSecret)
        }
    }
}
