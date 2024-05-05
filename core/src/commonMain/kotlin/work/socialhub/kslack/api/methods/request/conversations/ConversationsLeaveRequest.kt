package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsLeaveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Conversation to leave
     */
    var channel: String?
) : SlackApiRequest {
    class ConversationsLeaveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ConversationsLeaveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsLeaveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ConversationsLeaveRequest {
            return ConversationsLeaveRequest(token, channel)
        }

        override fun toString(): String {
            return "ConversationsLeaveRequest.ConversationsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ConversationsLeaveRequestBuilder {
            return ConversationsLeaveRequestBuilder()
        }
    }
}
