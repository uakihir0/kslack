package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class DndSetSnoozeRequest(
    /** Authentication token. Requires scope: `dnd:write` */
    override var token: String?,
    /** Number of minutes, from now, to snooze until. */
    var numMinutes: Int?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("num_minutes", numMinutes)
        }
    }
}