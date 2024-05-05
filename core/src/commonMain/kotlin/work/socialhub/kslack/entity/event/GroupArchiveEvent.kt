package work.socialhub.kslack.entity.event

/**
 * The group_archive event is sent to all connections for members of a private channel when that private channel is archived.
 * Clients can use this to update their local list of private channels.
 *
 *
 * https://api.slack.com/events/group_archive
 */
class GroupArchiveEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "group_archive"
    }
}