package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersSetActiveRequest(
    /**
     * Authentication token. Requires scope: `users:write`
     */
    override var token: String?
) : SlackApiRequest {
    class UsersSetActiveRequestBuilder() {
        private var token: String? = null

        fun token(token: String?): UsersSetActiveRequestBuilder {
            this.token = token
            return this
        }

        fun build(): UsersSetActiveRequest {
            return UsersSetActiveRequest(token)
        }

        override fun toString(): String {
            return "UsersSetActiveRequest.UsersSetActiveRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): UsersSetActiveRequestBuilder {
            return UsersSetActiveRequestBuilder()
        }
    }
}