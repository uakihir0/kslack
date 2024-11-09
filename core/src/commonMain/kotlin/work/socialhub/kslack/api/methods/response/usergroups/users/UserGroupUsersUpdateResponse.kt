package work.socialhub.kslack.api.methods.response.usergroups.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.UserGroup
import kotlin.js.JsExport

@JsExport
@Serializable
class UserGroupUsersUpdateResponse : SlackApiResponse() {
    var usergroup: UserGroup? = null
}