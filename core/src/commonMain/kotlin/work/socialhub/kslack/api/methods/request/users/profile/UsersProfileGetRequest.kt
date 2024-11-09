package work.socialhub.kslack.api.methods.request.users.profile

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsersProfileGetRequest(
    /** Authentication token. Requires scope: `users.profile:read` */
    override var token: String?,
    /** User to retrieve profile info for */
    var user: String?,
    /** Include labels for each ID in custom profile fields */
    var isIncludeLabels: Boolean
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
            it.addParam("include_labels", isIncludeLabels)
        }
    }
}