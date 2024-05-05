package work.socialhub.kslack.entity.event

/**
 * The list of accounts a user is signed into has changed
 *
 *
 * The accounts_changed event is used by our web client
 * to maintain a list of logged-in accounts.
 * Other clients should ignore this event.
 *
 *
 * https://api.slack.com/events/accounts_changed
 */
class AccountChangedEvent : Event {
    override val type: String = TYPE_NAME

    companion object {
        const val TYPE_NAME: String = "accounts_changed"
    }
}