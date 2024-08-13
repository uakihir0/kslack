package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsArchiveRequest(
    /**
     * Authentication token. Requires scope: `groups:write`
     */
    override var token: String?,
    /**
     * Private channel to archive
     */
    var channel: String?
) : SlackApiRequest {
    class GroupsArchiveRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null

        fun token(token: String?): GroupsArchiveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): GroupsArchiveRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): GroupsArchiveRequest {
            return GroupsArchiveRequest(token, channel)
        }

        override fun toString(): String {
            return "GroupsArchiveRequest.GroupsArchiveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): GroupsArchiveRequestBuilder {
            return GroupsArchiveRequestBuilder()
        }
    }
}