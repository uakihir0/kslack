package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://api.slack.com/methods/reminders.add
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