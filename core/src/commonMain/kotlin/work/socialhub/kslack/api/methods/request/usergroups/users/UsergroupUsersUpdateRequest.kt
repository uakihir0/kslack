package work.socialhub.kslack.api.methods.request.usergroups.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsergroupUsersUpdateRequest(
    /** Authentication token. Requires scope: `usergroups:write` */
    override var token: String?,
    /** The encoded ID of the User Group to update. */
    var usergroup: String?,
    /** A comma separated string of encoded user IDs that represent the entire list of users for the User Group. */
    var users: Array<String>?,
    /** Include the number of users in the User Group. */
    var isIncludeCount: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("usergroup", usergroup)
            if (users != null) {
                it.addParam("users", users!!.joinToString(","))
            }
            it.addParam("include_count", isIncludeCount)
        }
    }
}