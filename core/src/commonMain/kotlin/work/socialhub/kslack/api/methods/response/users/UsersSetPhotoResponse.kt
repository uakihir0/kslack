package work.socialhub.kslack.api.methods.response.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.Profile
import kotlin.js.JsExport

@JsExport
@Serializable
class UsersSetPhotoResponse : SlackApiResponse() {
    var profile: Profile? = null
}
