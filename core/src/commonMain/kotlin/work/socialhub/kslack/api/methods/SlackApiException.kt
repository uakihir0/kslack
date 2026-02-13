package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpResponse
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson

class SlackApiException(
    val response: HttpResponse,
) : Exception() {

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
