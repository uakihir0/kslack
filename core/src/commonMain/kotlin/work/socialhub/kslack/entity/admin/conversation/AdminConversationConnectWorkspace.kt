package work.socialhub.kslack.entity.admin.conversation

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversationConnectWorkspace {
    var id: String? = null
    var name: String? = null
}
