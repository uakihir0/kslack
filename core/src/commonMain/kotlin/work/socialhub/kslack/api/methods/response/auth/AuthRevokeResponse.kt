package work.socialhub.kslack.api.methods.response.auth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AuthRevokeResponse : SlackApiResponse() {
    var isRevoked: Boolean = false
}