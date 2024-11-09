package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.Conversation
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsListResponse : SlackApiResponse() {
    var channels: Array<Conversation>? = null
    var responseMetadata: ResponseMetadata? = null
}
