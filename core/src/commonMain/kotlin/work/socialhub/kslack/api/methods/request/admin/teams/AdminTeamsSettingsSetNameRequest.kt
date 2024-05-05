package com.github.seratch.jslack.api.methods.request.admin.teams

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.settings.setName
 */
class AdminTeamsSettingsSetNameRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * ID for the workspace to set the icon for.
     */
    var teamId: String?, var name: String?
) : SlackApiRequest {
    class AdminTeamsSettingsSetNameRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var name: String? = null

        fun token(token: String?): AdminTeamsSettingsSetNameRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminTeamsSettingsSetNameRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun name(name: String?): AdminTeamsSettingsSetNameRequestBuilder {
            this.name = name
            return this
        }

        fun build(): AdminTeamsSettingsSetNameRequest {
            return AdminTeamsSettingsSetNameRequest(token, teamId, name)
        }

        override fun toString(): String {
            return "AdminTeamsSettingsSetNameRequest.AdminTeamsSettingsSetNameRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", name=" + this.name + ")"
        }
    }

    companion object {
        fun builder(): AdminTeamsSettingsSetNameRequestBuilder {
            return AdminTeamsSettingsSetNameRequestBuilder()
        }
    }
}
