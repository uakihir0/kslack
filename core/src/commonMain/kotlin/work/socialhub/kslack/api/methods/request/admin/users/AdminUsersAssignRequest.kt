package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.assign
 */
class AdminUsersAssignRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Workspace Id.
     */
    var teamId: String?,
    /**
     * The ID of the user to add to the workspace.
     */
    var userId: String?,
    /**
     * True if user should be added to the workspace as a guest.
     */
    var isRestricted: Boolean,
    /**
     * True if user should be added to the workspace as a single-channel guest.
     */
    var isUltraRestricted: Boolean
) : SlackApiRequest {
    class AdminUsersAssignRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var userId: String? = null
        private var isRestricted = false
        private var isUltraRestricted = false

        fun token(token: String?): AdminUsersAssignRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminUsersAssignRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun userId(userId: String?): AdminUsersAssignRequestBuilder {
            this.userId = userId
            return this
        }

        fun isRestricted(isRestricted: Boolean): AdminUsersAssignRequestBuilder {
            this.isRestricted = isRestricted
            return this
        }

        fun isUltraRestricted(isUltraRestricted: Boolean): AdminUsersAssignRequestBuilder {
            this.isUltraRestricted = isUltraRestricted
            return this
        }

        fun build(): AdminUsersAssignRequest {
            return AdminUsersAssignRequest(token, teamId, userId, isRestricted, isUltraRestricted)
        }

        override fun toString(): String {
            return "AdminUsersAssignRequest.AdminUsersAssignRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", userId=" + this.userId + ", isRestricted=" + this.isRestricted + ", isUltraRestricted=" + this.isUltraRestricted + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersAssignRequestBuilder {
            return AdminUsersAssignRequestBuilder()
        }
    }
}
