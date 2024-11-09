package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Conversation
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsOpenResponse : SlackApiResponse() {
    var isNoOp: Boolean = false
    var isAlreadyOpen: Boolean = false
    var channel: Conversation? = null
}
