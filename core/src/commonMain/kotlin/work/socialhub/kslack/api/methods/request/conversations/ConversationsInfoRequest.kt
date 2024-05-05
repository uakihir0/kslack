package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:read`
     */
    override var token: String?,
    /**
     * Conversation ID to learn more about
     */
    var channel: String?,
    /**
     * Set this to `true` to receive the locale for this conversation. Defaults to `false`
     */
    var isIncludeLocale: Boolean,
    /**
     * Set to true to include the member count for the specified conversation. Defaults to false
     */
    var isIncludeNumMembers: Boolean
) : SlackApiRequest {
    class ConversationsInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var includeLocale = false
        private var includeNumMembers = false

        fun token(token: String?): ConversationsInfoRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsInfoRequestBuilder {
            this.channel = channel
            return this
        }

        fun includeLocale(includeLocale: Boolean): ConversationsInfoRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        fun includeNumMembers(includeNumMembers: Boolean): ConversationsInfoRequestBuilder {
            this.includeNumMembers = includeNumMembers
            return this
        }

        fun build(): ConversationsInfoRequest {
            return ConversationsInfoRequest(token, channel, includeLocale, includeNumMembers)
        }

        override fun toString(): String {
            return "ConversationsInfoRequest.ConversationsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", includeLocale=" + this.includeLocale + ", includeNumMembers=" + this.includeNumMembers + ")"
        }
    }

    companion object {
        fun builder(): ConversationsInfoRequestBuilder {
            return ConversationsInfoRequestBuilder()
        }
    }
}