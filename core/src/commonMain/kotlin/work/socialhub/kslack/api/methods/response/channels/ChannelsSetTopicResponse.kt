package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ChannelsSetTopicResponse : SlackApiResponse() {
    var topic: String? = null
}
