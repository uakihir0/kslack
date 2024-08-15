package work.socialhub.kslack.api.methods.response.auth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class AuthRevokeResponse : SlackApiResponse() {
    var isRevoked: Boolean = false
}