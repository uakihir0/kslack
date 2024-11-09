package work.socialhub.kslack.entity.view

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ViewClose {
    var type: String? = null
    var text: String? = null
    var isEmoji: Boolean = false
}
