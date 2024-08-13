package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsArchiveRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to archive */
    var channel: String?
) : SlackApiRequest