package com.github.seratch.jslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersGetPresenceRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users:read`
     */
    override var token: String?,
    /**
     * User to get presence info on. Defaults to the authed user.
     */
    var user: String?
) : SlackApiRequest {
    class UsersGetPresenceRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null

        fun token(token: String?): UsersGetPresenceRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): UsersGetPresenceRequestBuilder {
            this.user = user
            return this
        }

        fun build(): UsersGetPresenceRequest {
            return UsersGetPresenceRequest(token, user)
        }

        override fun toString(): String {
            return "UsersGetPresenceRequest.UsersGetPresenceRequestBuilder(token=" + this.token + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): UsersGetPresenceRequestBuilder {
            return UsersGetPresenceRequestBuilder()
        }
    }
}