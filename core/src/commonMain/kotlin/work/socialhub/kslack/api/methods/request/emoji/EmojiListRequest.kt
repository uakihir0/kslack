package com.github.seratch.jslack.api.methods.request.emoji

import work.socialhub.kslack.api.methods.SlackApiRequest

class EmojiListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `emoji:read`
     */
    override var token: String?
) : SlackApiRequest {
    class EmojiListRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): EmojiListRequestBuilder {
            this.token = token
            return this
        }

        fun build(): EmojiListRequest {
            return EmojiListRequest(token)
        }

        override fun toString(): String {
            return "EmojiListRequest.EmojiListRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): EmojiListRequestBuilder {
            return EmojiListRequestBuilder()
        }
    }
}