package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsJoinRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * ID of conversation to join
     */
    var channel: String?
) : SlackApiRequest {
    class ConversationsJoinRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ConversationsJoinRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsJoinRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ConversationsJoinRequest {
            return ConversationsJoinRequest(token, channel)
        }

        override fun toString(): String {
            return "ConversationsJoinRequest.ConversationsJoinRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ConversationsJoinRequestBuilder {
            return ConversationsJoinRequestBuilder()
        }
    }
}
