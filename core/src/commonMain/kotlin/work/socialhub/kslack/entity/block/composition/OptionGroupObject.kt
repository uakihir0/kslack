package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#option-group
 */
class OptionGroupObject {
    private var label: PlainTextObject? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the List<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    private var options: List<OptionObject>? = null

    constructor(label: PlainTextObject?, options: List<OptionObject>?) {
        this.label = label
        this.options = options
    }

    constructor()

    fun getLabel(): PlainTextObject? {
        return this.label
    }

    fun getOptions(): List<OptionObject>? {
        return this.options
    }

    fun setLabel(label: PlainTextObject?) {
        this.label = label
    }

    fun setOptions(options: List<OptionObject>?) {
        this.options = options
    }

    class OptionGroupObjectBuilder internal constructor() {
        private var label: PlainTextObject? = null
        private var options: List<OptionObject>? = null

        fun label(label: PlainTextObject?): OptionGroupObjectBuilder {
            this.label = label
            return this
        }

        fun options(options: List<OptionObject>?): OptionGroupObjectBuilder {
            this.options = options
            return this
        }

        fun build(): OptionGroupObject {
            return OptionGroupObject(label, options)
        }

        override fun toString(): String {
            return "OptionGroupObject.OptionGroupObjectBuilder(label=" + this.label + ", options=" + this.options + ")"
        }
    }

    companion object {
        fun builder(): OptionGroupObjectBuilder {
            return OptionGroupObjectBuilder()
        }
    }
}
