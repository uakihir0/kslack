package work.socialhub.kslack.entity.file

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class FileAddress {
    var address: String? = null
    var name: String? = null
    var original: String? = null
}