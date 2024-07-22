package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsKickRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * User to remove from channel.
     */
    var channel: String?,
    /**
     * Channel to remove user from.
     */
    var user: String?
) : SlackApiRequest {
    class ChannelsKickRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var user: String? = null

        fun token(token: String?): ChannelsKickRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsKickRequestBuilder {
            this.channel = channel
            return this
        }

        fun user(user: String?): ChannelsKickRequestBuilder {
            this.user = user
            return this
        }

        fun build(): ChannelsKickRequest {
            return ChannelsKickRequest(token, channel, user)
        }

        override fun toString(): String {
            return "ChannelsKickRequest.ChannelsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): ChannelsKickRequestBuilder {
            return ChannelsKickRequestBuilder()
        }
    }
}