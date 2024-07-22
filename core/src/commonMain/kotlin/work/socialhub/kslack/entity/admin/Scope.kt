package work.socialhub.kslack.entity.admin

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Scope {

    var name: String? = null
    var description: String? = null

    @SerialName("is_sensitive")
    var isSensitive = false
    @SerialName("token_type")
    var tokenType: String? = null
}