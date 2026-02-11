package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import kotlin.js.JsExport

@JsExport
interface OAuthResource {

    suspend fun oauthAccess(
        req: OAuthAccessRequest
    ): OAuthAccessResponse

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

    suspend fun oauthToken(
        req: OAuthTokenRequest
    ): OAuthTokenResponse

    @JsExport.Ignore
    fun oauthTokenBlocking(
        req: OAuthTokenRequest
    ): OAuthTokenResponse
}
