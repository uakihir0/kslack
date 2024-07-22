package work.socialhub.kslack.entity.admin

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Team {

    var id: String? = null
    var name: String? = null
    var domain: String? = null
}