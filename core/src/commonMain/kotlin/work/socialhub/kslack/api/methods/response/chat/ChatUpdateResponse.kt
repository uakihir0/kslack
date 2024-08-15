package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.Message

@Serializable
class ChatUpdateResponse : SlackApiResponse() {
    var channel: String? = null
    var ts: String? = null
    var text: String? = null
    var message: Message? = null
}