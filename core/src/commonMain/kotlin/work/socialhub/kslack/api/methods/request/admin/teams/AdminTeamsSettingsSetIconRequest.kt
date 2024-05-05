package com.github.seratch.jslack.api.methods.request.admin.teams

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.settings.setIcon
 */
class AdminTeamsSettingsSetIconRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * ID for the workspace to set the icon for.
     */
    var teamId: String?, var imageUrl: String?
) : SlackApiRequest {
    class AdminTeamsSettingsSetIconRequestBuilder internal constructor() {
        private var token: String? = null
        private var teamId: String? = null
        private var imageUrl: String? = null

        fun token(token: String?): AdminTeamsSettingsSetIconRequestBuilder {
            this.token = token
            return this
        }

        fun teamId(teamId: String?): AdminTeamsSettingsSetIconRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun imageUrl(imageUrl: String?): AdminTeamsSettingsSetIconRequestBuilder {
            this.imageUrl = imageUrl
            return this
        }

        fun build(): AdminTeamsSettingsSetIconRequest {
            return AdminTeamsSettingsSetIconRequest(token, teamId, imageUrl)
        }

        override fun toString(): String {
            return "AdminTeamsSettingsSetIconRequest.AdminTeamsSettingsSetIconRequestBuilder(token=" + this.token + ", teamId=" + this.teamId + ", imageUrl=" + this.imageUrl + ")"
        }
    }

    companion object {
        fun builder(): AdminTeamsSettingsSetIconRequestBuilder {
            return AdminTeamsSettingsSetIconRequestBuilder()
        }
    }
}
