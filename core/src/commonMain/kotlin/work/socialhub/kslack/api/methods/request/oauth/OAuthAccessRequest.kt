package work.socialhub.kslack.api.methods.request.oauth

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/docs/oauth
 */
class OAuthAccessRequest(
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

    class OAuthAccessRequestBuilder() {
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var code: String? = null
        private var redirectUri: String? = null
        private var singleChannel = false

        fun clientId(clientId: String?): OAuthAccessRequestBuilder {
            this.clientId = clientId
            return this
        }

        fun clientSecret(clientSecret: String?): OAuthAccessRequestBuilder {
            this.clientSecret = clientSecret
            return this
        }

        fun code(code: String?): OAuthAccessRequestBuilder {
            this.code = code
            return this
        }

        fun redirectUri(redirectUri: String?): OAuthAccessRequestBuilder {
            this.redirectUri = redirectUri
            return this
        }

        fun singleChannel(singleChannel: Boolean): OAuthAccessRequestBuilder {
            this.singleChannel = singleChannel
            return this
        }

        fun build(): OAuthAccessRequest {
            return OAuthAccessRequest(clientId, clientSecret, code, redirectUri, singleChannel)
        }

        override fun toString(): String {
            return "OAuthAccessRequest.OAuthAccessRequestBuilder(clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ", code=" + this.code + ", redirectUri=" + this.redirectUri + ", singleChannel=" + this.singleChannel + ")"
        }
    }

    companion object {
        fun builder(): OAuthAccessRequestBuilder {
            return OAuthAccessRequestBuilder()
        }
    }
}