package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#conversations-select
 */
class ConversationsSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialConversation: String? = null
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialConversation: String?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialConversation = initialConversation
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
        if (o !is ConversationsSelectElement) return false
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
        val `this$initialConversation`: Any? = this.initialConversation
        val `other$initialConversation`: Any? = other.initialConversation
        if (if (`this$initialConversation` == null) `other$initialConversation` != null else `this$initialConversation` != `other$initialConversation`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is ConversationsSelectElement
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
        val `$initialConversation`: Any? = this.initialConversation
        result = result * PRIME + (`$initialConversation`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class ConversationsSelectElementBuilder() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialConversation: String? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): ConversationsSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): ConversationsSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): ConversationsSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialConversation(initialConversation: String?): ConversationsSelectElementBuilder {
            this.initialConversation = initialConversation
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): ConversationsSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): ConversationsSelectElement {
            return ConversationsSelectElement(fallback, placeholder, actionId, initialConversation, confirm)
        }

        override fun toString(): String {
            return "ConversationsSelectElement.ConversationsSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialConversation=" + this.initialConversation + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "conversations_select"
        fun builder(): ConversationsSelectElementBuilder {
            return ConversationsSelectElementBuilder()
        }
    }
}
