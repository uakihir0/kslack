package work.socialhub.kslack.entity

class Option {
    var text: String? = null
    var value: String? = null

    constructor(text: String?, value: String?) {
        this.text = text
        this.value = value
    }

    constructor()

    class OptionBuilder internal constructor() {
        private var text: String? = null
        private var value: String? = null

        fun text(text: String?): OptionBuilder {
            this.text = text
            return this
        }

        fun value(value: String?): OptionBuilder {
            this.value = value
            return this
        }

        fun build(): Option {
            return Option(text, value)
        }

        override fun toString(): String {
            return "Option.OptionBuilder(text=" + this.text + ", value=" + this.value + ")"
        }
    }

    companion object {
        fun builder(): OptionBuilder {
            return OptionBuilder()
        }
    }
}
