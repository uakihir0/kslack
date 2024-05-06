package com.github.seratch.jslack.api.methods.response.usergroups.users

import com.github.seratch.jslack.api.methods.SlackApiResponse

class UsergroupUsersListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var users: List<String>? = null
}