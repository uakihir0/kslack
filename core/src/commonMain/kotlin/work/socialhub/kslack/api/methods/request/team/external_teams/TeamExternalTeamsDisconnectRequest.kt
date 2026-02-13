package work.socialhub.kslack.api.methods.request.team.external_teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class TeamExternalTeamsDisconnectRequest(
    override var token: String?,
    var targetTeam: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("target_team", targetTeam)
        }
    }
}
