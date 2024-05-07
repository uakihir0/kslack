package work.socialhub.kslack.entity.event

/**
 * The subteam_members_changed event is sent to all connections for a workspace
 * when users are added or removed from an existing User Group.
 * Clients can use the timestamp information to detect if they are out of sync with the user list.
 *
 *
 * Unlike subteam_updated, this only shows the delta of added or removed members and does not include a snapshot of the User Group.
 *
 *
 * https://api.slack.com/events/subteam_members_changed
 */
class SubteamMembersChangedEvent : Event {
    override val type: String = TYPE_NAME
    var subteamId: String? = null
    var teamId: String? = null
    var datePreviousUpdate: Int? = null
    var dateUpdate: Int? = null
    var addedUsers: Array<String>? = null
    var addedUsersCount: Int? = null
    var removedUsers: Array<String>? = null
    var removedUsersCount: Int? = null

    companion object {
        const val TYPE_NAME: String = "subteam_members_changed"
    }
}