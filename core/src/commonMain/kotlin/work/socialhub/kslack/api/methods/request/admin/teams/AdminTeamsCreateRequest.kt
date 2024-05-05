package com.github.seratch.jslack.api.methods.request.admin.teams

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.create
 */
class AdminTeamsCreateRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * Team domain (for example, slacksoftballteam).
     */
    var teamDomain: String?,
    /**
     * Team name (for example, Slack Softball Team).
     */
    var teamName: String?,
    /**
     * Description for the team.
     */
    var teamDescription: String?,
    /**
     * Who can join the team. A team's discoverability can be open, closed, invite_only, or unlisted.
     */
    var teamDiscoverability: String?
) : SlackApiRequest {
    class AdminTeamsCreateRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamDomain: String? = null
        private var teamName: String? = null
        private var teamDescription: String? = null
        private var teamDiscoverability: String? = null

        fun token(token: String?): AdminTeamsCreateRequestBuilder {
            this.token = token
            return this
        }

        fun teamDomain(teamDomain: String?): AdminTeamsCreateRequestBuilder {
            this.teamDomain = teamDomain
            return this
        }

        fun teamName(teamName: String?): AdminTeamsCreateRequestBuilder {
            this.teamName = teamName
            return this
        }

        fun teamDescription(teamDescription: String?): AdminTeamsCreateRequestBuilder {
            this.teamDescription = teamDescription
            return this
        }

        fun teamDiscoverability(teamDiscoverability: String?): AdminTeamsCreateRequestBuilder {
            this.teamDiscoverability = teamDiscoverability
            return this
        }

        fun build(): AdminTeamsCreateRequest {
            return AdminTeamsCreateRequest(token, teamDomain, teamName, teamDescription, teamDiscoverability)
        }

        override fun toString(): String {
            return "AdminTeamsCreateRequest.AdminTeamsCreateRequestBuilder(token=" + this.token + ", teamDomain=" + this.teamDomain + ", teamName=" + this.teamName + ", teamDescription=" + this.teamDescription + ", teamDiscoverability=" + this.teamDiscoverability + ")"
        }
    }

    companion object {
        fun builder(): AdminTeamsCreateRequestBuilder {
            return AdminTeamsCreateRequestBuilder()
        }
    }
}
