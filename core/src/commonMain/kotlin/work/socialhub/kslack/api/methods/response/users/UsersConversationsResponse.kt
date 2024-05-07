package com.github.seratch.jslack.api.methods.response.users

import com.github.seratch.jslack.api.model.Conversation

class UsersConversationsResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channels: Array<Conversation>? = null
    var responseMetadata: ResponseMetadata? = null
}
