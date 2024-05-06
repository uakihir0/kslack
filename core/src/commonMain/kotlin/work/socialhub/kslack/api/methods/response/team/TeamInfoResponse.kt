package com.github.seratch.jslack.api.methods.response.team

import com.github.seratch.jslack.api.model.Team

class TeamInfoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var team: Team? = null
}