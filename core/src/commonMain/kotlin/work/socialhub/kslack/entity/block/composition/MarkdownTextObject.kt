package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
class MarkdownTextObject : TextObject {
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
    var verbatim: Boolean? = null

    constructor(text: String?, verbatim: Boolean?) {
        this.text = text
        this.verbatim = verbatim
    }

    constructor()

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is MarkdownTextObject) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$text`: Any? = this.text
        val `other$text`: Any? = other.text
        if (if (`this$text` == null) `other$text` != null else `this$text` != `other$text`) return false
        val `this$verbatim`: Any? = this.verbatim
        val `other$verbatim`: Any? = other.verbatim
        if (if (`this$verbatim` == null) `other$verbatim` != null else `this$verbatim` != `other$verbatim`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is MarkdownTextObject
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$text`: Any? = this.text
        result = result * PRIME + (`$text`?.hashCode() ?: 43)
        val `$verbatim`: Any? = this.verbatim
        result = result * PRIME + (`$verbatim`?.hashCode() ?: 43)
        return result
    }

    class MarkdownTextObjectBuilder internal constructor() {
        private var text: String? = null
        private var verbatim: Boolean? = null

        fun text(text: String?): MarkdownTextObjectBuilder {
            this.text = text
            return this
        }

        fun verbatim(verbatim: Boolean?): MarkdownTextObjectBuilder {
            this.verbatim = verbatim
            return this
        }

        fun build(): MarkdownTextObject {
            return MarkdownTextObject(text, verbatim)
        }

        override fun toString(): String {
            return "MarkdownTextObject.MarkdownTextObjectBuilder(text=" + this.text + ", verbatim=" + this.verbatim + ")"
        }
    }

    companion object {
        const val TYPE: String = "mrkdwn"
        fun builder(): MarkdownTextObjectBuilder {
            return MarkdownTextObjectBuilder()
        }
    }
}
