package work.socialhub.kslack.entity.block

/**
 * https://api.slack.com/reference/messaging/blocks#divider
 */
class DividerBlock : LayoutBlock {
    override val type: String = TYPE
    var blockId: String? = null

    constructor(blockId: String?) {
        this.blockId = blockId
    }

    constructor()

    class DividerBlockBuilder internal constructor() {
        private var blockId: String? = null

        fun blockId(blockId: String?): DividerBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun build(): DividerBlock {
            return DividerBlock(blockId)
        }

        override fun toString(): String {
            return "DividerBlock.DividerBlockBuilder(blockId=" + this.blockId + ")"
        }
    }

    companion object {
        const val TYPE: String = "divider"
        fun builder(): DividerBlockBuilder {
            return DividerBlockBuilder()
        }
    }
}
