package com.github.seratch.jslack.api.methods.response.users

import com.github.seratch.jslack.api.model.User

class UsersInfoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var user: User? = null
}