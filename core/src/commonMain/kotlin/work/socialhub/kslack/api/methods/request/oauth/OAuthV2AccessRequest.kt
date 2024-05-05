package com.github.seratch.jslack.api.methods.request.oauth

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/authentication/basics
 * https://api.slack.com/methods/oauth.v2.access
 */
class OAuthV2AccessRequest internal constructor(
    /**
     * Issued when you created your application.
     */
    var clientId: String?,
    /**
     * Issued when you created your application.
     */
    var clientSecret: String?,
    /**
     * The `code` param returned via the OAuth callback.
     */
    var code: String?,
    /**
     * This must match the originally submitted URI (if one was sent).
     */
    var redirectUri: String?
) : SlackApiRequest {
    override val token: String?
        get() = null

    class OAuthV2AccessRequestBuilder internal constructor() {
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var code: String? = null
        private var redirectUri: String? = null

        fun clientId(clientId: String?): OAuthV2AccessRequestBuilder {
            this.clientId = clientId
            return this
        }

        fun clientSecret(clientSecret: String?): OAuthV2AccessRequestBuilder {
            this.clientSecret = clientSecret
            return this
        }

        fun code(code: String?): OAuthV2AccessRequestBuilder {
            this.code = code
            return this
        }

        fun redirectUri(redirectUri: String?): OAuthV2AccessRequestBuilder {
            this.redirectUri = redirectUri
            return this
        }

        fun build(): OAuthV2AccessRequest {
            return OAuthV2AccessRequest(clientId, clientSecret, code, redirectUri)
        }

        override fun toString(): String {
            return "OAuthV2AccessRequest.OAuthV2AccessRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ")"
        }
    }

    companion object {
        fun builder(): OAuthV2AccessRequestBuilder {
            return OAuthV2AccessRequestBuilder()
        }
    }
}