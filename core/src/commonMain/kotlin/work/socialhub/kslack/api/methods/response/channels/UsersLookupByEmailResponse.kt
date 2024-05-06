package com.github.seratch.jslack.api.methods.response.channels

import com.github.seratch.jslack.api.model.User

class UsersLookupByEmailResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var user: User? = null
}
