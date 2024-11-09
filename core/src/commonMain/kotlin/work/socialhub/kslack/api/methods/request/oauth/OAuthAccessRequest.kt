package work.socialhub.kslack.api.methods.request.oauth

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/docs/oauth
 */
@JsExport
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
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("client_id", clientId)
            it.addParam("client_secret", clientSecret)
            it.addParam("code", code)
            it.addParam("redirect_uri", redirectUri)
            it.addParam("single_channel", isSingleChannel)
        }
    }
}