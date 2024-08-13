package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImHistoryRequest(
    /**
     * Authentication token. Requires scope: `im:history`
     */
    override var token: String?,
    /**
     * Direct message channel to fetch history for.
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
    class ImHistoryRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null
        private var oldest: String? = null
        private var latest: String? = null
        private var inclusive = false
        private var count: Int? = null
        private var unreads = false

        fun token(token: String?): ImHistoryRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ImHistoryRequestBuilder {
            this.channel = channel
            return this
        }

        fun oldest(oldest: String?): ImHistoryRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun latest(latest: String?): ImHistoryRequestBuilder {
            this.latest = latest
            return this
        }

        fun inclusive(inclusive: Boolean): ImHistoryRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun count(count: Int?): ImHistoryRequestBuilder {
            this.count = count
            return this
        }

        fun unreads(unreads: Boolean): ImHistoryRequestBuilder {
            this.unreads = unreads
            return this
        }

        fun build(): ImHistoryRequest {
            return ImHistoryRequest(token, channel, oldest, latest, inclusive, count, unreads)
        }

        override fun toString(): String {
            return "ImHistoryRequest.ImHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")"
        }
    }

    companion object {
        fun builder(): ImHistoryRequestBuilder {
            return ImHistoryRequestBuilder()
        }
    }
}