package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.owners.list
 */
class AdminTeamsOwnersListRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Set cursor to next_cursor returned by the previous call to list items in the next page */
    var cursor: String?,
    /** The maximum number of items to return. Must be between 1 - 1000 both inclusive. */
    var limit: Int?,
    /** Workspace Id. */
    var teamId: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
            it.addParam("team_id", teamId)
        }
    }
}