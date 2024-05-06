package com.github.seratch.jslack.api.methods.response.conversations

import com.github.seratch.jslack.api.model.Message

class ConversationsRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: List<Message>? = null
    var isHasMore: Boolean = false
    var responseMetadata: ResponseMetadata? = null
}
