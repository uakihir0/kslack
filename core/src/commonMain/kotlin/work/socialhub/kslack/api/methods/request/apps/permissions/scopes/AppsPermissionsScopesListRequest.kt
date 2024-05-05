package com.github.seratch.jslack.api.methods.request.apps.permissions.scopes

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsScopesListRequest internal constructor(override var token: String?) : SlackApiRequest {
    class AppsPermissionsScopesListRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): AppsPermissionsScopesListRequestBuilder {
            this.token = token
            return this
        }

        fun build(): AppsPermissionsScopesListRequest {
            return AppsPermissionsScopesListRequest(token)
        }

        override fun toString(): String {
            return "AppsPermissionsScopesListRequest.AppsPermissionsScopesListRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsScopesListRequestBuilder {
            return AppsPermissionsScopesListRequestBuilder()
        }
    }
}