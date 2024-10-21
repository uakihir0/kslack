package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * A request to retrieve a permalink URL for a specific extant message
 * @see [Slack chat.getPermalink API](https://api.slack.com/methods/chat.getPermalink)
 */
class ChatGetPermalinkRequest(
    /** Authentication token. Requires scope: `none` */
    override var token: String?,
    /** The ID of the conversation or channel containing the message */
    var channel: String?,
    /** A message's `ts` value, uniquely identifying it within a channel */
    var messageTs: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("message_ts", messageTs)
        }
    }
}