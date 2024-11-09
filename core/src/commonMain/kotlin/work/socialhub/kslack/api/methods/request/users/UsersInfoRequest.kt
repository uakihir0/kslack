package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsersInfoRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,
    /** User to get info on */
    var user: String?,
    /** Set this to `true` to receive the locale for this user. Defaults to `false` */
    var isIncludeLocale: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
            it.addParam("include_locale", isIncludeLocale)
        }
    }
}