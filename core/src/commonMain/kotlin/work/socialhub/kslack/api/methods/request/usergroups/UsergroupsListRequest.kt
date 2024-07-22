package com.github.seratch.jslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:read
     */
    override var token: String?,
    /**
     * Include disabled User Groups.
     */
    var isIncludeDisabled: Boolean,
    /**
     * Include the number of users in each User Group
     */
    var isIncludeCount: Boolean,
    /**
     * Include the list of users for each User Group.
     */
    var isIncludeUsers: Boolean
) : SlackApiRequest {
    class UsergroupsListRequestBuilder internal constructor() {
        private var token: String? = null
        private var includeDisabled = false
        private var includeCount = false
        private var includeUsers = false

        fun token(token: String?): UsergroupsListRequestBuilder {
            this.token = token
            return this
        }

        fun includeDisabled(includeDisabled: Boolean): UsergroupsListRequestBuilder {
            this.includeDisabled = includeDisabled
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupsListRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun includeUsers(includeUsers: Boolean): UsergroupsListRequestBuilder {
            this.includeUsers = includeUsers
            return this
        }

        fun build(): UsergroupsListRequest {
            return UsergroupsListRequest(token, includeDisabled, includeCount, includeUsers)
        }

        override fun toString(): String {
            return "UsergroupsListRequest.UsergroupsListRequestBuilder(token=" + this.token + ", includeDisabled=" + this.includeDisabled + ", includeCount=" + this.includeCount + ", includeUsers=" + this.includeUsers + ")"
        }
    }

    companion object {
        fun builder(): UsergroupsListRequestBuilder {
            return UsergroupsListRequestBuilder()
        }
    }
}