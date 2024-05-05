package work.socialhub.kslack.entity.event

/**
 * We send this event when a user removes an existing grant for your workspace app.
 *
 *
 * https://api.slack.com/events/user_resource_removed
 */
class UserResourceRemovedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var triggerId: String? = null

    companion object {
        const val TYPE_NAME: String = "user_resource_removed"
    }
}