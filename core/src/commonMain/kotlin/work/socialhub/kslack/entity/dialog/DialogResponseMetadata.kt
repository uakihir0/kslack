package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class DialogResponseMetadata {
    var messages: Array<String>? = null
}
