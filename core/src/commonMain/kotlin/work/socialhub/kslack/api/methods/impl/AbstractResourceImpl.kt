package work.socialhub.kslack.api.methods.impl

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.methods.SlackApiException
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson

open class AbstractResourceImpl(
    val token: String?
) {

    // ----------------------------------------------
    // OkHttp layer methods
    // ----------------------------------------------
    suspend fun runPostForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): HttpResponse {
        return HttpRequest()
            .url("${Slack.ENDPOINT_URL_PREFIX}$endpoint")
            .also { it.params += params }
            .forceApplicationFormUrlEncoded(true)
            .post()
    }

    suspend fun runPostFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse {
        return HttpRequest()
            .url("${Slack.ENDPOINT_URL_PREFIX}$endpoint")
            .also { it.params += params }
            .header("Authorization", "Bearer $token")
            .forceApplicationFormUrlEncoded(true)
            .post()
    }

    suspend fun runPostMultipart(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse {
        return HttpRequest()
            .url("${Slack.ENDPOINT_URL_PREFIX}$endpoint")
            .also { it.params += params }
            .header("Authorization", "Bearer $token")
            .forceMultipartFormData(true)
            .post()
    }

    protected suspend inline fun <reified T> postForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): T {
        val response = runPostForm(params, endpoint)
        return parseJsonResponse(response)
    }

    protected suspend inline fun <reified T> postFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): T {
        val response = runPostFormWithToken(params, endpoint, token)
        return parseJsonResponse(response)
    }

    protected suspend inline fun <reified T> postMultipartWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): T {
        val response = runPostMultipart(params, endpoint, token)
        return parseJsonResponse(response)
    }

    // ----------------------------------------------
    // Internal methods
    // ----------------------------------------------
    protected fun getToken(
        request: SlackApiRequest
    ): String {
        if (request.token != null) {
            return request.token!!
        }

        if (token != null) {
            return token
        }

        throw IllegalStateException(
            "This API requires an access token. Provide it via SlackFactory.instance(token) or request.token."
        )
    }

    inline fun <reified T> parseJsonResponse(
        response: HttpResponse
    ): T {
        if (response.status !in 200..299) {
            throw SlackApiException(response)
        }

        val body = response.stringBody

        return try {
            fromJson(body)
        } catch (e: Exception) {
            throw IllegalStateException(
                "Failed to parse Slack API response: $body",
                e
            )
        }
    }
}
