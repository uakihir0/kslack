package com.github.seratch.jslack.api.methods.request.groups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class GroupsOpenRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to open.
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsOpenRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsOpenRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsOpenRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsOpenRequest {
            return GroupsOpenRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsOpenRequest.GroupsOpenRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsOpenRequestBuilder {
            return GroupsOpenRequestBuilder()
        }
    }
}