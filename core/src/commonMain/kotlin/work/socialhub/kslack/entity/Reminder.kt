package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a Slack reminder created via the `reminders.*` API methods.
 *
 * Contains the reminder ID, creator and user IDs, text content,
 * scheduled time, and completion status.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/reminders.add">reminders.add</a>
 */
@JsExport
@Serializable
class Reminder {

    var id: String? = null
    var creator: String? = null
    var user: String? = null
    var text: String? = null

    @SerialName("recurring")
    var isRecurring: Boolean = false

    var time: Int? = null

    @SerialName("complete_ts")
    var completeTs: Int? = null
}