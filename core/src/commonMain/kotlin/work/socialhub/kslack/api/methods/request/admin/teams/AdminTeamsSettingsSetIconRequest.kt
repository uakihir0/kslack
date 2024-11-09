package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.teams.settings.setIcon
 */
@JsExport
class AdminTeamsSettingsSetIconRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** ID for the workspace to set the icon for. */
    var teamId: String?, var imageUrl: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("team_id", teamId)
            it.addParam("image_url", imageUrl)
        }
    }
}