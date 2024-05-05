package com.github.seratch.jslack.api.methods.request.auth

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AuthTestRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    override var token: String?
) : SlackApiRequest {
    class AuthTestRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): AuthTestRequestBuilder {
            this.token = token
            return this
        }

        fun build(): AuthTestRequest {
            return AuthTestRequest(token)
        }

        override fun toString(): String {
            return "AuthTestRequest.AuthTestRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): AuthTestRequestBuilder {
            return AuthTestRequestBuilder()
        }
    }
}