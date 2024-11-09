package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Conversation
import work.socialhub.kslack.entity.Error
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsInviteResponse : SlackApiResponse() {
    var errors: Array<Error>? = null
    var channel: Conversation? = null
}
