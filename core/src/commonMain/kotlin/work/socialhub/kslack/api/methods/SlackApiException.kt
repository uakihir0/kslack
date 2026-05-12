package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson

/**
 * Exception thrown when a Slack Web API call results in an HTTP error (non-2xx status code).
 *
 * This exception wraps the raw [HttpResponse] and attempts to parse the response body
 * as a [SlackApiErrorResponse] for structured error information. The original HTTP
 * status code and response body are accessible via [response].
 *
 * Example:
 * ```kotlin
 * try {
 *     slack.chat().chatPostMessageBlocking(ChatPostMessageRequest(...))
 * } catch (e: SlackApiException) {
 *     val status = e.response.statusCode
 *     val errorBody = e.error?.error
 * }
 * ```
 *
 * @see HttpResponse
 * @see SlackApiResponse
 */
class SlackApiException(
    /**
     * The raw HTTP response from the Slack API.
     * Contains status code, headers, and body.
     */
    val response: HttpResponse,
) : Exception() {

    /**
     * Parsed error response from the Slack API body.
     * Contains structured error information like error code, required scopes, etc.
     * May be null if the response body cannot be parsed as JSON.
     */
    var error: SlackApiErrorResponse? = null

    init {
        val body = response.stringBody
        try {
            error = fromJson(body)

        } catch (e: Exception) {
            val text = if (body.length > 1000)
                body.subSequence(0, 1000).toString() + " ..." else body
            println("Failed to parse the error response body: $text")
        }
    }

}
