package work.socialhub.kslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsListRequest(
    /**
     * Authentication token. Requires scope: `pins:read`
     */
    override var token: String?,
    /**
     * Channel to get pinned items for.
     */
    var channel: String?
) : SlackApiRequest {
    class PinsListRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): PinsListRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): PinsListRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): PinsListRequest {
            return PinsListRequest(token, channel)
        }

        override fun toString(): String {
            return "PinsListRequest.PinsListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): PinsListRequestBuilder {
            return PinsListRequestBuilder()
        }
    }
}