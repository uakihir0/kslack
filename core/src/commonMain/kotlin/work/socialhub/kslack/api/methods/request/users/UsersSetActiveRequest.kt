package com.github.seratch.jslack.api.methods.request.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

class UsersSetActiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users:write`
     */
    override var token: String?
) : SlackApiRequest {
    class UsersSetActiveRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): UsersSetActiveRequestBuilder {
            this.token = token
            return this
        }

        fun build(): UsersSetActiveRequest {
            return UsersSetActiveRequest(token)
        }

        override fun toString(): String {
            return "UsersSetActiveRequest.UsersSetActiveRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): UsersSetActiveRequestBuilder {
            return UsersSetActiveRequestBuilder()
        }
    }
}