package com.github.seratch.jslack.api.methods.response.im

class ImRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: List<MessageRoot>? = null
    var isHasMore: Boolean = false
}