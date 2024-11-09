package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class DndEndSnoozeRequest(
    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mapOf()
    }
}