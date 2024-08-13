package work.socialhub.kslack.api.status.v2

import net.socialhub.http.HttpResponse

class StatusApiException(response: HttpResponse, val responseBody: String) : java.lang.Exception() {
    private val response: HttpResponse = response

    fun getResponse(): HttpResponse {
        return this.response
    }
}
