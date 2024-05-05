package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#option
 */
class OptionObject {
    private var text: PlainTextObject? = null
    var value: String? = null

    constructor(text: PlainTextObject?, value: String?) {
        this.text = text
        this.value = value
    }

    constructor()

    fun getText(): PlainTextObject? {
        return this.text
    }

    fun setText(text: PlainTextObject?) {
        this.text = text
    }

    class OptionObjectBuilder internal constructor() {
        private var text: PlainTextObject? = null
        private var value: String? = null

        fun text(text: PlainTextObject?): OptionObjectBuilder {
            this.text = text
            return this
        }

        fun value(value: String?): OptionObjectBuilder {
            this.value = value
            return this
        }

        fun build(): OptionObject {
            return OptionObject(text, value)
        }

        override fun toString(): String {
            return "OptionObject.OptionObjectBuilder(text=" + this.text + ", value=" + this.value + ")"
        }
    }

    companion object {
        fun builder(): OptionObjectBuilder {
            return OptionObjectBuilder()
        }
    }
}
