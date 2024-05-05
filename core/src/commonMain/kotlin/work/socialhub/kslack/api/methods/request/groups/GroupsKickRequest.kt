package com.github.seratch.jslack.api.methods.request.groups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class GroupsKickRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to remove user from.
     */
    var channel: String?,
    /**
     * User to remove from private channel.
     */
    var user: String?
) : SlackApiRequest {
    class GroupsKickRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var user: String? = null

        fun token(token: String?): GroupsKickRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsKickRequestBuilder {
            this.channel = channel
            return this
        }

        fun user(user: String?): GroupsKickRequestBuilder {
            this.user = user
            return this
        }

        fun build(): GroupsKickRequest {
            return GroupsKickRequest(token, channel, user)
        }

        override fun toString(): String {
            return "GroupsKickRequest.GroupsKickRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): GroupsKickRequestBuilder {
            return GroupsKickRequestBuilder()
        }
    }
}