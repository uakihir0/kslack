package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/block-elements#conversations-select
 */
@JsExport
@Serializable
class ConversationsSelectElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null
    var placeholder: PlainTextObject? = null
    var actionId: String? = null
    var initialConversation: String? = null
    var confirm: ConfirmationDialogObject? = null

    companion object {
        const val TYPE: String = "conversations_select"
    }
}
