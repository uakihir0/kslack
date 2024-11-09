package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a [text](https://api.slack.com/dialogs#text_elements)
 * dialog element
 *
 * `Text` elements are single-line plain text fields.
 */
@JsExport
@Serializable
class DialogTextElement : DialogElement {
    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    override var label: String? = null

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    override var name: String? = null

    /**
     * Type of element.  For a text element, the type is always
     * `text` . It's required.
     *
     * @see [Dialog form elements](https://api.slack.com/dialogs.elements)
     */
    override val type: String = "text"

    /**
     * A default value for this field. Up to 500 characters.
     */
    override var value: String? = null

    /**
     * A string displayed as needed to help guide users in completing the element.
     * 150 character maximum.
     */
    override var placeholder: String? = null

    /**
     * Provide `true` when the form element is not required. By default,
     * form elements are required.
     */
    override var isOptional: Boolean = false

    /**
     * Maximum input length allowed for element. Up to 150 characters. Defaults to 150.
     */
    var maxLength: Int = 0

    /**
     * Minimum input length allowed for element.
     * Type `text`: Up to 150 characters. Defaults to 0.
     */
    var minLength: Int = 0

    /**
     * Helpful text provided to assist users in answering a question. Up to 150 characters.
     */
    var hint: String? = null

    /**
     * Subtype for this text type element (e.g. Number)
     */
    var subtype: DialogSubType? = null
}
