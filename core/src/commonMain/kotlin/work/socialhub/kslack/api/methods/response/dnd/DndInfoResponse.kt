package work.socialhub.kslack.api.methods.response.dnd

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class DndInfoResponse : SlackApiResponse() {
    var isDndEnabled: Boolean = false
    var nextDndStartTs: Int? = null
    var nextDndEndTs: Int? = null
    var isSnoozeEnabled: Boolean = false
    var snoozeEndtime: Int? = null
    var snoozeRemaining: Int? = null
}