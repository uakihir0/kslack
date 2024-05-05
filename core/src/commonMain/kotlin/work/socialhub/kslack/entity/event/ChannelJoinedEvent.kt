package work.socialhub.kslack.entity.event

/**
 * The channel_joined event is sent to all connections for a user when that user joins a channel.
 *
 *
 * In addition to this message, all existing members of the channel may receive a channel_join message event.
 *
 *
 * Of course, there's also the fresher, more dependable member_joined_channel. This changelog entry clears it all up.
 *
 *
 * https://api.slack.com/events/channel_joined
 */
class ChannelJoinedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: Channel? = null

    // TODO: the existence of these attributes has not been verified yet
    class Channel {
        var id: String? = null
        var name: String? = null
        var created: Int? = null
        var creator: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "channel_joined"
    }
}