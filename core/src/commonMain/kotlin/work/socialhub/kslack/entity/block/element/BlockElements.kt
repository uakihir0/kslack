package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.entity.block.ContextBlockElement

object BlockElements {

    fun asElements(vararg elements: BlockElement): Array<BlockElement> {
        return arrayOf(*elements)
    }

    fun asContextElements(vararg elements: ContextBlockElement): Array<ContextBlockElement> {
        return arrayOf(*elements)
    }

    fun asRichTextElements(vararg elements: RichTextElement): Array<RichTextElement> {
        return arrayOf(*elements)
    }
}
