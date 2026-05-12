package work.socialhub.kslack.api.methods.request.admin.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.search
 */
@JsExport
class AdminConversationsSearchRequest(
    override var token: String?,
    /** A cursor as returned by a previous API call. */
    var cursor: String?,
    /** If set, only private channels will be included in the results. */
    var isPrivate: Boolean?,
    /** The maximum number of items to return. */
    var limit: Int?,
    /** A search term. */
    var query: String?,
    /** The name of the property to sort the results by. */
    var sort: String?,
    /** The direction to sort the results. */
    var sortDir: String?,
    /** An array of workspace IDs. */
    var workspaceIds: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("is_private", isPrivate)
            it.addParam("limit", limit)
            it.addParam("query", query)
            it.addParam("sort", sort)
            it.addParam("sort_dir", sortDir)
            it.addParam("workspace_ids", workspaceIds?.joinToString(","))
        }
    }
}
