package work.socialhub.kslack.entity.event

/**
 * A im_history_changed event is sent to all clients in a DM channel When bulk changes have occurred to that DM channel's history.
 * When clients receive this message they should reload chat history for the channel if they have any cached messages before latest.
 *
 *
 * These bulk changes may be the result of data importation or bulk action taken by an administrator.
 *
 *
 * https://api.slack.com/events/im_history_changed
 */
class ImHistoryChangedEvent : Event {
    override val type: String = TYPE_NAME
    var latest: String? = null
    var ts: String? = null
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "im_history_changed"
    }
}