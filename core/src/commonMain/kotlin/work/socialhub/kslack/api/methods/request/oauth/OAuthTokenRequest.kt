package com.github.seratch.jslack.api.methods.request.oauth

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * Exchanges a temporary OAuth verifier code for a workspace token.
 *
 *
 * https://api.slack.com/docs/oauth
 */
class OAuthTokenRequest internal constructor(
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
    var redirectUri: String?,
    /**
     * Request the user to add your app only to a single channel.
     */
    var isSingleChannel: Boolean
) : SlackApiRequest {
    override val token: String?
        get() = null

    class OAuthTokenRequestBuilder internal constructor() {
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var code: String? = null
        private var redirectUri: String? = null
        private var singleChannel = false

        fun clientId(clientId: String?): OAuthTokenRequestBuilder {
            this.clientId = clientId
            return this
        }

        fun clientSecret(clientSecret: String?): OAuthTokenRequestBuilder {
            this.clientSecret = clientSecret
            return this
        }

        fun code(code: String?): OAuthTokenRequestBuilder {
            this.code = code
            return this
        }

        fun redirectUri(redirectUri: String?): OAuthTokenRequestBuilder {
            this.redirectUri = redirectUri
            return this
        }

        fun singleChannel(singleChannel: Boolean): OAuthTokenRequestBuilder {
            this.singleChannel = singleChannel
            return this
        }

        fun build(): OAuthTokenRequest {
            return OAuthTokenRequest(clientId, clientSecret, code, redirectUri, singleChannel)
        }

        override fun toString(): String {
            return "OAuthTokenRequest.OAuthTokenRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ", singleChannel=" + this.singleChannel + ")"
        }
    }

    companion object {
        fun builder(): OAuthTokenRequestBuilder {
            return OAuthTokenRequestBuilder()
        }
    }
}