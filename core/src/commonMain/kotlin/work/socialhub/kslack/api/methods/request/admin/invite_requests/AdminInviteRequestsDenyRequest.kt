package work.socialhub.kslack.api.methods.request.admin.invite_requests

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.inviteRequests.deny
 */
class AdminInviteRequestsDenyRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** ID of the request to deny. */
    var inviteRequestId: String?,
    /** ID for the workspace where the invite request was made. */
    var teamId: String?
) : SlackApiRequest