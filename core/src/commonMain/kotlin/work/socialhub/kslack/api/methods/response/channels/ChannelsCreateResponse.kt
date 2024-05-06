package com.github.seratch.jslack.api.methods.response.channels

import com.github.seratch.jslack.api.model.Channel

class ChannelsCreateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channel: Channel? = null
}
