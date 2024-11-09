package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsKickRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** ID of conversation to remove user from. */
    var channel: String?,
    /** User ID to be removed. */
    var user: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("user", user)
        }
    }
}