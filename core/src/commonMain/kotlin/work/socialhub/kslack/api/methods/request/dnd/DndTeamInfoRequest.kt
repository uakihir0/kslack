package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class DndTeamInfoRequest(
    /** Authentication token. Requires scope: `dnd:read` */
    override var token: String?,
    /** Comma-separated list of users to fetch Do Not Disturb status for */
    var users: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            if (users != null) {
                it.addParam("users", users!!.joinToString(","))
            }
        }
    }
}