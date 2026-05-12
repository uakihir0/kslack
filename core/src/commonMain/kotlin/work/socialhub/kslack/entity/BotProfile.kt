package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents the profile information of a Slack bot user.
 *
 * Used in responses from `bots.info` and included in message objects
 * for bot-sent messages. Contains bot identification, app association,
 * and icon URLs at various sizes.
 *
 * @see <a href="https://api.slack.com/methods/bots.info">bots.info</a>
 */
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

/**
 * Contains URLs to bot profile icon images at different resolutions.
 *
 * Image URLs are 36x36, 48x48, and 72x72 pixels respectively.
 */
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