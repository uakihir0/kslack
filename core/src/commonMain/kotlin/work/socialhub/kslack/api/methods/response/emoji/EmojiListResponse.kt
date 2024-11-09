package work.socialhub.kslack.api.methods.response.emoji

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class EmojiListResponse : SlackApiResponse() {
    var emoji: Map<String, String>? = null
    var cacheTs: String? = null
}