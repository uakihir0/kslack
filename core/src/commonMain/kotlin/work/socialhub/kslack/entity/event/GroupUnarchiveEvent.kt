package work.socialhub.kslack.entity.event

/**
 * The group_unarchive event is sent to all connections for members of a private channel when that private channel is unarchived.
 * Clients can use this to update their local list of private channels.
 *
 *
 * https://api.slack.com/events/group_unarchive
 */
class GroupUnarchiveEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "group_unarchive"
    }
}