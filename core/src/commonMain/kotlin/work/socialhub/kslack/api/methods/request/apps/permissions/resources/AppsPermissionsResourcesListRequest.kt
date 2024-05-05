package com.github.seratch.jslack.api.methods.request.apps.permissions.resources

import com.github.seratch.jslack.api.methods.SlackApiRequest

class AppsPermissionsResourcesListRequest internal constructor(
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
    class AppsPermissionsResourcesListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null

        fun token(token: String?): AppsPermissionsResourcesListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): AppsPermissionsResourcesListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): AppsPermissionsResourcesListRequestBuilder {
            this.limit = limit
            return this
        }

        fun build(): AppsPermissionsResourcesListRequest {
            return AppsPermissionsResourcesListRequest(token, cursor, limit)
        }

        override fun toString(): String {
            return "AppsPermissionsResourcesListRequest.AppsPermissionsResourcesListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ")"
        }
    }

    companion object {
        fun builder(): AppsPermissionsResourcesListRequestBuilder {
            return AppsPermissionsResourcesListRequestBuilder()
        }
    }
}