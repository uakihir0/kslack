package work.socialhub.kslack.api.methods.request.team.external_teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class TeamExternalTeamsListRequest(
    override var token: String?,
    var connectionStatusFilter: String? = null,
    var cursor: String? = null,
    var limit: Int? = null,
    var slackConnectPrefFilter: String? = null,
    var sortDirection: String? = null,
    var sortField: String? = null,
    var workspaceFilter: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("connection_status_filter", connectionStatusFilter)
            it.addParam("cursor", cursor)
            it.addParam("limit", limit?.toString())
            it.addParam("slack_connect_pref_filter", slackConnectPrefFilter)
            it.addParam("sort_direction", sortDirection)
            it.addParam("sort_field", sortField)
            it.addParam("workspace_filter", workspaceFilter)
        }
    }
}
