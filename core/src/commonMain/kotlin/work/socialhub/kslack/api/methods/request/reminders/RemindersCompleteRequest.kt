package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersCompleteRequest(
    /** Authentication token. Requires scope: `reminders:write` */
    override var token: String?,
    /** The ID of the reminder to be marked as complete */
    var reminder: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("reminder", reminder)
        }
    }
}