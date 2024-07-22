package com.github.seratch.jslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * A request to retrieve a permalink URL for a specific extant message
 *
 * @see [Slack chat.getPermalink API](https://api.slack.com/methods/chat.getPermalink)
 */
class ChatGetPermalinkRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    override var token: String?,
    /**
     * The ID of the conversation or channel containing the message
     */
    var channel: String?,
    /**
     * A message's `ts` value, uniquely identifying it within a channel
     */
    var messageTs: String?
) : SlackApiRequest {
    class ChatGetPermalinkRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var messageTs: String? = null

        fun token(token: String?): ChatGetPermalinkRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatGetPermalinkRequestBuilder {
            this.channel = channel
            return this
        }

        fun messageTs(messageTs: String?): ChatGetPermalinkRequestBuilder {
            this.messageTs = messageTs
            return this
        }

        fun build(): ChatGetPermalinkRequest {
            return ChatGetPermalinkRequest(token, channel, messageTs)
        }

        override fun toString(): String {
            return "ChatGetPermalinkRequest.ChatGetPermalinkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", messageTs=" + this.messageTs + ")"
        }
    }

    companion object {
        fun builder(): ChatGetPermalinkRequestBuilder {
            return ChatGetPermalinkRequestBuilder()
        }
    }
}
