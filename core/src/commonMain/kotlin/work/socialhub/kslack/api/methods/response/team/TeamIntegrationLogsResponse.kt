package com.github.seratch.jslack.api.methods.response.team

import com.github.seratch.jslack.api.model.IntegrationLog

class TeamIntegrationLogsResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var logs: List<IntegrationLog>? = null
    var paging: Paging? = null
}