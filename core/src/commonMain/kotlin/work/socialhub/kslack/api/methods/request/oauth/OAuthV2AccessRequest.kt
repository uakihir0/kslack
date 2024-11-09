package work.socialhub.kslack.api.methods.request.oauth

import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/authentication/basics
 * https://api.slack.com/methods/oauth.v2.access
 */
@JsExport
class OAuthV2AccessRequest(
    override val token: String?,
    /** Issued when you created your application. */
    var clientId: String?,
    /** Issued when you created your application. */
    var clientSecret: String?,
    /** The `code` param returned via the OAuth callback. */
    var code: String?,
    /** This must match the originally submitted URI (if one was sent). */
    var redirectUri: String?
) : SlackApiRequest