package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setAdmin
 */
class AdminUsersSetAdminRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Workspace Id
     */
    var teamId: String?,
    /**
     * The ID of the user to designate as an admin.
     */
    var userId: String?
) : SlackApiRequest {
    class AdminUsersSetAdminRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var userId: String? = null

        fun token(token: String?): AdminUsersSetAdminRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminUsersSetAdminRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun userId(userId: String?): AdminUsersSetAdminRequestBuilder {
            this.userId = userId
            return this
        }

        fun build(): AdminUsersSetAdminRequest {
            return AdminUsersSetAdminRequest(token, teamId, userId)
        }

        override fun toString(): String {
            return "AdminUsersSetAdminRequest.AdminUsersSetAdminRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersSetAdminRequestBuilder {
            return AdminUsersSetAdminRequestBuilder()
        }
    }
}
