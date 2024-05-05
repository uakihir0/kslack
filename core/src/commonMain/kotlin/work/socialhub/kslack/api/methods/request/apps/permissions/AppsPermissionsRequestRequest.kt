package com.github.seratch.jslack.api.methods.request.apps.permissions

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsRequestRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    override var token: String?,
    /**
     * Token used to trigger the permissions API
     */
    var triggerId: String?,
    /**
     * A comma separated list of scopes to request for
     */
    var scopes: List<String>?
) : SlackApiRequest {
    class AppsPermissionsRequestRequestBuilder internal constructor() {
        private var token: String? = null
        private var triggerId: String? = null
        private var scopes: List<String>? = null

        fun token(token: String?): AppsPermissionsRequestRequestBuilder {
            this.token = token
            return this
        }

        fun triggerId(triggerId: String?): AppsPermissionsRequestRequestBuilder {
            this.triggerId = triggerId
            return this
        }

        fun scopes(scopes: List<String>?): AppsPermissionsRequestRequestBuilder {
            this.scopes = scopes
            return this
        }

        fun build(): AppsPermissionsRequestRequest {
            return AppsPermissionsRequestRequest(token, triggerId, scopes)
        }

        override fun toString(): String {
            return "AppsPermissionsRequestRequest.AppsPermissionsRequestRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", scopes=" + this.scopes + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsRequestRequestBuilder {
            return AppsPermissionsRequestRequestBuilder()
        }
    }
}