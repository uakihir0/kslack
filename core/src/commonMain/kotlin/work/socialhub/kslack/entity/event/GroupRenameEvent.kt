package work.socialhub.kslack.entity.event

/**
 * When a private channel is renamed, the group_rename event is sent to all connections for members of a private channel.
 * Clients can use this to update their local list of private channels.
 *
 *
 * https://api.slack.com/events/group_rename
 */
class GroupRenameEvent : Event {
    override val type: String = TYPE_NAME
    var channel: Channel? = null

    class Channel {
        var id: String? = null
        var name: String? = null
        var created: Int? = null
    }

    companion object {
        const val TYPE_NAME: String = "group_rename"
    }
}