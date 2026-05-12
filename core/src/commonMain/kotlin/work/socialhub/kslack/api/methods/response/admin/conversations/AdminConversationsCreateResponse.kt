package work.socialhub.kslack.api.methods.response.admin.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.admin.conversation.AdminConversation
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversationsCreateResponse : SlackApiResponse() {
    var channel: AdminConversation? = null
    var responseMetadata: ResponseMetadata? = null
}
