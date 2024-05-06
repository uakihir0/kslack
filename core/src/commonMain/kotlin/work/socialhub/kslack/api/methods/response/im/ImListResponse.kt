package com.github.seratch.jslack.api.methods.response.im

import com.github.seratch.jslack.api.model.Im

class ImListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var ims: List<Im>? = null
    var responseMetadata: ResponseMetadata? = null
}
