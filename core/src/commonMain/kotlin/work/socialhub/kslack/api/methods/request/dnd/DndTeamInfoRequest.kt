package com.github.seratch.jslack.api.methods.request.dnd

import com.github.seratch.jslack.api.methods.SlackApiRequest

class DndTeamInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    override var token: String?,
    /**
     * Comma-separated list of users to fetch Do Not Disturb status for
     */
    var users: List<String>?
) : SlackApiRequest {
    class DndTeamInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var users: List<String>? = null

        fun token(token: String?): DndTeamInfoRequestBuilder {
            this.token = token
            return this
        }

        fun users(users: List<String>?): DndTeamInfoRequestBuilder {
            this.users = users
            return this
        }

        fun build(): DndTeamInfoRequest {
            return DndTeamInfoRequest(token, users)
        }

        override fun toString(): String {
            return "DndTeamInfoRequest.DndTeamInfoRequestBuilder(token=" + this.token + ", users=" + this.users + ")"
        }
    }

    companion object {
        fun builder(): DndTeamInfoRequestBuilder {
            return DndTeamInfoRequestBuilder()
        }
    }
}