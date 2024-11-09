package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class MpimCloseRequest(
    /** Authentication token. Requires scope: `mpim:write` */
    override var token: String?,
    /** MPIM to close. */
    var channel: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
        }
    }
}