package work.socialhub.kslack.entity.block.element

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
class RichTextPreformattedElement : BlockElement, RichTextElement {
    override val type: String = TYPE
    private var elements: Array<RichTextElement>? = java.util.ArrayArray<RichTextElement>()

    constructor(elements: Array<RichTextElement>?) {
        this.elements = elements
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
        if (o !is RichTextPreformattedElement) return false
        val other = o
        if (!other.canEqual(this as Any)) return false
        if (!super.equals(o)) return false
        val `this$type`: Any = this.type
        val `other$type`: Any = other.type
        if (if (`this$type` == null) `other$type` != null else `this$type` != `other$type`) return false
        val `this$elements`: Any? = this.getElements()
        val `other$elements`: Any? = other.getElements()
        if (if (`this$elements` == null) `other$elements` != null else `this$elements` != `other$elements`) return false
        return true
    }

    protected fun canEqual(other: Any?): Boolean {
        return other is RichTextPreformattedElement
    }

    override fun hashCode(): Int {
        val PRIME = 59
        var result = super.hashCode()
        val `$type`: Any = this.type
        result = result * PRIME + (`$type`?.hashCode() ?: 43)
        val `$elements`: Any? = this.getElements()
        result = result * PRIME + (`$elements`?.hashCode() ?: 43)
        return result
    }

    class RichTextPreformattedElementBuilder internal constructor() {
        private var elements: Array<RichTextElement>? = null

        fun elements(elements: Array<RichTextElement>?): RichTextPreformattedElementBuilder {
            this.elements = elements
            return this
        }

        fun build(): RichTextPreformattedElement {
            return RichTextPreformattedElement(elements)
        }

        override fun toString(): String {
            return "RichTextPreformattedElement.RichTextPreformattedElementBuilder(elements=" + this.elements + ")"
        }
    }

    companion object {
        const val TYPE: String = "rich_text_preformatted"
        fun builder(): RichTextPreformattedElementBuilder {
            return RichTextPreformattedElementBuilder()
        }
    }
}