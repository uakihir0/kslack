package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a [textarea](https://api.slack.com/dialogs#textarea_elements)
 * dialog element
 *
 *
 *
 *
 * A `textarea` is a multi-line plain text editing control. You've likely encountered
 * these on the world wide web. Use this element if you want a relatively long answer from
 * users.
 */
@JsExport
@Serializable
class DialogTextAreaElement : DialogElement {
    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    override var label: String? = null

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    override var name: String? = null

    /**
     * Type of element.  For a textarea, the type is always `textarea` . It's required.
     *
     * @see [Dialog form elements](https://api.slack.com/dialogs.elements)
     */
    override val type: String = "textarea"

    /**
     * A default value for this field.  Up to 500 characters.
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
     * Maximum input length allowed for element. 0-500 characters. Defaults to 150.
     */
    var maxLength: Int = 0

    /**
     * Minimum input length allowed for element. 1-500 characters. Defaults to 0.
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
