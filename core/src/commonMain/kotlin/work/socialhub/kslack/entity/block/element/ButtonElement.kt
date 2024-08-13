package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.block.composition.ConfirmationDialogObject

/**
 * https://api.slack.com/reference/messaging/block-elements#button
 */
class ButtonElement : BlockElement {
    val type: String = TYPE
    var fallback: String? = null
    private var text: PlainTextObject? = null
    var actionId: String? = null
    var url: String? = null
    var value: String? = null
    var style: String? = null // possible values: primary, danger
    private var confirm: ConfirmationDialogObject? = null

    constructor(
        fallback: String?,
        text: PlainTextObject?,
        actionId: String?,
        url: String?,
        value: String?,
        style: String?,
        confirm: ConfirmationDialogObject?
    ) {
        this.fallback = fallback
        this.text = text
        this.actionId = actionId
        this.url = url
        this.value = value
        this.style = style
        this.confirm = confirm
    }

    constructor()

    fun getText(): PlainTextObject? {
        return this.text
    }

    fun getConfirm(): ConfirmationDialogObject? {
        return this.confirm
    }

    fun setText(text: PlainTextObject?) {
        this.text = text
    }

    fun setConfirm(confirm: ConfirmationDialogObject?) {
        this.confirm = confirm
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is ButtonElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$fallback`: Any? = this.fallback
        val `other$fallback`: Any? = other.fallback
        if (if (`this$fallback` == null) `other$fallback` != null else `this$fallback` != `other$fallback`) return false
        val `this$text`: Any? = this.getText()
        val `other$text`: Any? = other.getText()
        if (if (`this$text` == null) `other$text` != null else `this$text` != `other$text`) return false
        val `this$actionId`: Any? = this.actionId
        val `other$actionId`: Any? = other.actionId
        if (if (`this$actionId` == null) `other$actionId` != null else `this$actionId` != `other$actionId`) return false
        val `this$url`: Any? = this.url
        val `other$url`: Any? = other.url
        if (if (`this$url` == null) `other$url` != null else `this$url` != `other$url`) return false
        val `this$value`: Any? = this.value
        val `other$value`: Any? = other.value
        if (if (`this$value` == null) `other$value` != null else `this$value` != `other$value`) return false
        val `this$style`: Any? = this.style
        val `other$style`: Any? = other.style
        if (if (`this$style` == null) `other$style` != null else `this$style` != `other$style`) return false
        val `this$confirm`: Any? = this.getConfirm()
        val `other$confirm`: Any? = other.getConfirm()
        if (if (`this$confirm` == null) `other$confirm` != null else `this$confirm` != `other$confirm`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is ButtonElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$fallback`: Any? = this.fallback
        result = result * PRIME + (`$fallback`?.hashCode() ?: 43)
        val `$text`: Any? = this.getText()
        result = result * PRIME + (`$text`?.hashCode() ?: 43)
        val `$actionId`: Any? = this.actionId
        result = result * PRIME + (`$actionId`?.hashCode() ?: 43)
        val `$url`: Any? = this.url
        result = result * PRIME + (`$url`?.hashCode() ?: 43)
        val `$value`: Any? = this.value
        result = result * PRIME + (`$value`?.hashCode() ?: 43)
        val `$style`: Any? = this.style
        result = result * PRIME + (`$style`?.hashCode() ?: 43)
        val `$confirm`: Any? = this.getConfirm()
        result = result * PRIME + (`$confirm`?.hashCode() ?: 43)
        return result
    }

    class ButtonElementBuilder() {
        private var fallback: String? = null
        private var text: PlainTextObject? = null
        private var actionId: String? = null
        private var url: String? = null
        private var value: String? = null
        private var style: String? = null
        private var confirm: ConfirmationDialogObject? = null

        fun fallback(fallback: String?): ButtonElementBuilder {
            this.fallback = fallback
            return this
        }

        fun text(text: PlainTextObject?): ButtonElementBuilder {
            this.text = text
            return this
        }

        fun actionId(actionId: String?): ButtonElementBuilder {
            this.actionId = actionId
            return this
        }

        fun url(url: String?): ButtonElementBuilder {
            this.url = url
            return this
        }

        fun value(value: String?): ButtonElementBuilder {
            this.value = value
            return this
        }

        fun style(style: String?): ButtonElementBuilder {
            this.style = style
            return this
        }

        fun confirm(confirm: ConfirmationDialogObject?): ButtonElementBuilder {
            this.confirm = confirm
            return this
        }

        fun build(): ButtonElement {
            return ButtonElement(fallback, text, actionId, url, value, style, confirm)
        }

        override fun toString(): String {
            return "ButtonElement.ButtonElementBuilder(fallback=" + this.fallback + ", text=" + this.text + ", actionId=" + this.actionId + ", url=" + this.url + ", value=" + this.value + ", style=" + this.style + ", confirm=" + this.confirm + ")"
        }
    }

    companion object {
        const val TYPE: String = "button"
        fun builder(): ButtonElementBuilder {
            return ButtonElementBuilder()
        }
    }
}
