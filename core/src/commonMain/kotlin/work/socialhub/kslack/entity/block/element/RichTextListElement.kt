package work.socialhub.kslack.entity.block.element

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
class RichTextListElement : BlockElement, RichTextElement {
    override val type: String = TYPE
    private var elements: Array<RichTextElement>? = java.util.ArrayArray<RichTextElement>()
    var style: String? = null // bullet, ordered
    var indent: Int? = null

    constructor(elements: Array<RichTextElement>?, style: String?, indent: Int?) {
        this.elements = elements
        this.style = style
        this.indent = indent
    }

    constructor()

    fun getElements(): Array<RichTextElement>? {
        return this.elements
    }

    fun setElements(elements: Array<RichTextElement>?) {
        this.elements = elements
    }

    override fun equals(o: Any): Boolean {
        if (o === this) return true
        if (o !is RichTextListElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$elements`: Any? = this.getElements()
        val `other$elements`: Any? = other.getElements()
        if (if (`this$elements` == null) `other$elements` != null else `this$elements` != `other$elements`) return false
        val `this$style`: Any? = this.style
        val `other$style`: Any? = other.style
        if (if (`this$style` == null) `other$style` != null else `this$style` != `other$style`) return false
        val `this$indent`: Any? = this.indent
        val `other$indent`: Any? = other.indent
        if (if (`this$indent` == null) `other$indent` != null else `this$indent` != `other$indent`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is RichTextListElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$elements`: Any? = this.getElements()
        result = result * PRIME + (`$elements`?.hashCode() ?: 43)
        val `$style`: Any? = this.style
        result = result * PRIME + (`$style`?.hashCode() ?: 43)
        val `$indent`: Any? = this.indent
        result = result * PRIME + (`$indent`?.hashCode() ?: 43)
        return result
    }

    class RichTextListElementBuilder internal constructor() {
        private var elements: Array<RichTextElement>? = null
        private var style: String? = null
        private var indent: Int? = null

        fun elements(elements: Array<RichTextElement>?): RichTextListElementBuilder {
            this.elements = elements
            return this
        }

        fun style(style: String?): RichTextListElementBuilder {
            this.style = style
            return this
        }

        fun indent(indent: Int?): RichTextListElementBuilder {
            this.indent = indent
            return this
        }

        fun build(): RichTextListElement {
            return RichTextListElement(elements, style, indent)
        }

        override fun toString(): String {
            return "RichTextListElement.RichTextListElementBuilder(elements=" + this.elements + ", style=" + this.style + ", indent=" + this.indent + ")"
        }
    }

    companion object {
        const val TYPE: String = "rich_text_list"
        fun builder(): RichTextListElementBuilder {
            return RichTextListElementBuilder()
        }
    }
}