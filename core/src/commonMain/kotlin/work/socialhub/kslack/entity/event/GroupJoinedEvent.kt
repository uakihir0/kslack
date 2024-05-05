package work.socialhub.kslack.entity.event

/**
 * The group_joined event is sent to all connections for a user when that user joins a private channel.
 *
 *
 * The channel value is the string identifier for the private channel.
 *
 *
 * https://api.slack.com/events/group_joined
 */
class GroupJoinedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: Channel? = null

    class Channel

    companion object {
        const val TYPE_NAME: String = "group_joined"
    }
}