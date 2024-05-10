package work.socialhub.kslack.entity.bot

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class BotProfile {
    var id: String? = null // B00000000
    var isDeleted: Boolean = false
    var name: String? = null
    var updated: Int? = null
    var appId: String? = null // A00000000
    var icons: BotIcons? = null
    var teamId: String? = null
}
