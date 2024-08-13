package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsInviteRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Channel to invite user to. */
    var channel: String?,
    /** User to invite to channel. */
    var user: String?
) : SlackApiRequest