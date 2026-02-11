package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsMarkRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Channel or conversation to set the read cursor for. */
    var channel: String?,
    /** Unique identifier of message you want marked as most recently seen in this conversation. */
    var ts: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("ts", ts)
        }
    }
}
