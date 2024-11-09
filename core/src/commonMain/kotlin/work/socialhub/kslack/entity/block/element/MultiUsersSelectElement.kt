package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
@JsExport
@Serializable
class MultiUsersSelectElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null

    var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialUsers: Array<String>? = null
    var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null

    companion object {
        const val TYPE: String = "multi_users_select"
    }
}
