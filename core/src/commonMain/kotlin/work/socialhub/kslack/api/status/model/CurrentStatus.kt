package work.socialhub.kslack.api.status.model

class CurrentStatus {
    var status: String? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var activeIncidents: Array<SlackIssue>? = null
}
