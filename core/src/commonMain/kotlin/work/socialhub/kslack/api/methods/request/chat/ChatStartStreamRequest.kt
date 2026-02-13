package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChatStartStreamRequest(
    override var token: String?,
    var channel: String?,
    var threadTs: String? = null,
    var text: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("thread_ts", threadTs)
            it.addParam("text", text)
        }
    }
}
