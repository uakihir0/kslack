package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
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
    var icons: BotProfileIcons? = null
    var teamId: String? = null


}

@JsExport
@Serializable
class BotProfileIcons {
    @SerialName("image_36")
    var image36: String? = null

    @SerialName("image_48")
    var image48: String? = null

    @SerialName("image_72")
    var image72: String? = null
}