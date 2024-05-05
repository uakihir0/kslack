package com.github.seratch.jslack.api.methods.request.mpim

import com.github.seratch.jslack.api.methods.SlackApiRequest

class MpimCloseRequest internal constructor(
    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    override var token: String?,
    /**
     * MPIM to close.
     */
    var channel: String?
) : SlackApiRequest {
    class MpimCloseRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): MpimCloseRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): MpimCloseRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): MpimCloseRequest {
            return MpimCloseRequest(token, channel)
        }

        override fun toString(): String {
            return "MpimCloseRequest.MpimCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): MpimCloseRequestBuilder {
            return MpimCloseRequestBuilder()
        }
    }
}