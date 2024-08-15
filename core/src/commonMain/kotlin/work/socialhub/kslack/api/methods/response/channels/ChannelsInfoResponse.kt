package work.socialhub.kslack.api.methods.response.channels

import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel

class ChannelsInfoResponse : SlackApiResponse() {
    var channel: Channel? = null
}
