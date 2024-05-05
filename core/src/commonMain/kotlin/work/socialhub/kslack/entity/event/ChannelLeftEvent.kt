package work.socialhub.kslack.entity.event

/**
 * The channel_left event is sometimes sent to all connections for a user when that user leaves a channel.
 * It is sometimes withheld.
 *
 *
 * Clients should respond to this message by closing the channel
 * — this means that when a channel is left from client A, it will automatically be closed in client B.
 *
 *
 * In addition to this message, all existing members of the channel will receive a channel_leave message event.
 *
 *
 * https://api.slack.com/events/channel_left
 */
class ChannelLeftEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_left"
    }
}