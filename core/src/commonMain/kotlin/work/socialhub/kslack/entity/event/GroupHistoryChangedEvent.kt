package work.socialhub.kslack.entity.event

/**
 * A group_history_changed event is sent to all clients in a private channel when bulk changes have occurred to that group's history.
 * When clients receive this message they should reload chat history for the private channel
 * if they have any cached messages before latest.
 *
 *
 * https://api.slack.com/events/group_history_changed
 */
class GroupHistoryChangedEvent : Event {
    override val type: String = TYPE_NAME
    var latest: String? = null
    var ts: String? = null
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "group_history_changed"
    }
}