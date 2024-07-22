package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsArchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to archive
     */
    var channel: String?
) : SlackApiRequest {
    class ChannelsArchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ChannelsArchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsArchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ChannelsArchiveRequest {
            return ChannelsArchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "ChannelsArchiveRequest.ChannelsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ChannelsArchiveRequestBuilder {
            return ChannelsArchiveRequestBuilder()
        }
    }
}