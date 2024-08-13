package work.socialhub.kslack.api.methods.response.channels

import work.socialhub.kslack.api.model.Channel

class ChannelsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channels: Array<Channel>? = null
    var responseMetadata: ResponseMetadata? = null
}
