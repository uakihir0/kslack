package com.github.seratch.jslack.api.methods.response.views

import com.github.seratch.jslack.api.model.view.View

class ViewsPublishResponse : SlackApiResponse {
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