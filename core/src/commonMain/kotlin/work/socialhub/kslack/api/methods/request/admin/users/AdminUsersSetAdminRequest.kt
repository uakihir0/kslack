package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setAdmin
 */
class AdminUsersSetAdminRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Workspace Id */
    var teamId: String?,
    /** The ID of the user to designate as an admin. */
    var userId: String?
) : SlackApiRequest