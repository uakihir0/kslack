package work.socialhub.kslack.entity.oauth

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class OAuthIncomingWebhook {
    var url: String? = null
    var channel: String? = null
    var channelId: String? = null
    var configurationUrl: String? = null
}