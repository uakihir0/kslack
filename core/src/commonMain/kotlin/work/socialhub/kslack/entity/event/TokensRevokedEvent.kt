package work.socialhub.kslack.entity.event

/**
 * When your app's API tokens are revoked, the tokens_revoked event is sent via the Events API to your app if it is subscribed.
 *
 *
 * The example above details the complete Events API payload, including the event wrapper.
 * Use the team_id to identify the associated workspace.
 *
 *
 * The inner event's tokens field is a hash keyed with the types of revoked tokens.
 * oauth tokens are user-based tokens negotiated with OAuth or app installation,
 * typically beginning with xoxp-. bot tokens are also negotiated in that process,
 * but belong specifically to any bot user contained in your app and begin with xoxb-.
 *
 *
 * Each key contains an array of user IDs, not the actual token strings representing your revoked tokens.
 * To use this event most effectively, store your tokens along side user IDs and team IDs.
 *
 *
 * https://api.slack.com/events/tokens_revoked
 */
class TokensRevokedEvent : Event {
    override val type: String = TYPE_NAME
    var tokens: Tokens? = null

    class Tokens {
        var oauth: Array<String>? = null
        var bot: Array<String>? = null
    }

    companion object {
        const val TYPE_NAME: String = "tokens_revoked"
    }
}