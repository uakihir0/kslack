package com.github.seratch.jslack.api.methods.response.usergroups.users

import com.github.seratch.jslack.api.model.Usergroup

class UsergroupUsersUpdateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var usergroup: Usergroup? = null
}