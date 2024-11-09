package work.socialhub.kslack.entity.block.composition

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/composition-objects#confirm
 */
@JsExport
@Serializable
class ConfirmationDialogObject {
    private var title: PlainTextObject? = null
    private var text: TextObject? = null
    private var confirm: PlainTextObject? = null
    private var deny: PlainTextObject? = null
}
