package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
class PlainTextObject : TextObject {
    val type: String = TYPE
    var text: String? = null

    /**
     * The documentation of the Slack API states that the verbatim field is optional.
     * The API examples always render the emoji field (as true, but that is its default value) -- so that is not helpful.
     * I picked the Boolean because basically you have 3 possible states:
     * - true
     * - false
     * - not present (and therefore not rendered in the resulting JSON sent to the Slack API)
     */
    var emoji: Boolean? = null

    constructor(text: String?, emoji: Boolean?) {
        this.text = text
        this.emoji = emoji
    }

    constructor()

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is PlainTextObject) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$text`: Any? = this.text
        val `other$text`: Any? = other.text
        if (if (`this$text` == null) `other$text` != null else `this$text` != `other$text`) return false
        val `this$emoji`: Any? = this.emoji
        val `other$emoji`: Any? = other.emoji
        if (if (`this$emoji` == null) `other$emoji` != null else `this$emoji` != `other$emoji`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is PlainTextObject
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$text`: Any? = this.text
        result = result * PRIME + (`$text`?.hashCode() ?: 43)
        val `$emoji`: Any? = this.emoji
        result = result * PRIME + (`$emoji`?.hashCode() ?: 43)
        return result
    }

    fun toBuilder(): PlainTextObjectBuilder {
        return PlainTextObjectBuilder().text(this.text).emoji(
            this.emoji
        )
    }

    class PlainTextObjectBuilder internal constructor() {
        private var text: String? = null
        private var emoji: Boolean? = null

        fun text(text: String?): PlainTextObjectBuilder {
            this.text = text
            return this
        }

        fun emoji(emoji: Boolean?): PlainTextObjectBuilder {
            this.emoji = emoji
            return this
        }

        fun build(): PlainTextObject {
            return PlainTextObject(text, emoji)
        }

        override fun toString(): String {
            return "PlainTextObject.PlainTextObjectBuilder(text=" + this.text + ", emoji=" + this.emoji + ")"
        }
    }

    companion object {
        const val TYPE: String = "plain_text"

        fun builder(): PlainTextObjectBuilder {
            return PlainTextObjectBuilder()
        }
    }
}
