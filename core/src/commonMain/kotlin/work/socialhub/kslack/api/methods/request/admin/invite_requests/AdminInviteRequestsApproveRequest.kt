package com.github.seratch.jslack.api.methods.request.admin.invite_requests

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.inviteRequests.approve
 */
class AdminInviteRequestsApproveRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * ID of the request to invite.
     */
    var inviteRequestId: String?,
    /**
     * ID for the workspace where the invite request was made.
     */
    var teamId: String?
) : SlackApiRequest {
    class AdminInviteRequestsApproveRequestBuilder internal constructor() {
        private var token: String? = null
        private var inviteRequestId: String? = null
        private var teamId: String? = null

        fun token(token: String?): AdminInviteRequestsApproveRequestBuilder {
            this.token = token
            return this
        }

        fun inviteRequestId(inviteRequestId: String?): AdminInviteRequestsApproveRequestBuilder {
            this.inviteRequestId = inviteRequestId
            return this
        }

        fun teamId(teamId: String?): AdminInviteRequestsApproveRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminInviteRequestsApproveRequest {
            return AdminInviteRequestsApproveRequest(token, inviteRequestId, teamId)
        }

        override fun toString(): String {
            return "AdminInviteRequestsApproveRequest.AdminInviteRequestsApproveRequestBuilder(token=" + this.token + ", inviteRequestId=" + this.inviteRequestId + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminInviteRequestsApproveRequestBuilder {
            return AdminInviteRequestsApproveRequestBuilder()
        }
    }
}
