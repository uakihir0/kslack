package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsInviteRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to invite user to.
     */
    var channel: String?,
    /**
     * User to invite to channel.
     */
    var user: String?
) : SlackApiRequest {
    class ChannelsInviteRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var user: String? = null

        fun token(token: String?): ChannelsInviteRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsInviteRequestBuilder {
            this.channel = channel
            return this
        }

        fun user(user: String?): ChannelsInviteRequestBuilder {
            this.user = user
            return this
        }

        fun build(): ChannelsInviteRequest {
            return ChannelsInviteRequest(token, channel, user)
        }

        override fun toString(): String {
            return "ChannelsInviteRequest.ChannelsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): ChannelsInviteRequestBuilder {
            return ChannelsInviteRequestBuilder()
        }
    }
}