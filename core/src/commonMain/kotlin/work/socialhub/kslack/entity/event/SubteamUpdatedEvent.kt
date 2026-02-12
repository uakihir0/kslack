package work.socialhub.kslack.entity.event

import kotlinx.serialization.SerialName

/**
 * The subteam_updated event is sent to all connections for a workspace when an existing User Group is updated.
 * This event is triggered for changes to the User Group information (name, description, or handle)
 * as well as the members of the group.
 *
 *
 * Clients can use this to update their local list of groups and group members.
 * The users field is truncated at 500, however the user_count field will still show the actual count.
 *
 *
 * If you are only interested in User Group membership changes, consider using the subteam_members_changed event instead.
 *
 *
 * This event type may also arise when a subteam has been disabled.
 *
 *
 * https://api.slack.com/events/subteam_updated
 */
class SubteamUpdatedEvent : Event {
    override val type: String = TYPE_NAME
    var subteam: Subteam? = null

    class Subteam {
        var id: String? = null
        var teamId: String? = null

        @SerialName("is_usergroup")
        var isUsergroup: Boolean = false
        var name: String? = null
        var description: String? = null
        var handle: String? = null

        @SerialName("is_external")
        var isExternal: Boolean = false
        var dateCreate: Int? = null
        var dateUpdate: Int? = null
        var dateDelete: Int? = null
        var autoType: String? = null
        var createdBy: String? = null
        var updatedBy: String? = null
        var deletedBy: String? = null
        var prefs: Prefs? = null
        var users: Array<String>? = null
        var userCount: String? = null
    }

    class Prefs {
        var channels: Array<String>? = null
        var groups: Array<String>? = null
    }

    companion object {
        const val TYPE_NAME: String = "subteam_updated"
    }
}