package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimRepliesRequest(
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
    class MpimRepliesRequestBuilder() {
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