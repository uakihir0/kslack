package work.socialhub.kslack.api.methods.response.admin.teams

import work.socialhub.kslack.api.methods.SlackApiResponse

class AdminTeamsCreateResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var team: String? = null // created team id
    var responseMetadata: ResponseMetadata? = null

    class ResponseMetadata {
        var messages: Array<String>? = null
    }
}