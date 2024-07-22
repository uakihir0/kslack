package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.composition.PlainTextObject

/**
 * https://api.slack.com/reference/messaging/blocks#image
 */
class ImageBlock : LayoutBlock {
    override val type: String = TYPE
    var fallback: String? = null

    var imageUrl: String? = null
    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null

    var altText: String? = null
    var title: PlainTextObject? = null
    var blockId: String? = null
}
