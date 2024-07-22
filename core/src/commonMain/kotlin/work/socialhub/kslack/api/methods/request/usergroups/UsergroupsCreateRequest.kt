package com.github.seratch.jslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsCreateRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    override var token: String?,
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
     * Include the number of users in each User Group.
     */
    var isIncludeCount: Boolean
) : SlackApiRequest {
    class UsergroupsCreateRequestBuilder internal constructor() {
        private var token: String? = null
        private var name: String? = null
        private var handle: String? = null
        private var description: String? = null
        private var channels: Array<String>? = null
        private var includeCount = false

        fun token(token: String?): UsergroupsCreateRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): UsergroupsCreateRequestBuilder {
            this.name = name
            return this
        }

        fun handle(handle: String?): UsergroupsCreateRequestBuilder {
            this.handle = handle
            return this
        }

        fun description(description: String?): UsergroupsCreateRequestBuilder {
            this.description = description
            return this
        }

        fun channels(channels: Array<String>?): UsergroupsCreateRequestBuilder {
            this.channels = channels
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupsCreateRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun build(): UsergroupsCreateRequest {
            return UsergroupsCreateRequest(token, name, handle, description, channels, includeCount)
        }

        override fun toString(): String {
            return "UsergroupsCreateRequest.UsergroupsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", handle=" + this.handle + ", description=" + this.description + ", channels=" + this.channels + ", includeCount=" + this.includeCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupsCreateRequestBuilder {
            return UsergroupsCreateRequestBuilder()
        }
    }
}