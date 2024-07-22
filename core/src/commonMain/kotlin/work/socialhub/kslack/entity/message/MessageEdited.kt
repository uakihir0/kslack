package work.socialhub.kslack.entity.message

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class MessageEdited {
    var user: String? = null
    var ts: String? = null
}