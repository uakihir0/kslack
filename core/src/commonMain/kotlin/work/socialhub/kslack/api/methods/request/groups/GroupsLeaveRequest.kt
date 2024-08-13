package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsLeaveRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to leave
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsLeaveRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsLeaveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsLeaveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsLeaveRequest {
            return GroupsLeaveRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsLeaveRequest.GroupsLeaveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsLeaveRequestBuilder {
            return GroupsLeaveRequestBuilder()
        }
    }
}