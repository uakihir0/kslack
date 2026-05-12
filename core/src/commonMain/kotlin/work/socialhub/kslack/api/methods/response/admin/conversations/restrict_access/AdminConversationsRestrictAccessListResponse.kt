package work.socialhub.kslack.api.methods.response.admin.conversations.restrict_access

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.admin.conversation.AdminConversationRestriction
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminConversationsRestrictAccessListResponse : SlackApiResponse() {
    var restrictions: Array<AdminConversationRestriction>? = null
    var responseMetadata: ResponseMetadata? = null
}
