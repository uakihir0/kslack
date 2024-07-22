package com.github.seratch.jslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsArchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * ID of conversation to archive
     */
    var channel: String?
) : SlackApiRequest {
    class ConversationsArchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ConversationsArchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsArchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ConversationsArchiveRequest {
            return ConversationsArchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "ConversationsArchiveRequest.ConversationsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ConversationsArchiveRequestBuilder {
            return ConversationsArchiveRequestBuilder()
        }
    }
}
