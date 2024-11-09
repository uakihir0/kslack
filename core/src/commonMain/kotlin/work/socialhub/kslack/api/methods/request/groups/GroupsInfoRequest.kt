package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class GroupsInfoRequest(
    /** Authentication token. Requires scope: `groups:read` */
    override var token: String?,
    /** Private channel to get info on */
    var channel: String?,
    /** Set this to `true` to receive the locale for this group. Defaults to `false` */
    var isIncludeLocale: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("include_locale", isIncludeLocale)
        }
    }
}