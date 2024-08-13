package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImCloseRequest(
    /**
     * Authentication token. Requires scope: `im:write`
     */
    override var token: String?,
    /**
     * Direct message channel to close.
     */
    var channel: String?
) : SlackApiRequest {
    class ImCloseRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): ImCloseRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ImCloseRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ImCloseRequest {
            return ImCloseRequest(token, channel)
        }

        override fun toString(): String {
            return "ImCloseRequest.ImCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ImCloseRequestBuilder {
            return ImCloseRequestBuilder()
        }
    }
}