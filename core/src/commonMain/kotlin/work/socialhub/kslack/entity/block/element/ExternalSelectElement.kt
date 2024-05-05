package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#external-select
 */
class ExternalSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    private var initialOption: OptionObject? = null
    var minQueryLength: Int? = null
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialOption: OptionObject?,
        minQueryLength: Int?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialOption = initialOption
        this.minQueryLength = minQueryLength
        this.confirm = confirm
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun getInitialOption(): OptionObject? {
        return this.initialOption
    }

    fun getConfirm(): ConfirmationDialogObject? {
        return this.confirm
    }

    fun setPlaceholder(placeholder: PlainTextObject?) {
        this.placeholder = placeholder
    }

    fun setInitialOption(initialOption: OptionObject?) {
        this.initialOption = initialOption
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is ExternalSelectElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$fallback`: Any? = this.fallback
        val `other$fallback`: Any? = other.fallback
        if (if (`this$fallback` == null) `other$fallback` != null else `this$fallback` != `other$fallback`) return false
        val `this$placeholder`: Any? = this.getPlaceholder()
        val `other$placeholder`: Any? = other.getPlaceholder()
        if (if (`this$placeholder` == null) `other$placeholder` != null else `this$placeholder` != `other$placeholder`) return false
        val `this$actionId`: Any? = this.actionId
        val `other$actionId`: Any? = other.actionId
        if (if (`this$actionId` == null) `other$actionId` != null else `this$actionId` != `other$actionId`) return false
        val `this$initialOption`: Any? = this.getInitialOption()
        val `other$initialOption`: Any? = other.getInitialOption()
        if (if (`this$initialOption` == null) `other$initialOption` != null else `this$initialOption` != `other$initialOption`) return false
        val `this$minQueryLength`: Any? = this.minQueryLength
        val `other$minQueryLength`: Any? = other.minQueryLength
        if (if (`this$minQueryLength` == null) `other$minQueryLength` != null else `this$minQueryLength` != `other$minQueryLength`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is ExternalSelectElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$fallback`: Any? = this.fallback
        result = result * PRIME + (`$fallback`?.hashCode() ?: 43)
        val `$placeholder`: Any? = this.getPlaceholder()
        result = result * PRIME + (`$placeholder`?.hashCode() ?: 43)
        val `$actionId`: Any? = this.actionId
        result = result * PRIME + (`$actionId`?.hashCode() ?: 43)
        val `$initialOption`: Any? = this.getInitialOption()
        result = result * PRIME + (`$initialOption`?.hashCode() ?: 43)
        val `$minQueryLength`: Any? = this.minQueryLength
        result = result * PRIME + (`$minQueryLength`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class ExternalSelectElementBuilder internal constructor() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialOption: OptionObject? = null
        private var minQueryLength: Int? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): ExternalSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): ExternalSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): ExternalSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialOption(initialOption: OptionObject?): ExternalSelectElementBuilder {
            this.initialOption = initialOption
            return this
        }

        fun minQueryLength(minQueryLength: Int?): ExternalSelectElementBuilder {
            this.minQueryLength = minQueryLength
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): ExternalSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): ExternalSelectElement {
            return ExternalSelectElement(fallback, placeholder, actionId, initialOption, minQueryLength, confirm)
        }

        override fun toString(): String {
            return "ExternalSelectElement.ExternalSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialOption=" + this.initialOption + ", minQueryLength=" + this.minQueryLength + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "external_select"
        fun builder(): ExternalSelectElementBuilder {
            return ExternalSelectElementBuilder()
        }
    }
}
