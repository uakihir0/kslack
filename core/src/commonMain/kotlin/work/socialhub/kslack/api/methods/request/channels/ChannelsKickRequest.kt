package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChannelsKickRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** User to remove from channel. */
    var channel: String?,
    /** Channel to remove user from. */
    var user: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("user", user)
        }
    }

}