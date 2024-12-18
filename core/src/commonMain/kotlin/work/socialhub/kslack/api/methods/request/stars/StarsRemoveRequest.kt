package work.socialhub.kslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class StarsRemoveRequest(
    /** Authentication token. Requires scope: `stars:write` */
    override var token: String?,
    /** File to remove star from. */
    var file: String?,
    /** File comment to remove star from. */
    var fileComment: String?,
    /** Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`). */
    var channel: String?,
    /** Timestamp of the message to remove star from. */
    var timestamp: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("file", file)
            it.addParam("file_comment", fileComment)
            it.addParam("timestamp", timestamp)
        }
    }
}