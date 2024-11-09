package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/block-kit/block-elements#input
 */
@JsExport
@Serializable
class PlainTextInputElement : BlockElement() {
    val type: String = TYPE
    var actionId: String? = null
    var placeholder: PlainTextObject? = null
    var initialValue: String? = null
    var isMultiline: Boolean = false
    var minLength: Int? = null
    var maxLength: Int? = null

    companion object {
        const val TYPE: String = "plain_text_input"
    }
}
