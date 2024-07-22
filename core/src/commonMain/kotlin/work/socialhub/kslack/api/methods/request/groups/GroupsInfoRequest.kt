package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:read`
     */
    override var token: String?,
    /**
     * Private channel to get info on
     */
    var channel: String?,
    /**
     * Set this to `true` to receive the locale for this group. Defaults to `false`
     */
    var isIncludeLocale: Boolean
) : SlackApiRequest {
    class GroupsInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var includeLocale = false

        fun token(token: String?): GroupsInfoRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsInfoRequestBuilder {
            this.channel = channel
            return this
        }

        fun includeLocale(includeLocale: Boolean): GroupsInfoRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        fun build(): GroupsInfoRequest {
            return GroupsInfoRequest(token, channel, includeLocale)
        }

        override fun toString(): String {
            return "GroupsInfoRequest.GroupsInfoRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", includeLocale=" + this.includeLocale + ")"
        }
    }

    companion object {
        fun builder(): GroupsInfoRequestBuilder {
            return GroupsInfoRequestBuilder()
        }
    }
}