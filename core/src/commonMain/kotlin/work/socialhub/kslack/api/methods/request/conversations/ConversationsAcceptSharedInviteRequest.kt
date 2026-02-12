package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsAcceptSharedInviteRequest(
    override var token: String?,
    var channelName: String?,
    var channelId: String? = null,
    var freeTrialAccepted: Boolean? = null,
    var inviteId: String? = null,
    var isPrivate: Boolean? = null,
    var teamId: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_name", channelName)
            it.addParam("channel_id", channelId)
            it.addParam("free_trial_accepted", freeTrialAccepted?.toString())
            it.addParam("invite_id", inviteId)
            it.addParam("is_private", isPrivate?.toString())
            it.addParam("team_id", teamId)
        }
    }
}
