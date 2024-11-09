package work.socialhub.kslack.entity.bot

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Bot {
    var id: String? = null
    var appId: String? = null
    var userId: String? = null
    var name: String? = null
    var isDeleted: Boolean = false
    var updated: Int? = null
    var icons: BotIcons? = null
}