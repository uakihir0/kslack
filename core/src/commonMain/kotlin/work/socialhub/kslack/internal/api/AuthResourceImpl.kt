package work.socialhub.kslack.internal.api

import io.ktor.http.URLBuilder
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.AuthResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.auth.AuthRevokeRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTeamsListRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.response.auth.AuthRevokeResponse
import work.socialhub.kslack.api.methods.response.auth.AuthTeamsListResponse
import work.socialhub.kslack.api.methods.response.auth.AuthTestResponse
import work.socialhub.kslack.util.toBlocking

class AuthResourceImpl(
    token: String?
) : AbstractResourceImpl(token), AuthResource {

    override suspend fun authRevoke(req: AuthRevokeRequest): AuthRevokeResponse {
        return postFormWithToken(req.toParams(), Methods.AUTH_REVOKE, getToken(req))
    }

    override fun authRevokeBlocking(req: AuthRevokeRequest): AuthRevokeResponse {
        return toBlocking { authRevoke(req) }
    }

    override suspend fun authTest(req: AuthTestRequest): AuthTestResponse {
        return postFormWithToken(req.toParams(), Methods.AUTH_TEST, getToken(req))
    }

    override fun authTestBlocking(req: AuthTestRequest): AuthTestResponse {
        return toBlocking { authTest(req) }
    }

    override suspend fun authTeamsList(req: AuthTeamsListRequest): AuthTeamsListResponse {
        return postFormWithToken(req.toParams(), Methods.AUTH_TEAMS_LIST, getToken(req))
    }

    override fun authTeamsListBlocking(req: AuthTeamsListRequest): AuthTeamsListResponse {
        return toBlocking { authTeamsList(req) }
    }

    override fun authorizationURL(
        clientId: String,
        redirectUri: String,
        scope: String?,
        userScope: String?,
    ): String {
        val builder = URLBuilder(Slack.AUTHORIZE_URL)
        builder.parameters.append("client_id", clientId)
        builder.parameters.append("redirect_uri", redirectUri)
        if (scope != null) {
            builder.parameters.append("scope", scope)
        }
        if (userScope != null) {
            builder.parameters.append("user_scope", userScope)
        }
        return builder.build().toString()
    }
}
