package work.socialhub.kslack.entity.event

/**
 * The im_marked event is sent to all open connections for a user
 * when that user moves the read cursor in a direct message channel by calling the im.mark API method.
 *
 *
 * https://api.slack.com/events/im_marked
 */
class ImMarkedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var ts: String? = null

    companion object {
        const val TYPE_NAME: String = "im_marked"
    }
}