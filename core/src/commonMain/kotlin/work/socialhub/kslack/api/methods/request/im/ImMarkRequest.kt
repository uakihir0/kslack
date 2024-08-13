package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImMarkRequest(
    /**
     * Authentication token. Requires scope: `im:write`
     */
    override var token: String?,
    /**
     * Direct message channel to set reading cursor in.
     */
    var channel: String?,
    /**
     * Timestamp of the most recently seen message.
     */
    var ts: String?
) : SlackApiRequest {
    class ImMarkRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null
        private var ts: String? = null

        fun token(token: String?): ImMarkRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ImMarkRequestBuilder {
            this.channel = channel
            return this
        }

        fun ts(ts: String?): ImMarkRequestBuilder {
            this.ts = ts
            return this
        }

        fun build(): ImMarkRequest {
            return ImMarkRequest(token, channel, ts)
        }

        override fun toString(): String {
            return "ImMarkRequest.ImMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")"
        }
    }

    companion object {
        fun builder(): ImMarkRequestBuilder {
            return ImMarkRequestBuilder()
        }
    }
}