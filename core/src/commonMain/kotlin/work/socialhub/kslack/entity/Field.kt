package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a named field in a Slack message attachment.
 *
 * Fields are displayed in a table inside the attachment. Short fields
 * appear side-by-side with other short fields, while long fields take
 * the full width. Used in `Attachment.fields`.
 *
 * @see <a href="https://api.slack.com/docs/message-attachments">Message attachments</a>
 */
@JsExport
@Serializable
class Field {

    /**
     * Shown as a bold heading above the value text. It cannot contain markup and will be escaped for you.
     */
    var title: String? = null

    /**
     * The text value of the field. It may contain standard message markup (see details below) and must be escaped as normal. May be multi-line.
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    var value: String? = null

    /**
     * An optional flag indicating whether the value is short enough to be displayed side-by-side with other values.
     */
    @SerialName("short")
    var isValueShortEnough: Boolean = false
}