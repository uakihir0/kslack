package com.github.seratch.jslack.api.methods.request.mpim

import com.github.seratch.jslack.api.methods.SlackApiRequest

class MpimMarkRequest internal constructor(
    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    override var token: String?,
    /**
     * multiparty direct message channel to set reading cursor in.
     */
    var channel: String?,
    /**
     * Timestamp of the most recently seen message.
     */
    var ts: String?
) : SlackApiRequest {
    class MpimMarkRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var ts: String? = null

        fun token(token: String?): MpimMarkRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): MpimMarkRequestBuilder {
            this.channel = channel
            return this
        }

        fun ts(ts: String?): MpimMarkRequestBuilder {
            this.ts = ts
            return this
        }

        fun build(): MpimMarkRequest {
            return MpimMarkRequest(token, channel, ts)
        }

        override fun toString(): String {
            return "MpimMarkRequest.MpimMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")"
        }
    }

    companion object {
        fun builder(): MpimMarkRequestBuilder {
            return MpimMarkRequestBuilder()
        }
    }
}