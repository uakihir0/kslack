package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsMarkRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to set reading cursor in.
     */
    var channel: String?,
    /**
     * Timestamp of the most recently seen message.
     */
    var ts: String?
) : SlackApiRequest {
    class GroupsMarkRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var ts: String? = null

        fun token(token: String?): GroupsMarkRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsMarkRequestBuilder {
            this.channel = channel
            return this
        }

        fun ts(ts: String?): GroupsMarkRequestBuilder {
            this.ts = ts
            return this
        }

        fun build(): GroupsMarkRequest {
            return GroupsMarkRequest(token, channel, ts)
        }

        override fun toString(): String {
            return "GroupsMarkRequest.GroupsMarkRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ")"
        }
    }

    companion object {
        fun builder(): GroupsMarkRequestBuilder {
            return GroupsMarkRequestBuilder()
        }
    }
}