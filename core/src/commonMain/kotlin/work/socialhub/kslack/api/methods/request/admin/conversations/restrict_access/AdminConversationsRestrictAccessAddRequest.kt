package work.socialhub.kslack.api.methods.request.admin.conversations.restrict_access

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.restrictAccess.add
 */
@JsExport
class AdminConversationsRestrictAccessAddRequest(
    override var token: String?,
    /** The ID of the channel. */
    var channelId: String,
    /** A JSON array of restriction IDs. */
    var restriction: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("restriction", restriction)
        }
    }
}
