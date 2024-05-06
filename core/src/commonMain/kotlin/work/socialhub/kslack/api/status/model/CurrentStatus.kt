package com.github.seratch.jslack.api.status.v2.model

class CurrentStatus {
    var status: String? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var activeIncidents: List<SlackIssue>? = null
}
