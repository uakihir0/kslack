package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.auth.AuthRevokeRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTeamsListRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.response.auth.AuthRevokeResponse
import work.socialhub.kslack.api.methods.response.auth.AuthTeamsListResponse
import work.socialhub.kslack.api.methods.response.auth.AuthTestResponse
import kotlin.js.JsExport

@JsExport
interface AuthResource {

    suspend fun authRevoke(
        req: AuthRevokeRequest
    ): AuthRevokeResponse

    @JsExport.Ignore
    fun authRevokeBlocking(
        req: AuthRevokeRequest
    ): AuthRevokeResponse

    suspend fun authTest(
        req: AuthTestRequest
    ): AuthTestResponse

    @JsExport.Ignore
    fun authTestBlocking(
        req: AuthTestRequest
    ): AuthTestResponse

    suspend fun authTeamsList(
        req: AuthTeamsListRequest
    ): AuthTeamsListResponse

    @JsExport.Ignore
    fun authTeamsListBlocking(
        req: AuthTeamsListRequest
    ): AuthTeamsListResponse

    fun authorizationURL(
        clientId: String,
        redirectUri: String,
        scope: String? = null,
        userScope: String? = null,
    ): String
}
