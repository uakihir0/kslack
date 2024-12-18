package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsergroupsEnableRequest(
    /** Authentication token. Requires scope: `usergroups:write` */
    override var token: String?,
    /** The encoded ID of the User Group to enable. */
    var usergroup: String?,
    /** Include the number of users in the User Group. */
    var isIncludeCount: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("usergroup", usergroup)
            it.addParam("include_count", isIncludeCount)
        }
    }
}