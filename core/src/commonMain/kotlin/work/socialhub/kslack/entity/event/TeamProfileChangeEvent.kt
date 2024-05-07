package work.socialhub.kslack.entity.event

/**
 * The team_profile_change event is sent to all connections for a workspace
 * when Workspace Admin updates the field definitions in the profile.
 * Only the modified field definitions are included in the payload.
 * Where appropriate, clients should update to reflect new changes immediately.
 *
 *
 * https://api.slack.com/events/team_profile_change
 */
class TeamProfileChangeEvent : Event {
    override val type: String = TYPE_NAME
    var profile: Profile? = null

    class Profile {
        var fields: Array<Field>? = null
    }

    class Field {
        // TODO: other attributes
        var id: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "team_profile_change"
    }
}