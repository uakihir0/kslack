package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#actions
 */
class ActionsBlock : LayoutBlock {
    companion object {
        const val TYPE: String = "actions"
    }

    override val type: String = TYPE

    private var elements: Array<BlockElement>? = arrayOf()
    var blockId: String? = null
}
