package com.github.seratch.jslack.api.methods.request.apps.permissions.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsUsersRequestRequest internal constructor(
    override var token: String?,
    /**
     * A comma separated list of user scopes to request for
     */
    var scopes: List<String>?,
    /**
     * Token used to trigger the request
     */
    var triggerId: String?,
    /**
     * The user this scope is being requested for
     */
    var user: String?
) : SlackApiRequest {
    class AppsPermissionsUsersRequestRequestBuilder internal constructor() {
        private var token: String? = null
        private var scopes: List<String>? = null
        private var triggerId: String? = null
        private var user: String? = null

        fun token(token: String?): AppsPermissionsUsersRequestRequestBuilder {
            this.token = token
            return this
        }

        fun scopes(scopes: List<String>?): AppsPermissionsUsersRequestRequestBuilder {
            this.scopes = scopes
            return this
        }

        fun triggerId(triggerId: String?): AppsPermissionsUsersRequestRequestBuilder {
            this.triggerId = triggerId
            return this
        }

        fun user(user: String?): AppsPermissionsUsersRequestRequestBuilder {
            this.user = user
            return this
        }

        fun build(): AppsPermissionsUsersRequestRequest {
            return AppsPermissionsUsersRequestRequest(token, scopes, triggerId, user)
        }

        override fun toString(): String {
            return "AppsPermissionsUsersRequestRequest.AppsPermissionsUsersRequestRequestBuilder(token=" + this.token + ", scopes=" + this.scopes + ", triggerId=" + this.triggerId + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsUsersRequestRequestBuilder {
            return AppsPermissionsUsersRequestRequestBuilder()
        }
    }
}