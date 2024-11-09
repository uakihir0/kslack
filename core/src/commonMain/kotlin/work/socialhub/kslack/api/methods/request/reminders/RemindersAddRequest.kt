package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class RemindersAddRequest(
    /** Authentication token. Requires scope: `reminders:write` */
    override var token: String?,
    /** The content of the reminder */
    var text: String?,

    /**
     * When this reminder should happen: the Unix timestamp (up to five years from now),
     * the number of seconds until the reminder (if within 24 hours), or a natural language description
     * (Ex. \"in 15 minutes,\" or \"every Thursday\")
     */
    var time: String?,

    /** The user who will receive the reminder. If no user is specified, the reminder will go to user who created it. */
    var user: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("text", text)
            it.addParam("time", time)
            it.addParam("user", user)

        }
    }
}