package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ChatGetPermalinkResponse : SlackApiResponse() {
    var channel: String? = null
    var permalink: String? = null
}
