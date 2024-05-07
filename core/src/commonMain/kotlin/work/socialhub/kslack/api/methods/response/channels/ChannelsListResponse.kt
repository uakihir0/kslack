package com.github.seratch.jslack.api.methods.response.channels

import com.github.seratch.jslack.api.model.Channel

class ChannelsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channels: Array<Channel>? = null
    var responseMetadata: ResponseMetadata? = null
}
