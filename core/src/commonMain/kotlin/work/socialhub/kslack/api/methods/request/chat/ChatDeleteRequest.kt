package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatDeleteRequest(
    /** Authentication token. Requires scope: `chat:write` */
    override var token: String?,
    /** Timestamp of the message to be deleted. */
    var ts: String?,
    /** Channel containing the message to be deleted. */
    var channel: String?,

    /**
     * Pass true to delete the message as the authed user with `chat:write:user` scope.
     * [Bot users](/bot-users) in this context are considered authed users.
     * If unused or false, the message will be deleted with `chat:write:bot` scope.
     */
    var isAsUser: Boolean
) : SlackApiRequest , FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("ts", ts)
        }
    }
}