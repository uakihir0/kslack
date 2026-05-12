package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.OAuthResource
import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2ExchangeRequest
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2ExchangeResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [OAuthResource] for Slack's `oauth.*` API methods.
 *
 * Handles OAuth2 authorization code and refresh token exchange.
 * Note: This implementation has methods marked as TODO - not yet implemented.
 * Use [AuthResourceImpl] for the OAuth authorization URL generation instead.
 *
 * The `oauthAccess` and `oauthToken` methods are deprecated in favor of `oauthV2Access`.
 *
 * @param token Not used (OAuth methods use client credentials, not workspace tokens)
 */
class OAuthResourceImpl : OAuthResource {

    @Deprecated("Use oauthV2Access instead.")
    override suspend fun oauthAccess(req: OAuthAccessRequest): OAuthAccessResponse {
        TODO("Not yet implemented")
    }

    @Deprecated("Use oauthV2Access instead.")
    override fun oauthAccessBlocking(req: OAuthAccessRequest): OAuthAccessResponse {
        return toBlocking { oauthAccess(req) }
    }

    override suspend fun oauthV2Access(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        TODO("Not yet implemented")
    }

    override fun oauthV2AccessBlocking(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        return toBlocking { oauthV2Access(req) }
    }

    @Deprecated("Use oauthV2Access instead.")
    override suspend fun oauthToken(req: OAuthTokenRequest): OAuthTokenResponse {
        TODO("Not yet implemented")
    }

    @Deprecated("Use oauthV2Access instead.")
    override fun oauthTokenBlocking(req: OAuthTokenRequest): OAuthTokenResponse {
        return toBlocking { oauthToken(req) }
    }

    override suspend fun oauthV2Exchange(req: OAuthV2ExchangeRequest): OAuthV2ExchangeResponse {
        TODO("Not yet implemented")
    }

    override fun oauthV2ExchangeBlocking(req: OAuthV2ExchangeRequest): OAuthV2ExchangeResponse {
        return toBlocking { oauthV2Exchange(req) }
    }
}
