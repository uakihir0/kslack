package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.remove
 */
class AdminUsersRemoveRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Workspace Id
     */
    var teamId: String?,
    /**
     * The ID of the user to remove.
     */
    var userId: String?
) : SlackApiRequest {
    class AdminUsersRemoveRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var userId: String? = null

        fun token(token: String?): AdminUsersRemoveRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminUsersRemoveRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun userId(userId: String?): AdminUsersRemoveRequestBuilder {
            this.userId = userId
            return this
        }

        fun build(): AdminUsersRemoveRequest {
            return AdminUsersRemoveRequest(token, teamId, userId)
        }

        override fun toString(): String {
            return "AdminUsersRemoveRequest.AdminUsersRemoveRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersRemoveRequestBuilder {
            return AdminUsersRemoveRequestBuilder()
        }
    }
}
