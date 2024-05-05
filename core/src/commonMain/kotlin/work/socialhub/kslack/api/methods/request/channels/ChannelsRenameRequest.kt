package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsRenameRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Channel to rename
     */
    var channel: String?,
    /**
     * New name for channel.
     */
    var name: String?,
    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    var isValidate: Boolean
) : SlackApiRequest {
    class ChannelsRenameRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var name: String? = null
        private var validate = false

        fun token(token: String?): ChannelsRenameRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChannelsRenameRequestBuilder {
            this.channel = channel
            return this
        }

        fun name(name: String?): ChannelsRenameRequestBuilder {
            this.name = name
            return this
        }

        fun validate(validate: Boolean): ChannelsRenameRequestBuilder {
            this.validate = validate
            return this
        }

        fun build(): ChannelsRenameRequest {
            return ChannelsRenameRequest(token, channel, name, validate)
        }

        override fun toString(): String {
            return "ChannelsRenameRequest.ChannelsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ", validate=" + this.validate + ")"
        }
    }

    companion object {
        fun builder(): ChannelsRenameRequestBuilder {
            return ChannelsRenameRequestBuilder()
        }
    }
}