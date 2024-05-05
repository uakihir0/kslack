package work.socialhub.kslack.entity.event

/**
 * The im_created event is sent to all connections for a user when a new direct message channel is created that they are a member of.
 *
 *
 * This message lets the client know that a channel has been created,
 * but the client should show no changes based on this, just update its internal list of IM channels.
 * Usually this event is followed by an im_open event.
 *
 *
 * https://api.slack.com/events/im_created
 */
class ImCreatedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channel: Channel? = null

    class Channel

    companion object {
        const val TYPE_NAME: String = "im_created"
    }
}