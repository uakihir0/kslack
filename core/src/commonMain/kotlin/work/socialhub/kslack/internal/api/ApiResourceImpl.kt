package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ApiResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.api.ApiRateLimitRequest
import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.response.api.ApiRateLimitResponse
import work.socialhub.kslack.api.methods.response.api.ApiTestResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [ApiResource] for Slack's `api.*` utility methods.
 *
 * Handles HTTP POST requests for API testing (`api.test`) and rate limit
 * inspection (`api.rateLimit`). The `api.test` method does not require
 * a token, while `api.rateLimit` returns detailed rate limit headers.
 *
 * @param token Optional default token provided at factory initialization
 */
class ApiResourceImpl(
    token: String?
) : AbstractResourceImpl(token), ApiResource {

    override suspend fun apiTest(req: ApiTestRequest): ApiTestResponse {
        return postForm(req.toParams(), Methods.API_TEST)
    }

    override fun apiTestBlocking(req: ApiTestRequest): ApiTestResponse {
        return toBlocking { apiTest(req) }
    }

    override suspend fun apiRateLimit(req: ApiRateLimitRequest): ApiRateLimitResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.API_RATE_LIMIT,
            getToken(req),
        )
    }

    override fun apiRateLimitBlocking(req: ApiRateLimitRequest): ApiRateLimitResponse {
        return toBlocking { apiRateLimit(req) }
    }
}
