package com.github.seratch.jslack.api.methods.request.admin.teams

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.settings.setDescription
 */
class AdminTeamsSettingsSetDescriptionRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * ID for the workspace to set the description for.
     */
    var teamId: String?, var description: String?
) : SlackApiRequest {
    class AdminTeamsSettingsSetDescriptionRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var description: String? = null

        fun token(token: String?): AdminTeamsSettingsSetDescriptionRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminTeamsSettingsSetDescriptionRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun description(description: String?): AdminTeamsSettingsSetDescriptionRequestBuilder {
            this.description = description
            return this
        }

        fun build(): AdminTeamsSettingsSetDescriptionRequest {
            return AdminTeamsSettingsSetDescriptionRequest(token, teamId, description)
        }

        override fun toString(): String {
            return "AdminTeamsSettingsSetDescriptionRequest.AdminTeamsSettingsSetDescriptionRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", description=" + this.description + ")"
        }
    }

    companion object {
        fun builder(): AdminTeamsSettingsSetDescriptionRequestBuilder {
            return AdminTeamsSettingsSetDescriptionRequestBuilder()
        }
    }
}
