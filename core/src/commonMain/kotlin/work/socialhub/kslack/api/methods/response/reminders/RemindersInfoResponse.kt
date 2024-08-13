package work.socialhub.kslack.api.methods.response.reminders

import work.socialhub.kslack.api.model.Reminder

class RemindersInfoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var reminder: Reminder? = null
}