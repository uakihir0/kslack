package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.Message

class ChatPostMessageResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null
    var channel: String? = null
    var ts: String? = null
    var message: Message? = null

    @Serializable
    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}