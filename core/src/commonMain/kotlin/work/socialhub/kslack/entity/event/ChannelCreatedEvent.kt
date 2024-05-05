package work.socialhub.kslack.entity.event

/**
 * The channel_created event is sent to all connections for a workspace when a new channel is created.
 * Clients can use this to update their local cache of non-joined channels.
 *
 *
 * https://api.slack.com/events/channel_created
 */
class ChannelCreatedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: Channel? = null

    class Channel {
        var id: String? = null
        var name: String? = null
        var created: Int? = null
        var creator: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "channel_created"
    }
}