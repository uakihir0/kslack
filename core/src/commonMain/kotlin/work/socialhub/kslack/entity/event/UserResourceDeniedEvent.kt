package work.socialhub.kslack.entity.event

/**
 * We send this event when a user declines to grant your workspace app
 * the permissions you recently requested with apps.permissions.users.request.
 *
 *
 * https://api.slack.com/events/user_resource_denied
 */
class UserResourceDeniedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var scopes: Array<String>? = null
    var triggerId: String? = null

    companion object {
        const val TYPE_NAME: String = "user_resource_denied"
    }
}