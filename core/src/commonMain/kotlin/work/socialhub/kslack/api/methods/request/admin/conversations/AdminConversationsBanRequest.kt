package work.socialhub.kslack.api.methods.request.admin.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.ban
 */
@JsExport
class AdminConversationsBanRequest(
    override var token: String?,
    /** The channel to ban the user in. */
    var channelId: String,
    /** The user to ban. */
    var userId: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("user_id", userId)
        }
    }
}
