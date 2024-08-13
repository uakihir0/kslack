package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsInfoRequest(
    /** Authentication token. Requires scope: `groups:read` */
    override var token: String?,
    /** Private channel to get info on */
    var channel: String?,
    /** Set this to `true` to receive the locale for this group. Defaults to `false` */
    var isIncludeLocale: Boolean
) : SlackApiRequest