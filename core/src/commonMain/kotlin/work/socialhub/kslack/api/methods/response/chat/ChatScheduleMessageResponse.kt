package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class ChatScheduleMessageResponse : SlackApiResponse() {

    var scheduledMessageId: String? = null
    var channel: String? = null
    var postAt: Int? = null
    var message: Message? = null
}