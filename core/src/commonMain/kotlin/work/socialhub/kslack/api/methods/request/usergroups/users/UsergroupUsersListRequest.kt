package work.socialhub.kslack.api.methods.request.usergroups.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsergroupUsersListRequest(
    /** Authentication token. Requires scope: `usergroups:read` */
    override var token: String?,
    /** The encoded ID of the User Group to update. */
    var usergroup: String?,
    /** Allow results that involve disabled User Groups. */
    var isIncludeDisabled: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("usergroup", usergroup)
            it.addParam("include_disabled", isIncludeDisabled)
        }
    }
}