package work.socialhub.kslack.entity.message

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ScheduledMessage {
    var id: String? = null
    var channelId: String? = null
    var postAt: Int? = null
    var dateCreated: Int? = null
}