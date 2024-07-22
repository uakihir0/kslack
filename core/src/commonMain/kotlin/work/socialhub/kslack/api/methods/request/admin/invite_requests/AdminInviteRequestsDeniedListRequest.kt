package work.socialhub.kslack.api.methods.request.admin.invite_requests

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.inviteRequests.denied.list
 */
class AdminInviteRequestsDeniedListRequest (
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Set cursor to next_cursor returned by the previous call to list items in the next page */
    var cursor: String?,
    /** The maximum number of items to return. Must be between 1 - 1000 both inclusive. */
    var limit: Int?,
    /** Workspace Id. */
    var teamId: String?
) : SlackApiRequest