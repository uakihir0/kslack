package work.socialhub.kslack.api.methods.request.oauth

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/docs/oauth
 */
class OAuthAccessRequest(
    override val token: String?,
    /** Issued when you created your application. */
    var clientId: String?,
    /** Issued when you created your application. */
    var clientSecret: String?,
    /** The `code` param returned via the OAuth callback. */
    var code: String?,
    /** This must match the originally submitted URI (if one was sent). */
    var redirectUri: String?,
    /** Request the user to add your app only to a single channel. */
    var isSingleChannel: Boolean
) : SlackApiRequest