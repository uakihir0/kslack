package com.github.seratch.jslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `team:read`
     */
    override var token: String?
) : SlackApiRequest {
    class TeamInfoRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): TeamInfoRequestBuilder {
            this.token = token
            return this
        }

        fun build(): TeamInfoRequest {
            return TeamInfoRequest(token)
        }

        override fun toString(): String {
            return "TeamInfoRequest.TeamInfoRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): TeamInfoRequestBuilder {
            return TeamInfoRequestBuilder()
        }
    }
}