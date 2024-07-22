package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsHistoryRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:history`
     */
    override var token: String?,
    /**
     * Channel to fetch history for.
     */
    var channel: String?,
    /**
     * End of time range of messages to include in results.
     */
    var latest: String?,
    /**
     * Start of time range of messages to include in results.
     */
    var oldest: String?,
    /**
     * Include messages with latest or oldest timestamp in results.
     */
    var isInclusive: Boolean,
    /**
     * Number of messages to return, between 1 and 1000.
     */
    var count: Int?,
    /**
     * Include `unread_count_display` in the output?
     */
    var isUnreads: Boolean
) : SlackApiRequest {
    class ChannelsHistoryRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var latest: String? = null
        private var oldest: String? = null
        private var inclusive = false
        private var count: Int? = null
        private var unreads = false

        fun token(token: String?): ChannelsHistoryRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsHistoryRequestBuilder {
            this.channel = channel
            return this
        }

        fun latest(latest: String?): ChannelsHistoryRequestBuilder {
            this.latest = latest
            return this
        }

        fun oldest(oldest: String?): ChannelsHistoryRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun inclusive(inclusive: Boolean): ChannelsHistoryRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun count(count: Int?): ChannelsHistoryRequestBuilder {
            this.count = count
            return this
        }

        fun unreads(unreads: Boolean): ChannelsHistoryRequestBuilder {
            this.unreads = unreads
            return this
        }

        fun build(): ChannelsHistoryRequest {
            return ChannelsHistoryRequest(token, channel, latest, oldest, inclusive, count, unreads)
        }

        override fun toString(): String {
            return "ChannelsHistoryRequest.ChannelsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", latest=" + this.latest + ", oldest=" + this.oldest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")"
        }
    }

    companion object {
        fun builder(): ChannelsHistoryRequestBuilder {
            return ChannelsHistoryRequestBuilder()
        }
    }
}