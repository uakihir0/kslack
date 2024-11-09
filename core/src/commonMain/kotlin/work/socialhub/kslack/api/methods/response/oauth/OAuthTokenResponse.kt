package work.socialhub.kslack.api.methods.response.oauth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.oauth.OAuthBot
import work.socialhub.kslack.entity.oauth.OAuthIncomingWebhook
import kotlin.js.JsExport

@JsExport
@Serializable
class OAuthTokenResponse : SlackApiResponse() {
    var accessToken: String? = null
    var scope: String? = null
    var teamName: String? = null
    var teamId: String? = null
    var userId: String? = null
    var incomingWebhook: OAuthIncomingWebhook? = null
    var bot: OAuthBot? = null
}