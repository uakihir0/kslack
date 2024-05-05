package com.github.seratch.jslack.api.methods.request.admin.invite_requests

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.inviteRequests.deny
 */
class AdminInviteRequestsDenyRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * ID of the request to deny.
     */
    var inviteRequestId: String?,
    /**
     * ID for the workspace where the invite request was made.
     */
    var teamId: String?
) : SlackApiRequest {
    class AdminInviteRequestsDenyRequestBuilder internal constructor() {
        private var token: String? = null
        private var inviteRequestId: String? = null
        private var teamId: String? = null

        fun token(token: String?): AdminInviteRequestsDenyRequestBuilder {
            this.token = token
            return this
        }

        fun inviteRequestId(inviteRequestId: String?): AdminInviteRequestsDenyRequestBuilder {
            this.inviteRequestId = inviteRequestId
            return this
        }

        fun teamId(teamId: String?): AdminInviteRequestsDenyRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminInviteRequestsDenyRequest {
            return AdminInviteRequestsDenyRequest(token, inviteRequestId, teamId)
        }

        override fun toString(): String {
            return "AdminInviteRequestsDenyRequest.AdminInviteRequestsDenyRequestBuilder(token=" + this.token + ", inviteRequestId=" + this.inviteRequestId + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminInviteRequestsDenyRequestBuilder {
            return AdminInviteRequestsDenyRequestBuilder()
        }
    }
}
