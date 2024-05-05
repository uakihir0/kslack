package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsInviteRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * The ID of the public or private channel to invite user(s) to.
     */
    var channel: String?,
    /**
     * A comma separated list of user IDs. Up to 30 users may be listed.
     */
    var users: List<String>?
) : SlackApiRequest {
    class ConversationsInviteRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var users: List<String>? = null

        fun token(token: String?): ConversationsInviteRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsInviteRequestBuilder {
            this.channel = channel
            return this
        }

        fun users(users: List<String>?): ConversationsInviteRequestBuilder {
            this.users = users
            return this
        }

        fun build(): ConversationsInviteRequest {
            return ConversationsInviteRequest(token, channel, users)
        }

        override fun toString(): String {
            return "ConversationsInviteRequest.ConversationsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", users=" + this.users + ")"
        }
    }

    companion object {
        fun builder(): ConversationsInviteRequestBuilder {
            return ConversationsInviteRequestBuilder()
        }
    }
}
