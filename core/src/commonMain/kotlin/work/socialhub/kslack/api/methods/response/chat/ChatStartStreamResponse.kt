package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ChatStartStreamResponse : SlackApiResponse() {

    @SerialName("stream_id")
    var streamId: String? = null

    var channel: String? = null
    var ts: String? = null
}
