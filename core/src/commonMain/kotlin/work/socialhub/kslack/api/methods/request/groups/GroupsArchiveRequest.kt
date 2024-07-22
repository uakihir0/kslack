package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsArchiveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to archive
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsArchiveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsArchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsArchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsArchiveRequest {
            return GroupsArchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsArchiveRequest.GroupsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsArchiveRequestBuilder {
            return GroupsArchiveRequestBuilder()
        }
    }
}