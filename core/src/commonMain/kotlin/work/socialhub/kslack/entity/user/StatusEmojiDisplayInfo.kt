package work.socialhub.kslack.entity.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class StatusEmojiDisplayInfo {

    @SerialName("emoji_name")
    val emojiName: String? = null

    @SerialName("display_alias")
    val displayAlias: String? = null

    @SerialName("display_url")
    val displayUrl: String? = null

    val unicode: String? = null
}