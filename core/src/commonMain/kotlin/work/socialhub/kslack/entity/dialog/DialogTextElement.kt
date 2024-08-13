package work.socialhub.kslack.entity.dialog

/**
 * Represents a [text](https://api.slack.com/dialogs#text_elements)
 * dialog element
 *
 *
 *
 *
 * `Text` elements are single-line plain text fields.
 */
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

    constructor(
        label: String?,
        name: String?,
        value: String?,
        placeholder: String?,
        optional: Boolean,
        maxLength: Int,
        minLength: Int,
        hint: String?,
        subtype: DialogSubType?
    ) {
        this.label = label
        this.name = name
        this.value = value
        this.placeholder = placeholder
        this.isOptional = optional
        this.maxLength = maxLength
        this.minLength = minLength
        this.hint = hint
        this.subtype = subtype
    }

    constructor()

    fun getSubtype(): DialogSubType? {
        return this.subtype
    }

    fun setSubtype(subtype: DialogSubType?) {
        this.subtype = subtype
    }

    class DialogTextElementBuilder() {
        private var label: String? = null
        private var name: String? = null
        private var value: String? = null
        private var placeholder: String? = null
        private var optional = false
        private var maxLength = 0
        private var minLength = 0
        private var hint: String? = null
        private var subtype: DialogSubType? = null

        fun label(label: String?): DialogTextElementBuilder {
            this.label = label
            return this
        }

        fun name(name: String?): DialogTextElementBuilder {
            this.name = name
            return this
        }

        fun value(value: String?): DialogTextElementBuilder {
            this.value = value
            return this
        }

        fun placeholder(placeholder: String?): DialogTextElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun optional(optional: Boolean): DialogTextElementBuilder {
            this.optional = optional
            return this
        }

        fun maxLength(maxLength: Int): DialogTextElementBuilder {
            this.maxLength = maxLength
            return this
        }

        fun minLength(minLength: Int): DialogTextElementBuilder {
            this.minLength = minLength
            return this
        }

        fun hint(hint: String?): DialogTextElementBuilder {
            this.hint = hint
            return this
        }

        fun subtype(subtype: DialogSubType?): DialogTextElementBuilder {
            this.subtype = subtype
            return this
        }

        fun build(): DialogTextElement {
            return DialogTextElement(label, name, value, placeholder, optional, maxLength, minLength, hint, subtype)
        }

        override fun toString(): String {
            return "DialogTextElement.DialogTextElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", hint=" + this.hint + ", subtype=" + this.subtype + ")"
        }
    }

    companion object {
        fun builder(): DialogTextElementBuilder {
            return DialogTextElementBuilder()
        }
    }
}
