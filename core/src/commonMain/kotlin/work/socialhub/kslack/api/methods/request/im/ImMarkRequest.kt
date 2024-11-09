package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ImMarkRequest(
    /** Authentication token. Requires scope: `im:write` */
    override var token: String?,
    /** Direct message channel to set reading cursor in. */
    var channel: String?,
    /** Timestamp of the most recently seen message. */
    var ts: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("ts", ts)
        }
    }
}