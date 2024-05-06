package com.github.seratch.jslack.api.methods.response.chat

import com.github.seratch.jslack.api.model.Message

class ChatPostMessageResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var responseMetadata: ResponseMetadata? = null

    class ResponseMetadata {
        var messages: List<String>? = null
    }

    var channel: String? = null
    var ts: String? = null
    var message: Message? = null
}