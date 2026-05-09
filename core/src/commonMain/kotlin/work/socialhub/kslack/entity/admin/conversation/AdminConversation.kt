package work.socialhub.kslack.entity.admin.conversation

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversation {
    var id: String? = null
    var name: String? = null
    var isChannel: Boolean? = null
    var isGroup: Boolean? = null
    var isIm: Boolean? = null
    var dateCreate: Long? = null
    var creatorId: String? = null
    var workspaceId: String? = null
    var isPrivate: Boolean? = null
}
