package work.socialhub.kslack.entity.event

/**
 * The subteam_self_removed event is sent to you when you have been removed to an existing User Group.
 * Clients can use this to update their local list of User Groups.
 *
 *
 * This event is not available to bot user subscriptions in the Events API.
 *
 *
 * https://api.slack.com/events/subteam_self_removed
 */
class SubteamSelfRemovedEvent : Event {
    override val type: String = TYPE_NAME
    var subteamId: String? = null

    companion object {
        const val TYPE_NAME: String = "subteam_self_removed"
    }
}