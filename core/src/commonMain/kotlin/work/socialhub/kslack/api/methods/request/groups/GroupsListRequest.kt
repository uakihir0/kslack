package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class GroupsListRequest(
    /** Authentication token. Requires scope: `groups:read` */
    override var token: String?,
    /** Exclude the `members` from each `group` */
    var isExcludeMembers: Boolean,
    /** Don't return archived private channels. */
    var isExcludeArchived: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("exclude_archived", isExcludeArchived)
            it.addParam("exclude_members", isExcludeMembers)
        }
    }
}