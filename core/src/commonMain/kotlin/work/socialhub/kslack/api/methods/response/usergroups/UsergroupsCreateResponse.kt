package com.github.seratch.jslack.api.methods.response.usergroups

import com.github.seratch.jslack.api.model.Usergroup

class UsergroupsCreateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null // "usergroups:write"
    var provided: String? = null // some permissions

    var usergroup: Usergroup? = null
}