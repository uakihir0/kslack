package work.socialhub.kslack.api.methods.response.chat.scheduled_messages

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata
import work.socialhub.kslack.entity.message.ScheduledMessage
import kotlin.js.JsExport

@JsExport
@Serializable
class ChatScheduleMessagesListResponse : SlackApiResponse() {
    var scheduledMessages: Array<ScheduledMessage>? = null
    var responseMetadata: ResponseMetadata? = null
}