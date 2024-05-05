package com.github.seratch.jslack.api.methods.request.apps.permissions.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsUsersListRequest internal constructor(
    override var token: String?,
    /**
     * Paginate through collections of data by setting the cursor parameter to
     * a next_cursor attribute returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection. See pagination for more detail.
     */
    var cursor: String?,
    /**
     * The maximum number of items to return.
     */
    var limit: Int?
) : SlackApiRequest {
    class AppsPermissionsUsersListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null

        fun token(token: String?): AppsPermissionsUsersListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): AppsPermissionsUsersListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): AppsPermissionsUsersListRequestBuilder {
            this.limit = limit
            return this
        }

        fun build(): AppsPermissionsUsersListRequest {
            return AppsPermissionsUsersListRequest(token, cursor, limit)
        }

        override fun toString(): String {
            return "AppsPermissionsUsersListRequest.AppsPermissionsUsersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsUsersListRequestBuilder {
            return AppsPermissionsUsersListRequestBuilder()
        }
    }
}