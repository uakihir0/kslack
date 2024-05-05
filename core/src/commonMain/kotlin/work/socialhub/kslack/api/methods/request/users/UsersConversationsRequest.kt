package com.github.seratch.jslack.api.methods.request.users

import com.github.seratch.jslack.api.model.ConversationType

/**
 * List conversations the calling user may access.
 */
class UsersConversationsRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    var token: String?,
    /**
     * Browse conversations by a specific user ID's membership.
     * Non-public channels are restricted to those where the calling user shares membership."
     */
    var user: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to
     * a `next_cursor` attribute returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * Set to `true` to exclude archived channels from the list
     */
    var isExcludeArchived: Boolean,
    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
     */
    var limit: Int?, types: List<ConversationType>?
) : SlackApiRequest {
    /**
     * Mix and match channel types by providing a comma-separated list of
     * any combination of `public_channel`, `private_channel`, `mpim`, `im`
     */
    private var types: List<ConversationType>?

    init {
        this.types = types
    }

    fun getTypes(): List<ConversationType>? {
        return this.types
    }

    fun setTypes(types: List<ConversationType>?) {
        this.types = types
    }

    class UsersConversationsRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null
        private var cursor: String? = null
        private var excludeArchived = false
        private var limit: Int? = null
        private var types: List<ConversationType>? = null

        fun token(token: String?): UsersConversationsRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): UsersConversationsRequestBuilder {
            this.user = user
            return this
        }

        fun cursor(cursor: String?): UsersConversationsRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun excludeArchived(excludeArchived: Boolean): UsersConversationsRequestBuilder {
            this.excludeArchived = excludeArchived
            return this
        }

        fun limit(limit: Int?): UsersConversationsRequestBuilder {
            this.limit = limit
            return this
        }

        fun types(types: List<ConversationType>?): UsersConversationsRequestBuilder {
            this.types = types
            return this
        }

        fun build(): UsersConversationsRequest {
            return UsersConversationsRequest(token, user, cursor, excludeArchived, limit, types)
        }

        override fun toString(): String {
            return "UsersConversationsRequest.UsersConversationsRequestBuilder(token=" + this.token + ", user=" + this.user + ", cursor=" + this.cursor + ", excludeArchived=" + this.excludeArchived + ", limit=" + this.limit + ", types=" + this.types + ")"
        }
    }

    companion object {
        fun builder(): UsersConversationsRequestBuilder {
            return UsersConversationsRequestBuilder()
        }
    }
}
