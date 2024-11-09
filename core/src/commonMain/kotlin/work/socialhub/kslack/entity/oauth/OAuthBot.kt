package work.socialhub.kslack.entity.oauth

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class OAuthBot {
    var botUserId: String? = null
    var botAccessToken: String? = null
}