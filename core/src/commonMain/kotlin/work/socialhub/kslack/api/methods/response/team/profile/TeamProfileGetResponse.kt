package com.github.seratch.jslack.api.methods.response.team.profile

import com.github.seratch.jslack.api.model.Team

class TeamProfileGetResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var profile: Profiles? = null

    class Profiles {
        var fields: List<Team.Profile>? = null
    }
}