package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsRequestSharedInviteApproveRequest(
    override var token: String?,
    var inviteId: String?,
    var channelId: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("invite_id", inviteId)
            it.addParam("channel_id", channelId)
        }
    }
}
