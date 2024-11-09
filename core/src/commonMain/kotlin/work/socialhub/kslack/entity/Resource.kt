package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Resource {
    var id: String? = null
    var type: String? = null
    var scopes: Array<String>? = null
}