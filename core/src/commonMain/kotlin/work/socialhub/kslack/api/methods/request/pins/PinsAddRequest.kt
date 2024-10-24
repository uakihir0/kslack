package work.socialhub.kslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsAddRequest(
    /** Authentication token. Requires scope: `pins:write` */
    override var token: String?,
    /** Channel to pin the item in. */
    var channel: String?,
    /** File to pin. */
    var file: String?,
    /** File comment to pin. */
    var fileComment: String?,
    /** Timestamp of the message to pin. */
    var timestamp: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("file", file)
            it.addParam("file_comment", fileComment)
            it.addParam("timestamp", timestamp)
        }
    }
}