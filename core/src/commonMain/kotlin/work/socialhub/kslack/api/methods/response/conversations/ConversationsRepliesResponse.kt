package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsRepliesResponse : SlackApiResponse() {
    var messages: Array<Message>? = null
    var isHasMore: Boolean = false
    var responseMetadata: ResponseMetadata? = null
}
