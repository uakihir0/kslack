package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.openid.connect.*
import work.socialhub.kslack.api.methods.response.openid.connect.*
import kotlin.js.JsExport

@JsExport
interface OpenIDConnectResource {

    suspend fun openIDConnectToken(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse

    @JsExport.Ignore
    fun openIDConnectTokenBlocking(
        req: OpenIDConnectTokenRequest
    ): OpenIDConnectTokenResponse

    suspend fun openIDConnectUserInfo(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse

    @JsExport.Ignore
    fun openIDConnectUserInfoBlocking(
        req: OpenIDConnectUserInfoRequest
    ): OpenIDConnectUserInfoResponse
}
