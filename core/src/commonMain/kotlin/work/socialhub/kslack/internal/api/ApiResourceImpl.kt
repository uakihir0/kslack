package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ApiResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.response.api.ApiTestResponse
import work.socialhub.kslack.util.toBlocking

class ApiResourceImpl(
    token: String?
) : AbstractResourceImpl(token), ApiResource {

    override suspend fun apiTest(req: ApiTestRequest): ApiTestResponse {
        return postForm(req.toParams(), Methods.API_TEST)
    }

    override fun apiTestBlocking(req: ApiTestRequest): ApiTestResponse {
        return toBlocking { apiTest(req) }
    }
}
