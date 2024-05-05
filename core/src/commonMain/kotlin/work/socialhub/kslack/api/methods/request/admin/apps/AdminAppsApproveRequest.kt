package com.github.seratch.jslack.api.methods.request.admin.apps

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.apps.approve
 */
class AdminAppsApproveRequest internal constructor(
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
    class AdminAppsApproveRequestBuilder internal constructor() {
        private var token: String? = null
        private var appId: String? = null
        private var requestId: String? = null
        private var teamId: String? = null

        fun token(token: String?): AdminAppsApproveRequestBuilder {
            this.token = token
            return this
        }

        fun appId(appId: String?): AdminAppsApproveRequestBuilder {
            this.appId = appId
            return this
        }

        fun requestId(requestId: String?): AdminAppsApproveRequestBuilder {
            this.requestId = requestId
            return this
        }

        fun teamId(teamId: String?): AdminAppsApproveRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun build(): AdminAppsApproveRequest {
            return AdminAppsApproveRequest(token, appId, requestId, teamId)
        }

        override fun toString(): String {
            return "AdminAppsApproveRequest.AdminAppsApproveRequestBuilder(token=" + this.token + ", appId=" + this.appId + ", requestId=" + this.requestId + ", teamId=" + this.teamId + ")"
        }
    }

    companion object {
        fun builder(): AdminAppsApproveRequestBuilder {
            return AdminAppsApproveRequestBuilder()
        }
    }
}
