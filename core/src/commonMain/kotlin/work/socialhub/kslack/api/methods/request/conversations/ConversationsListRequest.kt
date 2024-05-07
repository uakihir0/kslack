package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.model.ConversationType

class ConversationsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    var token: String?,
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
    var limit: Int?, types: Array<ConversationType>?
) : SlackApiRequest {
    /**
     * Mix and match channel types by providing a comma-separated list of
     * any combination of `public_channel`, `private_channel`, `mpim`, `im`
     */
    private var types: Array<ConversationType>?

    init {
        this.types = types
    }

    fun getTypes(): Array<ConversationType>? {
        return this.types
    }

    fun setTypes(types: Array<ConversationType>?) {
        this.types = types
    }

    class ConversationsListRequestBuilder internal constructor() {
        private var token: String? = null
        private var cursor: String? = null
        private var excludeArchived = false
        private var limit: Int? = null
        private var types: Array<ConversationType>? = null

        fun token(token: String?): ConversationsListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): ConversationsListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun excludeArchived(excludeArchived: Boolean): ConversationsListRequestBuilder {
            this.excludeArchived = excludeArchived
            return this
        }

        fun limit(limit: Int?): ConversationsListRequestBuilder {
            this.limit = limit
            return this
        }

        fun types(types: Array<ConversationType>?): ConversationsListRequestBuilder {
            this.types = types
            return this
        }

        fun build(): ConversationsListRequest {
            return ConversationsListRequest(token, cursor, excludeArchived, limit, types)
        }

        override fun toString(): String {
            return "ConversationsListRequest.ConversationsListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", excludeArchived=" + this.excludeArchived + ", limit=" + this.limit + ", types=" + this.types + ")"
        }
    }

    companion object {
        fun builder(): ConversationsListRequestBuilder {
            return ConversationsListRequestBuilder()
        }
    }
}
