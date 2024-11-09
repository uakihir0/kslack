package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Scope {
    var appHome: Array<String>? = null
    var team: Array<String>? = null
    var channel: Array<String>? = null
    var group: Array<String>? = null
    var mpim: Array<String>? = null
    var im: Array<String>? = null
    var user: Array<String>? = null
}