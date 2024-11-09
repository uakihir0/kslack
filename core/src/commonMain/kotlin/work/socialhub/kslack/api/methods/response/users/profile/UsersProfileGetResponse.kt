package work.socialhub.kslack.api.methods.response.users.profile

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.Profile
import kotlin.js.JsExport

@JsExport
@Serializable
class UsersProfileGetResponse : SlackApiResponse() {
    var profile: Profile? = null
}