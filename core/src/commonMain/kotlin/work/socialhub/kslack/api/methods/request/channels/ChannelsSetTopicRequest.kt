package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsSetTopicRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to set the topic of
     */
    var channel: String?,
    /**
     * The new topic
     */
    var topic: String?
) : SlackApiRequest {
    class ChannelsSetTopicRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var topic: String? = null

        fun token(token: String?): ChannelsSetTopicRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsSetTopicRequestBuilder {
            this.channel = channel
            return this
        }

        fun topic(topic: String?): ChannelsSetTopicRequestBuilder {
            this.topic = topic
            return this
        }

        fun build(): ChannelsSetTopicRequest {
            return ChannelsSetTopicRequest(token, channel, topic)
        }

        override fun toString(): String {
            return "ChannelsSetTopicRequest.ChannelsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")"
        }
    }

    companion object {
        fun builder(): ChannelsSetTopicRequestBuilder {
            return ChannelsSetTopicRequestBuilder()
        }
    }
}