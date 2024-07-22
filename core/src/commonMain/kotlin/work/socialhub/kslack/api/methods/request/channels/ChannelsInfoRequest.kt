package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:read`
     */
    override var token: String?,
    /**
     * Set this to `true` to receive the locale for this channel. Defaults to `false`
     */
    var isIncludeLocale: Boolean,
    /**
     * Channel to get info on
     */
    var channel: String?
) : SlackApiRequest {
    class ChannelsInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var includeLocale = false
        private var channel: String? = null

        fun token(token: String?): ChannelsInfoRequestBuilder {
            this.token = token
            return this
        }

        fun includeLocale(includeLocale: Boolean): ChannelsInfoRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        fun channel(channel: String?): ChannelsInfoRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ChannelsInfoRequest {
            return ChannelsInfoRequest(token, includeLocale, channel)
        }

        override fun toString(): String {
            return "ChannelsInfoRequest.ChannelsInfoRequestBuilder(token=" + this.token + ", includeLocale=" + this.includeLocale + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ChannelsInfoRequestBuilder {
            return ChannelsInfoRequestBuilder()
        }
    }
}