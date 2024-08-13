package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsUnarchiveRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to unarchive */
    var channel: String?
) : SlackApiRequest