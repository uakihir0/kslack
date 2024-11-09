package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Confirmation {
    companion object {
        const val OKAY: String = "Okay"
        const val DISMISS: String = "Cancel"
    }

    var title: String? = null
    var text: String? = null
    var okText: String? = OKAY
    var dismissText: String? = DISMISS
}
