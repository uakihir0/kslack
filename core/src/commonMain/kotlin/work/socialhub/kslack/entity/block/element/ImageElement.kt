package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.ContextBlockElement
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/block-elements#image
 */
@JsExport
@Serializable
class ImageElement : BlockElement(), ContextBlockElement {
    val type: String = TYPE
    var fallback: String? = null
    var imageUrl: String? = null
    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null
    var altText: String? = null

    companion object {
        const val TYPE: String = "image"
    }
}
