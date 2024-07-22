package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName

/**
 * https://api.slack.com/docs/message-attachments
 */
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