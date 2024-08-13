package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.PlainTextObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#input
 */
class PlainTextInputElement : BlockElement {
    val type: String = TYPE
    var actionId: String? = null
    private var placeholder: PlainTextObject? = null
    var initialValue: String? = null
    var isMultiline: Boolean = false
    var minLength: Int? = null
    var maxLength: Int? = null

    constructor(
        actionId: String?,
        placeholder: PlainTextObject?,
        initialValue: String?,
        multiline: Boolean,
        minLength: Int?,
        maxLength: Int?
    ) {
        this.actionId = actionId
        this.placeholder = placeholder
        this.initialValue = initialValue
        this.isMultiline = multiline
        this.minLength = minLength
        this.maxLength = maxLength
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun setPlaceholder(placeholder: PlainTextObject?) {
        this.placeholder = placeholder
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is PlainTextInputElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$actionId`: Any? = this.actionId
        val `other$actionId`: Any? = other.actionId
        if (if (`this$actionId` == null) `other$actionId` != null else `this$actionId` != `other$actionId`) return false
        val `this$placeholder`: Any? = this.getPlaceholder()
        val `other$placeholder`: Any? = other.getPlaceholder()
        if (if (`this$placeholder` == null) `other$placeholder` != null else `this$placeholder` != `other$placeholder`) return false
        val `this$initialValue`: Any? = this.initialValue
        val `other$initialValue`: Any? = other.initialValue
        if (if (`this$initialValue` == null) `other$initialValue` != null else `this$initialValue` != `other$initialValue`) return false
        if (this.isMultiline != other.isMultiline) return false
        val `this$minLength`: Any? = this.minLength
        val `other$minLength`: Any? = other.minLength
        if (if (`this$minLength` == null) `other$minLength` != null else `this$minLength` != `other$minLength`) return false
        val `this$maxLength`: Any? = this.maxLength
        val `other$maxLength`: Any? = other.maxLength
        if (if (`this$maxLength` == null) `other$maxLength` != null else `this$maxLength` != `other$maxLength`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is PlainTextInputElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$actionId`: Any? = this.actionId
        result = result * PRIME + (`$actionId`?.hashCode() ?: 43)
        val `$placeholder`: Any? = this.getPlaceholder()
        result = result * PRIME + (`$placeholder`?.hashCode() ?: 43)
        val `$initialValue`: Any? = this.initialValue
        result = result * PRIME + (`$initialValue`?.hashCode() ?: 43)
        result = result * PRIME + (if (this.isMultiline) 79 else 97)
        val `$minLength`: Any? = this.minLength
        result = result * PRIME + (`$minLength`?.hashCode() ?: 43)
        val `$maxLength`: Any? = this.maxLength
        result = result * PRIME + (`$maxLength`?.hashCode() ?: 43)
        return result
    }

    class PlainTextInputElementBuilder() {
        private var actionId: String? = null
        private var placeholder: PlainTextObject? = null
        private var initialValue: String? = null
        private var multiline = false
        private var minLength: Int? = null
        private var maxLength: Int? = null

        fun actionId(actionId: String?): PlainTextInputElementBuilder {
            this.actionId = actionId
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): PlainTextInputElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun initialValue(initialValue: String?): PlainTextInputElementBuilder {
            this.initialValue = initialValue
            return this
        }

        fun multiline(multiline: Boolean): PlainTextInputElementBuilder {
            this.multiline = multiline
            return this
        }

        fun minLength(minLength: Int?): PlainTextInputElementBuilder {
            this.minLength = minLength
            return this
        }

        fun maxLength(maxLength: Int?): PlainTextInputElementBuilder {
            this.maxLength = maxLength
            return this
        }

        fun build(): PlainTextInputElement {
            return PlainTextInputElement(actionId, placeholder, initialValue, multiline, minLength, maxLength)
        }

        override fun toString(): String {
            return "PlainTextInputElement.PlainTextInputElementBuilder(actionId=" + this.actionId + ", placeholder=" + this.placeholder + ", initialValue=" + this.initialValue + ", multiline=" + this.multiline + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ")"
        }
    }

    companion object {
        const val TYPE: String = "plain_text_input"
        fun builder(): PlainTextInputElementBuilder {
            return PlainTextInputElementBuilder()
        }
    }
}
