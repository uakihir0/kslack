package com.github.seratch.jslack.api.methods.request.team

import com.github.seratch.jslack.api.methods.SlackApiRequest

class TeamIntegrationLogsRequest internal constructor(
    /**
     * Authentication token. Requires scope: `admin`
     */
    override var token: String?,
    /**
     * Filter logs to this service. Defaults to all logs.
     */
    var serviceId: String?,
    /**
     * Filter logs generated by this user\u2019s actions. Defaults to all logs.
     */
    var user: String?,
    /**
     * Filter logs to this Slack app. Defaults to all logs.
     */
    var appId: Int?,
    /**
     * Filter logs with this change type. Defaults to all logs.
     */
    var changeType: String?, var count: Int?, var page: Int?
) : SlackApiRequest {
    class TeamIntegrationLogsRequestBuilder internal constructor() {
        private var token: String? = null
        private var serviceId: String? = null
        private var user: String? = null
        private var appId: Int? = null
        private var changeType: String? = null
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): TeamIntegrationLogsRequestBuilder {
            this.token = token
            return this
        }

        fun serviceId(serviceId: String?): TeamIntegrationLogsRequestBuilder {
            this.serviceId = serviceId
            return this
        }

        fun user(user: String?): TeamIntegrationLogsRequestBuilder {
            this.user = user
            return this
        }

        fun appId(appId: Int?): TeamIntegrationLogsRequestBuilder {
            this.appId = appId
            return this
        }

        fun changeType(changeType: String?): TeamIntegrationLogsRequestBuilder {
            this.changeType = changeType
            return this
        }

        fun count(count: Int?): TeamIntegrationLogsRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): TeamIntegrationLogsRequestBuilder {
            this.page = page
            return this
        }

        fun build(): TeamIntegrationLogsRequest {
            return TeamIntegrationLogsRequest(token, serviceId, user, appId, changeType, count, page)
        }

        override fun toString(): String {
            return "TeamIntegrationLogsRequest.TeamIntegrationLogsRequestBuilder(token=" + this.token + ", serviceId=" + this.serviceId + ", user=" + this.user + ", appId=" + this.appId + ", changeType=" + this.changeType + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): TeamIntegrationLogsRequestBuilder {
            return TeamIntegrationLogsRequestBuilder()
        }
    }
}