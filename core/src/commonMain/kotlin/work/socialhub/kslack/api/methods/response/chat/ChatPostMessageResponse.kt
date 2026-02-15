package work.socialhub.kslack.api.methods.response.chat

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class ChatPostMessageResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null
    var channel: String? = null
    var ts: String? = null
    var message: JsonElement? = null
}
