package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsApproveSharedInviteRequest(
    override var token: String?,
    var inviteId: String?,
    var targetApprovalsChannelId: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("invite_id", inviteId)
            it.addParam("target_approvals_channel_id", targetApprovalsChannelId)
        }
    }
}
