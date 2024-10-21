package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsInviteRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to invite user to. */
    var channel: String?,
    /** User to invite to channel. */
    var user: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("user", user)
        }
    }
}