package com.github.seratch.jslack.api.methods.request.mpim

import com.github.seratch.jslack.api.methods.SlackApiRequest

class MpimRepliesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `mpim:history`
     */
    override var token: String?,
    /**
     * Multiparty direct message channel to fetch thread from.
     */
    var channel: String?,
    /**
     * Unique identifier of a thread's parent message.
     */
    var threadTs: String?
) : SlackApiRequest {
    class MpimRepliesRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var threadTs: String? = null

        fun token(token: String?): MpimRepliesRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): MpimRepliesRequestBuilder {
            this.channel = channel
            return this
        }

        fun threadTs(threadTs: String?): MpimRepliesRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun build(): MpimRepliesRequest {
            return MpimRepliesRequest(token, channel, threadTs)
        }

        override fun toString(): String {
            return "MpimRepliesRequest.MpimRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")"
        }
    }

    companion object {
        fun builder(): MpimRepliesRequestBuilder {
            return MpimRepliesRequestBuilder()
        }
    }
}