package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsInviteRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to invite user to. */
    var channel: String?,
    /** User to invite. */
    var user: String?
) : SlackApiRequest