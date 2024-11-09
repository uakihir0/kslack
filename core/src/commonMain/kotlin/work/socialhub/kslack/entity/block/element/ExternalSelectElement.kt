package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.OptionObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/block-elements#external-select
 */
@JsExport
@Serializable
class ExternalSelectElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null
    var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialOption: OptionObject? = null
    var minQueryLength: Int? = null
    var confirm: ConfirmationDialogObject? = null

    companion object {
        const val TYPE: String = "external_select"
    }
}
