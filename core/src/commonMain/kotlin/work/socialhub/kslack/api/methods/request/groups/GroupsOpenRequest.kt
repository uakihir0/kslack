package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsOpenRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to open. */
    var channel: String?
) : SlackApiRequest