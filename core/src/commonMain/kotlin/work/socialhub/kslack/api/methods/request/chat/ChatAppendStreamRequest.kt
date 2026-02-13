package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChatAppendStreamRequest(
    override var token: String?,
    var streamId: String?,
    var channel: String?,
    var text: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("stream_id", streamId)
            it.addParam("channel", channel)
            it.addParam("text", text)
        }
    }
}
