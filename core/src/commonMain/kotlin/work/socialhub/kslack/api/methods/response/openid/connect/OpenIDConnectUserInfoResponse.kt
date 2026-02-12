package work.socialhub.kslack.api.methods.response.openid.connect

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class OpenIDConnectUserInfoResponse : SlackApiResponse() {

    var sub: String? = null
    var email: String? = null

    @SerialName("email_verified")
    var emailVerified: Boolean? = null

    var name: String? = null
    var picture: String? = null

    @SerialName("given_name")
    var givenName: String? = null

    @SerialName("family_name")
    var familyName: String? = null

    var locale: String? = null

    @SerialName("team_id")
    var teamId: String? = null
}
