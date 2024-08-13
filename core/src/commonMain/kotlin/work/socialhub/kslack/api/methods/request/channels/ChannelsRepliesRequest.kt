package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsRepliesRequest(
    /** Authentication token. Requires scope: `channels:history */
    override var token: String?,
    /** Channel to fetch thread from */
    var channel: String?,
    /** Unique identifier of a thread's parent message */
    var threadTs: String?
) : SlackApiRequest