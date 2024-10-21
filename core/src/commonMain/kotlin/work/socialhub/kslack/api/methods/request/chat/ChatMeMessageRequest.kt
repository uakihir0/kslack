package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatMeMessageRequest(
    /** Authentication token. Requires scope: `chat:write:user` */
    override var token: String?,
    /** Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. */
    var channel: String?,
    /** Text of the message to send. */
    var text: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("text", text)
        }
    }
}