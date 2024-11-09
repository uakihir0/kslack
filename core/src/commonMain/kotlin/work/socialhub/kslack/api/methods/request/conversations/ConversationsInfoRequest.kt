package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsInfoRequest(
    /** Authentication token. Requires scope: `conversations:read` */
    override var token: String?,
    /** Conversation ID to learn more about */
    var channel: String?,

    /**
     * Set this to `true` to receive the locale for this conversation.
     * Defaults to `false`
     */

    var isIncludeLocale: Boolean,
    /**
     * Set to true to include the member count for the specified conversation.
     * Defaults to false
     */
    var isIncludeNumMembers: Boolean
) : SlackApiRequest , FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("include_locale", isIncludeLocale)
            it.addParam("include_num_members", isIncludeNumMembers)
        }
    }
}