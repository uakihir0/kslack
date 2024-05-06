package com.github.seratch.jslack.api.methods.response.reactions

import com.github.seratch.jslack.api.model.Reaction

class ReactionsGetResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var type: String? = null
    var channel: String? = null
    var message: Message? = null

    class Message {
        var type: String? = null
        var subtype: String? = null
        var text: String? = null
        var ts: String? = null
        var username: String? = null
        var botId: String? = null
        var permalink: String? = null
        var reactions: List<Reaction>? = null
    }
}