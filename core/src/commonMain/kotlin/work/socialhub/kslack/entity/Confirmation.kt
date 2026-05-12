package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a confirmation dialog for destructive actions in message attachments.
 *
 * When a user clicks a button that could have significant consequences,
 * this model defines the confirmation prompt shown before the action is executed.
 * Used with `Action.confirm` in interactive message buttons.
 *
 * @see <a href="https://api.slack.com/docs/message-attachments">Message attachments</a>
 */
@JsExport
@Serializable
class Confirmation {
    companion object {
        const val OKAY: String = "Okay"
        const val DISMISS: String = "Cancel"
    }

    var title: String? = null
    var text: String? = null
    var okText: String? = OKAY
    var dismissText: String? = DISMISS
}
