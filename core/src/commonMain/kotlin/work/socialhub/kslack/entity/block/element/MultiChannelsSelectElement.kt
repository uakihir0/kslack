package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
class MultiChannelsSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialChannels: Array<String>? = null
    private var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialChannels: Array<String>?,
        confirm: ConfirmationDialogObject?,
        maxSelectedItems: Int?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialChannels = initialChannels
        this.confirm = confirm
        this.maxSelectedItems = maxSelectedItems
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
        if (o !is MultiChannelsSelectElement) return false
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
        val `this$initialChannels`: Any? = this.initialChannels
        val `other$initialChannels`: Any? = other.initialChannels
        if (if (`this$initialChannels` == null) `other$initialChannels` != null else `this$initialChannels` != `other$initialChannels`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        val `this$maxSelectedItems`: Any? = this.maxSelectedItems
        val `other$maxSelectedItems`: Any? = other.maxSelectedItems
        if (if (`this$maxSelectedItems` == null) `other$maxSelectedItems` != null else `this$maxSelectedItems` != `other$maxSelectedItems`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is MultiChannelsSelectElement
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
        val `$initialChannels`: Any? = this.initialChannels
        result = result * PRIME + (`$initialChannels`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        val `$maxSelectedItems`: Any? = this.maxSelectedItems
        result = result * PRIME + (`$maxSelectedItems`?.hashCode() ?: 43)
        return result
    }

    class MultiChannelsSelectElementBuilder() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialChannels: Array<String>? = null
        private var confirm: ConfirmationDialogObject? = null
        private var maxSelectedItems: Int? = null

        fun fallback(fallback: String?): MultiChannelsSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): MultiChannelsSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): MultiChannelsSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialChannels(initialChannels: Array<String>?): MultiChannelsSelectElementBuilder {
            this.initialChannels = initialChannels
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): MultiChannelsSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun maxSelectedItems(maxSelectedItems: Int?): MultiChannelsSelectElementBuilder {
            this.maxSelectedItems = maxSelectedItems
            return this
        }

        fun build(): MultiChannelsSelectElement {
            return MultiChannelsSelectElement(
                fallback,
                placeholder,
                actionId,
                initialChannels,
                confirm,
                maxSelectedItems
            )
        }

        override fun toString(): String {
            return "MultiChannelsSelectElement.MultiChannelsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialChannels=" + this.initialChannels + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")"
        }
    }

    companion object {
        const val TYPE: String = "multi_channels_select"
        fun builder(): MultiChannelsSelectElementBuilder {
            return MultiChannelsSelectElementBuilder()
        }
    }
}
