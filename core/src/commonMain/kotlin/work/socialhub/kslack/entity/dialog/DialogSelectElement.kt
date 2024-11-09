package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a [select](https://api.slack.com/dialogs#select_elements)
 * dialog element
 *
 *
 *
 *
 * Use the `select` element for multiple choice selections allowing users to pick a
 * single item from a list. True to web roots, this selection is displayed as a dropdown
 * menu.
 */

@JsExport
@Serializable
class DialogSelectElement : DialogElement {
    /**
     * Label displayed to user. Required. No more than 24 characters.
     */
    override var label: String? = null

    /**
     * Name of form element. Required. No more than 300 characters.
     */
    override var name: String? = null

    /**
     * Type of element.  For a dropdown (select), the type is always
     * `select` . It's required.
     *
     * @see [Dialog form elements](https://api.slack.com/dialogs.elements)
     */
    override val type: String = "select"

    /**
     * A default value for this field.  Must match a value presented in [DialogOption]s.
     */
    override var value: String? = null

    /**
     * A string displayed as needed to help guide users in completing the element.
     * 150 character maximum.
     */
    override var placeholder: String? = null

    /**
     * Provide true when the form element is not required. By default, form elements are
     * required.
     */
    override var isOptional: Boolean = false

    /**
     * Provide up to 100 option element attributes. Required for this type.
     */
    private var options: Array<DialogOption>? = null

}
