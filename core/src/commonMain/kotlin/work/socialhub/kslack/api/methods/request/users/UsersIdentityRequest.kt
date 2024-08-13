package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersIdentityRequest(
    /**
     * Authentication token. Requires scope: `identity.basic`
     */
    override var token: String?
) : SlackApiRequest {
    class UsersIdentityRequestBuilder() {
        private var token: String? = null

        fun token(token: String?): UsersIdentityRequestBuilder {
            this.token = token
            return this
        }

        fun build(): UsersIdentityRequest {
            return UsersIdentityRequest(token)
        }

        override fun toString(): String {
            return "UsersIdentityRequest.UsersIdentityRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): UsersIdentityRequestBuilder {
            return UsersIdentityRequestBuilder()
        }
    }
}