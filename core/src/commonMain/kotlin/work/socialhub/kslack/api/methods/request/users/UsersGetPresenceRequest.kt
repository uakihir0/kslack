package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsersGetPresenceRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,
    /** User to get presence info on. Defaults to the authed user. */
    var user: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
        }
    }
}