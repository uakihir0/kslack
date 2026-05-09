package work.socialhub.kslack.entity.admin.conversation

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversationBanUser {
    var userId: String? = null
    var teamId: String? = null
}
