package com.github.seratch.jslack.api.methods.response.mpim

import com.github.seratch.jslack.api.model.Message

class MpimRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: Array<Message>? = null
}