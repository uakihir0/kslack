package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsRepliesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:history`
     */
    override var token: String?,
    /**
     * Private channel to fetch thread from
     */
    var channel: String?,
    /**
     * Unique identifier of a thread's parent message
     */
    var threadTs: String?
) : SlackApiRequest {
    class GroupsRepliesRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var threadTs: String? = null

        fun token(token: String?): GroupsRepliesRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsRepliesRequestBuilder {
            this.channel = channel
            return this
        }

        fun threadTs(threadTs: String?): GroupsRepliesRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun build(): GroupsRepliesRequest {
            return GroupsRepliesRequest(token, channel, threadTs)
        }

        override fun toString(): String {
            return "GroupsRepliesRequest.GroupsRepliesRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", threadTs=" + this.threadTs + ")"
        }
    }

    companion object {
        fun builder(): GroupsRepliesRequestBuilder {
            return GroupsRepliesRequestBuilder()
        }
    }
}