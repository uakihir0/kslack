package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersLookupByEmailRequest(
    /** Authentication token. Requires scope: `users:read.email` */
    override var token: String?,
    /** An email address belonging to a user in the workspace */
    var email: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("email", email)
        }
    }
}