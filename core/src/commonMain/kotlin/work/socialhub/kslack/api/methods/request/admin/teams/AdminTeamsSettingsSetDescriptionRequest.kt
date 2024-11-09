package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.teams.settings.setDescription
 */
@JsExport
class AdminTeamsSettingsSetDescriptionRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** ID for the workspace to set the description for. */
    var teamId: String?, var description: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("team_id", teamId)
            it.addParam("description", description)
        }
    }
}
