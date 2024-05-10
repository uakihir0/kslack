package work.socialhub.kslack.entity.bot

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class BotIcons {

    @SerialName("image_36")
    var image36: String? = null

    @SerialName("image_48")
    var image48: String? = null

    @SerialName("image_72")
    var image72: String? = null
}
