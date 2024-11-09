package work.socialhub.kslack.entity.team

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Profiles {
    var fields: Array<Profile>? = null
}