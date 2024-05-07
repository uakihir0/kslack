package com.github.seratch.jslack.api.methods.response.pins

import com.github.seratch.jslack.api.model.File

class PinsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var items: Array<MessageItem>? = null

    class MessageItem {
        var type: String? = null
        var channel: String? = null
        var message: Message? = null
        var file: File? = null
        var comment: FileComment? = null
        var createdBy: String? = null
        var created: Int? = null
    }
}