package com.github.seratch.jslack.api.methods.response.groups

import work.socialhub.kslack.api.methods.SlackApiResponse

class GroupsLeaveResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}