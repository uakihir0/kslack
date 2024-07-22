package com.github.seratch.jslack.api.methods.request.team.profile

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamProfileGetRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users.profile:read`
     */
    override var token: String?,
    /**
     * Filter by visibility.
     */
    var visibility: String?
) : SlackApiRequest {
    class TeamProfileGetRequestBuilder internal constructor() {
        private var token: String? = null
        private var visibility: String? = null

        fun token(token: String?): TeamProfileGetRequestBuilder {
            this.token = token
            return this
        }

        fun visibility(visibility: String?): TeamProfileGetRequestBuilder {
            this.visibility = visibility
            return this
        }

        fun build(): TeamProfileGetRequest {
            return TeamProfileGetRequest(token, visibility)
        }

        override fun toString(): String {
            return "TeamProfileGetRequest.TeamProfileGetRequestBuilder(token=" + this.token + ", visibility=" + this.visibility + ")"
        }
    }

    companion object {
        fun builder(): TeamProfileGetRequestBuilder {
            return TeamProfileGetRequestBuilder()
        }
    }
}