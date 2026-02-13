package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.response.api.ApiTestResponse
import kotlin.js.JsExport

@JsExport
interface ApiResource {

    suspend fun apiTest(
        req: ApiTestRequest
    ): ApiTestResponse

    @JsExport.Ignore
    fun apiTestBlocking(
        req: ApiTestRequest
    ): ApiTestResponse
}
