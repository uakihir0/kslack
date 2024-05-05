package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsRepliesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:history`
     */
    override var token: String?,
    /**
     * Channel to fetch thread from
     */
    var channel: String?,
    /**
     * Unique identifier of a thread's parent message
     */
    var threadTs: String?
) : SlackApiRequest {
    class ChannelsRepliesRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var threadTs: String? = null

        fun token(token: String?): ChannelsRepliesRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsRepliesRequestBuilder {
            this.channel = channel
            return this
        }

        fun threadTs(threadTs: String?): ChannelsRepliesRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun build(): ChannelsRepliesRequest {
            return ChannelsRepliesRequest(token, channel, threadTs)
        }

        override fun toString(): String {
            return "ChannelsRepliesRequest.ChannelsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")"
        }
    }

    companion object {
        fun builder(): ChannelsRepliesRequestBuilder {
            return ChannelsRepliesRequestBuilder()
        }
    }
}