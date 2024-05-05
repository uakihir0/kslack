package work.socialhub.kslack.entity.event

/**
 * The im_open event is sent to all connections for a user when a direct message channel is opened by that user.
 *
 *
 * https://api.slack.com/events/im_open
 */
class ImOpenEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null

    companion object {
        const val TYPE_NAME: String = "im_open"
    }
}