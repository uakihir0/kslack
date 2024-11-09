package work.socialhub.kslack.entity.block.composition

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/composition-objects#option
 */
@JsExport
@Serializable
class OptionObject {
    var text: PlainTextObject? = null
    var value: String? = null
}
