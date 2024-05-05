package work.socialhub.kslack.entity.dialog

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
    private var options: List<DialogOption>? = null

    constructor(
        label: String?,
        name: String?,
        value: String?,
        placeholder: String?,
        optional: Boolean,
        options: List<DialogOption>?
    ) {
        this.label = label
        this.name = name
        this.value = value
        this.placeholder = placeholder
        this.isOptional = optional
        this.options = options
    }

    constructor()

    fun getOptions(): List<DialogOption>? {
        return this.options
    }

    fun setOptions(options: List<DialogOption>?) {
        this.options = options
    }

    class DialogSelectElementBuilder internal constructor() {
        private var label: String? = null
        private var name: String? = null
        private var value: String? = null
        private var placeholder: String? = null
        private var optional = false
        private var options: List<DialogOption>? = null

        fun label(label: String?): DialogSelectElementBuilder {
            this.label = label
            return this
        }

        fun name(name: String?): DialogSelectElementBuilder {
            this.name = name
            return this
        }

        fun value(value: String?): DialogSelectElementBuilder {
            this.value = value
            return this
        }

        fun placeholder(placeholder: String?): DialogSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun optional(optional: Boolean): DialogSelectElementBuilder {
            this.optional = optional
            return this
        }

        fun options(options: List<DialogOption>?): DialogSelectElementBuilder {
            this.options = options
            return this
        }

        fun build(): DialogSelectElement {
            return DialogSelectElement(label, name, value, placeholder, optional, options)
        }

        override fun toString(): String {
            return "DialogSelectElement.DialogSelectElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", options=" + this.options + ")"
        }
    }

    companion object {
        fun builder(): DialogSelectElementBuilder {
            return DialogSelectElementBuilder()
        }
    }
}
