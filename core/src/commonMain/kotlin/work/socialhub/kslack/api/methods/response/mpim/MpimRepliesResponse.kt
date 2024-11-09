package work.socialhub.kslack.api.methods.response.mpim

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class MpimRepliesResponse : SlackApiResponse() {
    var messages: Array<Message>? = null
}