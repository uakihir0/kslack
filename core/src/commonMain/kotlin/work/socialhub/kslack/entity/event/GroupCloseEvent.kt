package work.socialhub.kslack.entity.event

/**
 * The group_close event is sent to all connections for a user when a private channel is closed by that user.
 *
 *
 * This event is not available to bot user subscriptions in the Events API.
 *
 *
 * https://api.slack.com/events/group_close
 */
class GroupCloseEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "group_close"
    }
}