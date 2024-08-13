package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersSetPresenceRequest(
    /**
     * Authentication token. Requires scope: `users:write`
     */
    override var token: String?,
    /**
     * Either `auto` or `away`
     */
    var presence: String?
) : SlackApiRequest {
    class UsersSetPresenceRequestBuilder() {
        private var token: String? = null
        private var presence: String? = null

        fun token(token: String?): UsersSetPresenceRequestBuilder {
            this.token = token
            return this
        }

        fun presence(presence: String?): UsersSetPresenceRequestBuilder {
            this.presence = presence
            return this
        }

        fun build(): UsersSetPresenceRequest {
            return UsersSetPresenceRequest(token, presence)
        }

        override fun toString(): String {
            return "UsersSetPresenceRequest.UsersSetPresenceRequestBuilder(token=" + this.token + ", presence=" + this.presence + ")"
        }
    }

    companion object {
        fun builder(): UsersSetPresenceRequestBuilder {
            return UsersSetPresenceRequestBuilder()
        }
    }
}