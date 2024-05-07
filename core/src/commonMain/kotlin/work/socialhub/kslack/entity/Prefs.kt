package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Prefs {
    var channels: Array<String>? = null
    var groups: Array<String>? = null
}
