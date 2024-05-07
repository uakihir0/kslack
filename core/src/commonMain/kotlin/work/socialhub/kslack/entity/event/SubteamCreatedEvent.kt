package work.socialhub.kslack.entity.event

import com.google.gson.annotations.SerialName

/**
 * The subteam_created event is sent to all connections for a workspace when a new User Group is created.
 * Clients can use this to update their local list of User Groups and group members.
 *
 *
 * https://api.slack.com/events/subteam_created
 */
class SubteamCreatedEvent : Event {
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
        var userCount: String? = null
    }

    class Prefs {
        var channels: Array<String>? = null
        var groups: Array<String>? = null
    }

    companion object {
        const val TYPE_NAME: String = "subteam_created"
    }
}