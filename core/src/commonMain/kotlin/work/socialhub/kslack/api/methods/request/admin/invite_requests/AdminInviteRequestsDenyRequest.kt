package work.socialhub.kslack.api.methods.request.admin.invite_requests

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/admin.inviteRequests.deny
 */
@JsExport
class AdminInviteRequestsDenyRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** ID of the request to deny. */
    var inviteRequestId: String?,
    /** ID for the workspace where the invite request was made. */
    var teamId: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("invite_request_id", inviteRequestId)
            it.addParam("team_id", teamId)
        }
    }
}