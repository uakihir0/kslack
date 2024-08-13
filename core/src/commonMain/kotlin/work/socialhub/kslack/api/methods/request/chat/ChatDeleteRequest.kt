package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatDeleteRequest(
    /**
     * Authentication token. Requires scope: `chat:write`
     */
    override var token: String?,
    /**
     * Timestamp of the message to be deleted.
     */
    var ts: String?,
    /**
     * Channel containing the message to be deleted.
     */
    var channel: String?,
    /**
     * Pass true to delete the message as the authed user with `chat:write:user` scope.
     * [Bot users](/bot-users) in this context are considered authed users.
     * If unused or false, the message will be deleted with `chat:write:bot` scope.
     */
    var isAsUser: Boolean
) : SlackApiRequest {
    class ChatDeleteRequestBuilder() {
        private var token: String? = null
        private var ts: String? = null
        private var channel: String? = null
        private var asUser = false

        fun token(token: String?): ChatDeleteRequestBuilder {
            this.token = token
            return this
        }

        fun ts(ts: String?): ChatDeleteRequestBuilder {
            this.ts = ts
            return this
        }

        fun channel(channel: String?): ChatDeleteRequestBuilder {
            this.channel = channel
            return this
        }

        fun asUser(asUser: Boolean): ChatDeleteRequestBuilder {
            this.asUser = asUser
            return this
        }

        fun build(): ChatDeleteRequest {
            return ChatDeleteRequest(token, ts, channel, asUser)
        }

        override fun toString(): String {
            return "ChatDeleteRequest.ChatDeleteRequestBuilder(token=" + this.token + ", ts=" + this.ts + ", channel=" + this.channel + ", asUser=" + this.asUser + ")"
        }
    }

    companion object {
        fun builder(): ChatDeleteRequestBuilder {
            return ChatDeleteRequestBuilder()
        }
    }
}