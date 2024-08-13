package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsLeaveRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to leave */
    var channel: String?
) : SlackApiRequest