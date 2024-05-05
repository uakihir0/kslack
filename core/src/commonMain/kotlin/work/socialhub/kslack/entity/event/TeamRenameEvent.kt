package work.socialhub.kslack.entity.event

/**
 * The team_rename event is sent to all connections for a workspace when an admin changes the workspace name.
 *
 *
 * Clients can use this to update the display of the workspace name as soon as it changes.
 * If they don't the client will receive the new name the next time it calls rtm.start.
 *
 *
 * https://api.slack.com/events/team_rename
 */
class TeamRenameEvent : Event {
    override val type: String = TYPE_NAME
    var name: String? = null

    companion object {
        const val TYPE_NAME: String = "team_rename"
    }
}