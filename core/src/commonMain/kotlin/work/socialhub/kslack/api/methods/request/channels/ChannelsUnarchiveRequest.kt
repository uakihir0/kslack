package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsUnarchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to unarchive
     */
    var channel: String?
) : SlackApiRequest {
    class ChannelsUnarchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ChannelsUnarchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsUnarchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ChannelsUnarchiveRequest {
            return ChannelsUnarchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "ChannelsUnarchiveRequest.ChannelsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ChannelsUnarchiveRequestBuilder {
            return ChannelsUnarchiveRequestBuilder()
        }
    }
}