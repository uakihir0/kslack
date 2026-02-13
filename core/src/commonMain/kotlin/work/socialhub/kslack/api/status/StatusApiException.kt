package work.socialhub.kslack.api.status

import work.socialhub.khttpclient.HttpResponse

class StatusApiException(
    val response: HttpResponse,
    val responseBody: String
) : Exception() {

}
