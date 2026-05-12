package work.socialhub.kslack.api.status

import work.socialhub.khttpclient.HttpResponse

/**
 * Exception thrown when the Slack Status API returns an error response.
 *
 * Wraps the HTTP response and raw response body for error diagnosis
 * when querying the public Slack Status page.
 *
 * @param response The HTTP response that triggered the exception
 * @param responseBody The raw response body text
 */
class StatusApiException(
    val response: HttpResponse,
    val responseBody: String
) : Exception() {

}
