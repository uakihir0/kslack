package work.socialhub.kslack.api.methods.response.chat.scheduled_messages

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata

@Serializable
class ChatScheduleMessagesListResponse : SlackApiResponse() {
    var scheduledMessages: Array<ScheduledMessage>? = null
    var responseMetadata: ResponseMetadata? = null

    @Serializable
    class ScheduledMessage {
        var id: String? = null
        var channelId: String? = null
        var postAt: Int? = null
        var dateCreated: Int? = null
    }
}