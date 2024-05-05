package work.socialhub.kslack.entity.event

/**
 * The group_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a private channel by calling the groups.mark API method.
 *
 *
 * https://api.slack.com/events/group_marked
 */
class GroupMarkedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var ts: String? = null

    companion object {
        const val TYPE_NAME: String = "group_marked"
    }
}