package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsListRequest(
    /** Authentication token. Requires scope: `usergroups:read */
    override var token: String?,
    /** Include disabled User Groups. */
    var isIncludeDisabled: Boolean,
    /** Include the number of users in each User Group */
    var isIncludeCount: Boolean,
    /** Include the list of users for each User Group. */
    var isIncludeUsers: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("include_disabled", isIncludeDisabled)
            it.addParam("include_count", isIncludeCount)
            it.addParam("include_users", isIncludeUsers)
        }
    }
}