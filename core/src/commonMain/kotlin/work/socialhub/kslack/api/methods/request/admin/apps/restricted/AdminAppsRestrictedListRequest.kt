package work.socialhub.kslack.api.methods.request.admin.apps.restricted

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.apps.restricted.list
 */
@JsExport
class AdminAppsRestrictedListRequest(
    override var token: String?,
    /** A cursor as returned by a previous API call. */
    var cursor: String?,
    /** The maximum number of items to return. */
    var limit: Int?,
    /** The ID of the workspace to list apps for. */
    var appId: String?,
    /** The ID of the team to list apps for. */
    var teamId: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
            it.addParam("app_id", appId)
            it.addParam("team_id", teamId)
        }
    }
}
