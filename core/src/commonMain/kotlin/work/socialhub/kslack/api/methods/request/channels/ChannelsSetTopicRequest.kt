package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsSetTopicRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to set the topic of */
    var channel: String?,
    /** The new topic */
    var topic: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("topic", topic)
        }
    }
}