package com.github.seratch.jslack.api.methods.response.api

import com.github.seratch.jslack.api.methods.SlackApiResponse

class ApiTestResponse : SlackApiResponse {
    class Args {
        var foo: String? = null
        var error: String? = null
    }

    override var isOk: Boolean = false
    var args: Args? = null
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}