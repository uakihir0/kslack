package work.socialhub.kslack.entity.event

/**
 * The group_open event is sent to all connections for a user when a group Direct RTMMessage (or mpim) is opened by that user.
 *
 *
 * This event is not available to bot user subscriptions in the Events API.
 *
 *
 * https://api.slack.com/events/group_open
 */
class GroupOpenEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null

    companion object {
        const val TYPE_NAME: String = "group_open"
    }
}