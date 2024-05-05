package work.socialhub.kslack.entity.event

/**
 * The team_pref_change event is sent to all connections for a workspace when a preference is changed.
 * Where appropriate clients should update to reflect new changes immediately.
 *
 *
 * https://api.slack.com/events/team_pref_change
 */
class TeamPrefChangeEvent : Event {
    override val type: String = TYPE_NAME
    var name: String? = null
    var value: String? = null

    companion object {
        const val TYPE_NAME: String = "team_pref_change"
    }
}