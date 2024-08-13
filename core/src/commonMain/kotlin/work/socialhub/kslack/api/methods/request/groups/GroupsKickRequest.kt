package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsKickRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to remove user from. */
    var channel: String?,
    /** User to remove from private channel. */
    var user: String?
) : SlackApiRequest