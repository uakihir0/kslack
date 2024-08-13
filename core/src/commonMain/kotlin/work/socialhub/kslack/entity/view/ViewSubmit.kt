package work.socialhub.kslack.entity.view

class ViewSubmit {
    var type: String? = null
    var text: String? = null
    var isEmoji: Boolean = false

    constructor(type: String?, text: String?, emoji: Boolean) {
        this.type = type
        this.text = text
        this.isEmoji = emoji
    }

    constructor()

    class ViewSubmitBuilder() {
        private var type: String? = null
        private var text: String? = null
        private var emoji = false

        fun type(type: String?): ViewSubmitBuilder {
            this.type = type
            return this
        }

        fun text(text: String?): ViewSubmitBuilder {
            this.text = text
            return this
        }

        fun emoji(emoji: Boolean): ViewSubmitBuilder {
            this.emoji = emoji
            return this
        }

        fun build(): ViewSubmit {
            return ViewSubmit(type, text, emoji)
        }

        override fun toString(): String {
            return "ViewSubmit.ViewSubmitBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")"
        }
    }

    companion object {
        fun builder(): ViewSubmitBuilder {
            return ViewSubmitBuilder()
        }
    }
}
