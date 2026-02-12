package work.socialhub.kslack.api.methods.request.openid.connect

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class OpenIDConnectTokenRequest(
    override var token: String? = null,
    var clientId: String?,
    var clientSecret: String?,
    var code: String?,
    var redirectUri: String? = null,
    var grantType: String? = null,
    var refreshToken: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("client_id", clientId)
            it.addParam("client_secret", clientSecret)
            it.addParam("code", code)
            it.addParam("redirect_uri", redirectUri)
            it.addParam("grant_type", grantType)
            it.addParam("refresh_token", refreshToken)
        }
    }
}
