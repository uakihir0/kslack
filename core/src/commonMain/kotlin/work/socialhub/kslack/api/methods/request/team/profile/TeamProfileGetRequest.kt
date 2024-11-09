package work.socialhub.kslack.api.methods.request.team.profile

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class TeamProfileGetRequest(
    /** Authentication token. Requires scope: `users.profile:read` */
    override var token: String?,
    /** Filter by visibility. */
    var visibility: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("visibility", visibility)
        }
    }
}