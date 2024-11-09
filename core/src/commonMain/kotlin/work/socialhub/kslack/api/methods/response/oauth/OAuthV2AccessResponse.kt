package work.socialhub.kslack.api.methods.response.oauth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.oauth.OAuthIncomingWebhook
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/oauth.v2.access
 */
@JsExport
@Serializable
class OAuthV2AccessResponse : SlackApiResponse() {
    var appId: String? = null
    var authedUser: OAuthAuthedUser? = null
    var scope: String? = null
    var tokenType: String? = null // "bot"
    var accessToken: String? = null // xoxb-xxx-yyy
    var botUserId: String? = null
    var team: OAuthTeam? = null
    var enterprise: OAuthEnterprise? = null
    var incomingWebhook: OAuthIncomingWebhook? = null
}

@JsExport
@Serializable
class OAuthAuthedUser {
    var id: String? = null
    var scope: String? = null
    var tokenType: String? = null // "user"
    var accessToken: String? = null // xoxp-xxx-yyy
}
@JsExport
@Serializable
class OAuthTeam {
    var id: String? = null
    var name: String? = null
}

@JsExport
@Serializable
class OAuthEnterprise {
    var id: String? = null
    var name: String? = null
}