package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#confirm
 */
class ConfirmationDialogObject {
    private var title: PlainTextObject? = null
    private var text: TextObject? = null
    private var confirm: PlainTextObject? = null
    private var deny: PlainTextObject? = null

    constructor(title: PlainTextObject?, text: TextObject?, confirm: PlainTextObject?, deny: PlainTextObject?) {
        this.title = title
        this.text = text
        this.confirm = confirm
        this.deny = deny
    }

    constructor()

    fun getTitle(): PlainTextObject? {
        return this.title
    }

    fun getText(): TextObject? {
        return this.text
    }

    fun getConfirm(): PlainTextObject? {
        return this.confirm
    }

    fun getDeny(): PlainTextObject? {
        return this.deny
    }

    fun setTitle(title: PlainTextObject?) {
        this.title = title
    }

    fun setText(text: TextObject?) {
        this.text = text
    }

    fun setConfirm(confirm: PlainTextObject?) {
        this.confirm = confirm
    }

    fun setDeny(deny: PlainTextObject?) {
        this.deny = deny
    }

    class ConfirmationDialogObjectBuilder internal constructor() {
        private var title: PlainTextObject? = null
        private var text: TextObject? = null
        private var confirm: PlainTextObject? = null
        private var deny: PlainTextObject? = null

        fun title(title: PlainTextObject?): ConfirmationDialogObjectBuilder {
            this.title = title
            return this
        }

        fun text(text: TextObject?): ConfirmationDialogObjectBuilder {
            this.text = text
            return this
        }

        fun confirm(confirm: PlainTextObject?): ConfirmationDialogObjectBuilder {
            this.confirm = confirm
            return this
        }

        fun deny(deny: PlainTextObject?): ConfirmationDialogObjectBuilder {
            this.deny = deny
            return this
        }

        fun build(): ConfirmationDialogObject {
            return ConfirmationDialogObject(title, text, confirm, deny)
        }

        override fun toString(): String {
            return "ConfirmationDialogObject.ConfirmationDialogObjectBuilder(title=" + this.title + ", text=" + this.text + ", confirm=" + this.confirm + ", deny=" + this.deny + ")"
        }
    }

    companion object {
        fun builder(): ConfirmationDialogObjectBuilder {
            return ConfirmationDialogObjectBuilder()
        }
    }
}
