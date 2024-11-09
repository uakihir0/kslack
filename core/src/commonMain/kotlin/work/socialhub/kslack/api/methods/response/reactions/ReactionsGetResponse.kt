package work.socialhub.kslack.api.methods.response.reactions

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class ReactionsGetResponse : SlackApiResponse() {
    var type: String? = null
    var channel: String? = null
    var message: Message? = null
}

