package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsEnableRequest(
    /**
     * Authentication token. Requires scope: `usergroups:write`
     */
    override var token: String?,
    /**
     * The encoded ID of the User Group to enable.
     */
    var usergroup: String?,
    /**
     * Include the number of users in the User Group.
     */
    var isIncludeCount: Boolean
) : SlackApiRequest {
    class UsergroupsEnableRequestBuilder() {
        private var token: String? = null
        private var usergroup: String? = null
        private var includeCount = false

        fun token(token: String?): UsergroupsEnableRequestBuilder {
            this.token = token
            return this
        }

        fun usergroup(usergroup: String?): UsergroupsEnableRequestBuilder {
            this.usergroup = usergroup
            return this
        }

        fun includeCount(includeCount: Boolean): UsergroupsEnableRequestBuilder {
            this.includeCount = includeCount
            return this
        }

        fun build(): UsergroupsEnableRequest {
            return UsergroupsEnableRequest(token, usergroup, includeCount)
        }

        override fun toString(): String {
            return "UsergroupsEnableRequest.UsergroupsEnableRequestBuilder(token=" + this.token + ", usergroup=" + this.usergroup + ", includeCount=" + this.includeCount + ")"
        }
    }

    companion object {
        fun builder(): UsergroupsEnableRequestBuilder {
            return UsergroupsEnableRequestBuilder()
        }
    }
}