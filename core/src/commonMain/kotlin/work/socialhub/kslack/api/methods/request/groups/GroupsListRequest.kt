package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsListRequest(
    /**
     * Authentication token. Requires scope: `groups:read`
     */
    override var token: String?,
    /**
     * Exclude the `members` from each `group`
     */
    var isExcludeMembers: Boolean,
    /**
     * Don't return archived private channels.
     */
    var isExcludeArchived: Boolean
) : SlackApiRequest {
    class GroupsListRequestBuilder() {
        private var token: String? = null
        private var excludeMembers = false
        private var excludeArchived = false

        fun token(token: String?): GroupsListRequestBuilder {
            this.token = token
            return this
        }

        fun excludeMembers(excludeMembers: Boolean): GroupsListRequestBuilder {
            this.excludeMembers = excludeMembers
            return this
        }

        fun excludeArchived(excludeArchived: Boolean): GroupsListRequestBuilder {
            this.excludeArchived = excludeArchived
            return this
        }

        fun build(): GroupsListRequest {
            return GroupsListRequest(token, excludeMembers, excludeArchived)
        }

        override fun toString(): String {
            return "GroupsListRequest.GroupsListRequestBuilder(token=" + this.token + ", excludeMembers=" + this.excludeMembers + ", excludeArchived=" + this.excludeArchived + ")"
        }
    }

    companion object {
        fun builder(): GroupsListRequestBuilder {
            return GroupsListRequestBuilder()
        }
    }
}