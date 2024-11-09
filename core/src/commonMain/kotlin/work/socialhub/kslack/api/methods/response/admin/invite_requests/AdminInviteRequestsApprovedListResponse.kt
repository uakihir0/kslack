package work.socialhub.kslack.api.methods.response.admin.invite_requests

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminInviteRequestsApprovedListResponse : SlackApiResponse() {
    var approvedRequests: Array<String>? = null
}