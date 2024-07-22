package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsMarkRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to set reading cursor in.
     */
    var channel: String?,
    /**
     * Timestamp of the most recently seen message.
     */
    var ts: String?
) : SlackApiRequest {
    class ChannelsMarkRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var ts: String? = null

        fun token(token: String?): ChannelsMarkRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsMarkRequestBuilder {
            this.channel = channel
            return this
        }

        fun ts(ts: String?): ChannelsMarkRequestBuilder {
            this.ts = ts
            return this
        }

        fun build(): ChannelsMarkRequest {
            return ChannelsMarkRequest(token, channel, ts)
        }

        override fun toString(): String {
            return "ChannelsMarkRequest.ChannelsMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")"
        }
    }

    companion object {
        fun builder(): ChannelsMarkRequestBuilder {
            return ChannelsMarkRequestBuilder()
        }
    }
}