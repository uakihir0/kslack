package com.github.seratch.jslack.api.methods.response.im

import com.github.seratch.jslack.api.model.Message

class ImHistoryResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var latest: String? = null
    var messages: List<Message>? = null
    var isHasMore: Boolean = false
    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null
}