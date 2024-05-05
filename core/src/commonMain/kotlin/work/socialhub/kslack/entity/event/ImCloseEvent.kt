package work.socialhub.kslack.entity.event

/**
 * The im_close event is sent to all connections for a user when a direct message channel is closed by that user.
 *
 *
 * https://api.slack.com/events/im_close
 */
class ImCloseEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channel: String? = null

    companion object {
        const val TYPE_NAME: String = "im_close"
    }
}