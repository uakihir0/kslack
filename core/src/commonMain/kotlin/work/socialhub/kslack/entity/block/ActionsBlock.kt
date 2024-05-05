package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#actions
 */
class ActionsBlock : LayoutBlock {
    override val type: String = TYPE
    private var elements: List<BlockElement>? = java.util.ArrayList<BlockElement>()
    var blockId: String? = null

    constructor(elements: List<BlockElement>?, blockId: String?) {
        this.elements = elements
        this.blockId = blockId
    }

    constructor()

    fun getElements(): List<BlockElement>? {
        return this.elements
    }

    fun setElements(elements: List<BlockElement>?) {
        this.elements = elements
    }

    class ActionsBlockBuilder internal constructor() {
        private var elements: List<BlockElement>? = null
        private var blockId: String? = null

        fun elements(elements: List<BlockElement>?): ActionsBlockBuilder {
            this.elements = elements
            return this
        }

        fun blockId(blockId: String?): ActionsBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun build(): ActionsBlock {
            return ActionsBlock(elements, blockId)
        }

        override fun toString(): String {
            return "ActionsBlock.ActionsBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")"
        }
    }

    companion object {
        const val TYPE: String = "actions"
        fun builder(): ActionsBlockBuilder {
            return ActionsBlockBuilder()
        }
    }
}
