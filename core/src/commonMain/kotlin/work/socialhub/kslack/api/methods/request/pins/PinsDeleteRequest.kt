package work.socialhub.kslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/pins.delete
 */
@JsExport
class PinsDeleteRequest(
    override var token: String?,
    /** The channel containing the item to be pinned. */
    var channelId: String,
    /** A timestamp, in the format described in the Slack API documentation, of the item to be unpinned. */
    var timestamp: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("timestamp", timestamp)
        }
    }
}
