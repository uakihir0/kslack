package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Error {
    var isOk: Boolean = false
    var error: String? = null
}