package work.socialhub.kslack.entity.event

/**
 * The user_typing event is sent to all members of a channel when a user is typing a message in that channel.
 *
 *
 * https://api.slack.com/events/user_typing
 */
class UserTypingEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null

    companion object {
        const val TYPE_NAME: String = "user_typing"
    }
}