package work.socialhub.kslack.entity.event

/**
 * The thread_ts field only appears when the link was shared within a message thread.
 *
 *
 * https://api.slack.com/events/link_shared
 */
class LinkSharedEvent : Event {
    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null
    var messageTs: String? = null
    var threadTs: String? = null
    var links: Array<Link>? = null

    class Link {
        var domain: String? = null
        var url: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "link_shared"
    }
}