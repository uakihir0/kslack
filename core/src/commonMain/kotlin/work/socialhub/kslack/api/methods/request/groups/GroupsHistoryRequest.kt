package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsHistoryRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:history`
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
    class GroupsHistoryRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var oldest: String? = null
        private var latest: String? = null
        private var inclusive = false
        private var count: Int? = null
        private var unreads = false

        fun token(token: String?): GroupsHistoryRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsHistoryRequestBuilder {
            this.channel = channel
            return this
        }

        fun oldest(oldest: String?): GroupsHistoryRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun latest(latest: String?): GroupsHistoryRequestBuilder {
            this.latest = latest
            return this
        }

        fun inclusive(inclusive: Boolean): GroupsHistoryRequestBuilder {
            this.inclusive = inclusive
            return this
        }

        fun count(count: Int?): GroupsHistoryRequestBuilder {
            this.count = count
            return this
        }

        fun unreads(unreads: Boolean): GroupsHistoryRequestBuilder {
            this.unreads = unreads
            return this
        }

        fun build(): GroupsHistoryRequest {
            return GroupsHistoryRequest(token, channel, oldest, latest, inclusive, count, unreads)
        }

        override fun toString(): String {
            return "GroupsHistoryRequest.GroupsHistoryRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", oldest=" + this.oldest + ", latest=" + this.latest + ", inclusive=" + this.inclusive + ", count=" + this.count + ", unreads=" + this.unreads + ")"
        }
    }

    companion object {
        fun builder(): GroupsHistoryRequestBuilder {
            return GroupsHistoryRequestBuilder()
        }
    }
}