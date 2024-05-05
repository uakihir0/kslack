package work.socialhub.kslack.entity.event

/**
 * The pref_change event is sent to all connections for a user when a user preference is changed.
 * Clients should update to reflect new changes immediately.
 *
 *
 * https://api.slack.com/events/pref_change
 */
class PrefChangeEvent : Event {
    override val type: String = TYPE_NAME
    var name: String? = null
    var value: String? = null

    companion object {
        const val TYPE_NAME: String = "pref_change"
    }
}