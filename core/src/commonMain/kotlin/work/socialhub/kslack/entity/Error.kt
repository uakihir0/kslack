package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Error {
    @SerialName("ok")
    var isOk: Boolean = false
    var error: String? = null
}