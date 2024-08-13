package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsSetPurposeRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to set the purpose of */
    var channel: String?,
    /** The new purpose */
    var purpose: String?
) : SlackApiRequest