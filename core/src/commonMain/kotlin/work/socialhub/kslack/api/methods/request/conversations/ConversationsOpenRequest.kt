package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsOpenRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead. */
    var channel: String?,
    /** Boolean, indicates you want the full IM channel definition in the response. */
    var isReturnIm: Boolean,

    /**
     * Comma separated lists of users. If only one user is included, this creates a 1:1 DM.
     * The ordering of the users is preserved whenever a multi-person direct message is returned.
     * Supply a `channel` when not supplying `users`.
     */
    var users: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("return_im", isReturnIm)

            if (users != null) {
                it.addParam("users", users!!.joinToString(","))
            }
        }
    }
}