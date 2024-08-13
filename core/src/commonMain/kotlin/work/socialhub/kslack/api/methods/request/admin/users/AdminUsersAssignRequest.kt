package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.assign
 */
class AdminUsersAssignRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Workspace Id. */
    var teamId: String?,
    /** The ID of the user to add to the workspace. */
    var userId: String?,
    /** True if user should be added to the workspace as a guest. */
    var isRestricted: Boolean,
    /** True if user should be added to the workspace as a single-channel guest. */
    var isUltraRestricted: Boolean
) : SlackApiRequest