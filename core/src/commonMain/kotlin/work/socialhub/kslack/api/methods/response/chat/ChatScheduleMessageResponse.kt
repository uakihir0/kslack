package com.github.seratch.jslack.api.methods.response.chat

import com.github.seratch.jslack.api.model.Attachment

class ChatScheduleMessageResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var scheduledMessageId: String? = null
    var channel: String? = null
    var postAt: Int? = null
    var message: ScheduledMessage? = null

    class ScheduledMessage {
        var botId: String? = null
        var botProfile: BotProfile? = null

        var type: String? = null
        var team: String? = null
        var user: String? = null

        var text: String? = null
        var attachments: List<Attachment>? = null
        var blocks: List<LayoutBlock>? = null
    }
}