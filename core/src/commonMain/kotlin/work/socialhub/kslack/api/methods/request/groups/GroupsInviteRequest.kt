package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsInviteRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to invite user to.
     */
    var channel: String?,
    /**
     * User to invite.
     */
    var user: String?
) : SlackApiRequest {
    class GroupsInviteRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null
        private var user: String? = null

        fun token(token: String?): GroupsInviteRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsInviteRequestBuilder {
            this.channel = channel
            return this
        }

        fun user(user: String?): GroupsInviteRequestBuilder {
            this.user = user
            return this
        }

        fun build(): GroupsInviteRequest {
            return GroupsInviteRequest(token, channel, user)
        }

        override fun toString(): String {
            return "GroupsInviteRequest.GroupsInviteRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): GroupsInviteRequestBuilder {
            return GroupsInviteRequestBuilder()
        }
    }
}