package com.github.seratch.jslack.api.methods.request.auth

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AuthRevokeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    override var token: String?,
    /**
     * Setting this parameter to `1` triggers a _testing mode_ where the specified token will not actually be revoked.
     */
    var isTest: Boolean
) : SlackApiRequest {
    class AuthRevokeRequestBuilder internal constructor() {
        private var token: String? = null
        private var test = false

        fun token(token: String?): AuthRevokeRequestBuilder {
            this.token = token
            return this
        }

        fun test(test: Boolean): AuthRevokeRequestBuilder {
            this.test = test
            return this
        }

        fun build(): AuthRevokeRequest {
            return AuthRevokeRequest(token, test)
        }

        override fun toString(): String {
            return "AuthRevokeRequest.AuthRevokeRequestBuilder(token=" + this.token + ", test=" + this.test + ")"
        }
    }

    companion object {
        fun builder(): AuthRevokeRequestBuilder {
            return AuthRevokeRequestBuilder()
        }
    }
}