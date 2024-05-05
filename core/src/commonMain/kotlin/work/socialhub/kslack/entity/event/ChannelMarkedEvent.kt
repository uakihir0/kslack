package work.socialhub.kslack.entity.event

/**
 * The channel_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a channel by calling the channels.mark API method.
 *
 *
 * https://api.slack.com/events/channel_marked
 */
class ChannelMarkedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var ts: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_marked"
    }
}