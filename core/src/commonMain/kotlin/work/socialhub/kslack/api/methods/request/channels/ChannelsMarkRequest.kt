package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsMarkRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to set reading cursor in.
     */
    var channel: String?,
    /**
     * Timestamp of the most recently seen message.
     */
    var ts: String?
) : SlackApiRequest