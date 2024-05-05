package com.github.seratch.jslack.api.methods.request.bots

import com.github.seratch.jslack.api.methods.SlackApiRequest

class BotsInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users:read`
     */
    override var token: String?,
    /**
     * Bot user to get info on
     */
    var bot: String?
) : SlackApiRequest {
    class BotsInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var bot: String? = null

        fun token(token: String?): BotsInfoRequestBuilder {
            this.token = token
            return this
        }

        fun bot(bot: String?): BotsInfoRequestBuilder {
            this.bot = bot
            return this
        }

        fun build(): BotsInfoRequest {
            return BotsInfoRequest(token, bot)
        }

        override fun toString(): String {
            return "BotsInfoRequest.BotsInfoRequestBuilder(token=" + this.token + ", bot=" + this.bot + ")"
        }
    }

    companion object {
        fun builder(): BotsInfoRequestBuilder {
            return BotsInfoRequestBuilder()
        }
    }
}