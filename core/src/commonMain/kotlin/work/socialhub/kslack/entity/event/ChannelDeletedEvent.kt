package work.socialhub.kslack.entity.event

/**
 * The channel_deleted event is sent to all connections for a workspace when a channel is deleted.
 * Clients can use this to update their local cache of non-joined channels.
 *
 *
 * https://api.slack.com/events/channel_deleted
 */
class ChannelDeletedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_deleted"
    }
}