package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
class MultiStaticSelectElement : BlockElement {
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

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private var optionGroups: Array<OptionGroupObject>? = null

    private var initialOptions: Array<OptionObject>? = null
    private var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    constructor(
        fallback: String?,
        placeholder: PlainTextObject?,
        actionId: String?,
        options: Array<OptionObject>?,
        optionGroups: Array<OptionGroupObject>?,
        initialOptions: Array<OptionObject>?,
        confirm: ConfirmationDialogObject?,
        maxSelectedItems: Int?
    ) {
        this.fallback = fallback
        this.placeholder = placeholder
        this.actionId = actionId
        this.options = options
        this.optionGroups = optionGroups
        this.initialOptions = initialOptions
        this.confirm = confirm
        this.maxSelectedItems = maxSelectedItems
    }

    constructor()

    fun getPlaceholder(): PlainTextObject? {
        return this.placeholder
    }

    fun getOptions(): Array<OptionObject>? {
        return this.options
    }

    fun getOptionGroups(): Array<OptionGroupObject>? {
        return this.optionGroups
    }

    fun getInitialOptions(): Array<OptionObject>? {
        return this.initialOptions
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

    fun setOptionGroups(optionGroups: Array<OptionGroupObject>?) {
        this.optionGroups = optionGroups
    }

    fun setInitialOptions(initialOptions: Array<OptionObject>?) {
        this.initialOptions = initialOptions
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is MultiStaticSelectElement) return false
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
        val `this$optionGroups`: Any? = this.getOptionGroups()
        val `other$optionGroups`: Any? = other.getOptionGroups()
        if (if (`this$optionGroups` == null) `other$optionGroups` != null else `this$optionGroups` != `other$optionGroups`) return false
        val `this$initialOptions`: Any? = this.getInitialOptions()
        val `other$initialOptions`: Any? = other.getInitialOptions()
        if (if (`this$initialOptions` == null) `other$initialOptions` != null else `this$initialOptions` != `other$initialOptions`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        val `this$maxSelectedItems`: Any? = this.maxSelectedItems
        val `other$maxSelectedItems`: Any? = other.maxSelectedItems
        if (if (`this$maxSelectedItems` == null) `other$maxSelectedItems` != null else `this$maxSelectedItems` != `other$maxSelectedItems`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is MultiStaticSelectElement
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
        val `$optionGroups`: Any? = this.getOptionGroups()
        result = result * PRIME + (`$optionGroups`?.hashCode() ?: 43)
        val `$initialOptions`: Any? = this.getInitialOptions()
        result = result * PRIME + (`$initialOptions`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        val `$maxSelectedItems`: Any? = this.maxSelectedItems
        result = result * PRIME + (`$maxSelectedItems`?.hashCode() ?: 43)
        return result
    }

    class MultiStaticSelectElementBuilder() {
        private var fallback: String? = null
        private var placeholder: PlainTextObject? = null
        private var actionId: String? = null
        private var options: Array<OptionObject>? = null
        private var optionGroups: Array<OptionGroupObject>? = null
        private var initialOptions: Array<OptionObject>? = null
        private var confirm: ConfirmationDialogObject? = null
        private var maxSelectedItems: Int? = null

        fun fallback(fallback: String?): MultiStaticSelectElementBuilder {
            this.fallback = fallback
            return this
        }

        fun placeholder(placeholder: PlainTextObject?): MultiStaticSelectElementBuilder {
            this.placeholder = placeholder
            return this
        }

        fun actionId(actionId: String?): MultiStaticSelectElementBuilder {
            this.actionId = actionId
            return this
        }

        fun options(options: Array<OptionObject>?): MultiStaticSelectElementBuilder {
            this.options = options
            return this
        }

        fun optionGroups(optionGroups: Array<OptionGroupObject>?): MultiStaticSelectElementBuilder {
            this.optionGroups = optionGroups
            return this
        }

        fun initialOptions(initialOptions: Array<OptionObject>?): MultiStaticSelectElementBuilder {
            this.initialOptions = initialOptions
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): MultiStaticSelectElementBuilder {
            this.confirm = confirm
            return this
        }

        fun maxSelectedItems(maxSelectedItems: Int?): MultiStaticSelectElementBuilder {
            this.maxSelectedItems = maxSelectedItems
            return this
        }

        fun build(): MultiStaticSelectElement {
            return MultiStaticSelectElement(
                fallback,
                placeholder,
                actionId,
                options,
                optionGroups,
                initialOptions,
                confirm,
                maxSelectedItems
            )
        }

        override fun toString(): String {
            return "MultiStaticSelectElement.MultiStaticSelectElementBuilder(fallback=" + this.fallback + ", placeholder=" + this.placeholder + ", actionId=" + this.actionId + ", options=" + this.options + ", optionGroups=" + this.optionGroups + ", initialOptions=" + this.initialOptions + ", confirm=" + this.confirm + ", maxSelectedItems=" + this.maxSelectedItems + ")"
        }
    }

    companion object {
        const val TYPE: String = "multi_static_select"
        fun builder(): MultiStaticSelectElementBuilder {
            return MultiStaticSelectElementBuilder()
        }
    }
}
