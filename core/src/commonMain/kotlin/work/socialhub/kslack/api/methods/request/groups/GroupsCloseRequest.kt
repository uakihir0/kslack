package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsCloseRequest(
    override var token: String?,
    var channel: String?
) : SlackApiRequest