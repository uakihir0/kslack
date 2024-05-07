package com.github.seratch.jslack.api.methods.request.usergroups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class UsergroupsUpdateRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    override var token: String?,
    /**
     * The encoded ID of the User Group to update.
     */
    var usergroup: String?,
    /**
     * A name for the User Group. Must be unique among User Groups.
     */
    var name: String?,
    /**
     * A mention handle. Must be unique among channels, users and User Groups.
     */
    var handle: String?,
    /**
     * A short description of the User Group.
     */
    var description: String?,
    /**
     * A comma separated string of encoded channel IDs for which the User Group uses as a default.
     */
    var channels: Array<String>?,
    /**
     * Include the number of users in the User Group.
     */
    var isIncludeCount: Boolean
) : SlackApiRequest {
    class UsergroupsUpdateRequestBuilder internal constructor() {
        private var token: String? = null
        private var usergroup: String? = null
        private var name: String? = null
        private var handle: String? = null
        private var description: String? = null
        private var channels: Array<String>? = null
        private var includeCount = false

        fun token(token: String?): UsergroupsUpdateRequestBuilder {
            this.token = token
            return this
        }

        fun usergroup(usergroup: String?): UsergroupsUpdateRequestBuilder {
            this.usergroup = usergroup
            return this
        }

        fun name(name: String?): UsergroupsUpdateRequestBuilder {
            this.name = name
            return this
        }

        fun handle(handle: String?): UsergroupsUpdateRequestBuilder {
            this.handle = handle
            return this
        }

        fun description(description: String?): UsergroupsUpdateRequestBuilder {
            this.description = description
            return this
        }

        fun channels(channels: Array<String>?): UsergroupsUpdateRequestBuilder {
            this.channels = channels
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupsUpdateRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun build(): UsergroupsUpdateRequest {
            return UsergroupsUpdateRequest(token, usergroup, name, handle, description, channels, includeCount)
        }

        override fun toString(): String {
            return "UsergroupsUpdateRequest.UsergroupsUpdateRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", name=" + this.name + ", handle=" + this.handle + ", description=" + this.description + ", channels=" + this.channels + ", includeCount=" + this.includeCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupsUpdateRequestBuilder {
            return UsergroupsUpdateRequestBuilder()
        }
    }
}