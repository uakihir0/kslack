package work.socialhub.kslack.api.methods.response.groups

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel
import kotlin.js.JsExport

@JsExport
@Serializable
class GroupsRenameResponse : SlackApiResponse() {
    var channel: Channel? = null
}