package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.User

@Serializable
class UsersLookupByEmailResponse : SlackApiResponse() {
    var user: User? = null
}
