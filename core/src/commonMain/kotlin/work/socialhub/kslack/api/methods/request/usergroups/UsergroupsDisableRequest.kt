package com.github.seratch.jslack.api.methods.request.usergroups

import com.github.seratch.jslack.api.methods.SlackApiRequest

class UsergroupsDisableRequest internal constructor(
    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    override var token: String?,
    /**
     * The encoded ID of the User Group to disable.
     */
    var usergroup: String?,
    /**
     * Include the number of users in the User Group.
     */
    var isIncludeCount: Boolean
) : SlackApiRequest {
    class UsergroupsDisableRequestBuilder internal constructor() {
        private var token: String? = null
        private var usergroup: String? = null
        private var includeCount = false

        fun token(token: String?): UsergroupsDisableRequestBuilder {
            this.token = token
            return this
        }

        fun usergroup(usergroup: String?): UsergroupsDisableRequestBuilder {
            this.usergroup = usergroup
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupsDisableRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun build(): UsergroupsDisableRequest {
            return UsergroupsDisableRequest(token, usergroup, includeCount)
        }

        override fun toString(): String {
            return "UsergroupsDisableRequest.UsergroupsDisableRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeCount=" + this.includeCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupsDisableRequestBuilder {
            return UsergroupsDisableRequestBuilder()
        }
    }
}