package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.settings.setDescription
 */
class AdminTeamsSettingsSetDescriptionRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** ID for the workspace to set the description for. */
    var teamId: String?, var description: String?
) : SlackApiRequest
