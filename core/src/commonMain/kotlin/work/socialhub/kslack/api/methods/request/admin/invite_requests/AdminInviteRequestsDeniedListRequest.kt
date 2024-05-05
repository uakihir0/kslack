package com.github.seratch.jslack.api.methods.request.admin.invite_requests

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.inviteRequests.denied.list
 */
class AdminInviteRequestsDeniedListRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Set cursor to next_cursor returned by the previous call to list items in the next page
     */
    var cursor: String?,
    /**
     * The maximum number of items to return. Must be between 1 - 1000 both inclusive.
     */
    var limit: Int?,
    /**
     * Workspace Id.
     */
    var teamId: String?
) : SlackApiRequest {
    class AdminInviteRequestsDeniedListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var teamId: String? = null

        fun token(token: String?): AdminInviteRequestsDeniedListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): AdminInviteRequestsDeniedListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): AdminInviteRequestsDeniedListRequestBuilder {
            this.limit = limit
            return this
        }

        fun teamId(teamId: String?): AdminInviteRequestsDeniedListRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminInviteRequestsDeniedListRequest {
            return AdminInviteRequestsDeniedListRequest(token, cursor, limit, teamId)
        }

        override fun toString(): String {
            return "AdminInviteRequestsDeniedListRequest.AdminInviteRequestsDeniedListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminInviteRequestsDeniedListRequestBuilder {
            return AdminInviteRequestsDeniedListRequestBuilder()
        }
    }
}
