package work.socialhub.kslack.api.methods.response.pins

import work.socialhub.kslack.api.methods.SlackApiResponse

class PinsAddResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null

    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}