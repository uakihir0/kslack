package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsSetPurposeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to set the purpose of
     */
    var channel: String?,
    /**
     * The new purpose
     */
    var purpose: String?
) : SlackApiRequest {
    class ChannelsSetPurposeRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var purpose: String? = null

        fun token(token: String?): ChannelsSetPurposeRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsSetPurposeRequestBuilder {
            this.channel = channel
            return this
        }

        fun purpose(purpose: String?): ChannelsSetPurposeRequestBuilder {
            this.purpose = purpose
            return this
        }

        fun build(): ChannelsSetPurposeRequest {
            return ChannelsSetPurposeRequest(token, channel, purpose)
        }

        override fun toString(): String {
            return "ChannelsSetPurposeRequest.ChannelsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")"
        }
    }

    companion object {
        fun builder(): ChannelsSetPurposeRequestBuilder {
            return ChannelsSetPurposeRequestBuilder()
        }
    }
}