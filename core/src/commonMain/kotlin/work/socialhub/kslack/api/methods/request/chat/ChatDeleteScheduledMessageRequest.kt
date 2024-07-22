package com.github.seratch.jslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatDeleteScheduledMessageRequest internal constructor(
    override var token: String?,
    /**
     * The channel the scheduled_message is posting to
     */
    var channel: String?,
    /**
     * scheduled_message_id returned from call to chat.scheduleMessage
     */
    var scheduledMessageId: String?,
    /**
     * Pass true to delete the message as the authed user with chat:write:user scope.
     * Bot users in this context are considered authed users.
     * If unused or false, the message will be deleted with chat:write:bot scope.
     */
    var isAsUser: Boolean?
) : SlackApiRequest {
    // NOTE: The default value is intentionally null to support workplace apps.
    // NOTE: The default value is intentionally null to support workplace apps.

    class ChatDeleteScheduledMessageRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var scheduledMessageId: String? = null
        private var asUser: Boolean? = null

        fun token(token: String?): ChatDeleteScheduledMessageRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatDeleteScheduledMessageRequestBuilder {
            this.channel = channel
            return this
        }

        fun scheduledMessageId(scheduledMessageId: String?): ChatDeleteScheduledMessageRequestBuilder {
            this.scheduledMessageId = scheduledMessageId
            return this
        }

        fun asUser(asUser: Boolean?): ChatDeleteScheduledMessageRequestBuilder {
            this.asUser = asUser
            return this
        }

        fun build(): ChatDeleteScheduledMessageRequest {
            return ChatDeleteScheduledMessageRequest(token, channel, scheduledMessageId, asUser)
        }

        override fun toString(): String {
            return "ChatDeleteScheduledMessageRequest.ChatDeleteScheduledMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", scheduledMessageId=" + this.scheduledMessageId + ", asUser=" + this.asUser + ")"
        }
    }

    companion object {
        fun builder(): ChatDeleteScheduledMessageRequestBuilder {
            return ChatDeleteScheduledMessageRequestBuilder()
        }
    }
}