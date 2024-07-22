package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsUnarchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to unarchive
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsUnarchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsUnarchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsUnarchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsUnarchiveRequest {
            return GroupsUnarchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsUnarchiveRequest.GroupsUnarchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsUnarchiveRequestBuilder {
            return GroupsUnarchiveRequestBuilder()
        }
    }
}