package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.openid.connect.*
import work.socialhub.kslack.api.methods.response.openid.connect.*
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `openid.connect.*` API methods.
 *
 * Provides methods for OpenID Connect authentication, including token
 * exchange and user info retrieval. This enables identity verification
 * for users authenticating through Slack.
 *
 * # Usage Example
 * ```kotlin
 * // Exchange authorization code for ID token
 * val token = slack.openIDConnect.token(
 *     OpenIDConnectTokenRequest(
 *         clientId = "your_client_id",
 *         clientSecret = "your_client_secret",
 *         code = "auth_code"
 *     )
 * )
 *
 * // Get user info from access token
 * val userInfo = slack.openIDConnect.userInfo(
 *     OpenIDConnectUserInfoRequest(token = accessToken)
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/oauth">Slack OAuth Reference</a>
 */
@JsExport
interface OpenIDConnectResource {

    /**
     * Exchanges an authorization code for an OpenID Connect ID token.
     *
     * The ID token contains user identity information in JWT format.
     *
     * @param req Request containing client credentials and authorization code
     * @return Response with the ID token and associated metadata
     * @see <a href="https://docs.slack.dev/reference/oauth">Slack OAuth</a>
     */
    suspend fun openIDConnectToken(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse

    @JsExport.Ignore
    fun openIDConnectTokenBlocking(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse

    suspend fun openIDConnectUserInfo(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse

    @JsExport.Ignore
    fun openIDConnectUserInfoBlocking(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse
}
