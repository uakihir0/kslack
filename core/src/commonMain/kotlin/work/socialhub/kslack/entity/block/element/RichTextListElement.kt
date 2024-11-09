package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
@JsExport
@Serializable
class RichTextListElement : BlockElement(), RichTextElement {
    override val type: String = TYPE
    var elements: Array<RichTextElement>? = null
    var style: String? = null // bullet, ordered
    var indent: Int? = null

    companion object {
        const val TYPE: String = "rich_text_list"
    }
}