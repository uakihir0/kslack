package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersListRequest(
    /** Authentication token. Requires scope: `reminders:read` */
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mapOf()
    }
}