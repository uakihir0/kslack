package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersLookupByEmailRequest(
    /**
     * Authentication token. Requires scope: `users:read.email`
     */
    override var token: String?,
    /**
     * An email address belonging to a user in the workspace
     */
    var email: String?
) : SlackApiRequest {
    class UsersLookupByEmailRequestBuilder() {
        private var token: String? = null
        private var email: String? = null

        fun token(token: String?): UsersLookupByEmailRequestBuilder {
            this.token = token
            return this
        }

        fun email(email: String?): UsersLookupByEmailRequestBuilder {
            this.email = email
            return this
        }

        fun build(): UsersLookupByEmailRequest {
            return UsersLookupByEmailRequest(token, email)
        }

        override fun toString(): String {
            return "UsersLookupByEmailRequest.UsersLookupByEmailRequestBuilder(token=" + this.token + ", email=" + this.email + ")"
        }
    }

    companion object {
        fun builder(): UsersLookupByEmailRequestBuilder {
            return UsersLookupByEmailRequestBuilder()
        }
    }
}