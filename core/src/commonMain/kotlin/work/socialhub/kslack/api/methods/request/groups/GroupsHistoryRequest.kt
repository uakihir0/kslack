package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsHistoryRequest(
    /** Authentication token. Requires scope: `groups:history` */
    override var token: String?,
    /** Direct message channel to fetch history for. */
    var channel: String?,
    /** tart of time range of messages to include in results. */
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