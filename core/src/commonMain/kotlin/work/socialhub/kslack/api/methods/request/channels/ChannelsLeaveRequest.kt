package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsLeaveRequest(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to leave
     */
    var channel: String?
) : SlackApiRequest