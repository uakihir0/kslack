package com.github.seratch.jslack.api.methods

import com.github.seratch.jslack.SlackConfig
import com.github.seratch.jslack.common.json.GsonFactory
import net.socialhub.http.HttpResponse
import net.socialhub.logger.Logger

class SlackApiException(config: SlackConfig?, response: HttpResponse?, val responseBody: String) :
    java.lang.Exception() {
    private val response: HttpResponse? = response
    private val error: SlackApiErrorResponse?

    constructor(response: HttpResponse?, responseBody: String) : this(SlackConfig.DEFAULT, response, responseBody)

    init {
        var parsedErrorResponse: SlackApiErrorResponse? = null
        try {
            parsedErrorResponse =
                GsonFactory.createSnakeCase(config).fromJson(responseBody, SlackApiErrorResponse::class.java)
        } catch (e: java.lang.Exception) {
            if (log.isDebugEnabled()) {
                val responseToPrint = if (responseBody.length > 1000) responseBody.subSequence(0, 1000)
                    .toString() + " ..." else responseBody
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

    companion object {
        private val log: Logger = Logger.getLogger(SlackApiException::class.java)
    }
}
