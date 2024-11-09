package work.socialhub.kslack.api.methods.response.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class UsersGetPresenceResponse : SlackApiResponse() {
    var presence: String? = null
    var isOnline: Boolean = false
    var isAutoAway: Boolean = false
    var isManualAway: Boolean = false
    var connectionCount: Int? = null
    var lastActivity: Int? = null
}