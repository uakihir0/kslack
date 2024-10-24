package work.socialhub.kslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsRemoveRequest(
    /** Authentication token. Requires scope: `reactions:write` */
    override var token: String?,
    /** Reaction (emoji) name.*/
    var name: String?,
    /** File to remove reaction from. */
    var file: String?,
    /** File comment to remove reaction from. */
    var fileComment: String?,
    /** Channel where the message to remove reaction from was posted. */
    var channel: String?,
    /** Timestamp of the message to remove reaction from. */
    var timestamp: String?
) : SlackApiRequest, FormRequest {

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