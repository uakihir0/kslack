package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.remove
 */
class AdminUsersRemoveRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Workspace Id */
    var teamId: String?,
    /** The ID of the user to remove. */
    var userId: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("team_id", teamId)
            it.addParam("user_id", userId)
        }
    }
}