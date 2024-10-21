package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpResponse

class SlackApiException(
    val response: HttpResponse,
) : Exception() {

    var error: SlackApiErrorResponse?

    init {
        try {
            error =
                GsonFactory.createSnakeCase(config).fromJson(responseBody, SlackApiErrorResponse::class.java)
        } catch (e: java.lang.Exception) {
            if (log.isDebugEnabled()) {
                val responseToPrint =
                    if (responseBody.length > 1000)
                        responseBody.subSequence(0, 1000).toString() + " ..."
                    else responseBody
                log.debug("Failed to parse the error response body: $responseToPrint")
            }
        }
        this.error = parsedErrorResponse
    }

    fun getResponse(): HttpResponse? {
        return this.response
    }

    fun getError(): SlackApiErrorResponse? {
        return this.error
    }
}
