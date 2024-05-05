package work.socialhub.kslack.entity.view

class ViewClose {
    var type: String? = null
    var text: String? = null
    var isEmoji: Boolean = false

    constructor(type: String?, text: String?, emoji: Boolean) {
        this.type = type
        this.text = text
        this.isEmoji = emoji
    }

    constructor()

    class ViewCloseBuilder internal constructor() {
        private var type: String? = null
        private var text: String? = null
        private var emoji = false

        fun type(type: String?): ViewCloseBuilder {
            this.type = type
            return this
        }

        fun text(text: String?): ViewCloseBuilder {
            this.text = text
            return this
        }

        fun emoji(emoji: Boolean): ViewCloseBuilder {
            this.emoji = emoji
            return this
        }

        fun build(): ViewClose {
            return ViewClose(type, text, emoji)
        }

        override fun toString(): String {
            return "ViewClose.ViewCloseBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")"
        }
    }

    companion object {
        fun builder(): ViewCloseBuilder {
            return ViewCloseBuilder()
        }
    }
}
