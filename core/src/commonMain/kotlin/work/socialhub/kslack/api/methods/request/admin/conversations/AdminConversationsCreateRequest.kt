package work.socialhub.kslack.api.methods.request.admin.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.conversations.create
 */
@JsExport
class AdminConversationsCreateRequest(
    override var token: String?,
    /** Should the new channel be private? */
    var isPrivate: Boolean,
    /** The name of the channel. */
    var name: String,
    /** The ID of the workspace to create the channel in. */
    var workspaceId: String?,
    /** The channel's description */
    var description: String?,
    /** The channel's purpose */
    var purpose: String?,
    /** Whether the channel should be organic. */
    var isOrganizational: Boolean?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("is_private", isPrivate)
            it.addParam("name", name)
            it.addParam("workspace_id", workspaceId)
            it.addParam("description", description)
            it.addParam("purpose", purpose)
            it.addParam("is_organizational", isOrganizational)
        }
    }
}
