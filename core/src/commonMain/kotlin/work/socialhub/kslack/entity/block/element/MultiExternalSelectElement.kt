package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.OptionObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
@JsExport
@Serializable
class MultiExternalSelectElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null
    private var placeholder: PlainTextObject? = null
    var actionId: String? = null
    private var initialOptions: Array<OptionObject>? = null
    var minQueryLength: Int? = null
    private var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    companion object {
        const val TYPE: String = "multi_external_select"
    }
}
