package work.socialhub.kslack.api.methods.request.admin.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.setCustomRetention
 */
@JsExport
class AdminConversationsSetCustomRetentionRequest(
    override var token: String?,
    /** The ID of the channel. */
    var channelId: String,
    /** The retention period in days. */
    var durationDays: Int
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("duration_days", durationDays)
        }
    }
}
