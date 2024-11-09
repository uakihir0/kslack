package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ChatGetPermalinkResponse : SlackApiResponse() {
    var channel: String? = null
    var permalink: String? = null
}
