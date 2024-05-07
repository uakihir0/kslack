package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
class MultiConversationsSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialConversations: Array<String>? = null
    private var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialConversations: Array<String>?,
        confirm: ConfirmationDialogObject?,
        maxSelectedItems: Int?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialConversations = initialConversations
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
        if (o !is MultiConversationsSelectElement) return false
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
        val `this$initialConversations`: Any? = this.initialConversations
        val `other$initialConversations`: Any? = other.initialConversations
        if (if (`this$initialConversations` == null) `other$initialConversations` != null else `this$initialConversations` != `other$initialConversations`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        val `this$maxSelectedItems`: Any? = this.maxSelectedItems
        val `other$maxSelectedItems`: Any? = other.maxSelectedItems
        if (if (`this$maxSelectedItems` == null) `other$maxSelectedItems` != null else `this$maxSelectedItems` != `other$maxSelectedItems`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is MultiConversationsSelectElement
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
        val `$initialConversations`: Any? = this.initialConversations
        result = result * PRIME + (`$initialConversations`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        val `$maxSelectedItems`: Any? = this.maxSelectedItems
        result = result * PRIME + (`$maxSelectedItems`?.hashCode() ?: 43)
        return result
    }

    class MultiConversationsSelectElementBuilder internal constructor() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialConversations: Array<String>? = null
        private var confirm: ConfirmationDialogObject? = null
        private var maxSelectedItems: Int? = null

        fun fallback(fallback: String?): MultiConversationsSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): MultiConversationsSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): MultiConversationsSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialConversations(initialConversations: Array<String>?): MultiConversationsSelectElementBuilder {
            this.initialConversations = initialConversations
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): MultiConversationsSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun maxSelectedItems(maxSelectedItems: Int?): MultiConversationsSelectElementBuilder {
            this.maxSelectedItems = maxSelectedItems
            return this
        }

        fun build(): MultiConversationsSelectElement {
            return MultiConversationsSelectElement(
                fallback,
                placeholder,
                actionId,
                initialConversations,
                confirm,
                maxSelectedItems
            )
        }

        override fun toString(): String {
            return "MultiConversationsSelectElement.MultiConversationsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialConversations=" + this.initialConversations + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")"
        }
    }

    companion object {
        const val TYPE: String = "multi_conversations_select"
        fun builder(): MultiConversationsSelectElementBuilder {
            return MultiConversationsSelectElementBuilder()
        }
    }
}
