package work.socialhub.kslack.api.methods.response.openid.connect

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class OpenIDConnectTokenResponse : SlackApiResponse() {

    @SerialName("access_token")
    var accessToken: String? = null

    @SerialName("token_type")
    var tokenType: String? = null

    @SerialName("id_token")
    var idToken: String? = null

    @SerialName("refresh_token")
    var refreshToken: String? = null

    @SerialName("expires_in")
    var expiresIn: Int? = null

    var scope: String? = null

    @SerialName("team_id")
    var teamId: String? = null

    @SerialName("enterprise_id")
    var enterpriseId: String? = null
}
