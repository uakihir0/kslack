package com.github.seratch.jslack.api.methods.request.apps

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * This method uninstalls an app. Unlike auth.revoke, which revokes a single token,
 * this method revokes all tokens associated with a single installation of an app.
 */
class AppsUninstallRequest internal constructor(
    override var token: String?,
    /**
     * Issued when you created your application.
     */
    var clientId: String?,
    /**
     * Issued when you created your application.
     */
    var clientSecret: String?
) : SlackApiRequest {
    class AppsUninstallRequestBuilder internal constructor() {
        private var token: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null

        fun token(token: String?): AppsUninstallRequestBuilder {
            this.token = token
            return this
        }

        fun clientId(clientId: String?): AppsUninstallRequestBuilder {
            this.clientId = clientId
            return this
        }

        fun clientSecret(clientSecret: String?): AppsUninstallRequestBuilder {
            this.clientSecret = clientSecret
            return this
        }

        fun build(): AppsUninstallRequest {
            return AppsUninstallRequest(token, clientId, clientSecret)
        }

        override fun toString(): String {
            return "AppsUninstallRequest.AppsUninstallRequestBuilder(token=" + this.token + ", clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ")"
        }
    }

    companion object {
        fun builder(): AppsUninstallRequestBuilder {
            return AppsUninstallRequestBuilder()
        }
    }
}