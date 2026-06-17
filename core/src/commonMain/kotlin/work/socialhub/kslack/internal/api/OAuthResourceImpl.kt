package work.socialhub.kslack.internal.api

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.OAuthResource
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2ExchangeRequest
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2ExchangeResponse
import work.socialhub.kslack.util.toBlocking

class OAuthResourceImpl(
    token: String? = null,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), OAuthResource {

    @Deprecated("Use oauthV2Access instead.")
    override suspend fun oauthAccess(req: OAuthAccessRequest): OAuthAccessResponse {
        return postForm(req.toParams(), "oauth.access")
    }

    @Deprecated("Use oauthV2Access instead.")
    override fun oauthAccessBlocking(req: OAuthAccessRequest): OAuthAccessResponse {
        return toBlocking { oauthAccess(req) }
    }

    override suspend fun oauthV2Access(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        val params = buildList {
            req.clientId?.let { add(HttpParameter.param("client_id", it)) }
            req.clientSecret?.let { add(HttpParameter.param("client_secret", it)) }
            req.code?.let { add(HttpParameter.param("code", it)) }
            req.redirectUri?.let { add(HttpParameter.param("redirect_uri", it)) }
        }
        return postForm(params, "oauth.v2.access")
    }

    override fun oauthV2AccessBlocking(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        return toBlocking { oauthV2Access(req) }
    }

    @Deprecated("Use oauthV2Access instead.")
    override suspend fun oauthToken(req: OAuthTokenRequest): OAuthTokenResponse {
        return postForm(req.toParams(), "oauth.token")
    }

    @Deprecated("Use oauthV2Access instead.")
    override fun oauthTokenBlocking(req: OAuthTokenRequest): OAuthTokenResponse {
        return toBlocking { oauthToken(req) }
    }

    override suspend fun oauthV2Exchange(req: OAuthV2ExchangeRequest): OAuthV2ExchangeResponse {
        return postForm(req.toParams(), "oauth.v2.exchange")
    }

    override fun oauthV2ExchangeBlocking(req: OAuthV2ExchangeRequest): OAuthV2ExchangeResponse {
        return toBlocking { oauthV2Exchange(req) }
    }
}
