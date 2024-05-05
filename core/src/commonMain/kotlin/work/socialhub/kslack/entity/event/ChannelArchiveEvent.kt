package work.socialhub.kslack.entity.event

/**
 * The channel_archive event is sent to all connections for a workspace when a channel is archived.
 * Clients can use this to update their local list of channels.
 *
 *
 * https://api.slack.com/events/channel_archive
 */
class ChannelArchiveEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_archive"
    }
}