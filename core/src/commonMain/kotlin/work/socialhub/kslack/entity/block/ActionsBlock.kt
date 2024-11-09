package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#actions
 */
class ActionsBlock : LayoutBlock {
    override val type: String = TYPE
    private var elements: Array<BlockElement>? = arrayOf()
    var blockId: String? = null

    companion object {
        const val TYPE: String = "actions"
    }
}
