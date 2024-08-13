package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsJoinRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** Name of channel to join */
    var name: String?,
    /** Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria. */
    var isValidate: Boolean
) : SlackApiRequest