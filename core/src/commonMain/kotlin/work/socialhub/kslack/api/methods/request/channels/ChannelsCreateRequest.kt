package com.github.seratch.jslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsCreateRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:write`
     */
    override var token: String?,
    /**
     * Name of channel to create
     */
    var name: String?,
    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    var isValidate: Boolean
) : SlackApiRequest {
    class ChannelsCreateRequestBuilder internal constructor() {
        private var token: String? = null
        private var name: String? = null
        private var validate = false

        fun token(token: String?): ChannelsCreateRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): ChannelsCreateRequestBuilder {
            this.name = name
            return this
        }

        fun validate(validate: Boolean): ChannelsCreateRequestBuilder {
            this.validate = validate
            return this
        }

        fun build(): ChannelsCreateRequest {
            return ChannelsCreateRequest(token, name, validate)
        }

        override fun toString(): String {
            return "ChannelsCreateRequest.ChannelsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", validate=" + this.validate + ")"
        }
    }

    companion object {
        fun builder(): ChannelsCreateRequestBuilder {
            return ChannelsCreateRequestBuilder()
        }
    }
}