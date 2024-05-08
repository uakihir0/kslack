package work.socialhub.kslack.entity.team

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ProfilePermissions {

    var api: Array<String>? = null
    var ui: Boolean? = false
    var scim: Boolean? = false
}