package work.socialhub.kslack.api.methods.request.admin.conversations.restrict_access

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.restrictAccess.list
 */
@JsExport
class AdminConversationsRestrictAccessListRequest(
    override var token: String?,
    /** The ID of the channel. */
    var channelId: String,
    /** A cursor as returned by a previous API call. */
    var cursor: String?,
    /** The maximum number of items to return. */
    var limit: Int?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
        }
    }
}
