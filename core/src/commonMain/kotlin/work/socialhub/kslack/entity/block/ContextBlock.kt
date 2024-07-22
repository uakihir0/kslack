package work.socialhub.kslack.entity.block

/**
 * https://api.slack.com/reference/messaging/blocks#context
 */
class ContextBlock : LayoutBlock {
    override val type: String = "context"
    private var elements: Array<ContextBlockElement?>? = arrayOf()
    var blockId: String? = null
}
