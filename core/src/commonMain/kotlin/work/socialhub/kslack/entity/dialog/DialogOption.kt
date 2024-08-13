package work.socialhub.kslack.entity.dialog

/**
 * A dialog element option used with [DialogSelectElement]s
 */
class DialogOption {
    var label: String? = null
    var value: String? = null

    constructor(label: String?, value: String?) {
        this.label = label
        this.value = value
    }

    constructor()

    class DialogOptionBuilder() {
        private var label: String? = null
        private var value: String? = null

        fun label(label: String?): DialogOptionBuilder {
            this.label = label
            return this
        }

        fun value(value: String?): DialogOptionBuilder {
            this.value = value
            return this
        }

        fun build(): DialogOption {
            return DialogOption(label, value)
        }

        override fun toString(): String {
            return "DialogOption.DialogOptionBuilder(label=" + this.label + ", value=" + this.value + ")"
        }
    }

    companion object {
        fun builder(): DialogOptionBuilder {
            return DialogOptionBuilder()
        }
    }
}
