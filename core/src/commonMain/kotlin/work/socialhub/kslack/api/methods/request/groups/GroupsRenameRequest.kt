package com.github.seratch.jslack.api.methods.request.groups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class GroupsRenameRequest internal constructor(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to rename
     */
    var channel: String?,
    /**
     * New name for private channel.
     */
    var name: String?,
    /**
     * Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria.
     */
    var isValidate: Boolean
) : SlackApiRequest {
    class GroupsRenameRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var name: String? = null
        private var validate = false

        fun token(token: String?): GroupsRenameRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsRenameRequestBuilder {
            this.channel = channel
            return this
        }

        fun name(name: String?): GroupsRenameRequestBuilder {
            this.name = name
            return this
        }

        fun validate(validate: Boolean): GroupsRenameRequestBuilder {
            this.validate = validate
            return this
        }

        fun build(): GroupsRenameRequest {
            return GroupsRenameRequest(token, channel, name, validate)
        }

        override fun toString(): String {
            return "GroupsRenameRequest.GroupsRenameRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", name=" + this.name + ", validate=" + this.validate + ")"
        }
    }

    companion object {
        fun builder(): GroupsRenameRequestBuilder {
            return GroupsRenameRequestBuilder()
        }
    }
}