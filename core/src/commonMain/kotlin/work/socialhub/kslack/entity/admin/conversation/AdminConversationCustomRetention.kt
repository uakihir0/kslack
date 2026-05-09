package work.socialhub.kslack.entity.admin.conversation

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversationCustomRetention {
    var durationDays: Int? = null
}
