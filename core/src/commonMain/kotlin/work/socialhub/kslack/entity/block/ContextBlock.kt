package work.socialhub.kslack.entity.block

/**
 * https://api.slack.com/reference/messaging/blocks#context
 */
class ContextBlock : LayoutBlock {
    override val type: String = TYPE
    private var elements: Array<ContextBlockElement?>? = java.util.ArrayArray<ContextBlockElement>()
    var blockId: String? = null

    constructor(elements: Array<ContextBlockElement?>?, blockId: String?) {
        this.elements = elements
        this.blockId = blockId
    }

    constructor()

    fun getElements(): Array<ContextBlockElement?>? {
        return this.elements
    }

    fun setElements(elements: Array<ContextBlockElement?>?) {
        this.elements = elements
    }

    class ContextBlockBuilder internal constructor() {
        private var elements: Array<ContextBlockElement?>? = null
        private var blockId: String? = null

        fun elements(elements: Array<ContextBlockElement?>?): ContextBlockBuilder {
            this.elements = elements
            return this
        }

        fun blockId(blockId: String?): ContextBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun build(): ContextBlock {
            return ContextBlock(elements, blockId)
        }

        override fun toString(): String {
            return "ContextBlock.ContextBlockBuilder(elements=" + this.elements + ", blockId=" + this.blockId + ")"
        }
    }

    companion object {
        const val TYPE: String = "context"
        fun builder(): ContextBlockBuilder {
            return ContextBlockBuilder()
        }
    }
}
