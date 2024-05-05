package work.socialhub.kslack.entity.view

class ViewTitle {
    var type: String? = null
    var text: String? = null
    var isEmoji: Boolean = false

    constructor(type: String?, text: String?, emoji: Boolean) {
        this.type = type
        this.text = text
        this.isEmoji = emoji
    }

    constructor()

    class ViewTitleBuilder internal constructor() {
        private var type: String? = null
        private var text: String? = null
        private var emoji = false

        fun type(type: String?): ViewTitleBuilder {
            this.type = type
            return this
        }

        fun text(text: String?): ViewTitleBuilder {
            this.text = text
            return this
        }

        fun emoji(emoji: Boolean): ViewTitleBuilder {
            this.emoji = emoji
            return this
        }

        fun build(): ViewTitle {
            return ViewTitle(type, text, emoji)
        }

        override fun toString(): String {
            return "ViewTitle.ViewTitleBuilder(type=" + this.type + ", text=" + this.text + ", emoji=" + this.emoji + ")"
        }
    }

    companion object {
        fun builder(): ViewTitleBuilder {
            return ViewTitleBuilder()
        }
    }
}
