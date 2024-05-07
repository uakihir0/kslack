package com.github.seratch.jslack.api.methods.response.groups

import com.github.seratch.jslack.api.model.Group

class GroupsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var groups: Array<Group>? = null
}