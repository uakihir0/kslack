package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersInfoRequest(
    /** Authentication token. Requires scope: `reminders:read` */
    override var token: String?,
    /** The ID of the reminder */
    var reminder: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("reminder", reminder)
        }
    }
}