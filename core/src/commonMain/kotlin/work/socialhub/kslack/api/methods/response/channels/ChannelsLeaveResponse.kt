package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ChannelsLeaveResponse : SlackApiResponse() {
    var isNotInChannel: Boolean = false
}
