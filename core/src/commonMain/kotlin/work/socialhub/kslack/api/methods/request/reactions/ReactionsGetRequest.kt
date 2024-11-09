package work.socialhub.kslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ReactionsGetRequest(
    /** Authentication token. Requires scope: `reactions:read` */
    override var token: String?,
    /** File to get reactions for. */
    var file: String?,
    /** File comment to get reactions for. */
    var fileComment: String?,
    /** Channel where the message to get reactions for was posted. */
    var channel: String?,
    /** Timestamp of the message to get reactions for. */
    var timestamp: String?,
    /** If true always return the complete reaction list. */
    var isFull: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("file", file)
            it.addParam("file_comment", fileComment)
            it.addParam("channel", channel)
            it.addParam("timestamp", timestamp)
            it.addParam("full", isFull)
        }
    }
}