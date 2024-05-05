package com.github.seratch.jslack.api.methods.request.chat

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChatMeMessageRequest internal constructor(
    /**
     * Authentication token. Requires scope: `chat:write:user`
     */
    override var token: String?,
    /**
     * Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
     */
    var channel: String?,
    /**
     * Text of the message to send.
     */
    var text: String?
) : SlackApiRequest {
    class ChatMeMessageRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var text: String? = null

        fun token(token: String?): ChatMeMessageRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatMeMessageRequestBuilder {
            this.channel = channel
            return this
        }

        fun text(text: String?): ChatMeMessageRequestBuilder {
            this.text = text
            return this
        }

        fun build(): ChatMeMessageRequest {
            return ChatMeMessageRequest(token, channel, text)
        }

        override fun toString(): String {
            return "ChatMeMessageRequest.ChatMeMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", text=" + this.text + ")"
        }
    }

    companion object {
        fun builder(): ChatMeMessageRequestBuilder {
            return ChatMeMessageRequestBuilder()
        }
    }
}