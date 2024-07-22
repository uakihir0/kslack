package work.socialhub.kslack.entity.admin

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class PreviousResolution {

    var status: String? = null
    var scopes: Array<Scope>? = null
}