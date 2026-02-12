package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsListConnectInvitesRequest(
    override var token: String?,
    var count: Int? = null,
    var cursor: String? = null,
    var teamId: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("count", count?.toString())
            it.addParam("cursor", cursor)
            it.addParam("team_id", teamId)
        }
    }
}
