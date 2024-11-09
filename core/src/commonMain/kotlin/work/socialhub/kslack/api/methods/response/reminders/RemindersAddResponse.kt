package work.socialhub.kslack.api.methods.response.reminders

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Reminder
import kotlin.js.JsExport

@JsExport
@Serializable
class RemindersAddResponse : SlackApiResponse() {
    var reminder: Reminder? = null
}