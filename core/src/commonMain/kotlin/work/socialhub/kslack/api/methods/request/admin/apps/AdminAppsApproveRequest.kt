package work.socialhub.kslack.api.methods.request.admin.apps

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.apps.approve
 */
@JsExport
class AdminAppsApproveRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** The id of the app to approve. */
    var appId: String?,
    /** The id of the request to approve. */
    var requestId: String?,
    /** Workspace ID */
    var teamId: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("app_id", appId)
            it.addParam("request_id", requestId)
            it.addParam("team_id", teamId)
        }
    }
}