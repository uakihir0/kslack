package com.github.seratch.jslack.api.methods.response.conversations

import com.github.seratch.jslack.api.model.Conversation

class ConversationsOpenResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var isNoOp: Boolean = false
    var isAlreadyOpen: Boolean = false
    var channel: Conversation? = null
}
