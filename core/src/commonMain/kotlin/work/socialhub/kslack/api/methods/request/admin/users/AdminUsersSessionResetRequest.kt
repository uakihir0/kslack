package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.session.reset
 */
class AdminUsersSessionResetRequest (
    /** Authentication token bearing required scopes. (admin.users:write) */
    override var token: String?,
    /** The ID of the user to wipe sessions for */
    var userId: String?,
    /** Only expire mobile sessions (default: false) */
    var isMobileOnly: Boolean,
    /** Only expire web sessions (default: false) */
    var isWebOnly: Boolean
) : SlackApiRequest