package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsCreateChildRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to clone and archive.
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsCreateChildRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsCreateChildRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsCreateChildRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsCreateChildRequest {
            return GroupsCreateChildRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsCreateChildRequest.GroupsCreateChildRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsCreateChildRequestBuilder {
            return GroupsCreateChildRequestBuilder()
        }
    }
}