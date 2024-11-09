package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/block-elements#button
 */
@JsExport
@Serializable
class ButtonElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null
    var text: PlainTextObject? = null
    var actionId: String? = null
    var url: String? = null
    var value: String? = null
    var style: String? = null // possible values: primary, danger
    var confirm: ConfirmationDialogObject? = null

    companion object {
        const val TYPE: String = "button"
    }
}
