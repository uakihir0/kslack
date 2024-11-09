package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class MpimRepliesRequest(
    /** Authentication token. Requires scope: `mpim:history` */
    override var token: String?,
    /** Multiparty direct message channel to fetch thread from. */
    var channel: String?,
    /** Unique identifier of a thread's parent message. */
    var threadTs: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("thread_ts", threadTs)
        }
    }
}