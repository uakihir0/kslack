package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.composition.TextObject
import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#section
 */
class SectionBlock : LayoutBlock {
    override val type: String = "section"

    var text: TextObject? = null
    var blockId: String? = null
    var fields: Array<TextObject>? = null
    var accessory: BlockElement? = null
}
