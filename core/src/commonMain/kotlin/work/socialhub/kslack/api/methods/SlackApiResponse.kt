package work.socialhub.kslack.api.methods

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
open class SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null

    // only when having a permission error
    var needed: String? = null
    var provided: String? = null
}
