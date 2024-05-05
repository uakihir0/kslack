package com.github.seratch.jslack.api.methods.request.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

class UsersIdentityRequest internal constructor(
    /**
     * Authentication token. Requires scope: `identity.basic`
     */
    override var token: String?
) : SlackApiRequest {
    class UsersIdentityRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): UsersIdentityRequestBuilder {
            this.token = token
            return this
        }

        fun build(): UsersIdentityRequest {
            return UsersIdentityRequest(token)
        }

        override fun toString(): String {
            return "UsersIdentityRequest.UsersIdentityRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): UsersIdentityRequestBuilder {
            return UsersIdentityRequestBuilder()
        }
    }
}