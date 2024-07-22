package com.github.seratch.jslack.api.methods.request.usergroups.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupUsersUpdateRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    override var token: String?,
    /**
     * The encoded ID of the User Group to update.
     */
    var usergroup: String?,
    /**
     * A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
     */
    var users: Array<String>?,
    /**
     * Include the number of users in the User Group.
     */
    var isIncludeCount: Boolean
) : SlackApiRequest {
    class UsergroupUsersUpdateRequestBuilder internal constructor() {
        private var token: String? = null
        private var usergroup: String? = null
        private var users: Array<String>? = null
        private var includeCount = false

        fun token(token: String?): UsergroupUsersUpdateRequestBuilder {
            this.token = token
            return this
        }

        fun usergroup(usergroup: String?): UsergroupUsersUpdateRequestBuilder {
            this.usergroup = usergroup
            return this
        }

        fun users(users: Array<String>?): UsergroupUsersUpdateRequestBuilder {
            this.users = users
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupUsersUpdateRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun build(): UsergroupUsersUpdateRequest {
            return UsergroupUsersUpdateRequest(token, usergroup, users, includeCount)
        }

        override fun toString(): String {
            return "UsergroupUsersUpdateRequest.UsergroupUsersUpdateRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", users=" + this.users + ", includeCount=" + this.includeCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupUsersUpdateRequestBuilder {
            return UsergroupUsersUpdateRequestBuilder()
        }
    }
}