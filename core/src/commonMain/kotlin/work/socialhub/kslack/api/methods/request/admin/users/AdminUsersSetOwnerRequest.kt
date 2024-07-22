package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setOwner
 */
class AdminUsersSetOwnerRequest (
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Workspace Id */
    var teamId: String?,
    /** Id of the user to promote to owner. */
    var userId: String?
) : SlackApiRequest