package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChannelsRepliesRequest(
    /** Authentication token. Requires scope: `channels:history */
    override var token: String?,
    /** Channel to fetch thread from */
    var channel: String?,
    /** Unique identifier of a thread's parent message */
    var threadTs: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("thread_ts", threadTs)
        }
    }
}