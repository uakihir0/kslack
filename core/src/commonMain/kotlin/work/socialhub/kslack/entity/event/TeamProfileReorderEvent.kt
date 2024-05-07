package work.socialhub.kslack.entity.event

/**
 * The team_profile_reorder event is sent to all connections for a workspace
 * when Workspace Admin reorders the field definitions in the profile.
 * The payload includes only the id and the ordering for each field definition that is reordered.
 * Where appropriate, clients should update to reflect new changes immediately.
 *
 *
 * https://api.slack.com/events/team_profile_reorder
 */
class TeamProfileReorderEvent : Event {
    override val type: String = TYPE_NAME
    var profile: Profile? = null

    class Profile {
        var fields: Array<Field>? = null
    }

    class Field {
        var id: String? = null

        // TODO: other attributes
        var ordering: Int? = null
    }

    companion object {
        const val TYPE_NAME: String = "team_profile_reorder"
    }
}