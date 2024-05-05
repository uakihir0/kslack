package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setRegular
 */
class AdminUsersSetRegularRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Workspace Id
     */
    var teamId: String?,
    /**
     * The ID of the user to designate as a regular user.
     */
    var userId: String?
) : SlackApiRequest {
    class AdminUsersSetRegularRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var userId: String? = null

        fun token(token: String?): AdminUsersSetRegularRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminUsersSetRegularRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun userId(userId: String?): AdminUsersSetRegularRequestBuilder {
            this.userId = userId
            return this
        }

        fun build(): AdminUsersSetRegularRequest {
            return AdminUsersSetRegularRequest(token, teamId, userId)
        }

        override fun toString(): String {
            return "AdminUsersSetRegularRequest.AdminUsersSetRegularRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersSetRegularRequestBuilder {
            return AdminUsersSetRegularRequestBuilder()
        }
    }
}
