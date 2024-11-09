package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsersSetPresenceRequest(
    /** Authentication token. Requires scope: `users:write` */
    override var token: String?,
    /** Either `auto` or `away` */
    var presence: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("presence", presence)
        }
    }
}