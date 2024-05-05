package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsUnarchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * ID of conversation to unarchive
     */
    var channel: String?
) : SlackApiRequest {
    class ConversationsUnarchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ConversationsUnarchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsUnarchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ConversationsUnarchiveRequest {
            return ConversationsUnarchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "ConversationsUnarchiveRequest.ConversationsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ConversationsUnarchiveRequestBuilder {
            return ConversationsUnarchiveRequestBuilder()
        }
    }
}
