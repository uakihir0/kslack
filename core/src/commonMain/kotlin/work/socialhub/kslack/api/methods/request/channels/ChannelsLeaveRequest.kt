package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsLeaveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to leave
     */
    var channel: String?
) : SlackApiRequest {
    class ChannelsLeaveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ChannelsLeaveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsLeaveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ChannelsLeaveRequest {
            return ChannelsLeaveRequest(token, channel)
        }

        override fun toString(): String {
            return "ChannelsLeaveRequest.ChannelsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ChannelsLeaveRequestBuilder {
            return ChannelsLeaveRequestBuilder()
        }
    }
}