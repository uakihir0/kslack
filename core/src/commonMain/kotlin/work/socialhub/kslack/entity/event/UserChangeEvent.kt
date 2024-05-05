package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.User

/**
 * The user_change event is sent to all connections for a workspace when a member updates their profile or data.
 * Clients can use this to update their local cache of members.
 *
 *
 * Use the users.profile.set method to update user profile data.
 *
 *
 * https://api.slack.com/events/user_change
 */
class UserChangeEvent : Event {
    override val type: String = TYPE_NAME
    var user: User? = null // TODO: make sure the available attributes

    companion object {
        const val TYPE_NAME: String = "user_change"
    }
}