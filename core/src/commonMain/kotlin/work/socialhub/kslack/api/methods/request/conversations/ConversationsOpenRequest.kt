package com.github.seratch.jslack.api.methods.request.conversations

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ConversationsOpenRequest internal constructor(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
     */
    var channel: String?,
    /**
     * Boolean, indicates you want the full IM channel definition in the response.
     */
    var isReturnIm: Boolean,
    /**
     * Comma separated lists of users. If only one user is included, this creates a 1:1 DM.
     * The ordering of the users is preserved whenever a multi-person direct message is returned.
     * Supply a `channel` when not supplying `users`.
     */
    var users: List<String>?
) : SlackApiRequest {
    class ConversationsOpenRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var returnIm = false
        private var users: List<String>? = null

        fun token(token: String?): ConversationsOpenRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ConversationsOpenRequestBuilder {
            this.channel = channel
            return this
        }

        fun returnIm(returnIm: Boolean): ConversationsOpenRequestBuilder {
            this.returnIm = returnIm
            return this
        }

        fun users(users: List<String>?): ConversationsOpenRequestBuilder {
            this.users = users
            return this
        }

        fun build(): ConversationsOpenRequest {
            return ConversationsOpenRequest(token, channel, returnIm, users)
        }

        override fun toString(): String {
            return "ConversationsOpenRequest.ConversationsOpenRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", returnIm=" + this.returnIm + ", users=" + this.users + ")"
        }
    }

    companion object {
        fun builder(): ConversationsOpenRequestBuilder {
            return ConversationsOpenRequestBuilder()
        }
    }
}
