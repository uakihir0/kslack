package work.socialhub.kslack.api.methods.response.chat.scheduled_messages

import work.socialhub.kslack.api.model.ResponseMetadata

class ChatScheduleMessagesListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var scheduledMessages: Array<ScheduledMessage>? = null
    var responseMetadata: ResponseMetadata? = null

    class ScheduledMessage {
        var id: String? = null
        var channelId: String? = null
        var postAt: Int? = null
        var dateCreated: Int? = null
    }
}