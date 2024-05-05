package work.socialhub.kslack.entity.event

/**
 * The email_domain_changed event is sent to all connections for a workspace
 * when the email domain settings for a workspace change.
 * Most clients can ignore this event.
 *
 *
 * https://api.slack.com/events/email_domain_changed
 */
class EmailDomainChangedEvent : Event {
    override val type: String = TYPE_NAME
    var emailDomain: String? = null
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "email_domain_changed"
    }
}