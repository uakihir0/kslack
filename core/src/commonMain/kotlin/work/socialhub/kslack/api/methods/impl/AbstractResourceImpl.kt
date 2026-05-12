package work.socialhub.kslack.api.methods.impl

import work.socialhub.khttpclient.HttpParameter
import work.socialhub.khttpclient.HttpRequest
import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.methods.SlackApiException
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson

/**
 * Abstract base class for all Slack API resource implementations.
 *
 * Provides common HTTP client functionality for making POST requests to the
 * Slack Web API (`https://slack.com/api/{method}`). All resource implementations
 * (e.g., [ChatResourceImpl][work.socialhub.kslack.internal.api.ChatResourceImpl],
 * [UsersResourceImpl][work.socialhub.kslack.internal.api.UsersResourceImpl])
 * extend this class.
 *
 * **Authentication**: A token can be provided at construction time (via
 * `SlackFactory.instance(token)`) or per-request via the [SlackApiRequest.token]
 * property. The [getToken] method resolves the token using this priority:
 * 1. Request-level token (`request.token`)
 * 2. Factory-level token (constructor parameter)
 * 3. Throws `IllegalStateException` if neither is available
 *
 * **HTTP Methods**:
 * - [runPostForm] - POST with form-encoded body (no auth header)
 * - [runPostFormWithToken] - POST with form-encoded body + Bearer auth header
 * - [runPostMultipart] - POST with multipart/form-data body + Bearer auth header
 *
 * **Response Parsing**:
 * - [postForm] / [postFormWithToken] / [postMultipartWithToken] - Generic methods
 *   that execute the HTTP request and deserialize the JSON response into the
 *   target type `T` (which should extend [SlackApiResponse][work.socialhub.kslack.api.methods.SlackApiResponse])
 * - [parseJsonResponse] - Validates HTTP status (200-299) and deserializes JSON
 *   using [JsonHelper.fromJson][work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson]
 *
 * @param token Optional default authentication token. Can be overridden per-request.
 * @see Slack
 * @see SlackFactory
 * @see FormRequest
 */
open class AbstractResourceImpl(
    /**
     * Default authentication token for API calls.
     * Set when creating the resource via [SlackFactory].
     * Can be overridden by providing a token in individual requests.
     */
    val token: String?
) {

    // ----------------------------------------------
    // OkHttp layer methods
    // ----------------------------------------------

    /**
     * Sends a POST request to the Slack API with form-encoded parameters.
     * Uses the factory-level token (no Authorization header).
     *
     * @param params The form parameters to send
     * @param endpoint The API endpoint (e.g., "chat.postMessage")
     * @return The raw HTTP response
     * @see Slack.ENDPOINT_URL_PREFIX
     */
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

    /**
     * Sends a POST request to the Slack API with form-encoded parameters
     * and a Bearer token in the Authorization header.
     *
     * @param params The form parameters to send
     * @param endpoint The API endpoint (e.g., "chat.postMessage")
     * @param token The OAuth access token for authentication
     * @return The raw HTTP response
     */
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

    /**
     * Sends a POST request to the Slack API with multipart/form-data.
     * Used for file upload endpoints that accept binary data.
     *
     * @param params The form parameters to send
     * @param endpoint The API endpoint (e.g., "files.upload")
     * @param token The OAuth access token for authentication
     * @return The raw HTTP response
     */
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

    // ----------------------------------------------
    // High-level typed response methods
    // ----------------------------------------------

    /**
     * Sends a POST request and deserializes the JSON response into the specified type.
     * Uses the factory-level token (no Authorization header).
     *
     * @param T The response type (must extend [SlackApiResponse][work.socialhub.kslack.api.methods.SlackApiResponse])
     * @param params The form parameters
     * @param endpoint The API endpoint
     * @return The deserialized response object
     * @throws SlackApiException if the HTTP status is not 2xx
     * @throws IllegalStateException if JSON parsing fails
     */
    protected suspend inline fun <reified T> postForm(
        params: List<HttpParameter>,
        endpoint: String,
    ): T {
        val response = runPostForm(params, endpoint)
        return parseJsonResponse(response)
    }

    /**
     * Sends a POST request with Bearer authentication and deserializes the JSON response.
     *
     * @param T The response type (must extend [SlackApiResponse][work.socialhub.kslack.api.methods.SlackApiResponse])
     * @param params The form parameters
     * @param endpoint The API endpoint
     * @param token The OAuth access token
     * @return The deserialized response object
     * @throws SlackApiException if the HTTP status is not 2xx
     * @throws IllegalStateException if JSON parsing fails
     */
    protected suspend inline fun <reified T> postFormWithToken(
        params: List<HttpParameter>,
        endpoint: String,
        token: String,
    ): T {
        val response = runPostFormWithToken(params, endpoint, token)
        return parseJsonResponse(response)
    }

    /**
     * Sends a POST request with multipart/form-data and Bearer authentication,
     * then deserializes the JSON response.
     *
     * @param T The response type (must extend [SlackApiResponse][work.socialhub.kslack.api.methods.SlackApiResponse])
     * @param params The form parameters (may include binary file data)
     * @param endpoint The API endpoint
     * @param token The OAuth access token
     * @return The deserialized response object
     * @throws SlackApiException if the HTTP status is not 2xx
     * @throws IllegalStateException if JSON parsing fails
     */
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

    /**
     * Resolves the authentication token to use for an API call.
     *
     * Priority order:
     * 1. Token from the request object (`request.token`)
     * 2. Token from the resource constructor (factory-level token)
     * 3. Throws `IllegalStateException` if neither is available
     *
     * @param request The API request object
     * @return The resolved authentication token
     * @throws IllegalStateException if no token is available
     */
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

    /**
     * Validates the HTTP response status and deserializes the JSON body.
     *
     * - If status is 200-299, deserializes the body using [JsonHelper.fromJson][work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson]
     * - If status is outside 200-299, throws [SlackApiException]
     * - If JSON parsing fails, throws `IllegalStateException` with the raw body
     *
     * @param T The response type (must extend [SlackApiResponse][work.socialhub.kslack.api.methods.SlackApiResponse])
     * @param response The HTTP response to process
     * @return The deserialized response object
     * @throws SlackApiException if HTTP status is not 2xx
     * @throws IllegalStateException if JSON parsing fails
     */
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
