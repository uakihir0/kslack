package work.socialhub.kslack.api.methods.response.views

import work.socialhub.kslack.api.model.view.View

class ViewsPushResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var view: View? = null

    var responseMetadata: ResponseMetadata? = null

    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}
