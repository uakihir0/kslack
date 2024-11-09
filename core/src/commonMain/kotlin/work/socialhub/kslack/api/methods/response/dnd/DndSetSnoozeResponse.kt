package work.socialhub.kslack.api.methods.response.dnd

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class DndSetSnoozeResponse : SlackApiResponse() {
    var isSnoozeEnabled: Boolean = false
    var snoozeEndtime: Int? = null
    var snoozeRemaining: Int? = null
}