package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsMembersRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    override var token: String?,
    /**
     * ID of the conversation to retrieve members for
     */
    var channel: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection.
     * See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    var limit: Int?
) : SlackApiRequest {
    class ConversationsMembersRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var cursor: String? = null
        private var limit: Int? = null

        fun token(token: String?): ConversationsMembersRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsMembersRequestBuilder {
            this.channel = channel
            return this
        }

        fun cursor(cursor: String?): ConversationsMembersRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): ConversationsMembersRequestBuilder {
            this.limit = limit
            return this
        }

        fun build(): ConversationsMembersRequest {
            return ConversationsMembersRequest(token, channel, cursor, limit)
        }

        override fun toString(): String {
            return "ConversationsMembersRequest.ConversationsMembersRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", limit=" + this.limit + ")"
        }
    }

    companion object {
        fun builder(): ConversationsMembersRequestBuilder {
            return ConversationsMembersRequestBuilder()
        }
    }
}
