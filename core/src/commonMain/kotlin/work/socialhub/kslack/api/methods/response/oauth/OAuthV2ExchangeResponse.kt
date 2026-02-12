package work.socialhub.kslack.api.methods.response.oauth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class OAuthV2ExchangeResponse : SlackApiResponse() {

    @SerialName("access_token")
    var accessToken: String? = null

    var scope: String? = null

    @SerialName("token_type")
    var tokenType: String? = null

    @SerialName("bot_user_id")
    var botUserId: String? = null

    var team: OAuthV2ExchangeTeam? = null
    var enterprise: OAuthV2ExchangeEnterprise? = null

    @SerialName("authed_user")
    var authedUser: OAuthV2ExchangeAuthedUser? = null
}

@JsExport
@Serializable
class OAuthV2ExchangeTeam {
    var id: String? = null
    var name: String? = null
}

@JsExport
@Serializable
class OAuthV2ExchangeEnterprise {
    var id: String? = null
    var name: String? = null
}

@JsExport
@Serializable
class OAuthV2ExchangeAuthedUser {
    var id: String? = null

    @SerialName("access_token")
    var accessToken: String? = null

    var scope: String? = null

    @SerialName("token_type")
    var tokenType: String? = null
}
