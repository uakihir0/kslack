package work.socialhub.kslack.api.methods.response.usergroups

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.user.UserGroup
import kotlin.js.JsExport

@JsExport
@Serializable
class UsergroupsListResponse : SlackApiResponse() {
    var usergroups: Array<UserGroup>? = null
}