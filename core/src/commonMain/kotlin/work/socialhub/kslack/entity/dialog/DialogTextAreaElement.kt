package work.socialhub.kslack.entity.dialog

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

    class DialogTextAreaElementBuilder internal constructor() {
        private var label: String? = null
        private var name: String? = null
        private var value: String? = null
        private var placeholder: String? = null
        private var optional = false
        private var maxLength = 0
        private var minLength = 0
        private var hint: String? = null
        private var subtype: DialogSubType? = null

        fun label(label: String?): DialogTextAreaElementBuilder {
            this.label = label
            return this
        }

        fun name(name: String?): DialogTextAreaElementBuilder {
            this.name = name
            return this
        }

        fun value(value: String?): DialogTextAreaElementBuilder {
            this.value = value
            return this
        }

        fun placeholder(placeholder: String?): DialogTextAreaElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun optional(optional: Boolean): DialogTextAreaElementBuilder {
            this.optional = optional
            return this
        }

        fun maxLength(maxLength: Int): DialogTextAreaElementBuilder {
            this.maxLength = maxLength
            return this
        }

        fun minLength(minLength: Int): DialogTextAreaElementBuilder {
            this.minLength = minLength
            return this
        }

        fun hint(hint: String?): DialogTextAreaElementBuilder {
            this.hint = hint
            return this
        }

        fun subtype(subtype: DialogSubType?): DialogTextAreaElementBuilder {
            this.subtype = subtype
            return this
        }

        fun build(): DialogTextAreaElement {
            return DialogTextAreaElement(label, name, value, placeholder, optional, maxLength, minLength, hint, subtype)
        }

        override fun toString(): String {
            return "DialogTextAreaElement.DialogTextAreaElementBuilder(label=" + this.label + ", name=" + this.name + ", value=" + this.value + ", placeholder=" + this.placeholder + ", optional=" + this.optional + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", hint=" + this.hint + ", subtype=" + this.subtype + ")"
        }
    }

    companion object {
        fun builder(): DialogTextAreaElementBuilder {
            return DialogTextAreaElementBuilder()
        }
    }
}
