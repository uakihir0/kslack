package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#overflow
 */
class OverflowMenuElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null

    var actionId: String? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private var options: Array<OptionObject>? = null

    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        actionId: String?,
        options: Array<OptionObject>?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.actionId = actionId
        this.options = options
        this.confirm = confirm
    }

    constructor()

    fun getOptions(): Array<OptionObject>? {
        return this.options
    }

    fun getConfirm(): ConfirmationDialogObject? {
        return this.confirm
    }

    fun setOptions(options: Array<OptionObject>?) {
        this.options = options
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is OverflowMenuElement) return false
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
        val `this$options`: Any? = this.getOptions()
        val `other$options`: Any? = other.getOptions()
        if (if (`this$options` == null) `other$options` != null else `this$options` != `other$options`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is OverflowMenuElement
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
        val `$options`: Any? = this.getOptions()
        result = result * PRIME + (`$options`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class OverflowMenuElementBuilder() {
        private var fallback: String? = null
        private var actionId: String? = null
        private var options: Array<OptionObject>? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): OverflowMenuElementBuilder {
            this.fallback = fallback
            return this
        }

        fun actionId(actionId: String?): OverflowMenuElementBuilder {
            this.actionId = actionId
            return this
        }

        fun options(options: Array<OptionObject>?): OverflowMenuElementBuilder {
            this.options = options
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): OverflowMenuElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): OverflowMenuElement {
            return OverflowMenuElement(fallback, actionId, options, confirm)
        }

        override fun toString(): String {
            return "OverflowMenuElement.OverflowMenuElementBuilder(fallback=" + this.fallback + ", actionId=" + this.actionId + ", options=" + this.options + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "overflow"
        fun builder(): OverflowMenuElementBuilder {
            return OverflowMenuElementBuilder()
        }
    }
}
