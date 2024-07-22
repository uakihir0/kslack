package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsJoinRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Name of channel to join
     */
    var name: String?,
    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    var isValidate: Boolean
) : SlackApiRequest {
    class ChannelsJoinRequestBuilder internal constructor() {
        private var token: String? = null
        private var name: String? = null
        private var validate = false

        fun token(token: String?): ChannelsJoinRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): ChannelsJoinRequestBuilder {
            this.name = name
            return this
        }

        fun validate(validate: Boolean): ChannelsJoinRequestBuilder {
            this.validate = validate
            return this
        }

        fun build(): ChannelsJoinRequest {
            return ChannelsJoinRequest(token, name, validate)
        }

        override fun toString(): String {
            return "ChannelsJoinRequest.ChannelsJoinRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")"
        }
    }

    companion object {
        fun builder(): ChannelsJoinRequestBuilder {
            return ChannelsJoinRequestBuilder()
        }
    }
}