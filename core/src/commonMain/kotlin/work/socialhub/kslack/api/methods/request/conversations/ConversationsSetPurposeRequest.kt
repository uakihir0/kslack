package com.github.seratch.jslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsSetPurposeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Conversation to set the purpose of
     */
    var channel: String?,
    /**
     * A new, specialer purpose
     */
    var purpose: String?
) : SlackApiRequest {
    class ConversationsSetPurposeRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var purpose: String? = null

        fun token(token: String?): ConversationsSetPurposeRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsSetPurposeRequestBuilder {
            this.channel = channel
            return this
        }

        fun purpose(purpose: String?): ConversationsSetPurposeRequestBuilder {
            this.purpose = purpose
            return this
        }

        fun build(): ConversationsSetPurposeRequest {
            return ConversationsSetPurposeRequest(token, channel, purpose)
        }

        override fun toString(): String {
            return "ConversationsSetPurposeRequest.ConversationsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")"
        }
    }

    companion object {
        fun builder(): ConversationsSetPurposeRequestBuilder {
            return ConversationsSetPurposeRequestBuilder()
        }
    }
}
