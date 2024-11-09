package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/changelog/2019-09-what-they-see-is-what-you-get-and-more-and-less
 */
@JsExport
@Serializable
class RichTextSectionElement : BlockElement(), RichTextElement {
    override val type: String = TYPE
    var elements: Array<RichTextElement>? = null

    companion object {
        const val TYPE: String = "rich_text_section"
    }
}