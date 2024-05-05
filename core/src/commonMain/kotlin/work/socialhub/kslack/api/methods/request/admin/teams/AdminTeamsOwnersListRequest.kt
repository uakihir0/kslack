package com.github.seratch.jslack.api.methods.request.admin.teams

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.owners.list
 */
class AdminTeamsOwnersListRequest internal constructor(
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
    class AdminTeamsOwnersListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var teamId: String? = null

        fun token(token: String?): AdminTeamsOwnersListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): AdminTeamsOwnersListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): AdminTeamsOwnersListRequestBuilder {
            this.limit = limit
            return this
        }

        fun teamId(teamId: String?): AdminTeamsOwnersListRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminTeamsOwnersListRequest {
            return AdminTeamsOwnersListRequest(token, cursor, limit, teamId)
        }

        override fun toString(): String {
            return "AdminTeamsOwnersListRequest.AdminTeamsOwnersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminTeamsOwnersListRequestBuilder {
            return AdminTeamsOwnersListRequestBuilder()
        }
    }
}
