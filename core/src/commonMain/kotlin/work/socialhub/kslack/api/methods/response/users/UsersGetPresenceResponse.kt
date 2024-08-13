package work.socialhub.kslack.api.methods.response.users

import work.socialhub.kslack.api.methods.SlackApiResponse

class UsersGetPresenceResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var presence: String? = null
    var isOnline: Boolean = false
    var isAutoAway: Boolean = false
    var isManualAway: Boolean = false
    var connectionCount: Int? = null
    var lastActivity: Int? = null
}