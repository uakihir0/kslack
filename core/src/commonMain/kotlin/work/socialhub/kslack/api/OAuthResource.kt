package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2ExchangeRequest
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2ExchangeResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `oauth.*` API methods.
 *
 * Provides methods for the OAuth2 authorization flow, including exchanging
 * authorization codes for access tokens and exchanging refresh tokens.
 *
 * # OAuth Flow Overview
 * 1. Redirect users to the authorization URL from [AuthResource.authorizationURL][work.socialhub.kslack.api.AuthResource.authorizationURL]
 * 2. After user approval, receive an authorization `code` in the callback
 * 3. Exchange the code for an access token via `oauthV2Access`
 * 4. Use the access token in subsequent API requests with `Authorization: Bearer <token>`
 *
 * # Usage Example
 * ```kotlin
 * // Exchange authorization code for token (v2)
 * val token = slack.oauth.v2Access(
 *     OAuthV2AccessRequest(
 *         clientId = "your_client_id",
 *         clientSecret = "your_client_secret",
 *         code = "auth_code_from_callback"
 *     )
 * )
 *
 * // Exchange refresh token for new access token
 * val refreshed = slack.oauth.v2Exchange(
 *     OAuthV2ExchangeRequest(
 *         clientId = "your_client_id",
 *         clientSecret = "your_client_secret",
 *         refreshToken = "refresh_token_from_previous"
 *     )
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/oauth/v2">OAuth V2 Reference</a>
 */
@JsExport
interface OAuthResource {

    @Deprecated("Use oauthV2Access instead.")
    suspend fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse

    @Deprecated("Use oauthV2Access instead.")
    @JsExport.Ignore
    fun oauthAccessBlocking(
        req: OAuthAccessRequest
    ): OAuthAccessResponse

    suspend fun oauthV2Access(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse

    @JsExport.Ignore
    fun oauthV2AccessBlocking(
        req: OAuthV2AccessRequest
    ): OAuthV2AccessResponse

    @Deprecated("Use oauthV2Access instead.")
    suspend fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse

    @Deprecated("Use oauthV2Access instead.")
    @JsExport.Ignore
    fun oauthTokenBlocking(
        req: OAuthTokenRequest
    ): OAuthTokenResponse

    suspend fun oauthV2Exchange(
        req: OAuthV2ExchangeRequest
    ): OAuthV2ExchangeResponse

    @JsExport.Ignore
    fun oauthV2ExchangeBlocking(
        req: OAuthV2ExchangeRequest
    ): OAuthV2ExchangeResponse
}
