package com.github.seratch.jslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsSetTopicRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Conversation to set the topic of
     */
    var channel: String?,
    /**
     * The new topic string. Does not support formatting or linkification.
     */
    var topic: String?
) : SlackApiRequest {
    class ConversationsSetTopicRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var topic: String? = null

        fun token(token: String?): ConversationsSetTopicRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsSetTopicRequestBuilder {
            this.channel = channel
            return this
        }

        fun topic(topic: String?): ConversationsSetTopicRequestBuilder {
            this.topic = topic
            return this
        }

        fun build(): ConversationsSetTopicRequest {
            return ConversationsSetTopicRequest(token, channel, topic)
        }

        override fun toString(): String {
            return "ConversationsSetTopicRequest.ConversationsSetTopicRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", topic=" + this.topic + ")"
        }
    }

    companion object {
        fun builder(): ConversationsSetTopicRequestBuilder {
            return ConversationsSetTopicRequestBuilder()
        }
    }
}
