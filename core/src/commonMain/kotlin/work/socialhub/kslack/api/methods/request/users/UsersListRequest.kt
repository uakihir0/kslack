package com.github.seratch.jslack.api.methods.request.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

class UsersListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users:read`
     */
    override var token: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    var limit: Int?,
    /**
     * Set this to `true` to receive the locale for users. Defaults to `false`
     */
    var isIncludeLocale: Boolean, @field
    /**
     * Deprecated. Whether to include presence data in the output.
     * Defaults to `false`. Setting this to `true` reduces performance, especially with large teams.
     */
    :Deprecated("") @set:Deprecated("") @get:Deprecated("") var isPresence: Boolean
) : SlackApiRequest {
    class UsersListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var includeLocale = false
        private var presence = false

        fun token(token: String?): UsersListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): UsersListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): UsersListRequestBuilder {
            this.limit = limit
            return this
        }

        fun includeLocale(includeLocale: Boolean): UsersListRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        @Deprecated("")
        fun presence(presence: Boolean): UsersListRequestBuilder {
            this.presence = presence
            return this
        }

        fun build(): UsersListRequest {
            return UsersListRequest(token, cursor, limit, includeLocale, presence)
        }

        override fun toString(): String {
            return "UsersListRequest.UsersListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", includeLocale=" + this.includeLocale + ", presence=" + this.presence + ")"
        }
    }

    companion object {
        fun builder(): UsersListRequestBuilder {
            return UsersListRequestBuilder()
        }
    }
}