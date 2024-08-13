package work.socialhub.kslack.api.methods.response.auth

import work.socialhub.kslack.api.methods.SlackApiResponse

class AuthTestResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var url: String? = null
    var team: String? = null
    var user: String? = null
    var teamId: String? = null
    var userId: String? = null
    var enterpriseId: String? = null
}