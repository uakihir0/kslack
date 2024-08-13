package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
class RichTextBlock : LayoutBlock {
    override val type: String = TYPE

    var elements: Array<BlockElement>? = arrayOf<BlockElement>()
    var blockId: String? = null
}
