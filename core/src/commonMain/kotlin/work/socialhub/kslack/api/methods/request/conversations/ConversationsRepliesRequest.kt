package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsRepliesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    override var token: String?,
    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    var isInclusive: Boolean,
    /**
     * Unique identifier of a thread's parent message.
     */
    var ts: String?,
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
     * Conversation ID to fetch thread from.
     */
    var channel: String?,
    /**
     * Start of time range of messages to include in results.
     */
    var oldest: String?,
    /**
     * End of time range of messages to include in results.
     */
    var latest: String?
) : SlackApiRequest {
    class ConversationsRepliesRequestBuilder internal constructor() {
        private var token: String? = null
        private var inclusive = false
        private var ts: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var channel: String? = null
        private var oldest: String? = null
        private var latest: String? = null

        fun token(token: String?): ConversationsRepliesRequestBuilder {
            this.token = token
            return this
        }

        fun inclusive(inclusive: Boolean): ConversationsRepliesRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun ts(ts: String?): ConversationsRepliesRequestBuilder {
            this.ts = ts
            return this
        }

        fun cursor(cursor: String?): ConversationsRepliesRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): ConversationsRepliesRequestBuilder {
            this.limit = limit
            return this
        }

        fun channel(channel: String?): ConversationsRepliesRequestBuilder {
            this.channel = channel
            return this
        }

        fun oldest(oldest: String?): ConversationsRepliesRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun latest(latest: String?): ConversationsRepliesRequestBuilder {
            this.latest = latest
            return this
        }

        fun build(): ConversationsRepliesRequest {
            return ConversationsRepliesRequest(token, inclusive, ts, cursor, limit, channel, oldest, latest)
        }

        override fun toString(): String {
            return "ConversationsRepliesRequest.ConversationsRepliesRequestBuilder(token=" + this.token + ", inclusive=" + this.inclusive + ", ts=" + this.ts + ", cursor=" + this.cursor + ", limit=" + this.limit + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ")"
        }
    }

    companion object {
        fun builder(): ConversationsRepliesRequestBuilder {
            return ConversationsRepliesRequestBuilder()
        }
    }
}
