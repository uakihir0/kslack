package work.socialhub.kslack.api.methods.response.admin.teams

import work.socialhub.kslack.api.model.ResponseMetadata

class AdminTeamsAdminsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var adminIds: Array<String>? = null
    var responseMetadata: ResponseMetadata? = null
}