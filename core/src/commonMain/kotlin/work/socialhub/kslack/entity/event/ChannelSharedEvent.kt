package work.socialhub.kslack.entity.event

/**
 * The channel_shared event is sent to all event subscriptions
 * when a new shared channel is created or a channel is converted into a shared channel.
 * It's also triggered when an external workspace is added to an existing shared channel.
 *
 *
 * https://api.slack.com/events/channel_shared
 */
class ChannelSharedEvent : Event {
    override val type: String = TYPE_NAME

    // The connected_team_id value is the team ID of the workspace that has joined the channel.
    // Note that this ID may start with E, indicating that it is the ID of the organization
    // that has been removed from the channel.
    var connectedTeamId: String? = null

    // The channel value is the ID for the public or private channel.
    var channel: String? = null

    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "channel_shared"
    }
}