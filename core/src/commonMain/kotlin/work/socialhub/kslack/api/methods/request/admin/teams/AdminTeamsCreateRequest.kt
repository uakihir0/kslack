package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.teams.create
 */
@JsExport
class AdminTeamsCreateRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Team domain (for example, slacksoftballteam). */
    var teamDomain: String?,
    /** Team name (for example, Slack Softball Team). */
    var teamName: String?,
    /** Description for the team. */
    var teamDescription: String?,
    /** Who can join the team. A team's discoverability can be open, closed, invite_only, or unlisted.*/
    var teamDiscoverability: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("team_domain", teamDomain)
            it.addParam("team_name", teamName)
            it.addParam("team_description", teamDescription)
            it.addParam("team_discoverability", teamDiscoverability)
        }
    }
}