package com.github.seratch.jslack.api.methods.response.admin.users

import com.github.seratch.jslack.api.methods.SlackApiResponse

class AdminUsersRemoveResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var responseMetadata: ResponseMetadata? = null

    class ResponseMetadata {
        var messages: List<String>? = null
    }
}