package work.socialhub.kslack.entity.user

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ProfileField {
    var value: String? = null
    var alt: String? = null
    var label: String? = null
}