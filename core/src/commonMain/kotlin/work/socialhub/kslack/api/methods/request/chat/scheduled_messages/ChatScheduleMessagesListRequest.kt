package work.socialhub.kslack.api.methods.request.chat.scheduled_messages

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatScheduleMessagesListRequest(
    override var token: String?,
    /**
     * The channel of the scheduled messages
     */
    var channel: String?,
    /**
     * For pagination purposes, this is the cursor value returned from a previous call to chat.scheduledmessages.list
     * indicating where you want to start this call from.
     */
    var cursor: String?,
    /**
     * A UNIX timestamp of the latest value in the time range
     */
    var latest: String?,
    /**
     * Maximum number of original entries to return.
     */
    var limit: Int?,
    /**
     * A UNIX timestamp of the oldest value in the time range
     */
    var oldest: String?
) : SlackApiRequest