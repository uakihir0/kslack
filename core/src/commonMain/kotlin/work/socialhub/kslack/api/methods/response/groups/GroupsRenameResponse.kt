package com.github.seratch.jslack.api.methods.response.groups

import com.github.seratch.jslack.api.model.Channel

class GroupsRenameResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channel: Channel? = null
}