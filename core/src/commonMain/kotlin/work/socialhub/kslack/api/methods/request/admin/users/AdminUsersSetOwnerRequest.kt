package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.setOwner
 */
class AdminUsersSetOwnerRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Workspace Id
     */
    var teamId: String?,
    /**
     * Id of the user to promote to owner.
     */
    var userId: String?
) : SlackApiRequest {
    class AdminUsersSetOwnerRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var userId: String? = null

        fun token(token: String?): AdminUsersSetOwnerRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminUsersSetOwnerRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun userId(userId: String?): AdminUsersSetOwnerRequestBuilder {
            this.userId = userId
            return this
        }

        fun build(): AdminUsersSetOwnerRequest {
            return AdminUsersSetOwnerRequest(token, teamId, userId)
        }

        override fun toString(): String {
            return "AdminUsersSetOwnerRequest.AdminUsersSetOwnerRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersSetOwnerRequestBuilder {
            return AdminUsersSetOwnerRequestBuilder()
        }
    }
}
