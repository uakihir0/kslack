package com.github.seratch.jslack.api.methods.request.pins

import com.github.seratch.jslack.api.methods.SlackApiRequest

class PinsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `pins:read`
     */
    override var token: String?,
    /**
     * Channel to get pinned items for.
     */
    var channel: String?
) : SlackApiRequest {
    class PinsListRequestBuilder internal constructor() {
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