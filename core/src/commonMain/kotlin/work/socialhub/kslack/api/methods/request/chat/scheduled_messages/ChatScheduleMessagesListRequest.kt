package com.github.seratch.jslack.api.methods.request.chat.scheduled_messages

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChatScheduleMessagesListRequest internal constructor(
    override var token: String?,
    /**
     * The channel of the scheduled messages
     */
    var channel: String?,
    /**
     * For pagination purposes, this is the cursor value returned from a previous call to chat.scheduledmessages.list
     * indicating where you want to start this call from.
     */
    var cursor: String?,
    /**
     * A UNIX timestamp of the latest value in the time range
     */
    var latest: String?,
    /**
     * Maximum number of original entries to return.
     */
    var limit: Int?,
    /**
     * A UNIX timestamp of the oldest value in the time range
     */
    var oldest: String?
) : SlackApiRequest {
    class ChatScheduleMessagesListRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var cursor: String? = null
        private var latest: String? = null
        private var limit: Int? = null
        private var oldest: String? = null

        fun token(token: String?): ChatScheduleMessagesListRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatScheduleMessagesListRequestBuilder {
            this.channel = channel
            return this
        }

        fun cursor(cursor: String?): ChatScheduleMessagesListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun latest(latest: String?): ChatScheduleMessagesListRequestBuilder {
            this.latest = latest
            return this
        }

        fun limit(limit: Int?): ChatScheduleMessagesListRequestBuilder {
            this.limit = limit
            return this
        }

        fun oldest(oldest: String?): ChatScheduleMessagesListRequestBuilder {
            this.oldest = oldest
            return this
        }

        fun build(): ChatScheduleMessagesListRequest {
            return ChatScheduleMessagesListRequest(token, channel, cursor, latest, limit, oldest)
        }

        override fun toString(): String {
            return "ChatScheduleMessagesListRequest.ChatScheduleMessagesListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", latest=" + this.latest + ", limit=" + this.limit + ", oldest=" + this.oldest + ")"
        }
    }

    companion object {
        fun builder(): ChatScheduleMessagesListRequestBuilder {
            return ChatScheduleMessagesListRequestBuilder()
        }
    }
}