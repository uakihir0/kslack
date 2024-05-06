package com.github.seratch.jslack.api.methods.response.conversations

import com.github.seratch.jslack.api.model.ResponseMetadata

class ConversationsMembersResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var members: List<String>? = null
    var responseMetadata: ResponseMetadata? = null
}
