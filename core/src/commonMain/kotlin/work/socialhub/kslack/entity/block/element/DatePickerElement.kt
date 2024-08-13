package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#datepicker
 */
class DatePickerElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    var actionId: String? = null
    private var placeholder: PlainTextObject? = null
    var initialDate: String? = null
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        actionId: String?,
        placeholder: PlainTextObject?,
        initialDate: String?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.actionId = actionId
        this.placeholder = placeholder
        this.initialDate = initialDate
        this.confirm = confirm
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun getConfirm(): ConfirmationDialogObject? {
        return this.confirm
    }

    fun setPlaceholder(placeholder: PlainTextObject?) {
        this.placeholder = placeholder
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is DatePickerElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$fallback`: Any? = this.fallback
        val `other$fallback`: Any? = other.fallback
        if (if (`this$fallback` == null) `other$fallback` != null else `this$fallback` != `other$fallback`) return false
        val `this$actionId`: Any? = this.actionId
        val `other$actionId`: Any? = other.actionId
        if (if (`this$actionId` == null) `other$actionId` != null else `this$actionId` != `other$actionId`) return false
        val `this$placeholder`: Any? = this.getPlaceholder()
        val `other$placeholder`: Any? = other.getPlaceholder()
        if (if (`this$placeholder` == null) `other$placeholder` != null else `this$placeholder` != `other$placeholder`) return false
        val `this$initialDate`: Any? = this.initialDate
        val `other$initialDate`: Any? = other.initialDate
        if (if (`this$initialDate` == null) `other$initialDate` != null else `this$initialDate` != `other$initialDate`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is DatePickerElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$fallback`: Any? = this.fallback
        result = result * PRIME + (`$fallback`?.hashCode() ?: 43)
        val `$actionId`: Any? = this.actionId
        result = result * PRIME + (`$actionId`?.hashCode() ?: 43)
        val `$placeholder`: Any? = this.getPlaceholder()
        result = result * PRIME + (`$placeholder`?.hashCode() ?: 43)
        val `$initialDate`: Any? = this.initialDate
        result = result * PRIME + (`$initialDate`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class DatePickerElementBuilder() {
        private var fallback: String? = null
        private var actionId: String? = null
        private var placeholder: PlainTextObject? = null
        private var initialDate: String? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): DatePickerElementBuilder {
            this.fallback = fallback
            return this
        }

        fun actionId(actionId: String?): DatePickerElementBuilder {
            this.actionId = actionId
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): DatePickerElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun initialDate(initialDate: String?): DatePickerElementBuilder {
            this.initialDate = initialDate
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): DatePickerElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): DatePickerElement {
            return DatePickerElement(fallback, actionId, placeholder, initialDate, confirm)
        }

        override fun toString(): String {
            return "DatePickerElement.DatePickerElementBuilder(fallback=" + this.fallback + ", actionId=" + this.actionId + ", placeholder=" + this.placeholder + ", initialDate=" + this.initialDate + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "datepicker"
        fun builder(): DatePickerElementBuilder {
            return DatePickerElementBuilder()
        }
    }
}
