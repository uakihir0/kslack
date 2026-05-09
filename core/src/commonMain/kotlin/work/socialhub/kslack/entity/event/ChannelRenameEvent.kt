package work.socialhub.kslack.entity.event

import kotlinx.serialization.Serializable

/**
 * The channel_rename event is sent to all connections for a workspace when a channel is renamed.
 * Clients can use this to update their local list of channels.
 *
 *
 * https://api.slack.com/events/channel_rename
 */
@Serializable
class ChannelRenameEvent : Event {
    override val type: String = TYPE_NAME
    var channel: Channel? = null

    @Serializable
    class Channel {
        var id: String? = null
        var name: String? = null // new name
        var created: Int? = null
    }

    companion object {
        const val TYPE_NAME: String = "channel_rename"
    }
}