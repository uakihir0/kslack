package work.socialhub.kslack.entity.event

/**
 * The group_deleted event is sent to all members of a private channel when it is deleted.
 * Clients can use this to update their local list of private channels.
 *
 *
 * https://api.slack.com/events/group_deleted
 */
class GroupDeletedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "group_deleted"
    }
}