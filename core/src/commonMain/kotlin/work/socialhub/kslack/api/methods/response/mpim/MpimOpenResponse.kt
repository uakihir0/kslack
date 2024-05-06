package com.github.seratch.jslack.api.methods.response.mpim

import com.github.seratch.jslack.api.model.Group

class MpimOpenResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var group: Group? = null
}