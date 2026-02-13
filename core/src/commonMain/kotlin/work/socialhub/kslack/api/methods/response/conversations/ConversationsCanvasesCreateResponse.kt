package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsCanvasesCreateResponse : SlackApiResponse() {

    @SerialName("canvas_id")
    var canvasId: String? = null
}
