package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.OpenIDConnectResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.openid.connect.*
import work.socialhub.kslack.api.methods.response.openid.connect.*
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [OpenIDConnectResource] for Slack's `openid.connect.*` API methods.
 *
 * Handles HTTP POST requests for OpenID Connect token exchange and user info retrieval.
 * The `openIDConnectToken` method uses form POST without a token (client credentials only),
 * while `openIDConnectUserInfo` requires a bearer token.
 *
 * @param token Optional default token for the userInfo method (token method uses client credentials)
 */
class OpenIDConnectResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), OpenIDConnectResource {

    override suspend fun openIDConnectToken(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse {
        return postForm(
            req.toParams(),
            Methods.OPENID_CONNECT_TOKEN,
        )
    }

    override fun openIDConnectTokenBlocking(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse {
        return toBlocking { openIDConnectToken(req) }
    }

    override suspend fun openIDConnectUserInfo(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.OPENID_CONNECT_USER_INFO,
            getToken(req),
        )
    }

    override fun openIDConnectUserInfoBlocking(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse {
        return toBlocking { openIDConnectUserInfo(req) }
    }
}
