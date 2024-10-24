package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class DndInfoRequest(
    /** Authentication token. Requires scope: `dnd:read` */
    override var token: String?,
    /** User to fetch status for (defaults to current user) */
    var user: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
        }
    }
}