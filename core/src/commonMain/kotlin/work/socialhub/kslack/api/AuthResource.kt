package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.auth.AuthRevokeRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.response.auth.AuthRevokeResponse
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

    fun authorizationURL(
        clientId: String,
        redirectUri: String,
        scope: String,
    ): String
}
