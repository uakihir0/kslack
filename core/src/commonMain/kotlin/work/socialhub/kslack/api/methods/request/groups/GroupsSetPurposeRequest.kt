package com.github.seratch.jslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsSetPurposeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to set the purpose of
     */
    var channel: String?,
    /**
     * The new purpose
     */
    var purpose: String?
) : SlackApiRequest {
    class GroupsSetPurposeRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var purpose: String? = null

        fun token(token: String?): GroupsSetPurposeRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsSetPurposeRequestBuilder {
            this.channel = channel
            return this
        }

        fun purpose(purpose: String?): GroupsSetPurposeRequestBuilder {
            this.purpose = purpose
            return this
        }

        fun build(): GroupsSetPurposeRequest {
            return GroupsSetPurposeRequest(token, channel, purpose)
        }

        override fun toString(): String {
            return "GroupsSetPurposeRequest.GroupsSetPurposeRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", purpose=" + this.purpose + ")"
        }
    }

    companion object {
        fun builder(): GroupsSetPurposeRequestBuilder {
            return GroupsSetPurposeRequestBuilder()
        }
    }
}