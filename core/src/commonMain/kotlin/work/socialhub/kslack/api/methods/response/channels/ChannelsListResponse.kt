package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel
import work.socialhub.kslack.entity.ResponseMetadata

@Serializable
class ChannelsListResponse : SlackApiResponse() {
    var channels: Array<Channel>? = null
    var responseMetadata: ResponseMetadata? = null
}
