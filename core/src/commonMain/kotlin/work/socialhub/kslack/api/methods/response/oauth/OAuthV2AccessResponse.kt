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

    /**
     * Present only when token rotation is enabled for the app. The bot
     * [accessToken] then expires after [expiresIn] seconds and can be renewed
     * with this refresh token via `oauth.v2.access` (grant_type=refresh_token).
     */
    var refreshToken: String? = null

    /** Lifetime of the bot [accessToken] in seconds (token rotation only). */
    var expiresIn: Int? = null
}

@JsExport
@Serializable
class OAuthAuthedUser {
    var id: String? = null
    var scope: String? = null
    var tokenType: String? = null // "user"
    var accessToken: String? = null // xoxp-xxx-yyy

    /**
     * Present only when token rotation is enabled for the app. The user
     * [accessToken] then expires after [expiresIn] seconds and can be renewed
     * with this refresh token via `oauth.v2.access` (grant_type=refresh_token).
     */
    var refreshToken: String? = null

    /** Lifetime of the user [accessToken] in seconds (token rotation only). */
    var expiresIn: Int? = null
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