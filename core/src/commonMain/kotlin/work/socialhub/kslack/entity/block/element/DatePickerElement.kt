package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/block-elements#datepicker
 */
@JsExport
@Serializable
class DatePickerElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null
    var actionId: String? = null
    var placeholder: PlainTextObject? = null
    var initialDate: String? = null
    var confirm: ConfirmationDialogObject? = null

    companion object {
        const val TYPE: String = "datepicker"
    }
}
