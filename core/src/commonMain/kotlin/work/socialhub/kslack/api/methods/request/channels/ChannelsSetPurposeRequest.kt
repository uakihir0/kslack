package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChannelsSetPurposeRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to set the purpose of */
    var channel: String?,
    /** The new purpose */
    var purpose: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("purpose", purpose)
        }
    }
}