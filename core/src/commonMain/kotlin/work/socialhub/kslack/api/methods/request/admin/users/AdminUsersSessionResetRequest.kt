package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.session.reset
 */
class AdminUsersSessionResetRequest(
    /** Authentication token bearing required scopes. (admin.users:write) */
    override var token: String?,
    /** The ID of the user to wipe sessions for */
    var userId: String?,
    /** Only expire mobile sessions (default: false) */
    var isMobileOnly: Boolean,
    /** Only expire web sessions (default: false) */
    var isWebOnly: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user_id", userId)
            it.addParam("mobile_only", isMobileOnly)
            it.addParam("web_only", isWebOnly)
        }
    }
}