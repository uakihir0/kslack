package com.github.seratch.jslack.api.methods.request.usergroups.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupUsersListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:read`
     */
    override var token: String?,
    /**
     * The encoded ID of the User Group to update.
     */
    var usergroup: String?,
    /**
     * Allow results that involve disabled User Groups.
     */
    var isIncludeDisabled: Boolean
) : SlackApiRequest {
    class UsergroupUsersListRequestBuilder internal constructor() {
        private var token: String? = null
        private var usergroup: String? = null
        private var includeDisabled = false

        fun token(token: String?): UsergroupUsersListRequestBuilder {
            this.token = token
            return this
        }

        fun usergroup(usergroup: String?): UsergroupUsersListRequestBuilder {
            this.usergroup = usergroup
            return this
        }

        fun includeDisabled(includeDisabled: Boolean): UsergroupUsersListRequestBuilder {
            this.includeDisabled = includeDisabled
            return this
        }

        fun build(): UsergroupUsersListRequest {
            return UsergroupUsersListRequest(token, usergroup, includeDisabled)
        }

        override fun toString(): String {
            return "UsergroupUsersListRequest.UsergroupUsersListRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeDisabled=" + this.includeDisabled + ")"
        }
    }

    companion object {
        fun builder(): UsergroupUsersListRequestBuilder {
            return UsergroupUsersListRequestBuilder()
        }
    }
}