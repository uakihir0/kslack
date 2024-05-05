package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#users-select
 */
class UsersSelectElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null

    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialUser: String? = null
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        initialUser: String?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.initialUser = initialUser
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
        if (o !is UsersSelectElement) return false
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
        val `this$initialUser`: Any? = this.initialUser
        val `other$initialUser`: Any? = other.initialUser
        if (if (`this$initialUser` == null) `other$initialUser` != null else `this$initialUser` != `other$initialUser`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is UsersSelectElement
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
        val `$initialUser`: Any? = this.initialUser
        result = result * PRIME + (`$initialUser`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class UsersSelectElementBuilder internal constructor() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var initialUser: String? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): UsersSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): UsersSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): UsersSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun initialUser(initialUser: String?): UsersSelectElementBuilder {
            this.initialUser = initialUser
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): UsersSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): UsersSelectElement {
            return UsersSelectElement(fallback, placeholder, actionId, initialUser, confirm)
        }

        override fun toString(): String {
            return "UsersSelectElement.UsersSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", initialUser=" + this.initialUser + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "users_select"
        fun builder(): UsersSelectElementBuilder {
            return UsersSelectElementBuilder()
        }
    }
}
