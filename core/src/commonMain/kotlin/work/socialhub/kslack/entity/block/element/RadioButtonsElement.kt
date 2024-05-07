package work.socialhub.kslack.entity.block.element

import com.github.seratch.jslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#radio
 */
class RadioButtonsElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null

    private var placeholder: PlainTextObject? = null
    var actionId: String? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private var options: Array<OptionObject>? = null

    private var initialOption: OptionObject? = null
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        options: Array<OptionObject>?,
        initialOption: OptionObject?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.options = options
        this.initialOption = initialOption
        this.confirm = confirm
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun getOptions(): Array<OptionObject>? {
        return this.options
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

    fun setOptions(options: Array<OptionObject>?) {
        this.options = options
    }

    fun setInitialOption(initialOption: OptionObject?) {
        this.initialOption = initialOption
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is RadioButtonsElement) return false
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
        val `this$options`: Any? = this.getOptions()
        val `other$options`: Any? = other.getOptions()
        if (if (`this$options` == null) `other$options` != null else `this$options` != `other$options`) return false
        val `this$initialOption`: Any? = this.getInitialOption()
        val `other$initialOption`: Any? = other.getInitialOption()
        if (if (`this$initialOption` == null) `other$initialOption` != null else `this$initialOption` != `other$initialOption`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is RadioButtonsElement
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
        val `$options`: Any? = this.getOptions()
        result = result * PRIME + (`$options`?.hashCode() ?: 43)
        val `$initialOption`: Any? = this.getInitialOption()
        result = result * PRIME + (`$initialOption`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class RadioButtonsElementBuilder internal constructor() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var options: Array<OptionObject>? = null
        private var initialOption: OptionObject? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): RadioButtonsElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): RadioButtonsElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): RadioButtonsElementBuilder {
            this.actionId = actionId
            return this
        }

        fun options(options: Array<OptionObject>?): RadioButtonsElementBuilder {
            this.options = options
            return this
        }

        fun initialOption(initialOption: OptionObject?): RadioButtonsElementBuilder {
            this.initialOption = initialOption
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): RadioButtonsElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): RadioButtonsElement {
            return RadioButtonsElement(fallback, placeholder, actionId, options, initialOption, confirm)
        }

        override fun toString(): String {
            return "RadioButtonsElement.RadioButtonsElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", options=" + this.options + ", initialOption=" + this.initialOption + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "radio_buttons"
        fun builder(): RadioButtonsElementBuilder {
            return RadioButtonsElementBuilder()
        }
    }
}
