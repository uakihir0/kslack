package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImHistoryRequest(
    /** Authentication token. Requires scope: `im:history` */
    override var token: String?,
    /** Direct message channel to fetch history for. */
    var channel: String?,
    /** Start of time range of messages to include in results. */
    var oldest: String?,
    /** End of time range of messages to include in results. */
    var latest: String?,
    /** Include messages with latest or oldest timestamp in results. */
    var isInclusive: Boolean,
    /** Number of messages to return, between 1 and 1000. */
    var count: Int?,
    /** Include `unread_count_display` in the output? */
    var isUnreads: Boolean
) : SlackApiRequest