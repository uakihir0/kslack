package work.socialhub.kslack.api.status

import work.socialhub.khttpclient.HttpResponse


class StatusApiException(response: HttpResponse, val responseBody: String) : Exception() {
    private val response: HttpResponse = response

    fun getResponse(): HttpResponse {
        return this.response
    }
}
