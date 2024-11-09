package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * A dialog element option used with [DialogSelectElement]s
 */
@JsExport
@Serializable
class DialogOption {
    var label: String? = null
    var value: String? = null
}
