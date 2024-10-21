package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsMarkRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to set reading cursor in. */
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