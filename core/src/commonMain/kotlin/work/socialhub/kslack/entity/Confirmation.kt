package work.socialhub.kslack.entity

class Confirmation {
    var title: String? = null
    var text: String? = null
    var okText: String? = OKAY
    var dismissText: String? = DISMISS

    constructor(title: String?, text: String?, okText: String?, dismissText: String?) {
        this.title = title
        this.text = text
        this.okText = okText
        this.dismissText = dismissText
    }

    constructor()

    class ConfirmationBuilder internal constructor() {
        private var title: String? = null
        private var text: String? = null
        private var okText: String? = null
        private var dismissText: String? = null

        fun title(title: String?): ConfirmationBuilder {
            this.title = title
            return this
        }

        fun text(text: String?): ConfirmationBuilder {
            this.text = text
            return this
        }

        fun okText(okText: String?): ConfirmationBuilder {
            this.okText = okText
            return this
        }

        fun dismissText(dismissText: String?): ConfirmationBuilder {
            this.dismissText = dismissText
            return this
        }

        fun build(): Confirmation {
            return Confirmation(title, text, okText, dismissText)
        }

        override fun toString(): String {
            return "Confirmation.ConfirmationBuilder(title=" + this.title + ", text=" + this.text + ", okText=" + this.okText + ", dismissText=" + this.dismissText + ")"
        }
    }

    companion object {
        const val OKAY: String = "Okay"
        const val DISMISS: String = "Cancel"
        fun builder(): ConfirmationBuilder {
            return ConfirmationBuilder()
        }
    }
}
