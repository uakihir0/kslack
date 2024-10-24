package work.socialhub.kslack.api.methods.impl

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kmastodon.internal.InternalUtility.fromJson
import work.socialhub.kslack.api.methods.SlackApiException
import work.socialhub.kslack.api.methods.SlackApiRequest

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
            .url("http://$endpoint")
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
            .url("http://$endpoint")
            .also { it.params += params }
            .header("", token)
            .forceApplicationFormUrlEncoded(true)
            .post()
    }

    suspend fun runPostMultipart(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): HttpResponse {
        return HttpRequest()
            .url("http://$endpoint")
            .also { it.params += params }
            .header("", token)
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
        // TODO: その API では Token が必要かどうかを確認
        throw IllegalStateException("")
    }

    inline fun <reified T> parseJsonResponse(
        response: HttpResponse
    ): T {
        try {
            if (response.status in 200..299) {
                val body = response.stringBody
                return fromJson(body)
            } else {
                throw SlackApiException(response)
            }
        } catch (e: Exception) {
            throw IllegalStateException()
        }
    }
}