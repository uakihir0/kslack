package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.User

/**
 * The team_join event is sent to all connections for a workspace when a new member joins.
 * Clients can use this to update their local cache of members.
 *
 *
 * https://api.slack.com/events/team_join
 */
class TeamJoinEvent : Event {
    override val type: String = TYPE_NAME
    var user: User? = null // TODO: make sure the available attributes

    companion object {
        const val TYPE_NAME: String = "team_join"
    }
}