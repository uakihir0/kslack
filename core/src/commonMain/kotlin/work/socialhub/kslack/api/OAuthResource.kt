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
