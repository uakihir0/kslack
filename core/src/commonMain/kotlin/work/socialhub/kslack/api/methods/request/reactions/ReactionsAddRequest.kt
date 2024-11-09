package work.socialhub.kslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ReactionsAddRequest(
    /** Authentication token. Requires scope: `reactions:write` */
    override var token: String?,
    /** Reaction (emoji) name. */
    var name: String?,
    /** File to add reaction to. */
    var file: String?,
    /** File comment to add reaction to. */
    var fileComment: String?,
    /** Channel where the message to add reaction to was posted. */
    var channel: String?,
    /** Timestamp of the message to add reaction to. */
    var timestamp: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("name", name)
            it.addParam("file", file)
            it.addParam("file_comment", fileComment)
            it.addParam("channel", channel)
            it.addParam("timestamp", timestamp)
        }
    }
}