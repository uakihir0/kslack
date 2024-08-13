package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsSetPurposeRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to set the purpose of */
    var channel: String?,
    /** The new purpose */
    var purpose: String?
) : SlackApiRequest