package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/reference/block-kit/blocks#rich_text
 */
class RichTextBlock : LayoutBlock {
    override val type: String = "rich_text"

    var elements: Array<BlockElement>? = arrayOf()
    var blockId: String? = null
}
