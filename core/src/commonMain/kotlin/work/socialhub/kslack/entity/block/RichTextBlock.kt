package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.element.BlockElement

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
class RichTextBlock : LayoutBlock {
    override val type: String = TYPE
    private var elements: Array<BlockElement>? = java.util.ArrayArray<BlockElement>()
    var blockId: String? = null

    constructor(elements: Array<BlockElement>?, blockId: String?) {
        this.elements = elements
        this.blockId = blockId
    }

    constructor()

    fun getElements(): Array<BlockElement>? {
        return this.elements
    }

    fun setElements(elements: Array<BlockElement>?) {
        this.elements = elements
    }

    class RichTextBlockBuilder internal constructor() {
        private var elements: Array<BlockElement>? = null
        private var blockId: String? = null

        fun elements(elements: Array<BlockElement>?): RichTextBlockBuilder {
            this.elements = elements
            return this
        }

        fun blockId(blockId: String?): RichTextBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun build(): RichTextBlock {
            return RichTextBlock(elements, blockId)
        }

        override fun toString(): String {
            return "RichTextBlock.RichTextBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")"
        }
    }

    companion object {
        const val TYPE: String = "rich_text"
        fun builder(): RichTextBlockBuilder {
            return RichTextBlockBuilder()
        }
    }
}
