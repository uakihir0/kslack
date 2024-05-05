package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsHistoryRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    override var token: String?,
    /**
     * Conversation ID to fetch history for.
     */
    var channel: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     *
     *
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * Start of time range of messages to include in results.
     */
    var oldest: String?,
    /**
     * End of time range of messages to include in results.
     */
    var latest: String?,
    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the users list hasn't been reached.
     */
    var limit: Int?,
    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    var isInclusive: Boolean
) : SlackApiRequest {
    class ConversationsHistoryRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var cursor: String? = null
        private var oldest: String? = null
        private var latest: String? = null
        private var limit: Int? = null
        private var inclusive = false

        fun token(token: String?): ConversationsHistoryRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsHistoryRequestBuilder {
            this.channel = channel
            return this
        }

        fun cursor(cursor: String?): ConversationsHistoryRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun oldest(oldest: String?): ConversationsHistoryRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun latest(latest: String?): ConversationsHistoryRequestBuilder {
            this.latest = latest
            return this
        }

        fun limit(limit: Int?): ConversationsHistoryRequestBuilder {
            this.limit = limit
            return this
        }

        fun inclusive(inclusive: Boolean): ConversationsHistoryRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun build(): ConversationsHistoryRequest {
            return ConversationsHistoryRequest(token, channel, cursor, oldest, latest, limit, inclusive)
        }

        override fun toString(): String {
            return "ConversationsHistoryRequest.ConversationsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", oldest=" + this.oldest + ", latest=" + this.latest + ", limit=" + this.limit + ", inclusive=" + this.inclusive + ")"
        }
    }

    companion object {
        fun builder(): ConversationsHistoryRequestBuilder {
            return ConversationsHistoryRequestBuilder()
        }
    }
}
