package work.socialhub.kslack.api.methods.response.usergroups.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class UsergroupUsersListResponse : SlackApiResponse() {
    var users: Array<String>? = null
}