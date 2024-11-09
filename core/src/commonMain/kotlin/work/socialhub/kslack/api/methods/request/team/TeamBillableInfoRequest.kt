package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class TeamBillableInfoRequest(
    /** Authentication token. Requires scope: `admin` */
    override var token: String?,
    /** A user to retrieve the billable information for. Defaults to all users. */
    var user: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
        }
    }
}