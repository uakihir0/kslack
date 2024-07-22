package com.github.seratch.jslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamBillableInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `admin`
     */
    override var token: String?,
    /**
     * A user to retrieve the billable information for. Defaults to all users.
     */
    var user: String?
) : SlackApiRequest {
    class TeamBillableInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null

        fun token(token: String?): TeamBillableInfoRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): TeamBillableInfoRequestBuilder {
            this.user = user
            return this
        }

        fun build(): TeamBillableInfoRequest {
            return TeamBillableInfoRequest(token, user)
        }

        override fun toString(): String {
            return "TeamBillableInfoRequest.TeamBillableInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): TeamBillableInfoRequestBuilder {
            return TeamBillableInfoRequestBuilder()
        }
    }
}