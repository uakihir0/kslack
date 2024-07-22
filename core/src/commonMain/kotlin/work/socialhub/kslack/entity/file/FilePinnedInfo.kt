package work.socialhub.kslack.entity.file

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class FilePinnedInfo {
    var pinnedBy: String? = null // U00000000
    var pinnedTs: Int? = null
}