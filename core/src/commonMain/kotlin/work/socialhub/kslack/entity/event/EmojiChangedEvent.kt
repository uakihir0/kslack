package work.socialhub.kslack.entity.event

/**
 * The email_domain_changed event is sent to all connections for a workspace
 * when the email domain settings for a workspace change.
 * Most clients can ignore this event.
 *
 *
 * https://api.slack.com/events/emoji_changed
 */
class EmojiChangedEvent : Event {
    override val type: String = TYPE_NAME

    override var subtype: String? = null // possible values: add, remove

    var names: Array<String>? = null // only for subtype:remove

    var name: String? = null // only for subtype:add

    /**
     * The URL of the image
     */
    var value: String? = null // only for subtype:add

    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "emoji_changed"
    }
}