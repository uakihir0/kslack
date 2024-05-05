package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsCloseRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Conversation to close.
     */
    var channel: String?
) : SlackApiRequest {
    class ConversationsCloseRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ConversationsCloseRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsCloseRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ConversationsCloseRequest {
            return ConversationsCloseRequest(token, channel)
        }

        override fun toString(): String {
            return "ConversationsCloseRequest.ConversationsCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ConversationsCloseRequestBuilder {
            return ConversationsCloseRequestBuilder()
        }
    }
}
