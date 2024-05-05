package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
class MultiExternalSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    private var initialOptions: List<OptionObject>? = null
    var minQueryLength: Int? = null
    private var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialOptions: List<OptionObject>?,
        minQueryLength: Int?,
        confirm: ConfirmationDialogObject?,
        maxSelectedItems: Int?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialOptions = initialOptions
        this.minQueryLength = minQueryLength
        this.confirm = confirm
        this.maxSelectedItems = maxSelectedItems
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun getInitialOptions(): List<OptionObject>? {
        return this.initialOptions
    }

    fun getConfirm(): ConfirmationDialogObject? {
        return this.confirm
    }

    fun setPlaceholder(placeholder: PlainTextObject?) {
        this.placeholder = placeholder
    }

    fun setInitialOptions(initialOptions: List<OptionObject>?) {
        this.initialOptions = initialOptions
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is MultiExternalSelectElement) return false
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
        val `this$initialOptions`: Any? = this.getInitialOptions()
        val `other$initialOptions`: Any? = other.getInitialOptions()
        if (if (`this$initialOptions` == null) `other$initialOptions` != null else `this$initialOptions` != `other$initialOptions`) return false
        val `this$minQueryLength`: Any? = this.minQueryLength
        val `other$minQueryLength`: Any? = other.minQueryLength
        if (if (`this$minQueryLength` == null) `other$minQueryLength` != null else `this$minQueryLength` != `other$minQueryLength`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        val `this$maxSelectedItems`: Any? = this.maxSelectedItems
        val `other$maxSelectedItems`: Any? = other.maxSelectedItems
        if (if (`this$maxSelectedItems` == null) `other$maxSelectedItems` != null else `this$maxSelectedItems` != `other$maxSelectedItems`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is MultiExternalSelectElement
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
        val `$initialOptions`: Any? = this.getInitialOptions()
        result = result * PRIME + (`$initialOptions`?.hashCode() ?: 43)
        val `$minQueryLength`: Any? = this.minQueryLength
        result = result * PRIME + (`$minQueryLength`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        val `$maxSelectedItems`: Any? = this.maxSelectedItems
        result = result * PRIME + (`$maxSelectedItems`?.hashCode() ?: 43)
        return result
    }

    class MultiExternalSelectElementBuilder internal constructor() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialOptions: List<OptionObject>? = null
        private var minQueryLength: Int? = null
        private var confirm: ConfirmationDialogObject? = null
        private var maxSelectedItems: Int? = null

        fun fallback(fallback: String?): MultiExternalSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): MultiExternalSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): MultiExternalSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialOptions(initialOptions: List<OptionObject>?): MultiExternalSelectElementBuilder {
            this.initialOptions = initialOptions
            return this
        }

        fun minQueryLength(minQueryLength: Int?): MultiExternalSelectElementBuilder {
            this.minQueryLength = minQueryLength
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): MultiExternalSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun maxSelectedItems(maxSelectedItems: Int?): MultiExternalSelectElementBuilder {
            this.maxSelectedItems = maxSelectedItems
            return this
        }

        fun build(): MultiExternalSelectElement {
            return MultiExternalSelectElement(
                fallback,
                placeholder,
                actionId,
                initialOptions,
                minQueryLength,
                confirm,
                maxSelectedItems
            )
        }

        override fun toString(): String {
            return "MultiExternalSelectElement.MultiExternalSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialOptions=" + this.initialOptions + ", minQueryLength=" + this.minQueryLength + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")"
        }
    }

    companion object {
        const val TYPE: String = "multi_external_select"
        fun builder(): MultiExternalSelectElementBuilder {
            return MultiExternalSelectElementBuilder()
        }
    }
}
