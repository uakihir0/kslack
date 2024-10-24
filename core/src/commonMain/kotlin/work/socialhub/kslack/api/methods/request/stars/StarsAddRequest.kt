package work.socialhub.kslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsAddRequest(
    /** Authentication token. Requires scope: `stars:write` */
    override var token: String?,
    /** File to add star to. */
    var file: String?,
    /** File comment to add star to. */
    var fileComment: String?,
    /** Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`). */
    var channel: String?,
    /** Timestamp of the message to add star to. */
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