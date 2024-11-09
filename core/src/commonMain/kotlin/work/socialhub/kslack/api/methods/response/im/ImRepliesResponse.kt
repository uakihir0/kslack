package work.socialhub.kslack.api.methods.response.im

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.MessageRoot
import kotlin.js.JsExport

@JsExport
@Serializable
class ImRepliesResponse : SlackApiResponse() {
    var messages: Array<MessageRoot>? = null
    var isHasMore: Boolean = false
}