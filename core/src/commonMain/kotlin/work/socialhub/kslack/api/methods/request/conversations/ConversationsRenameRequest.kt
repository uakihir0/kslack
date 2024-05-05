package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsRenameRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * ID of conversation to rename
     */
    var channel: String?,
    /**
     * New name for conversation.
     *
     *
     * Conversation names can only contain lowercase letters, numbers, hyphens, and underscores, and must
     * be 21 characters or less. We will validate the submitted channel name and modify it to meet the above
     * criteria. When calling this method, we recommend storing the channel's name value that is returned
     * in the response.
     */
    var name: String?
) : SlackApiRequest {
    class ConversationsRenameRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var name: String? = null

        fun token(token: String?): ConversationsRenameRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsRenameRequestBuilder {
            this.channel = channel
            return this
        }

        fun name(name: String?): ConversationsRenameRequestBuilder {
            this.name = name
            return this
        }

        fun build(): ConversationsRenameRequest {
            return ConversationsRenameRequest(token, channel, name)
        }

        override fun toString(): String {
            return "ConversationsRenameRequest.ConversationsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ")"
        }
    }

    companion object {
        fun builder(): ConversationsRenameRequestBuilder {
            return ConversationsRenameRequestBuilder()
        }
    }
}