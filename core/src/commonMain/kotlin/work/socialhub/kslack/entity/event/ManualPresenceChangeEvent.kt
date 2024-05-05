package work.socialhub.kslack.entity.event

/**
 * The manual_presence_change event is sent to all connections for a user when that user manually updates their presence.
 * Clients can use this to update their local state.
 *
 *
 * https://api.slack.com/events/manual_presence_change
 */
class ManualPresenceChangeEvent : Event {
    override val type: String = TYPE_NAME
    var presence: String? = null

    companion object {
        const val TYPE_NAME: String = "manual_presence_change"
    }
}