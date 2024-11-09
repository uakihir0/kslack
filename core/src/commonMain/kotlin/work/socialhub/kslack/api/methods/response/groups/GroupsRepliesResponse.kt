package work.socialhub.kslack.api.methods.response.groups

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ThreadInfo
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class GroupsRepliesResponse : SlackApiResponse() {
    var messages: Array<Message>? = null
    var threadInfo: ThreadInfo? = null
    var isHasMore: Boolean = false
}
