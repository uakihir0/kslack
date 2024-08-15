package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ChatDeleteResponse : SlackApiResponse() {
    var channel: String? = null
    var ts: String? = null
}