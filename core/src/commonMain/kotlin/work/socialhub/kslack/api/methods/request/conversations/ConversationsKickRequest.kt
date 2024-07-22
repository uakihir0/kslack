package com.github.seratch.jslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsKickRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * ID of conversation to remove user from.
     */
    var channel: String?,
    /**
     * User ID to be removed.
     */
    var user: String?
) : SlackApiRequest {
    class ConversationsKickRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var user: String? = null

        fun token(token: String?): ConversationsKickRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsKickRequestBuilder {
            this.channel = channel
            return this
        }

        fun user(user: String?): ConversationsKickRequestBuilder {
            this.user = user
            return this
        }

        fun build(): ConversationsKickRequest {
            return ConversationsKickRequest(token, channel, user)
        }

        override fun toString(): String {
            return "ConversationsKickRequest.ConversationsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): ConversationsKickRequestBuilder {
            return ConversationsKickRequestBuilder()
        }
    }
}
