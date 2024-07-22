package work.socialhub.kslack.entity.block

/**
 * https://api.slack.com/reference/messaging/blocks#divider
 */
class DividerBlock : LayoutBlock {
    override val type: String = "divider"

    var blockId: String? = null
}
