package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsHistoryRequest(
    /** Authentication token. Requires scope: `channels:history` */
    override var token: String?,
    /** Channel to fetch history for. */
    var channel: String?,
    /** End of time range of messages to include in results. */
    var latest: String?,
    /** Start of time range of messages to include in results. */
    var oldest: String?,
    /** Include messages with latest or oldest timestamp in results. */
    var isInclusive: Boolean,
    /** Number of messages to return, between 1 and 1000. */
    var count: Int?,
    /** Include `unread_count_display` in the output? */
    var isUnreads: Boolean
) : SlackApiRequest