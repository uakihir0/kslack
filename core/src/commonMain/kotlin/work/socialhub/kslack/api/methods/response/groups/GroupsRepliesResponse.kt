package com.github.seratch.jslack.api.methods.response.groups

import com.github.seratch.jslack.api.model.Message

class GroupsRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: List<Message>? = null
    var threadInfo: ThreadInfo? = null
    var isHasMore: Boolean = false
}
