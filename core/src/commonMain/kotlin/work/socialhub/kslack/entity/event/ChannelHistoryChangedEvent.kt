package work.socialhub.kslack.entity.event

/**
 * A channel_history_changed event is sent to all clients in a channel when bulk changes have occurred to that channel's history.
 * When clients receive this message they should reload chat history for the channel if they have any cached messages before latest.
 *
 *
 * This message is most often triggered as the result of a channel data import by a workspace administrator.
 *
 *
 * https://api.slack.com/events/channel_history_changed
 */
class ChannelHistoryChangedEvent : Event {
    override val type: String = TYPE_NAME
    var latest: String? = null
    var ts: String? = null
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_history_changed"
    }
}