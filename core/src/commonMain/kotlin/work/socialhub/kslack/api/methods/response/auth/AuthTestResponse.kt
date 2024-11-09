package work.socialhub.kslack.api.methods.response.auth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AuthTestResponse : SlackApiResponse() {
    var url: String? = null
    var team: String? = null
    var user: String? = null
    var teamId: String? = null
    var userId: String? = null
    var enterpriseId: String? = null
}