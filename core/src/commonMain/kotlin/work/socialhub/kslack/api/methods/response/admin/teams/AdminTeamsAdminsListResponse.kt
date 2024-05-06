package com.github.seratch.jslack.api.methods.response.admin.teams

import com.github.seratch.jslack.api.model.ResponseMetadata

class AdminTeamsAdminsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var adminIds: List<String>? = null
    var responseMetadata: ResponseMetadata? = null
}