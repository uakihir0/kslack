package com.github.seratch.jslack.api.methods.request.apps.permissions

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    override var token: String?
) : SlackApiRequest {
    class AppsPermissionsInfoRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): AppsPermissionsInfoRequestBuilder {
            this.token = token
            return this
        }

        fun build(): AppsPermissionsInfoRequest {
            return AppsPermissionsInfoRequest(token)
        }

        override fun toString(): String {
            return "AppsPermissionsInfoRequest.AppsPermissionsInfoRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsInfoRequestBuilder {
            return AppsPermissionsInfoRequestBuilder()
        }
    }
}