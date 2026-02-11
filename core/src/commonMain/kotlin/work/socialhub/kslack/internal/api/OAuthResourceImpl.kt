package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.OAuthResource
import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthV2AccessRequest
import work.socialhub.kslack.api.methods.response.oauth.OAuthAccessResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthTokenResponse
import work.socialhub.kslack.api.methods.response.oauth.OAuthV2AccessResponse
import work.socialhub.kslack.util.toBlocking

class OAuthResourceImpl : OAuthResource {

    override suspend fun oauthAccess(req: OAuthAccessRequest): OAuthAccessResponse {
        TODO("Not yet implemented")
    }

    override fun oauthAccessBlocking(req: OAuthAccessRequest): OAuthAccessResponse {
        return toBlocking { oauthAccess(req) }
    }

    override suspend fun oauthV2Access(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        TODO("Not yet implemented")
    }

    override fun oauthV2AccessBlocking(req: OAuthV2AccessRequest): OAuthV2AccessResponse {
        return toBlocking { oauthV2Access(req) }
    }

    override suspend fun oauthToken(req: OAuthTokenRequest): OAuthTokenResponse {
        TODO("Not yet implemented")
    }

    override fun oauthTokenBlocking(req: OAuthTokenRequest): OAuthTokenResponse {
        return toBlocking { oauthToken(req) }
    }
}
