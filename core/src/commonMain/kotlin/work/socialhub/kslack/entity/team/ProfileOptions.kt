package work.socialhub.kslack.entity.team

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ProfileOptions {

    @SerialName("is_protected")
    var isProtected: Boolean = false

    @SerialName("is_scim")
    var scim: Boolean? = false
}