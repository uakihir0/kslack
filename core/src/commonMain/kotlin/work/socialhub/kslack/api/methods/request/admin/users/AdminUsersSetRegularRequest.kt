package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setRegular
 */
class AdminUsersSetRegularRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Workspace Id */
    var teamId: String?,
    /** The ID of the user to designate as a regular user. */
    var userId: String?
) : SlackApiRequest