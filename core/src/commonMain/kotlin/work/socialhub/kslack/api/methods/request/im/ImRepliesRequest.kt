package com.github.seratch.jslack.api.methods.request.im

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ImRepliesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `im:history`
     */
    override var token: String?,
    /**
     * Direct message channel to fetch thread from.
     */
    var channel: String?,
    /**
     * Unique identifier of a thread's parent message.
     */
    var threadTs: String?
) : SlackApiRequest {
    class ImRepliesRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var threadTs: String? = null

        fun token(token: String?): ImRepliesRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ImRepliesRequestBuilder {
            this.channel = channel
            return this
        }

        fun threadTs(threadTs: String?): ImRepliesRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun build(): ImRepliesRequest {
            return ImRepliesRequest(token, channel, threadTs)
        }

        override fun toString(): String {
            return "ImRepliesRequest.ImRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")"
        }
    }

    companion object {
        fun builder(): ImRepliesRequestBuilder {
            return ImRepliesRequestBuilder()
        }
    }
}