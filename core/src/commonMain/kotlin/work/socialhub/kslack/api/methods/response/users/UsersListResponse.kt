package work.socialhub.kslack.api.methods.response.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.user.User
import kotlin.js.JsExport

@JsExport
@Serializable
class UsersListResponse : SlackApiResponse() {
    var offset: String? = null // user id
    var members: Array<User>? = null
    var cacheTs: String? = null
    var responseMetadata: ResponseMetadata? = null
}
