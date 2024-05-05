package work.socialhub.kslack.entity.event

/**
 * The member_joined_channel event is sent to all WebSocket connections
 * and event subscriptions when users join public or private channels.
 * It's also triggered upon creating a new channel.
 *
 *
 * The provided user value is a user ID belonging to the user that joined the channel.
 *
 *
 * The channel value is the ID for a public channel or private channel (AKA group).
 *
 *
 * The channel_type value is a single letter indicating the type of channel used in channel:
 *
 *
 * C - typically a public channel
 * G - private channels (or groups) return this channel_type
 * The team identifies which workspace the user is from.
 *
 *
 * If the user was invited, the message will include an inviter property containing the user ID of the inviting user.
 * The property will be absent when a user manually joins a channel, or a user is added by default
 * (e.g. #general channel).
 * Also, the property is not available when a channel is converted from a public to private,
 * where the channel history is not shared with the user.
 *
 *
 * This example illustrates an absent inviter property, a result of a channel converting from public to private:
 *
 *
 * {
 * "type": "member_joined_channel",
 * "user": "W06GH7XHN",
 * "channel": "G0698JE0H",
 * "channel_type": "G",
 * "team": "T8MPF7EHL"
 * }
 * This event is supported as a bot user subscription in the Events API.
 * Workspace event subscriptions are also available for tokens holding
 * at least one of the channels:read or groups:read scopes.
 * Which events your app will receive depends on the scopes and their context.
 * For instance, you'll only receive member_joined_channel events for private channels if your app has the groups:read permission.
 *
 *
 * Even bot users receive this delightful event via Bot User subscription, when joining a channel.
 *
 *
 * https://api.slack.com/events/member_joined_channel
 */
class MemberJoinedChannelEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channel: String? = null
    var channelType: String? = null
    var team: String? = null
    var inviter: String? = null

    companion object {
        const val TYPE_NAME: String = "member_joined_channel"
    }
}