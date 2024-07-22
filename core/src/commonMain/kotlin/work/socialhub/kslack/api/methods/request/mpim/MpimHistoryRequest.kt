package com.github.seratch.jslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimHistoryRequest internal constructor(
    /**
     * Authentication token. Requires scope: `mpim:history`
     */
    override var token: String?,
    /**
     * Multiparty direct message to fetch history for.
     */
    var channel: String?,
    /**
     * Start of time range of messages to include in results.
     */
    var oldest: String?,
    /**
     * End of time range of messages to include in results.
     */
    var latest: String?,
    /**
     * Number of messages to return, between 1 and 1000.
     */
    var count: Int?,
    /**
     * Include messages with latest or oldest timestamp in results.
     */
    var isInclusive: Boolean,
    /**
     * Include `unread_count_display` in the output?
     */
    var isUnreads: Boolean
) : SlackApiRequest {
    class MpimHistoryRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var oldest: String? = null
        private var latest: String? = null
        private var count: Int? = null
        private var inclusive = false
        private var unreads = false

        fun token(token: String?): MpimHistoryRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): MpimHistoryRequestBuilder {
            this.channel = channel
            return this
        }

        fun oldest(oldest: String?): MpimHistoryRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun latest(latest: String?): MpimHistoryRequestBuilder {
            this.latest = latest
            return this
        }

        fun count(count: Int?): MpimHistoryRequestBuilder {
            this.count = count
            return this
        }

        fun inclusive(inclusive: Boolean): MpimHistoryRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun unreads(unreads: Boolean): MpimHistoryRequestBuilder {
            this.unreads = unreads
            return this
        }

        fun build(): MpimHistoryRequest {
            return MpimHistoryRequest(token, channel, oldest, latest, count, inclusive, unreads)
        }

        override fun toString(): String {
            return "MpimHistoryRequest.MpimHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", count=" + this.count + ", inclusive=" + this.inclusive + ", unreads=" + this.unreads + ")"
        }
    }

    companion object {
        fun builder(): MpimHistoryRequestBuilder {
            return MpimHistoryRequestBuilder()
        }
    }
}