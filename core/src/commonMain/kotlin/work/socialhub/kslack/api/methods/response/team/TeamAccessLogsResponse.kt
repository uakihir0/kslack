package work.socialhub.kslack.api.methods.response.team

import work.socialhub.kslack.api.model.Login

class TeamAccessLogsResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var logins: Array<Login>? = null
    var paging: Paging? = null
}