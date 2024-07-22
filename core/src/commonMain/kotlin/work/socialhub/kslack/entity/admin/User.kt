package work.socialhub.kslack.entity.admin

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class User {

    var id: String? = null
    var name: String? = null
    var email: String? = null
}