package work.socialhub.kslack.entity.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

// https://raw.githubusercontent.com/slackapi/slack-api-specs/master/web-api/slack_web_openapi_v2.json
// TODO: confirm the actual behavior
@JsExport
@Serializable
class MessageIcons {
    var emoji: String? = null

    @SerialName("image_36")
    var image36: String? = null

    @SerialName("image_48")
    var image48: String? = null

    @SerialName("image_64")
    var image64: String? = null

    @SerialName("image_72")
    var image72: String? = null
}