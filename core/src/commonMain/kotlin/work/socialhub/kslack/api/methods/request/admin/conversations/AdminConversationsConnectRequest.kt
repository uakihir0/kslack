package work.socialhub.kslack.api.methods.request.admin.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.connect
 */
@JsExport
class AdminConversationsConnectRequest(
    override var token: String?,
    /** The ID of the channel in the local workspace. */
    var channelId: String,
    /** The ID of the workspace to connect the channel to. */
    var targetWorkspaceId: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("target_workspace_id", targetWorkspaceId)
        }
    }
}
