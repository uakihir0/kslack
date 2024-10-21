package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsInviteRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** The ID of the public or private channel to invite user(s) to. */
    var channel: String?,
    /** A comma separated list of user IDs. Up to 30 users may be listed. */
    var users: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            if (users != null) {
                it.addParam("users", users!!.joinToString(","))
            }
        }
    }
}