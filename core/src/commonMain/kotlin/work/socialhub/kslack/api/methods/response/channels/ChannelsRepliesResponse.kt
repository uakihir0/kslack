package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ThreadInfo
import work.socialhub.kslack.entity.message.Message

@Serializable
class ChannelsRepliesResponse : SlackApiResponse() {
    var messages: Array<Message>? = null
    var threadInfo: ThreadInfo? = null
    var isHasMore: Boolean = false
}
