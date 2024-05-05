package work.socialhub.kslack.entity.event

/**
 * The channel_unshared event is sent to all event subscriptions
 * when an external workspace has been removed from an existing shared channel.
 *
 *
 * https://api.slack.com/events/channel_unshared
 */
class ChannelUnsharedEvent : Event {
    override val type: String = TYPE_NAME

    // The previously_connected_team_id value is the team ID of the workspace
    // that has been removed from the channel.
    // Note that this ID may start with E, indicating that it is the ID of the organization
    // that has been removed from the channel.
    var previouslyConnectedTeamId: String? = null

    // The channel value is the ID for the public or private channel.
    var channel: String? = null

    // The is_ext_shared value is true if the channel is still externally shared, and false otherwise.
    var isExtShared: Boolean = false

    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_unshared"
    }
}