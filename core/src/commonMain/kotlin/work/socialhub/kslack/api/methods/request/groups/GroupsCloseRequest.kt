package com.github.seratch.jslack.api.methods.request.groups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class GroupsCloseRequest internal constructor(override var token: String?, var channel: String?) : SlackApiRequest {
    class GroupsCloseRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsCloseRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsCloseRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsCloseRequest {
            return GroupsCloseRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsCloseRequest.GroupsCloseRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsCloseRequestBuilder {
            return GroupsCloseRequestBuilder()
        }
    }
}