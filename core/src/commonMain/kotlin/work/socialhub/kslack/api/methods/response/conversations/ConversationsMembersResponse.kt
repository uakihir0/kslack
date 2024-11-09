package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsMembersResponse : SlackApiResponse() {
    var members: Array<String>? = null
    var responseMetadata: ResponseMetadata? = null
}
