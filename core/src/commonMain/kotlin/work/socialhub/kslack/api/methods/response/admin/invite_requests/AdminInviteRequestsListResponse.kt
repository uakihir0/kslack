package work.socialhub.kslack.api.methods.response.admin.invite_requests

import work.socialhub.kslack.api.methods.SlackApiResponse

class AdminInviteRequestsListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var inviteRequests: Array<String>? = null
}