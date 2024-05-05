package com.github.seratch.jslack.api.methods.request.admin.apps

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.apps.restrict
 */
class AdminAppsRestrictRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * The id of the app to approve.
     */
    var appId: String?,
    /**
     * The id of the request to approve.
     */
    var requestId: String?,
    /**
     * Workspace Id
     */
    var teamId: String?
) : SlackApiRequest {
    class AdminAppsRestrictRequestBuilder internal constructor() {
        private var token: String? = null
        private var appId: String? = null
        private var requestId: String? = null
        private var teamId: String? = null

        fun token(token: String?): AdminAppsRestrictRequestBuilder {
            this.token = token
            return this
        }

        fun appId(appId: String?): AdminAppsRestrictRequestBuilder {
            this.appId = appId
            return this
        }

        fun requestId(requestId: String?): AdminAppsRestrictRequestBuilder {
            this.requestId = requestId
            return this
        }

        fun teamId(teamId: String?): AdminAppsRestrictRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminAppsRestrictRequest {
            return AdminAppsRestrictRequest(token, appId, requestId, teamId)
        }

        override fun toString(): String {
            return "AdminAppsRestrictRequest.AdminAppsRestrictRequestBuilder(token=" + this.token + ", appId=" + this.appId + ", requestId=" + this.requestId + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminAppsRestrictRequestBuilder {
            return AdminAppsRestrictRequestBuilder()
        }
    }
}
