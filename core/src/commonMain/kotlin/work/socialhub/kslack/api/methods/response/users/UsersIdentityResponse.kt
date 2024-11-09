package work.socialhub.kslack.api.methods.response.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.team.Team
import work.socialhub.kslack.entity.user.User
import kotlin.js.JsExport

@JsExport
@Serializable
class UsersIdentityResponse : SlackApiResponse() {
    var user: User? = null
    var team: Team? = null

}
